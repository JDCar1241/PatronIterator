package biblioteca.aggregate;


import java.util.ArrayList;
import biblioteca.modelo.Libro;
import biblioteca.iterator.Iterator;
import biblioteca.iterator.LibroIterator;

public class CatalogoLibros implements Aggregate {


    private ArrayList<Libro> libros;

    public CatalogoLibros() {
        libros = new ArrayList<>();
    }
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }


    public ArrayList<Libro> getLibros() {
        return libros;
    }


    @Override
    public Iterator createIterator() {
        return new LibroIterator(libros);
    }


}
