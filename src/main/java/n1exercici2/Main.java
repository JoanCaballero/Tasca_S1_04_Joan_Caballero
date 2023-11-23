package n1exercici2;

import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner sca = new Scanner(System.in);
        System.out.println("Escriu el teu DNI sense la lletra:");
        int DNI = sca.nextInt();
        CalculoDni calculoDni = new CalculoDni(DNI);
    }
}
