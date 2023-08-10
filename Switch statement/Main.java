import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		double[] a = new double [2];
		for ( int i =0; i< a.length; i++) {
		    a[i] = sc.nextDouble();
		}
		double result = areaSwitchCase(ch, a);
		System.out.printf("%.5f", result);
	}
	 public static double areaSwitchCase(int ch, double []a) {
        double pi = Math.PI;
        switch(ch) {
            case 1 : 
             return pi * a[0] * a[0];
          
            case 2 : 
             return a[0] * a[1];

        }
        return 0.0;
    }
}
