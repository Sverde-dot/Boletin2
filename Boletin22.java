package boletin2.pkg2;
import java.util.Scanner;

/**
 * @author sverdecadilla
 */
public class Boletin22 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float celsio=0, fahrenheit=0, kelvin=0;
        System.out.println("Dame los grados :");
        celsio=leer.nextFloat();
        fahrenheit= ((celsio*9/5)+32);
        kelvin=(273 +celsio);
        System.out.println("Hoy tendremos "+fahrenheit+"°F y "+kelvin+"°K");
        
    }
    
}
