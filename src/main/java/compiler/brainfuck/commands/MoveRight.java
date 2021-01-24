package compiler.brainfuck.commands;

import compiler.brainfuck.Memory;
import compiler.brainfuck.commands.Command;

public class MoveRight extends Command{

    public MoveRight() {
        super();
    }

    @Override
    public String execute() throws Exception {
        Memory.moveCarriageRight();
        return "";
    }
}
