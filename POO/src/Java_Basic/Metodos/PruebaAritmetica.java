package Java_Basic.Metodos;

public class PruebaAritmetica {

    public static void main(String[] args) {
        Aritmetica aritmetica = new Aritmetica();
        aritmetica.a = 8;
        aritmetica.b = 6;

        aritmetica.Sumar();

        //Lineas para el metodo de SumarConRetorno
        var resultado = aritmetica.SumarConRetorno();
        System.out.println("--------------------------------------------");
        System.out.println("el resultado retornado es= " + resultado);


        //Imprimir lo que se guarda en el metodo
        System.out.println("el resultado retornado es= " + aritmetica.SumarConRetorno());


        //Lineas metodo de SumarConParametros

        System.out.println("--------------------------------------------");

        resultado = aritmetica.SumarConParametros(10,44); //se ingresan parametros para calcular lo que esta dentro del metodo
        System.out.println(resultado);


    }

}
