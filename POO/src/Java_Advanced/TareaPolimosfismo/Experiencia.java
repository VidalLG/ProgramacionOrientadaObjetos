package Java_Advanced.TareaPolimosfismo;

public class Experiencia extends Persona{
    @Override
    public void Datos() {

    }



    @Override

    public void empleos (){
        System.out.println("Selecciona tu profesion: ");
        System.out.println("1: MEDICO  2: TESTER  3: PROGRAMADOR  4: TECNICO");
        profesion= entrada.nextInt();

        switch (profesion){
            case 1:
               // mostrarDatos(); //COMO PASAR LOS DATOS DE UNA CLASE A OTRA GETTER - SETTERS
                System.out.println("MEDICO");

                break;
            case 2:
                System.out.println("TESTER");
                break;
            case 3:
               // System.out.println(nombre + apellidoMaterno + apellidosPaterno +"PROGRAMADOR");
                System.out.println("PROGRAMADOR");
                break;
            case 4:
               // System.out.println(nombre + apellidoMaterno + apellidosPaterno +"TECNICO");
                System.out.println("TECNICO");
                break;


        }


    }


}
