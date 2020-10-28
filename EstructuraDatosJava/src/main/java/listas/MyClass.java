package listas;
/**
 * Curso de Estructura de datos de la universidad IUDigital de Antioquia
 * @author Sebastian Cardona Correan
 */
public class MyClass {
    public static void main(String[] args) {
        System.out.println("Comenzamos");
        listaSimple n1 = new listaSimple();
        n1.insertarPrimero(2);
        n1.insertarPrimero(1);
        n1.insertarFinal(3);
        n1.insertarFinal(4);

        System.out.println("Listamos desde main");
        n1.listar();
        System.out.println("Borramos un Elemento");
        n1.borrar(2);
        n1.borrar(5);
        System.out.println("volvemos a listar");
        n1.listar();
    }
}
