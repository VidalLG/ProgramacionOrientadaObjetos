package Java_Basic.OperadoresYVariables;

public class OperadoresCondicionales {

    public static void main(String[] args)
    {

        var a = 5;
        var resultado = a >= 0 && a <= 10 && a ==5; // En esta linea se declara &&, que es igual a AND


        if (resultado)
        {
            System.out.println("Dentro de rango");
        } else {

            System.out.println("Fuera de rango");
        }


        boolean vacaciones = false;
        boolean diaDescanso = true;
        boolean domingo = false;

        if (vacaciones || diaDescanso || domingo) //  En esta linea de codigo se declara ||, que es igual "o" o "OR"
        {
            System.out.println("Puedo beber cerveza");
        } else {

            System.out.println("No puedo beber cerveza");
        }










    }

}
