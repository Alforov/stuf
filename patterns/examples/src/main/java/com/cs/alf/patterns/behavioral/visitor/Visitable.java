package com.cs.alf.patterns.behavioral.visitor;

/**
 * Created by mikhail_alferov on 31.03.2017.
 */
interface Visitable {
 double accept(Visitor visitor);
}