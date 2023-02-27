package Java_Advanced.Herencia;

import java.util.Scanner;

public abstract class Dueno {

    protected int habitaciones, comedores , alberca;
   // protected String  totalAlbercas;
    protected String nombreHabitante, apellidosHabitante, HO;

    Scanner entrada = new Scanner(System.in);
    public void solicitarDatosCasa (){


        System.out.println("Total de Habitaciones : ");
        habitaciones = entrada.nextInt();
        System.out.println("Total de Comedores : ");
        comedores = entrada.nextInt();
        System.out.println("Solicita alberca : 1= SI    2= NO ");
        alberca = entrada.nextInt();

    }

    public void datosHabitanteSolicitar (){
        System.out.println("Ingresar Nombre del Habitante");
        nombreHabitante = entrada.nextLine();
        System.out.println("Ingresar Apellidos del Habitante");
        apellidosHabitante = entrada.nextLine();

    }

    public abstract void casaCompleta ();

    public void mostrarDatosCasa () {
        System.out.println("-----------------  Casa FinDeSenda   ----------------" );
        System.out.println("Habitaciones: " + habitaciones);
        System.out.println("Comedores: " + comedores);

        if (alberca == 1){
            System.out.println("CON ALBERCA");
        }else {
            System.out.println("SIN ALBERCA");
        }





    }

    public void mostrarDatosHabitantes (){
        //System.out.println("Información del Habitante : " + nombreHabitante + " " + apellidosHabitante);
        System.out.println("Información del Habitante : " + HO);
    }



}
