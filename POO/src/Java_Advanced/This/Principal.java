package Java_Advanced.This;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Base: " );
        int base = entrada.nextInt();
        System.out.println("Altura: ");
        int altura = entrada.nextInt();

       Rectangulo objRectangulo = new Rectangulo(base,altura);
       objRectangulo.Imprimir();

    }



}
