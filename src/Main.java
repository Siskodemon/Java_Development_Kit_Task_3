import java.sql.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Number x = 3;
        Number y = 47;
        calc.sum(x,y);
        calc.divide(x,y);
        calc.multiply(x,y);
        calc.subtract(x,y);

        Number[] xar= {1.2,3.0,4.46,5.0};
        Number[] yar= {1.2,3,4.46,5};

        if (calc.sizerrays(xar,yar))
            if (calc.compareArrays(xar,yar)) System.out.println("Массивы идентичны");
            else System.out.println("Массивы не идентичны");
        else System.out.println("У массивов разный размер");
    }
}