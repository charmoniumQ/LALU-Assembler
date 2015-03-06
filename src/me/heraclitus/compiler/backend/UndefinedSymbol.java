package me.heraclitus.compiler.backend;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;

public class UndefinedSymbol extends Throwable {
    public UndefinedSymbol(String type, ParserRuleContext ctx) {
        super();
        this.type = type;;
        this.ctx = ctx;
    }

    public String getType() {
        return type;
    }

    public ParserRuleContext getCtx() {
        return ctx;
    }

    String type;
    ParserRuleContext ctx;
}
