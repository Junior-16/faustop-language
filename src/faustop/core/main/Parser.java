import java.util.LinkedList;
import java.util.HashMap;
import java.util.regex.Pattern;


class Parser {

    private LinkedList<Token> instruction = new LinkedList<>();
    private HashMap<String, String> instructionRules = new HashMap<>();

    public Parser() {
        //regexes ahead (they should be somehow global)

        String kwBI = "keywordbuiltin";
        String kwFC = "keywordflowcontroller";
        String kwType = "keywordtype";

        String id = "identifier";

        String opAritm = "operatorarithmetic";
        String opLog = "operatorlogic";
        String opAssign = "operatorassignment";
        String opRel = "operatorrelational";

        String delParOpen = "delimiterparenthesesopen";
        String delParClose = "delimiterparenthesesclose";
        String delCurlyOpen = "delimitercurlybracketopen";
        String delCurlyClose = "delimitercurlybracketclose";
        String delQuot = "delimiterquotationmark";
        String delDoubQuot = "delimiterdoublequotationmark";
        String delSemicolon = "delimitersemicolon";

        String lit = "literal";

        // auxiliar regexes

        String funcCall = kwBI + delParOpen
                          + "(" + exp + ")?"
                          + delParClose;

        String exp = "(" + id + "|"
                     + lit + "|"
                     + funcCall + "|"
                     + opAritm + "|" + opLog + "|" + opRel
                     + delParOpen + "|" + delParClose + ")+";
        String dec = "^" + kwType + id + "$";
        String init = "^" + kwType + id + opAssign + exp + "$";
        String assign = "^" + id + opAssign + exp + "$";
        String flow = "^" + kwFC + delParOpen + exp + delParOpen
                            + delCurlyOpen
                            + "(" + exp + "|" + dec + "|" + init + "|" + assign ")*"
                            + delCurlyClose + "$"; // lacks recursion

        // actual regexes

        this.instructionRules.put(exp, "expression");
        this.instructionRules.put(dec, "declaration");
        this.instructionRules.put(init, "initialization");
        this.instructionRules.put(assign, "assignment");
        this.instructionRules.put(flow, "flowController");
    }

    public LinkedList<Token> getInstruction() {
        return this.instruction;
    }

    public void addToken(Token pToken) {
        this.instruction.add(pToken);
    }

    public boolean endOfInstruction() {
        /*
         * Checks if a final delimiter was found.
         * */

        return this.instruction.getLast().getName().equals(";")
               || this.instruction.getLast().getName().equals("");
        // missing conditional and loop cases
    }

    public boolean isValidInstruction() {
        /*
         * Identity type of instruction.
         * Checks if instruction follows all the instructionRules concerning to that
         * kind of instruction.
         * The Interpreter must, then, if instruction is valid, execute it;
         * else, it must throw an error. Nevertheless, the instruction
         * LinkedList must be clear afterwards.
         * */

        return false;
    }
}
