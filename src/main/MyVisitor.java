package main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.antlr.v4.runtime.tree.TerminalNode;

import antlr.ParserTBaseVisitor;
import antlr.ParserTParser;
import antlr.ParserTParser.DeclaracionContext;
import antlr.ParserTParser.EscribirContext;
import antlr.ParserTParser.LeerContext;
import antlr.ParserTParser.SiContext;
import antlr.ParserTParser.Hacer_mientrasContext;
import antlr.ParserTParser.MientrasContext;
import antlr.ParserTParser.ParaContext;
import antlr.ParserTParser.ReasignarContext;
import antlr.ParserTParser.CondicionContext;
import antlr.ParserTParser.CalculoContext;
import antlr.ParserTParser.Funcion_matematicaContext;

public class MyVisitor extends ParserTBaseVisitor<Integer>
{
	//podria definir structs, hacer un mapa de object y complejizar mas, pero hacerlo mas solido :thinking_emoji:
	private HashMap<String, VarClass> buffer = new HashMap<String, VarClass>();
	private Double forMath;
	
	//buscar tipo de variable
	private String searchType(TerminalNode charT, TerminalNode intT,TerminalNode realT,TerminalNode boolT)
	{
		if(charT!=null)
		{
			return("char");
		}
		else
		{
			if(intT!=null)
			{
				return("int");
			}
			else
			{
				if(realT!=null)
				{
					return("float");
				}
				else
				{
					if(boolT!=null)
					{
						return("boolean");
					}
					else
					{
						System.out.println("no debiese entrar aqui nunca -.-");
						return(null);
					}
				}
			}
		}
	}
	
	private String searchValue(String type,TerminalNode number,TerminalNode word, TerminalNode bool)
	{
		switch(type)
		{
			case("char"):
			{
				if(word!=null)
				{
					return (word.getText());
				}
				if(number!=null)
				{
					return(number.getText());
				}
				return(null);
			}
			case("int"):
			{
				if(number!=null)
				{
					return(Integer.toString(Integer.parseInt(number.getText())));
				}
				return(null);
			}
			case("float"):
			{
				if(number!=null)
				{
					return(Double.toString(Double.parseDouble(number.getText())));
				}
				return(null);
			}
			case("boolean"):
			{
				if(bool!=null)
				{
					if(bool.getText().equals("bener"))
					{
						return("1");
					}
					else
					{
						return("0");
					}
				}
				return(null);
			}
			default:
			{
				System.out.println("no debiese entrar aqui nunca -.-");
				return (null);
			}
		}
	}
	
	private boolean assertType(String type, String value)
	{
		switch(type)
		{
			case("char"):
			{
				return(true);
			}
			case("int"):
			{
				try
				{
					Integer.parseInt(value);
					return(true);
				}
				catch(NumberFormatException e)
				{
					return(false);
				}
			}
			case("float"):
			{
				try
				{
					Double.parseDouble(value);
					return(true);
				}
				catch(NumberFormatException e)
				{
					return(false);
				}
			}
			case("boolean"):
			{
				if(value.equals("0")||value.equals("1")||value.equals("true")||value.equals("false")||value.equals("TRUE")||value.equals("FALSE"))
				{
					return (true);
				}
				return (false);
			}
			default:
			{
				System.out.println("no debiese entrar aqui nunca -.-");
				return (false);
			}
		}
	}

	private String toInt()
	{
		Integer y= (forMath.intValue());
		return(y.toString());
	}
	
	@Override
	public Integer visitDeclaracion(DeclaracionContext ctx)//ok
	{
		if(buffer.get(ctx.NAME_VAR(0).getText())!=null)
		{
			System.out.println("CHE, PERO LA VARIABLE YA EXISTE 7-7)9 ");
			return(1);
		}
		//variable a añadir
		VarClass declaredVar =new VarClass();
		//verificacion de si es constante
		if (ctx.CONSTANT()!=null)
		{
			declaredVar.setIsConst(true);
		}
		else
		{
			declaredVar.setIsConst(false);
		}
		//seteo de token de tipo para casteos
		declaredVar.setType(searchType(ctx.CHAR(),ctx.INT(),ctx.REAL(),ctx.BOOLEAN()));
		//seteo de valor a variable
		declaredVar.setvalue(searchValue(declaredVar.getType(),ctx.NUMBER(),ctx.WORDS(),ctx.VAL_BOOLEAN()));
		if(declaredVar.getvalue()==null)
		{
			declaredVar.setvalue(visitFuncion_matematica(ctx.funcion_matematica()).toString());
		}
		System.out.printf("isConst? %b dataType= %s name= %s value= %s\n",declaredVar.getIsConst(), declaredVar.getType(),ctx.NAME_VAR(0),declaredVar.getvalue());// --> testing de que funca
		buffer.put(ctx.NAME_VAR(0).getText(), declaredVar);
		return(0);
	}

