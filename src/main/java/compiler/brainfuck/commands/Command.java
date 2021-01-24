package compiler.brainfuck.commands;

import compiler.brainfuck.Memory;

public abstract class Command {
    public Memory memory;

    Command() {
        this.memory = Memory.getInstance();
    }

    public abstract String execute() throws Exception;
    // Эксепшоны отхендлитьб
}