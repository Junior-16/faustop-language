package faustop.core.main.util;

import java.util.HashMap;
import java.util.Map;

import faustop.core.vars.*;

//
@FunctionalInterface
interface MethodParser <T1, T2>{

    public String apply(T1 arg1, T2 arg2);

}

//
public class OperatorParser {

	public static Map<String, MethodParser> INTEGER = new HashMap<String, MethodParser>();
    public static Map<String, MethodParser> DOUBLE = new HashMap<String, MethodParser>();
	public static Map<String, MethodParser> STRING = new HashMap<String, MethodParser>();

	/*
	 * Builds the hash maps
	 * */
	public static void init() {
		OperatorParser.buildInteger();
        OperatorParser.buildDouble();
		OperatorParser.buildString();
	}

	/*
	 * Builds the hash maps for the Integer_ type
	 * */
	public static void buildInteger() {
		MethodParser<Integer_, Integer> plus = (pObj, pValue) -> pObj.plus(pValue);
	    MethodParser<Integer_, Integer> minus = (pObj, pValue) -> pObj.minus(pValue);
	    MethodParser<Integer_, Integer> times = (pObj, pValue) -> pObj.times(pValue);
	    MethodParser<Integer_, Integer> division = (pObj, pValue) -> pObj.division(pValue);
        
        MethodParser<Integer_, Integer> grTh = (pObj, pValue) -> pObj.greaterThan(pValue);
        MethodParser<Integer_, Integer> grThOrEq = (pObj, pValue) -> pObj.greaterThanOrEqualTo(pValue);
        MethodParser<Integer_, Integer> lessTh = (pObj, pValue) -> pObj.lessThan(pValue);
        MethodParser<Integer_, Integer> lessThOrEq = (pObj, pValue) -> pObj.lessThanOrEqualTo(pValue);
        MethodParser<Integer_, Integer> eq = (pObj, pValue) -> pObj.equals(pValue);
        MethodParser<Integer_, Integer> dif = (pObj, pValue) -> pObj.differs(pValue);

		OperatorParser.INTEGER.put("+", plus);
	    OperatorParser.INTEGER.put("-", minus);
	    OperatorParser.INTEGER.put("*", times);
	    OperatorParser.INTEGER.put("/", division);
        
        OperatorParser.INTEGER.put(">", grTh);
        OperatorParser.INTEGER.put(">=", greaterThan);
        OperatorParser.INTEGER.put("<", lessTh);
        OperatorParser.INTEGER.put("<=", lessThOrEq);
        OperatorParser.INTEGER.put("==", eq);
        OperatorParser.INTEGER.put("!=", dif);
	}

	/*
	 * Builds the hash maps for the Double_ type
	 * */
     public static void buildDouble() {
 		MethodParser<Double_, Double> plus = (pObj, pValue) -> pObj.plus(pValue);
 	    MethodParser<Double_, Double> minus = (pObj, pValue) -> pObj.minus(pValue);
 	    MethodParser<Double_, Double> times = (pObj, pValue) -> pObj.times(pValue);
 	    MethodParser<Double_, Double> division = (pObj, pValue) -> pObj.division(pValue);
         
         MethodParser<Double_, Double> grTh = (pObj, pValue) -> pObj.greaterThan(pValue);
         MethodParser<Double_, Double> grThOrEq = (pObj, pValue) -> pObj.greaterThanOrEqualTo(pValue);
         MethodParser<Double_, Double> lessTh = (pObj, pValue) -> pObj.lessThan(pValue);
         MethodParser<Double_, Double> lessThOrEq = (pObj, pValue) -> pObj.lessThanOrEqualTo(pValue);
         MethodParser<Double_, Double> eq = (pObj, pValue) -> pObj.equals(pValue);
         MethodParser<Double_, Double> dif = (pObj, pValue) -> pObj.differs(pValue);

 		OperatorParser.DOUBLE.put("+", plus);
 	    OperatorParser.DOUBLE.put("-", minus);
 	    OperatorParser.DOUBLE.put("*", times);
 	    OperatorParser.DOUBLE.put("/", division);
         
         OperatorParser.DOUBLE.put(">", grTh);
         OperatorParser.DOUBLE.put(">=", greaterThan);
         OperatorParser.DOUBLE.put("<", lessTh);
         OperatorParser.DOUBLE.put("<=", lessThOrEq);
         OperatorParser.DOUBLE.put("==", eq);
         OperatorParser.DOUBLE.put("!=", dif);
 	}
    
    /*
	 * Builds the hash maps for the String_ type
	 * */
    public static void buildString() {
        MethodParser<String_, String> grTh = (pObj, pValue) -> pObj.greaterThan(pValue);
        MethodParser<String_, String> grThOrEq = (pObj, pValue) -> pObj.greaterThanOrEqualTo(pValue);
        MethodParser<String_, String> lessTh = (pObj, pValue) -> pObj.lessThan(pValue);
        MethodParser<String_, String> lessThOrEq = (pObj, pValue) -> pObj.lessThanOrEqualTo(pValue);
        MethodParser<String_, String> eq = (pObj, pValue) -> pObj.equals(pValue);
        MethodParser<String_, String> dif = (pObj, pValue) -> pObj.differs(pValue);
         
        OperatorParser.STRING.put(">", grTh);
        OperatorParser.STRING.put(">=", greaterThan);
        OperatorParser.STRING.put("<", lessTh);
        OperatorParser.STRING.put("<=", lessThOrEq);
        OperatorParser.STRING.put("==", eq);
        OperatorParser.STRING.put("!=", dif);
 	}


}
