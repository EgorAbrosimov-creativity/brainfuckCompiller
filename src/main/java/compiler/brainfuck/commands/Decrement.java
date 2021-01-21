package compiler.brainfuck.commands;

import compiler.brainfuck.Memory;
import compiler.brainfuck.commands.Command;

public class Decrement extends Command{

    public Decrement() {
        super();
    }

    @Override
    public void execute() throws Exception {
        Memory.decCarriageAt();
    }
}