	@Override
	public Integer visitEscribir(EscribirContext ctx)//ok
	{
		String texto;

		if(ctx.NAME_VAR() == null)
		{
			texto = ctx.WORDS().getText();
		}
		else
		{
			texto = buffer.get(ctx.NAME_VAR().getText()).getvalue();
		}

		if(texto == null)
		{
			System.out.println("NULL");
			return 1;
		}
		else
		{
			System.out.println(texto);
			return 0;
		}
	}

	@Override
	public Integer visitLeer(LeerContext ctx)//ok
	{
		Scanner s = new Scanner(System.in);
		VarClass toPut = buffer.get(ctx.NAME_VAR().getText());
		if(toPut.getIsConst()==true)
		{
			System.out.println("PERO COMO VAS A REASIGNAR UNA CONSTANTE AAAAAAAA 7-7)9 ");
			s.close();
			return 1;
		}

		String a =(s.nextLine());
		if(assertType(toPut.getType(),a)==true)
		{
			toPut.setvalue(a);
			s.close();
			return 0;
		}
		System.out.println("EPA PAPULINCE, LOS TIPOS NO CALZAN 7-7)9 ");
		s.close();
		return 1;

	}

	@Override
	public Integer visitReasignar(ReasignarContext ctx) //ok
	{
		VarClass toAssign =buffer.get(ctx.NAME_VAR().getText());
		if(toAssign==null)
		{
			System.out.println("VARIABLE NO DECLARADA 7-7)9 ");
			return(1);
		}
		if(toAssign.getIsConst())
		{
			System.out.println("PERO COMO VAS A REASIGNAR UNA CONSTANTE AAAAAAAA 7-7)9 ");
			return(1);
		}
		//validar tipos
		if(ctx.NUMBER()!=null)
		{
			if(assertType(toAssign.getType(),ctx.NUMBER().getText())==true)
			{
				toAssign.setvalue(ctx.NUMBER().getText());
				return 0;
			}
			System.out.println("EPA PAPULINCE, LOS TIPOS NO CALZAN 7-7)9 ");
			System.out.println("REASIGNACION INVALIDA, NO SE HICIERON CAMBIOS");
			return 1;
		}
		if(ctx.WORDS()!=null)
		{
			if(assertType(toAssign.getType(),ctx.WORDS().getText())==true)
			{
				toAssign.setvalue(ctx.WORDS().getText());
				return 0;
			}
			System.out.println("EPA PAPULINCE, LOS TIPOS NO CALZAN 7-7)9 ");
			System.out.println("REASIGNACION INVALIDA, NO SE HICIERON CAMBIOS");
			return 1;
		}
		else
		{
			if(ctx.funcion_matematica()!=null)
			{
				if(assertType(toAssign.getType(),visitFuncion_matematica(ctx.funcion_matematica()).toString()))
				{
					toAssign.setvalue(visitFuncion_matematica(ctx.funcion_matematica()).toString());
					return 0;
				}
				System.out.println("EPA PAPULINCE, LOS TIPOS NO CALZAN 7-7)9 ");
				System.out.println("REASIGNACION INVALIDA, NO SE HICIERON CAMBIOS");
				return 1;
			}
			else
			{
				if(ctx.calculo()!=null)
				{
					if(visitCalculo(ctx.calculo())!=1)
					{
						if((assertType(toAssign.getType(),forMath.toString())))
						{
							toAssign.setvalue(forMath.toString());
							return 0;
						}
						if(assertType(toAssign.getType(),toInt().toString()))
						{
							toAssign.setvalue(toInt().toString());
							return 0;
						}
						System.out.println("EPA PAPULINCE, LOS TIPOS NO CALZAN 7-7)9 ");
						System.out.println("REASIGNACION INVALIDA, NO SE HICIERON CAMBIOS");
						return 1;
					}
				}
				else
				{
					if(ctx.VAL_BOOLEAN()!=null)
					{
						String x =ctx.VAL_BOOLEAN().getText();
						if(x.equals("bener"))
						{
							x="true";
						}
						else
						{
							x="false";
						}
						if(assertType(toAssign.getType(),x))
						{
							toAssign.setvalue(x);
							return 0;
						}
						System.out.println("EPA PAPULINCE, LOS TIPOS NO CALZAN 7-7)9 ");
						System.out.println("REASIGNACION INVALIDA, NO SE HICIERON CAMBIOS");
						return 1;
					}
				}
			}
		}
		
		return 0;
	}
	
