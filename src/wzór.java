
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mateusz
 */
public class wzór

{
    public static void main(String[] args) {
        System.out.println("Podaj parametry równania kwadratowego ax2+bx+c");
       Scanner skaner = new Scanner(System.in);
       double a = skaner.nextDouble();
       double b = skaner.nextDouble ();
       double c = skaner.nextDouble ();
       double delta = b*b-4*a*c;
       
       if (delta>0)
           
       {
           delta = Math.sqrt(delta);
           double x1 = (-b-delta)/(2*a);
           double x2 = (-b+delta)/(2*a);
           System.out.println("Pierwiastek równania to" + x1 + "oraz" + x2);
       }
       else if (delta == 0)
       {
        double x0 = -b/(2*a);
        System.out.println("Pierwiastek podwójny to:" + x0);
           
       }
       else if (delta<0)
       {
           System.out.println("Równanie nie ma pierwiastków");
       }
               
       
       
       
    }
    
}



