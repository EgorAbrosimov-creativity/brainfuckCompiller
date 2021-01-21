package compiler.brainfuck.commands;

import compiler.brainfuck.Memory;
import compiler.brainfuck.commands.Command;

public class MoveLeft extends Command{

    public MoveLeft() {
        super();
    }

    @Override
    public void execute() throws Exception {
        Memory.moveCarriageLeft();
    }
}
