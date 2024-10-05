/*Să se scrie un program care citește un număr n natural de la tastatură și afișează toți
divizorii acestuia pe ecran. Dacă numărul este prim se va afișa un mesaj corespunzător. */
package Pb3;
import java.util.Scanner;
public class Pb3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți un numar: ");
        int nr = scanner.nextInt();
        System.out.print("Divizorii lui " + nr + " sunt: ");
        boolean prim = true;
        for (int i = 1; i <= nr; i++)
        {
            if (nr % i == 0)
            {
                System.out.print(i + " ");
                if (i != 1 && i != nr)
                {
                    prim = false;
                }
            }
        }
        if (prim)
        {
            System.out.println("\n" + nr + " este prim.");
        }
        scanner.close();
    }
}
