package compiler.brainfuck.commands;

import compiler.brainfuck.Memory;
import compiler.brainfuck.commands.Command;

public class Increment extends Command{

    public Increment() {
        super();
    }

    @Override
    public String execute() throws Exception {
        Memory.incCarriageAt();
        return "";
    }
}
