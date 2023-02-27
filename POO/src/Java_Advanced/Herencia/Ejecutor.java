package Java_Advanced.Herencia;

public class Ejecutor {

    public static void main(String[] args) {
        Dueno objCasa = new Casa();
        Dueno objHabitantes = new Habitantes();


        objCasa.solicitarDatosCasa();
        objCasa.casaCompleta();



        objHabitantes.datosHabitanteSolicitar();
        objHabitantes.casaCompleta();


        objHabitantes.mostrarDatosHabitantes();
        objCasa.mostrarDatosCasa();

    }

}
