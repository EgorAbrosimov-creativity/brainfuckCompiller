package compiler.brainfuck;

import java.util.ArrayList;

public final class Memory {

    private static Memory instance;

    private static int[] memoryKeeper;

    private static int carriageAt;

    private Memory(){
        memoryKeeper = new int[30000];
        carriageAt = 0;
    }

    public static Memory getInstance() {
        if (instance == null) {
            instance = new Memory();
        }
        return instance;
    }

    public void flush() {
        memoryKeeper = new int[30000];
        carriageAt = 0;
    }

    public static int getCarriageAt() {
        return carriageAt;
    }

    public static int getCarriageValue() { return memoryKeeper[carriageAt];}


    public static void moveCarriageLeft() throws Exception {
        if(carriageAt - 1 < 0)
            //throw new Exception("Carriage out of range!");
            System.out.println("123");
        else
            carriageAt -= 1;
    }

    public static void moveCarriageRight() throws Exception {
        if (carriageAt + 1 >= memoryKeeper.length)
            //throw new Exception("Carriage out of range");
            System.out.println("132");
        else carriageAt += 1;
    }

    public static void decCarriageAt() {
        memoryKeeper[carriageAt] = (memoryKeeper[carriageAt] - 1 + 153) % 153;
    }

    public static void incCarriageAt() {
        memoryKeeper[carriageAt] = (memoryKeeper[carriageAt] + 1) % 153;
    }

}
