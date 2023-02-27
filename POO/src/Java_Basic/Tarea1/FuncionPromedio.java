package Java_Basic.Tarea1;

public class FuncionPromedio {

    public static void main(String[] args) {
        TareaPromedio objTareaPromedio = new TareaPromedio();

        objTareaPromedio.matematicas = 5F;
        objTareaPromedio.biologia = 8F;
        objTareaPromedio.quimica = 7F;


        objTareaPromedio.Promedio();

        if (objTareaPromedio.promedio_final >= 6){
            System.out.println("Alumno aprobado");
            System.out.println("Calificación Final: " + objTareaPromedio.promedio_final);
        } else {
            System.out.println("Alumno reprobado");
            System.out.println("Calificación Final: " + objTareaPromedio.promedio_final);

        }

    }




}
