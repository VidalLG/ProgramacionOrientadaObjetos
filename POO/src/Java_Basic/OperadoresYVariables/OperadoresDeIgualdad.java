package Java_Basic.OperadoresYVariables;

public class OperadoresDeIgualdad {
    public static void main(String[] args) {

        var a = 5;
        var b = 4;

        var c = (a == b);
        System.out.println("c = " + c);
        System.out.println();

        var cadena = "hola";
        var cadenaDos = "hola";
        var validacion = cadena == cadenaDos;
        System.out.println("El resultado al comparar la cadena de texto es: " + validacion); // compara referencias de objetos

        var validacionDos = cadena.equals(cadenaDos); //Equals significa igual
        System.out.println();
        System.out.println("El resultado de la cadenaes: "+ validacionDos);




    }

}
