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
	public Integer visitReasignar(ReasignarContext ctx) //falta caso calculo
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
		if(ctx.WORDS()!=null)
		{
			if(assertType(toAssign.getType(),ctx.WORDS().getText())==true)
			{
				toAssign.setvalue(ctx.WORDS().getText());
				return 0;
			}
		}
		else
		{
			if(ctx.funcion_matematica()!=null)
			{
				toAssign.setvalue(visitFuncion_matematica(ctx.funcion_matematica()).toString());
				return 0;
			}
		}
		System.out.println("EPA PAPULINCE, LOS TIPOS NO CALZAN 7-7)9 ");
		
		return 0;
	}
	
	@Override
	public Integer visitSi(SiContext ctx) //falta realizarlo
	{
		return 0;
	}

	@Override
	public Integer visitCondicion(CondicionContext ctx)//operadores de comparacion, revisar cambios, PRIORIDAD
	{
		Integer x;
		/*
		for(int i=0;i< ctx.condicion().size();i++)
		{
			if(ctx.condicion(i)!=null)
			{
				x =visitCondicion(ctx.condicion(i));
			}
			if(ctx.VAL_BOOLEAN()!=null)
			{
				if(ctx.VAL_BOOLEAN().getText().equals("bener"))
				{
					return(1);
				}
				else
				{
					return(0);
				}
			}
			if(ctx.NAME_VAR()!=null)
			{
				
			}
			if(ctx.NUMBER()!=null)
			{
				
			}
		}
		*/
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
	public Integer visitCalculo(CalculoContext ctx)//operadores unarios, falta realizarlo, PRIORIDAD
	{
		return 0;
	}
	 
	/*
	@Override
	public Integer visitHacer_mientras(Hacer_mientrasContext ctx)
	{
		return 0;
	}

	@Override
	public Integer visitMientras(MientrasContext ctx)
	{
		return 0;
	}

	@Override
	public Integer visitPara(ParaContext ctx)
	{
		return 0;
	}
	*/
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