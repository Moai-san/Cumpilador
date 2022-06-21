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

public class MyVisitor extends ParserTBaseVisitor<Integer>
{
	private Map<String, String> variables = new HashMap<String, String>();
	
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
		return 0;
	}

	@Override
	public Integer visitLeer(LeerContext ctx)
	{
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
}