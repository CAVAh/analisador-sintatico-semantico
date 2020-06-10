// Generated from Sample.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SampleParser}.
 */
public interface SampleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SampleParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(SampleParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(SampleParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SampleParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SampleParser.ExprContext ctx);
}