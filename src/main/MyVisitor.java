package main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

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
	private HashMap<String, VarPair> variables = new HashMap<String, VarPair>();
	
	// Este metodo es para probar lo que contienen las variables que se crean en desarrollo, una ves este listo el "MyVisitor" se debe eliminar porque es inncesesario.
	public void printvar()
	{
		System.out.print(this.variables);
	}
	
	@Override
	public Integer visitDeclaracion(DeclaracionContext ctx)
	{
		return 0;
	}

	@Override
	public Integer visitEscribir(EscribirContext ctx)
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
			System.out.print("NULL");
			return 1;
		}
		else
		{
			System.out.print(texto);
			return 0;
		}
	}

	@Override
	public Integer visitLeer(LeerContext ctx)
	{
		Scanner s = new Scanner(System.in);

		if((buffer.get(ctx.NAME_VAR().getText())).getvalue().contains("pancet"))
		{
			return 1;
		}

		String type = buffer.get(ctx.NAME_VAR().getText()).getvalue();
		VarPair toPut = new VarPair();

		toPut.setvalue(s.nextLine());
		toPut.setType(type);

		return 0;
	}

	@Override
	public Integer visitSi(SiContext ctx)
	{
		return 0;
	}

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

	@Override
	public Integer visitReasignar(ReasignarContext ctx)
	{
		return 0;
	}

	@Override
	public Integer visitCondicion(CondicionContext ctx)
	{
		return 0;
	}

	@Override
	public Integer visitCalculo(CalculoContext ctx)
	{
		return 0;
	}
	
	@Override
	public Integer visitFuncion_matematica(Funcion_matematicaContext ctx)
	{
		return 0;
	}
}

final class VarPair
{
	private String type;
	private String value;

	public String getType()
	{
		return(type);
	}
	
	public String getvalue()
	{
		return(value);
	}
	
	public void setType(String tipo)
	{
		type=tipo;
	}
	
	public void setvalue(String valor)
	{
		value=valor;
	}
	
	public VarPair()
	{
		type = new String();
		value = new String();
	}
}