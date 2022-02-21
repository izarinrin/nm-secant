/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secantmethod;

/**
 *
 * @author PerlaMay
 */
public class a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //a= i-1 b= i c= i+1
        Double a = 0.2, b =0.5, c = 0.0, tol = 0.0001, fa = 0.0, fb = 0.0, fc = 0.0, e = 0.0, co = 0.0;
        int i = 0;
        Boolean tolcheck = false;

        System.out.println("[a          ,b          ,c          ,f(a)          ,f(b)          ,f(c)]          ,e");
        while (!tolcheck) {
            fa = function(a);
            fb = function(b);
            c = b - ((fb * (b - a)) / (fb - fa));
            fc = function(c);
            i++;
            System.out.printf("%.9f", a);
            System.out.print(" ");
            System.out.printf("%.9f", b);
            System.out.print(" ");
            System.out.printf("%.9f", c);
            System.out.print(" ");
            System.out.printf("%.9f", fa);
            System.out.print(" ");
            System.out.printf("%.9f", fb);
            System.out.print(" ");
            System.out.printf("%.9f", fc);

            e = (c - b) / c;
            a = b;
            b = c;
            if ((Math.abs(e)) <= tol) {
                tolcheck = true;
            }
            System.out.print(" ");
            System.out.printf("%.4f", (Math.abs(e)) * 100);
            System.out.print("%");
            System.out.println("  iteration #" + i);
        }
        System.out.println("The root of the function using secant method is " + c);

    }

    static double function(double num) {
        double kani = Math.pow(Math.E, 5*num)-3.123*num;
        return kani;
    }

}
