package biblioteca;
import biblioteca.aggregate.CatalogoLibros;
import biblioteca.iterator.Iterator;
import biblioteca.modelo.Libro;

public class Main {


    public static void main(String[] args) {


        CatalogoLibros catalogo = new CatalogoLibros();


        catalogo.agregarLibro(new Libro(1, "Programación en Java", "Carlos Gómez", "Tecnología", true));
        catalogo.agregarLibro(new Libro(2, "Bases de Datos", "Heber Abanto", "Tecnología", true));
        catalogo.agregarLibro(new Libro(3, "Fundamentos de Algoritmos en Programación", "Walter Lazo", "Tecnologia", true));
        catalogo.agregarLibro(new Libro(4, "Literatura Peruana", "María López", "Literatura", true));
        catalogo.agregarLibro(new Libro(5, "Matemática Básica", "Jorge Ramírez", "Educación", true));
        catalogo.agregarLibro(new Libro(6, "Física General", "Pedro Sánchez", "Ciencia", false));
        catalogo.agregarLibro(new Libro(7, "Fisica I ", "Limae ", "Ciencia", true));
        catalogo.agregarLibro(new Libro(8, "Redes de Computadoras", "Fernando Díaz", "Tecnología", true));


        Iterator iterator = catalogo.createIterator();

        System.out.println("=== CATÁLOGO DE LIBROS ORDENADO POR AUTOR ===\n");


        while (iterator.hasNext()) {
            Libro libro = iterator.next();
            System.out.println(libro);
        }
    }

}
