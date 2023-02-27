package Java_Basic.ClasesYObjetos;

public class PruebaPersona {

    public static void main(String[] args) {
        Persona objPersona = new Persona();

        objPersona.nombre = "Vidal";
        objPersona.apellido = "Leon";
        objPersona.edad = 25;
        objPersona.genero ="Masculino";
        objPersona.nacionalidad = "Mexicana";

        objPersona.mostrarInformacion();



    }

}
