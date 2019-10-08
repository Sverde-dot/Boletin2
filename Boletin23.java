package bontetin2.pkg3;
import java.util.Scanner;
/**
 *
 * @author sverdecadilla
 */
public class Boletin23 {

    public static void main(String[] args) {
        Scanner leer;
        leer = new Scanner(System.in);
        int cant100,cant20,cant5,cant1;
        System.out.println("Cuantos billetes de 100€: ");
        cant100 = leer.nextInt();
        
        System.out.println("Cuantos billetes de 20€: ");
        cant20 = leer.nextInt();
        
        System.out.println("Cuantos billetes de 5€: ");
        cant5 = leer.nextInt();
        
        System.out.println("Cuantas monedas de 1€: ");
        cant1 = leer.nextInt();
        
        int bucks100 = cant100*100;
        int bucks20 = cant20*20;
        int bucks5 = cant5*5;
        
        System.out.println("Tienes un total de: "+ (bucks100+bucks20+bucks5+cant1));
    }
    
}

