package compiler.brainfuck;

import compiler.brainfuck.commands.*;

import java.util.ArrayList;

public class Executor {//redo

    private ArrayList<Command> commands = new ArrayList<Command>();


    public String executeCommands() {
        String res = "";
        try {
            for (int i = 0; i < commands.size(); i++)
                res += commands.get(i).execute();
        } catch (Exception e) {
            System.out.println("Seems like you tried to reach an unexisting cell");
        }
        return res;
    }

    public void processCodeIntoCommands(String code) throws Exception {
        //int iter = 0;
        for (int i = 0; i < code.length(); i++) {
            switch (code.charAt(i)) {
                case '>':
                    commands.add(new MoveRight());
                    break;
                case '<':
                    commands.add(new MoveLeft());
                    break;
                case '+':
                    commands.add(new Increment());
                    break;
                case '-':
                    commands.add(new Decrement());
                    break;
                case '.':
                    commands.add(new PrintCarriageChar());
                    break;
                case '[':
                    if (Memory.getCarriageValue() == 0) {
                        int counter = 1;
                        while (counter > 0) {
                            i++;
                            if (code.charAt(i) == '[')
                                counter++;
                            if (code.charAt(i) == ']')
                                counter--;
                        }
                    }
                case ']':
                    if (Memory.getCarriageValue() != 0) {
                        int counter = 1;
                        while (counter > 0) {
                            i--;
                            if (code.charAt(i) == '[')
                                counter--;
                            if (code.charAt(i) == ']')
                                counter++;
                        }
                    }

            }
        }
    }

    public ArrayList<Command> getCommandSeq() {
        return commands;
    }
}