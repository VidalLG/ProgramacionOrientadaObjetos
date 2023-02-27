package Java_Advanced.Constructores;

import java.util.Scanner;

public class SinConstructor {
    private Scanner entrada = new Scanner(System.in);
    String nombre = "";

    public void PedirNombre(){
        System.out.println("¿Cual es tu nombre?" );
        nombre = entrada.nextLine();

    }
    public void Imprimir (){
        System.out.println("Tu nombre es: " + nombre);

    }




}
