package Java_Advanced.TareaPolimosfismo;

import java.util.Scanner;

public abstract class Persona {


    protected String nombre, apellidosPaterno, apellidoMaterno, resultado;
    //protected String medico, tecnico, programador, tester;
    protected int profesion;

    //protected int edad ;
    Scanner entrada = new Scanner(System.in);

    public void pedirDatosPersonales (){
        System.out.println("Introducir Nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Introducir Apellido Paterno");
        apellidosPaterno = entrada.nextLine();
        System.out.println("Introducir Apellido Materno");
        apellidoMaterno = entrada.nextLine();


    }

    public abstract void Datos() ;
    public abstract void empleos();
    public void mostrarDatos (){
        System.out.println();
        System.out.println("Confirmacion de Datos: " + resultado );

       /* if(profesion == 1){
            System.out.println("MEDICO");
        }if (profesion == 2){
            System.out.println("TESTER");
        } if (profesion == 3){
            System.out.println("PROGRAMADOR");
        } if (profesion == 4){
            System.out.println("TECNICO");
        } */




    }



}




