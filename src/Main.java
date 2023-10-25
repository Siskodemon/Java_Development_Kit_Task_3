import java.sql.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Пункт 1
        Calculator calc = new Calculator();
        Number x = 3;
        Number y = 47;
        calc.sum(x,y);
        calc.divide(x,y);
        calc.multiply(x,y);
        calc.subtract(x,y);

        //Пункт 2
        Number[] xar= {1.2,3.0,4.46,5.0};
        Number[] yar= {1.2,3,4.46,5};

        if (calc.sizerrays(xar,yar))
            if (calc.compareArrays(xar,yar)) System.out.println("Массивы идентичны");
            else System.out.println("Массивы не идентичны");
        else System.out.println("У массивов разный размер");

        //Пункт 3
        Pair<String> pair1 = new Pair<>("First","Second");
        Pair<Integer> pair2 = new Pair<>(1,2);
        Pair<Double> pair3 = new Pair<>(245.23,267.045);
        System.out.println(pair1.toString());
        System.out.println(pair2.toString());
        System.out.println(pair3.toString());
    }


}