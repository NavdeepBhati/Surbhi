package Code2;
import java.util.function.BiFunction;

class MathOperation {

    /**** Addition ****/
    public int add(int a, int b) {
        return a + b;
    }

    /**** Subtraction ****/
    public int sub(int a, int b) {
        return a - b;
    }
}

/***** Reference To An Instance Method Of A Particular Object *****/
public class MethodReferenceEx2 {

    public static void main(String[] args) {

        MathOperation op = new MathOperation();

        /**** Using Lambda Expression ****/
        System.out.println("--------------------Using Lambda Expression----------------------");
        BiFunction<Integer, Integer, Integer> add1 = (a, b) -> op.add(a, b);
        System.out.println("Addtion = " + add1.apply(4, 5));

        BiFunction<Integer, Integer, Integer> sub1 = (a, b) -> op.sub(a, b);
        System.out.println("Subtraction = " + sub1.apply(58, 5));

        /**** Using Method Reference ****/
        System.out.println("\n---------------------Using Method Reference---------------------");
        BiFunction<Integer, Integer, Integer> add2 = op::add;
        System.out.println("Addtion = " + add2.apply(4, 5));

        BiFunction<Integer, Integer, Integer> sub2 = op::sub;
        System.out.println("Subtraction = " + sub2.apply(58, 5));
    }
}



