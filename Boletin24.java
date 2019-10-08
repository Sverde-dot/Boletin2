package boletin2.pkg4;
import java.util.Scanner;
/**
 * @author sverdecadilla
 */
public class Boletin24 {

    public static void main(String[] args) {
        Scanner leer;
        leer = new Scanner(System.in);
        int cantotal,cant100 = 1,cant20 = 1,cant5 = 1,cant1 = 1;
        System.out.println("Cuanto dinero llevas encima: ");
        cantotal = leer.nextInt();
        
        int bucks100 = cantotal/100;
        int bucks20 = cantotal%100/20;
        int bucks5 = cantotal%20/5;
        int bucks1 = cantotal%5;
                
        System.out.println("Llevas encima "+bucks100+" de cien \n"+bucks20+" de veinte\n"+bucks5+" de cinco\ny "+bucks1+" Monedas");
    }
    
}
