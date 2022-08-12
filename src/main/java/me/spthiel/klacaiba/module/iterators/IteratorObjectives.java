package me.spthiel.klacaiba.module.iterators;

import net.eq2online.macros.scripting.ScriptedIterator;
import net.eq2online.macros.scripting.api.IMacro;
import net.eq2online.macros.scripting.api.IScriptActionProvider;
import net.minecraft.client.Minecraft;

public class IteratorObjectives extends ScriptedIterator {
    
    public IteratorObjectives(IScriptActionProvider provider, IMacro macro) {
        
        super(provider, macro);
        this.mc.world.getScoreboard().getScoreObjectives()
                     .forEach(
                             objective -> {
                                 this.begin();
                                 this.add("OBJECTIVECRITERIA", objective.getCriteria().getName());
                                 this.add("OBJECTIVEDISPLAYNAME", objective.getDisplayName());
                                 this.add("OBJECTIVENAME", objective.getName());
                                 this.add("OBJECTIVERENDERTYPE", objective.getRenderType().getRenderType());
                                 this.end();
                             }
                             );
    }
}
