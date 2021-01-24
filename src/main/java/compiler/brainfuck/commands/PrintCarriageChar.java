package compiler.brainfuck.commands;

import compiler.brainfuck.Memory;

public class PrintCarriageChar extends Command {
    @Override
    public String execute() throws Exception {
        char charRes = (char)Memory.getCarriageValue();
        return Character.toString(charRes);
    }
    /* we do not actually print here, we return
    * chars ready to print */
}
