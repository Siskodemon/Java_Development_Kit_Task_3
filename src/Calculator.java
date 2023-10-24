import java.awt.font.NumericShaper;

public class Calculator {
    public static <T extends Number> void divide(T x, T y){
        System.out.println(x + "/" + y + "=" + (x.doubleValue() / y.doubleValue()) + ";");
    }

    public static <T extends Number> void sum(T x, T y){
        if (x instanceof Double || y instanceof Double)
            System.out.println(x + "+" + y + "=" + (x.doubleValue() + y.doubleValue()) + ";");
        else System.out.println(x + "+" + y + "=" + ((Integer) x + (Integer) y) + ";");
    }

    public static <T extends Number> void multiply(T x, T y){
        if (x instanceof Double || y instanceof Double)
            System.out.println(x + "*" + y + "=" + (x.doubleValue() * y.doubleValue()) + ";");
        else System.out.println(x + "*" + y + "=" + ((Integer) x * (Integer) y) + ";");
    }
    public static <T extends Number> void subtract(T x, T y){
        if (x instanceof Double || y instanceof Double)
            System.out.println(x + "-" + y + "=" + (x.doubleValue() - y.doubleValue()) + ";");
        else System.out.println(x + "-" + y + "=" + ((Integer) x - (Integer) y) + ";");

    }

    public static <T extends Number> boolean sizerrays(T[] xar,T[] yar){
        if (xar.length != yar.length) return false;
        return true;
    }

    public static <T extends Number>  boolean compareArrays(T[] xar,T[] yar){
        for (int i = 0; i < xar.length; i++) {
            if (xar[i].doubleValue() != yar[i].doubleValue()) return false;
        }
        return true;
    }

}
