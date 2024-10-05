/*. Să se scrie un program care citește un set de numerele din fișierul de intrare in.txt, care
conține câte un număr pe un rând, având valorile din figura 18. Programul va determină suma
lor, media aritmetică, valoarea minimă, valoarea maximă, va afișa aceste valori pe ecran și le
va scrie în fișierul de ieșire out.txt. Media aritmetică va fi afișată ca un număr real. */
package Pb2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Pb2
{
    public static void main(String[] args)
    {
        String linie;
        String filename = "src/Pb2/in.txt";
        int minim = Integer.MAX_VALUE;
        int maxim = Integer.MIN_VALUE;
        int suma = 0;
        int contor = 0;
        try (BufferedReader Flux_in = new BufferedReader(new FileReader(filename)))
        {
            while ((linie = Flux_in.readLine()) != null)
            {
                if (!linie.trim().isEmpty())
                {
                    try
                    {
                        int numar = Integer.parseInt(linie.trim());
                        suma =suma+ numar;
                        contor++;
                        if (numar < minim)
                        {
                            minim = numar;
                        }
                        if (numar > maxim)
                        {
                            maxim = numar;
                        }
                    }
                    catch (NumberFormatException e)
                    {
                        System.out.println("Eroare!");
                    }
                }
            }
            if (contor > 0)
            {
                float media = (float) suma / contor;
                System.out.println("Minimul: " + minim);
                System.out.println("Maximul: " + maxim);
                System.out.println("Media Aritmetica: " + media);
            }
            else
            {
                System.out.println("Nu s a citit nimic.");
            }
        }
        catch (IOException e)
        {
            System.out.println("Eroare la citire: " + e.getMessage());
        }
    }
}
