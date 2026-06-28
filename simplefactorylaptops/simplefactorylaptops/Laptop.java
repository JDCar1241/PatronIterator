package simplefactorylaptops;

public abstract class Laptop {

    protected String marca;
    protected String modelo;
    protected int anioFabricacion;
    protected String procesador;
    protected double tamanioPantalla;

    public Laptop(String marca, String modelo, int anioFabricacion,
                  String procesador, double tamanioPantalla) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.procesador = procesador;
        this.tamanioPantalla = tamanioPantalla;
    }

    public void mostrarInformacion() {
        System.out.println(marca + " " + modelo +
                " (" + anioFabricacion + ") | " +
                procesador + " | " +
                tamanioPantalla + "\"");
    }

    public abstract void ejecutarPrueba();
}