
package boletin25;

import java.util.Scanner;

public class Boletin25 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        double sb, sf, sl, st,ven, com=0.05, km, die, irpf=0.18, ss=36;
	//Declaramos las variables
	//Introducimos las operaciones a realizar
        System.out.println("Introduzca Sueldo total");
        sf=ler.nextDouble();
        System.out.println("Introduzca los km recorridos");
        km=ler.nextDouble();
        System.out.println("Introduzca candidad de desplazamiento en dias");
        die=ler.nextDouble();
        System.out.println("Introduzca cantidad de ventas");
        ven=ler.nextDouble();
	//Operaciones a realizar para el proyecto
        sb= sf +(km*2)+(die*30)+(ven*com);
        System.out.println("sueldo bruto = " + sb+ "€");
        sl= (sb*irpf)-ss;
        sl= sl -sb;
        System.out.println("sueldo liquido ="+sl+"€");
    }
    
}
