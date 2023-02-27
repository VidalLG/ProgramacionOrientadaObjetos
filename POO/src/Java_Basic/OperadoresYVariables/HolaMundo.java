package Java_Basic.OperadoresYVariables;

public class HolaMundo
{

    //public: es para que puedas acceder/hacer referencia desde otra clase o package
    //static: por que este metodo solo se ejecuta solo una vez
    //void: quiere decir que el metodo no espera que se le regrese algo, es decir, no se usa el "return"
    //main: es el motor que hace que se ejecute el programa

    public static void main(String[] args) {

        //************************ SINTAXIS - REGLAS PARA DEFINIR VARIABLES ****************
       // int MiVariable = 10; --> Esta sintaxis es incorrecta
        // int mivariableentera = 10; --> Esta sintaxis es incorrecta

        //int _miVariableEntera = 10; --> Esta sintaxis es correcta y se llama snake case
        // int mi_Variable_Entera = 10; --> Esta sintaxis es correcta y se llama snake case

        int miVariableEntera = 10; // Esta sintaxis es es correcta y se llama camelCase

        System.out.println("Ejecutable");


    }


}
