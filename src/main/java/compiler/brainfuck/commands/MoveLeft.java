package compiler.brainfuck.commands;

import compiler.brainfuck.Memory;
import compiler.brainfuck.commands.Command;

public class MoveLeft extends Command{

    public MoveLeft() {
        super();
    }

    @Override
    public String execute() throws Exception {
        Memory.moveCarriageLeft();
        return "";
    }
}
