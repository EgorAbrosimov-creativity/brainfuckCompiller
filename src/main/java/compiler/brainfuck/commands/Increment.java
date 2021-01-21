package compiler.brainfuck.commands;

import compiler.brainfuck.Memory;
import compiler.brainfuck.commands.Command;

public class Increment extends Command{

    public Increment() {
        super();
    }

    @Override
    public void execute() throws Exception {
        Memory.incCarriageAt();
    }
}
