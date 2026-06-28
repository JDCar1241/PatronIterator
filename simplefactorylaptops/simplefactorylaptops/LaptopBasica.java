package simplefactorylaptops;

public class LaptopBasica extends Laptop {

    public LaptopBasica(String marca, String modelo, int anioFabricacion,
                        String procesador, double tamanioPantalla) {
        super(marca, modelo, anioFabricacion, procesador, tamanioPantalla);
    }

    @Override
    public void ejecutarPrueba() {
        System.out.println("Esta laptop es para uso básico.");
    }
}