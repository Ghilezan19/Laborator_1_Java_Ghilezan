/*Se cere să se scrie un program Java care să calculeze şi să afişeze perimetru şi aria unui
dreptunghi. Valorile pentru lungime şi lățime se citesc de la tastatura. Sa se adauge un break
point pe prima linie care citește valoarea unei laturi si din acel punct să se ruleze programul
linie cu linie urmărind valorile variabilelor în memorie.
*/
package Pb1;
import java.util.Scanner;
public class Pb1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți lungimea: ");
        float lungime = scanner.nextFloat();
        System.out.print("Introduceți latimea: ");
        float latime = scanner.nextFloat();
        float perimetru = 2 * (lungime + latime);
        float aria = lungime * latime;
        System.out.println("Perimetrul dreptunghiului este: " + perimetru);
        System.out.println("Aria dreptunghiului este: " + aria);
        scanner.close();
    }
}

