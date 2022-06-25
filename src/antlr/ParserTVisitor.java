// Generated from ParserT.g4 by ANTLR 4.7.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserTParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserTVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParserTParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ParserTParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#codigo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodigo(ParserTParser.CodigoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(ParserTParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#escribir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscribir(ParserTParser.EscribirContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#leer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeer(ParserTParser.LeerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(ParserTParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#hacer_mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHacer_mientras(ParserTParser.Hacer_mientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(ParserTParser.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPara(ParserTParser.ParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#reasignar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReasignar(ParserTParser.ReasignarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#funcion_matematica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion_matematica(ParserTParser.Funcion_matematicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(ParserTParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#calculo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalculo(ParserTParser.CalculoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(ParserTParser.BloqueContext ctx);
}