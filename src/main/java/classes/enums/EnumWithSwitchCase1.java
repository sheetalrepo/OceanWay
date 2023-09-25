package classes.enums;

/**
 * We are using common method for every enum
 * Disadvantage is we need to use throw stmt
 */
enum Operation{
    PLUS, MINUS, MULTIPLY, DIVIDE;

    double applyOperations(int a, int b){
        switch (this){
            case PLUS:  return a+b;
            case MINUS: return a-b;
            case MULTIPLY:  return a*b;
            case DIVIDE: return a/b;
        }
        throw new AssertionError("Unknown Operation"+this);
    }
}

public class EnumWithSwitchCase1 {


    public static void main(String [] ars){
        System.out.println("Plus: "+Operation.PLUS.applyOperations(10,20));
    }
}
