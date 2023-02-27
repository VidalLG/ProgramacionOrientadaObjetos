package Java_Basic.SwitchCase;

public class SwichCase {

    public static void main(String[] args) {
        var numero = 2;
        var numeroTexto = "Valor Desconocido";


        switch (numero){
            case 1:
                numeroTexto = "Numero UNO";
                break;

            case 2:
                numeroTexto = "Numero DOS";
                break;

            case 3:
                numeroTexto = "Numero TRES";
                break;

            case 4:
                numeroTexto = "Numero CUATRO";
                break;

            default:
                numeroTexto = "Desconozco ese numero";
        }

        System.out.println("Texto: " + numeroTexto);


    }
}
