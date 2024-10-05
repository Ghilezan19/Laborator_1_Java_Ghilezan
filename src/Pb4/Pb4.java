/*Să se determine cmmdc a două numere naturale, a căror valoare maximă este 30. Numerele
vor fi generate aleatoriu cu ajutorul unui obiect de tip Random și metodei nextInt(); */
package Pb4;
import java.util.Random;
public class Pb4
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        int a = rand.nextInt(30);
        int b = rand.nextInt(30);
        System.out.println("S-au generat numerele: " + a + " si " + b);
        System.out.println("CMMDC: ");
        if(a==0)
        {
            System.out.println(b);
        }
        else if(b==0)
        {
            System.out.println(a);
        }
        else
        {
            while(a!=b)
            {
                if(b>a)
                {
                    b -= a;
                }
                else
                {
                    a -= b;
                }
            }
            System.out.println(a);
        }
    }
}
