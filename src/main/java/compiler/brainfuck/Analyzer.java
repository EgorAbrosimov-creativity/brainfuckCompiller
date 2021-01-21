package compiler.brainfuck;

public class Analyzer {


    public static boolean codeIsCorrect(String code) {
        return syntaxIsValid(code) && parenthesisAreValid(code);
    }

    private static boolean syntaxIsValid(String code) {
        boolean result = true;
        String syntaxSymbols = "<>+-.[]";
        for(int i = 0; i < code.length(); i++) {
            if (syntaxSymbols.indexOf(code.charAt(i)) == -1) {
                result = false;
                break;
            }
        }
        return result;
    }

    private static boolean parenthesisAreValid(String code) {
        boolean result = true;
        int score = 0;
        for(int i = 0; i < code.length(); i++) {
            switch (code.charAt(i)) {
                case '[':
                    score += 1;
                        break;
                case ']':
                    score -= 1;
                        break;
            }
            if(score < 0) {
                result = false;
                break;
            }
        }
        if(score != 0)
            result = false;
        return result;
    }
}
