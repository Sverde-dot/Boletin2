package boletin2.pkg1;
import java.util.Scanner;

/**
 * @author sverdecadilla
 */
public class Boletin21 {

    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        float preciotaf=0, preciopag=0, porcentopag;
        System.out.println("teclea el precio de la tarifa:");
        preciotaf=leer.nextFloat();
        System.out.println("teclea el precio del pago:");
        preciopag=leer.nextFloat();
        porcentopag=(preciopag*100)/preciotaf;
        System.out.println("el porcentaje es del:"+porcentopag+"%");
    }
    
}
