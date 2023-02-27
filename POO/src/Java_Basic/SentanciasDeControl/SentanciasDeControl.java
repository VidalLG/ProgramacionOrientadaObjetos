package Java_Basic.SentanciasDeControl;

public class SentanciasDeControl {
    public static void main(String[] args) {
        boolean condicion = false;

        //EJERCICIO 1

        if (condicion){
            System.out.println("Condicion verdadera");

        }else {
            System.out.println("Condicion falsa");
        }

        //EJERCICIO 2

        int x = 11;

        if (x <= 10 || x >= 12 ){
            System.out.println("Esto es correcto");
        } else {
            System.out.println("Esto es incorrecto");
        }

        //EJERCICIO 3
        System.out.println();
        System.out.println();
        System.out.println("EJERCICIO TRESSS");

        int numero = 5;
        String texto = "Numero Desconocido";

        if (numero == 1){
            texto= "Numero Uno";

        } else if (numero == 2) {
            texto = "Numero Dos";

        } else if (numero == 3) {
            texto = "Numero Tres";
        } else if (numero == 4) {
            texto = "Numero Cuatro";
        }   else {
            texto = "Numero Desconocido";
        }

        System.out.println("Texto: " + texto);


    }

}
