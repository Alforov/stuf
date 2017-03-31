package com.cs.alf.patterns.behavioral.chainofresponsibility;

/**
 * Created by mikhail_alferov on 29.03.2017.
 */
public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);
        AbstractLogger infoLogger = new InfoLogger(AbstractLogger.INFO);
        errorLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(infoLogger);
        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
        System.out.print("\n\n");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");
        System.out.print("\n\n");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }
}