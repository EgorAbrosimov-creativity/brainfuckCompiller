package compiler.brainfuck;

import compiler.brainfuck.Analyzer;

public class Main {
    public static void main(String[] args) throws Exception {
        Analyzer analyzer = new Analyzer();
        boolean res = Analyzer.codeIsCorrect("");
        System.out.println(res);
    }
}
