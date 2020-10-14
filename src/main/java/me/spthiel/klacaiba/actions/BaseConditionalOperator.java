package me.spthiel.klacaiba.actions;

import net.eq2online.macros.scripting.actions.lang.ScriptActionIf;
import net.eq2online.macros.scripting.parser.ScriptContext;

public abstract class BaseConditionalOperator extends ScriptActionIf implements IDocumentable, BaseAction {
    
    public BaseConditionalOperator(String actionName) {
        
        super(ScriptContext.MAIN, actionName);
    }
}
