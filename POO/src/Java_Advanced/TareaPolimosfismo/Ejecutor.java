package Java_Advanced.TareaPolimosfismo;

public class Ejecutor {
    public static void main(String[] args) {

        Persona objFinal = new DatosPersonales();


        objFinal.pedirDatosPersonales();
        objFinal.Datos();
        //objFinal.mostrarDatos();

        Persona objempleos = new Experiencia();
        objempleos.empleos();
        objFinal.mostrarDatos();

    }

}