	@Override
	public Integer visitSi(SiContext ctx) //ok
	{
		if(visitCondicion(ctx.condicion())==1)
		{
			visitBloque(ctx.bloque(0));
		}
		else
		{
			visitBloque(ctx.bloque(1));
		}		
		return 0;
	}

	@Override
	public Integer visitCondicion(CondicionContext ctx)//ok
	{
		Integer a=null;
		Integer b=null;
		
		for(int i=0; i<2 ;i++)
		{
			if(ctx.VAL_BOOLEAN(i)!=null)
			{
				if(ctx.VAL_BOOLEAN(i).getText().equals("bener"))
				{
					if(a!=null)
					{
						b=1;
						continue;
					}
					a=1;
					continue;
				}
				else
				{
					if(a!=null)
					{
						b=0;
						continue;
					}
					a=0;
					continue;
				}
			}
			if(ctx.NAME_VAR()!=null)
			{
				if((buffer.get(ctx.NAME_VAR(i).getText()))!=null)
				{
					String type =((buffer.get(ctx.NAME_VAR(i).getText())).getType());
					switch (type)
					{
						case("char"):
						{
							if(a!=null)
							{
								b=1;
								continue;
							}
							a=1;
							continue;
						}
						case("int"):
						{
							if(a!=null)
							{
								b=(Integer.parseInt((buffer.get(ctx.NAME_VAR(i).getText())).getvalue()));
								continue;
							}
							a=(Integer.parseInt((buffer.get(ctx.NAME_VAR(i).getText())).getvalue()));
							continue;
						}
						case("float"):
						{
							Double c=(Double.parseDouble((buffer.get(ctx.NAME_VAR(i).getText())).getvalue()));
							if(a!=null)
							{
								b=c.intValue();
								continue;
							}
							a=c.intValue();
							continue;
						}
						case("boolean"):
						{
								if(((buffer.get(ctx.NAME_VAR(i).getText())).getvalue()).equals("bener"))
								{
									if(a!=null)
									{
										b=1;
										continue;
									}
									a=1;
									continue;
								}
								else
								{
									if(a!=null)
									{
										b=0;
										continue;
									}
									a=0;
									continue;
								}
						}
					}
				}
			}
			if(ctx.NUMBER(i)!=null)
			{
				if(a!=null)
				{
					b=(Integer.parseInt(ctx.NUMBER(i).getText()));
					continue;
				}
				b=(Integer.parseInt(ctx.NUMBER(i).getText()));
				continue;
			}
		}
		boolean eval=false;
		switch(ctx.OP_SIMBOLS().getText())
		{
			case("|"):
			{
				if((a==0)&&(b==0))
				{
					return 0;
				}
				return 1;
			}
			case("&"):
			{
				if((a==0)||(b==0))
				{
					return 0;
				}
				return 1;
			}
			case(">"):
			{
				eval=a>b;
			}
			case("<"):
			{
				eval=a<b;
			}
			case(">="):
			{
				eval=a>=b;
			}
			case("<="):
			{
				eval=a<=b;
			}
			case("=="):
			{
				eval=a==b;
			}
			case("!="):
			{
				eval=a!=b;
			}
		}
		if(eval!=false)
		{
			return(1);
		}
		return 0;
	}
	
