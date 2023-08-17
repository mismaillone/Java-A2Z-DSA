import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int  a = sc.nextInt();
        int b = sc.nextInt();
        String result = compareIfElse(a, b);
        System.out.println(result);
    }

    public static String compareIfElse(int a, int b) {
        if ( a > b ) {
            return "greater";
        }
        else if ( a == b ) {
            return "equal ";
        }
        else if ( a < b ) {
            return "smaller";
        }
        return "";
    }
}