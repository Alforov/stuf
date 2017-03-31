package com.cs.alf.patterns.behavioral.template;

/**
 * Created by mikhail_alferov on 31.03.2017.
 */
public class AndroidCompiler extends CrossCompiler {
    protected void collectSource() {
        //anything specific to this class
    }
    protected void compileToTarget() {
        //android specific compilation
    }
}