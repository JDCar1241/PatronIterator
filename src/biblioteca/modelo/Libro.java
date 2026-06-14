package biblioteca.modelo;

public class Libro {

    private int id;
    private String titulo;
    private String autor;
    private String categoria;
    private boolean disponible;

    public Libro(int id, String titulo, String autor, String categoria, boolean disponible) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.disponible = disponible;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean isDisponible() {
        return disponible;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nTítulo: " + titulo + "\nAutor: " + autor + "\nCategoría: " + categoria + "\nDisponible: " + (disponible ? "Sí" : "No") + "\n--------------------------------";
    }

}
