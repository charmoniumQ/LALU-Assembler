package me.heraclitus.compiler.backend;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;

public class PostProcessError extends Throwable {
    public PostProcessError(String message, String rule, ParserRuleContext ctx) {
        super();
        this.message = message;
        this.rule = rule;
        this.ctx = ctx;
    }

    public String getMessage() { return message; }

    public String getRule() { return rule; }

    public ParserRuleContext getCtx() {
        return ctx;
    }

    String rule;
    String message;
    ParserRuleContext ctx;
}
