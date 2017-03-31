package com.cs.alf.patterns.behavioral.visitor;

/**
 * Created by mikhail_alferov on 31.03.2017.
 */

interface Visitor {
    double visit(Liquor liquorItem);
    double visit(Tobacco tobaccoItem);
    double visit(Necessity necessityItem);
}