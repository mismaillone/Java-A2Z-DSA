import java.util.*;
public class Solution {


	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = 1, end = 1, fib = 0;
        if(n == 1) {
            System.out.print(start);
        } else if(n == 2) {
            System.out.print(end);
        } else {
            for (int i = 3; i <= n; i++) {
                fib = start + end;
                start = end;
                end = fib;
            }
            System.out.print(fib);
        }
	}

}

