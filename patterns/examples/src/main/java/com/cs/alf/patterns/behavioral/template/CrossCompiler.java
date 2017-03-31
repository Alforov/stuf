package com.cs.alf.patterns.behavioral.template;

/**
 * Created by mikhail_alferov on 31.03.2017.
 */
public abstract class CrossCompiler {
    public final void crossCompile() {
        collectSource();
        compileToTarget();
    }
    //Template methods
    protected abstract void collectSource();
    protected abstract void compileToTarget();
}
