package biblioteca.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import biblioteca.modelo.Libro;

public class LibroIterator implements Iterator {


    private ArrayList<Libro> libros;
    private int posicion = 0;

    public LibroIterator(ArrayList<Libro> libros) {
        this.libros = new ArrayList<>(libros);

        Collections.sort(this.libros, Comparator.comparing(Libro::getAutor));
    }

    @Override
    public boolean hasNext() {
        return posicion < libros.size();
    }

    @Override
    public Libro next() {
        return libros.get(posicion++);
    }

}
