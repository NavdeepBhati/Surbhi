package Code1;
/**** Functional Interface ****/
interface Predicate {
    boolean test(int n);
}

class EvenOddCheck {
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
}

/***** Reference To A Static Method *****/
public class MethodReferenceEx1 {

    public static void main(String[] args) {

        /**** Using Lambda Expression ****/
        System.out.println("--------------------Using Lambda Expression----------------------");
        Predicate predicate1 = (n) -> EvenOddCheck.isEven(n);
        System.out.println(predicate1.test(20));

        /**** Using Method Reference ****/
        System.out.println("\n---------------------Using Method Reference---------------------");
        Predicate predicate2 = EvenOddCheck::isEven;
        System.out.println(predicate2.test(25));
    }
}
