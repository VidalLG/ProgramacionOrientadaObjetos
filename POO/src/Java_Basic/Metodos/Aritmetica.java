package Java_Basic.Metodos;

public class Aritmetica {

    //Atributos

    int a;
    int b;
    int c;

    //Metodo Sumar
    public void Sumar(){
        int resultado = a + b;
        System.out.println("resultado= " + resultado);
    }

    //Metodo SumarConRetorno
    public int SumarConRetorno(){
        int resultado = a + b;
        return resultado;
    }



    // Parametros y argumentos es lo mismo
    public int SumarConParametros(int param1, int param2) {
        a = param1;
        b = param2;
        return a + b ;
    }



}
