package Code4;
import java.util.function.BiConsumer;

class MathOperations {

    public MathOperations(int a, int b) {
        System.out.println("Sum of " + a + " and " + b + " is " + (a + b));
    }
}

/***** Reference To A Constructor *****/
public class MethodReferenceEx4 {

    public static void main(String[] args) {

        /**** Using Lambda Expression ****/
        System.out.println("--------------------Using Lambda Expression----------------------");
        BiConsumer<Integer, Integer> addtion1 = (a, b) -> new MathOperations(a, b);
        addtion1.accept(10, 20);

        /**** Using Method Reference ****/
        System.out.println("\n---------------------Using Method Reference---------------------");
        BiConsumer<Integer, Integer> addtion2 = MathOperations::new;
        addtion2.accept(50, 20);
    }
}