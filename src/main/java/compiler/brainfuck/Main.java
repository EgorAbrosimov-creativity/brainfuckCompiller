package compiler.brainfuck;

import compiler.brainfuck.commands.Command;
import java.util.ArrayList;
import java.util.Scanner;
import compiler.brainfuck.Analyzer;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System. in);
        String code = scanner.nextLine();

        if (Analyzer.codeIsCorrect(code)) {
            Executor executor = new Executor();
            executor.processCodeIntoCommands(code);
            String res = executor.executeCommands();
            System.out.println(res);
        } else {
            System.out.println("Input is incorrect");
        }

    }
}
