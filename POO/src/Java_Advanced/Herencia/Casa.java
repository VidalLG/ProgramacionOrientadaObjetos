package Java_Advanced.Herencia;

public class Casa extends Dueno {
    @Override

    public void casaCompleta (){
        System.out.println("Total de habitaciones:  " + habitaciones + " " + "Total de comedores: " + comedores);

        if (alberca == 1){
            System.out.println("CON ALBERCA");
        }else {
            System.out.println("SIN ALBERCA");
        }



    }



}
