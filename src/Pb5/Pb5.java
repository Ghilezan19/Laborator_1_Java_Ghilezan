/* Să se scrie un program care generează aleatoriu un număr întreg cuprins între 0 și 20.
Programul va determina dacă numărul aparține șirului lui Fobonacci. */
package Pb5;
import java.util.Random;
public class Pb5
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        int n = rand.nextInt(20);
        System.out.println("S-a generat: " + n);
        boolean fib=true;
        int a = 0;
        int b = 1;
        if (n==a || n==b)
        {
            System.out.println("Apartine sirului Fibbonaci");
        }
        int c = a+b;
        while(c<=n)
        {
            if(c == n)
            {
                System.out.println("Apartine sirului Fibbonaci");
                fib=false;
            }
            a = b;
            b = c;
            c = a + b;
        }
        if(fib)
        {
            System.out.println("Nu apartine sirului Fibbonaci!");
        }
    }
}
