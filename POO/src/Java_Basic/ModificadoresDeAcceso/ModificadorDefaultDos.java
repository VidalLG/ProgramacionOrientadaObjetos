package Java_Basic.ModificadoresDeAcceso;

class ModificadorDefaultDos {
    public static void main(String[] args) { //Esto es un metodo
        ModificadorDefault objModificadorDefault = new ModificadorDefault(); //crear objeto
        ModificadorPublico objModificadorPublico = new ModificadorPublico();

        objModificadorDefault.ejemplo(); //Llamar al metodo de la class ModificadorDefault
        objModificadorDefault.ejemploDos();

        objModificadorPublico.ejemploCuatro();


        /*Modificador de acceso por defecto, nos permite acceder a los metodos o
        atributos de una clase, siempre y cuando se encuentre en el mismo package, sino estuviera en
        el mismo package, al utilizar este modificador de acceso, nos devolveria un error de compilacion*/

    }

}