	@Override
	public Integer visitFuncion_matematica(Funcion_matematicaContext ctx)//ok
	{
		Double output;
		Double n =null;
		Double m =null; 
		if(ctx.MOD()!=null)
		{
			for(int i=0;i<2;i++)
			{
				if(ctx.NAME_VAR(i)!=null)
				{
					if ( buffer.get(ctx.NAME_VAR(i).getText()).getType().equals("float") || buffer.get(ctx.NAME_VAR(i).getText()).getType().equals("int"))
					{
						if(n!=null)
						{
							m =Double.parseDouble(buffer.get(ctx.NAME_VAR(i).getText()).getvalue());
							continue;
						}
						else
						{
							n =Double.parseDouble(buffer.get(ctx.NAME_VAR(i).getText()).getvalue());
							continue;
						}
					}
					
				}
				if(ctx.NUMBER(i)!=null)
				{
					if(n!=null)
					{
						m =Double.parseDouble(ctx.NUMBER(i).getText());
						continue;
					}
					else
					{
						n =Double.parseDouble(ctx.NUMBER(i).getText());
						continue;
					}
				}
			}
			output=(n%m);
			return(output.intValue());
		}
		if(ctx.FACT()!=null)
		{
			if(ctx.NAME_VAR(0)!=null)
			{
				if ( buffer.get(ctx.NAME_VAR(0).getText()).getType().equals("float") || buffer.get(ctx.NAME_VAR(0).getText()).getType().equals("int"))
				{
					m =Double.parseDouble(buffer.get(ctx.NAME_VAR(0).getText()).getvalue());
				}
			}
			if(ctx.NUMBER(0)!=null)
			{
				m =Double.parseDouble(ctx.NUMBER(0).getText());
			}
			output=1.0;
			for(int i= 1;i<=m;i++)
			{
				output= output*i;
			}
			return(output.intValue());
		}
		return 1;
	}
	
	 @Override
	public Integer visitCalculo(CalculoContext ctx)//ok
	{
		 	Double a=null;
			Double b=null;
			
			for(int i=0; i<2 ;i++)
			{
				if(ctx.NUMBER(i)!=null)
				{
					if(a!=null)
					{
						b=(Double.parseDouble(ctx.NUMBER(i).getText()));
						continue;
					}
					b=(Double.parseDouble(ctx.NUMBER(i).getText()));
					continue;
				}
				if(ctx.NAME_VAR(i)!=null)
				{
					if((buffer.get(ctx.NAME_VAR(i).getText()))!=null)
					{
						String type =((buffer.get(ctx.NAME_VAR(i).getText())).getType());
						switch (type)
						{
							case("char"):
							{
								System.out.println("EPAEPAEPA COMO VAS A HACER MATES CON CARÁCTERES, NO TE BASTA CON ECHARTE DIFERENCIALES?");
								return 1;
							}
							case("int"):
							{
								if(a!=null)
								{
									b=(Double.parseDouble((buffer.get(ctx.NAME_VAR(i).getText())).getvalue()));
									continue;
								}
								a=(Double.parseDouble((buffer.get(ctx.NAME_VAR(i).getText())).getvalue()));
								continue;
							}
							case("float"):
							{
								if(a!=null)
								{
									b=(Double.parseDouble((buffer.get(ctx.NAME_VAR(i).getText())).getvalue()));
									continue;
								}
								a=(Double.parseDouble((buffer.get(ctx.NAME_VAR(i).getText())).getvalue()));
								continue;
							}
							case("boolean"):
							{
								System.out.println("EPAEPAEPA COMO VAS A HACER MATES CON BOOLEANOS, TE HACE SENTIDO ESO?");
								return 1;
							}
						}
					}
				}
			}
			switch(ctx.MAT_SIMBOLS().getText())
			{
				case("+"):
				{
					forMath=(a+b);
					break;
				}
				case("-"):
				{
					forMath=(a-b);
					break;
				}
				case("*"):
				{
					forMath=(a*b);
					break;
				}
				case("/"):
				{
					forMath=(a/b);
					break;
				}
				case("^"):
				{
					forMath= a;
					for(int i=1;i<b;i++)
					{
						forMath= forMath*a;
					}
					break;
				}
			}
			return 0;
	}
	 
}


//Clase para el desglose de las variables
final class VarClass
{
	private String type;
	private String value;
	private boolean isConst; //true si es constante, false si no;

	public String getType()
	{
		return(type);
	}
	
	public String getvalue()
	{
		return(value);
	}
	
	public boolean getIsConst()
	{
		return(isConst);
	}
	
	public void setType(String tipo)
	{
		type=tipo;
	}
	
	public void setvalue(String valor)
	{
		value=valor;
	}
	
	public void setIsConst(boolean state)
	{
		isConst=state;
	}
	
	public VarClass()
	{
		type = new String();
		value = new String();
	}
}