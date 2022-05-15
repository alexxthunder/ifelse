import java.util.EnumMap;
import java.util.Enumeration;

public class ifelse {
    public static void main(String[] args) {

        int cash = 100;
        do {
            System.out.println("Minus deneg");
            cash = cash - 20;
        } while (cash > 0);
        printMe(45);
        int s = summ(10,21);
        printMe(s);
        System.out.println(factor(10));
        System.out.println(recursfactor(10));
    }
    public static void printMe(int number) {
        System.out.println(number);
    }
    public static int summ(int a, int b) {
        int result = a + b;
        return result;
    }

    public static int factor(int n) {
        if (n==0) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i<=n; i++) {
            result = result * i;
        }
        return result;
    }
    public static int recursfactor(int l) {
        if (l==0) {
            return 1;
        }
        return l * recursfactor(l-1);
    }
}
