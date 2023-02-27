package Java_Basic.Ciclos;

public class For {
    public static void main(String[] args) {

        /* for (int i  = 0; i < 10; i++){ //Este incremento se usa de uno a uno

            System.out.println("FOR de 1 en 1: " + i);
        }

        System.out.println("------------------------------------------------");

        for (int i  = 0; i < 10; i+=3){ //Este sintaxis se usa para  incremento dos en dos

            System.out.println("FOR de 3 en 3: " + i);
        } */


        System.out.println("-------------------------------------------------");

        for (int i = 1; i <= 10; i++){

            if (i==7){  //Esta funcion es para romper el ciclo
                break;
            }

            System.out.println("For 3 : " + " " + i);

        }

        System.out.println("-------------------------------------------------");

        for (int i = 1; i <= 10; i++){

            if (i==7){  //Esta funcion es para romper el ciclo

                continue; //Continua el ciclo pero no imprime el numero de la condicion
            }

            System.out.println("For 3 : " + " " + i);

        }




    }

}
