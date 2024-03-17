package vehiculos;
import interfaces.PuedeVolar;
import javax.swing.*;

public class Avioneta extends Vehiculo implements PuedeVolar {
    private String aeropuerto;
    private double maxKg;
    public Avioneta(){
        this.matricula="123LLR";
        this.marca="Airbus";
        this.modelo="A220";
        this.color="Blanco";
        this.kilometros=0;
        this.numPuertas=2;
        this.numPlazas=4;
        this.aeropuerto="Aeropuerto 1";
        this.maxKg=51029;
    }
    public Avioneta(String matricula, String marca, String modelo, String color, double kilometros, int numPuertas, int numPlazas, String aeropuerto, double maxKg) {
        super(matricula, marca, modelo, color, kilometros, numPuertas, numPlazas);
        this.aeropuerto =aeropuerto;
        this.maxKg =maxKg;

    }

    public String getAeropuerto(){
        return this.aeropuerto;
    }
    public void setAeropuerto(String aeropuerto){
        this.aeropuerto=aeropuerto;
    }
    public double getMaxKg(){
        return this.maxKg;
    }
    public void setMaxKg(double maxKg){
        this.maxKg=maxKg;
    }

    @Override
    public void arrancar() {
        JOptionPane.showInputDialog(null,"La avioneta ha arrancado.");
    }
    @Override
    public void acelerar() {
        JOptionPane.showInputDialog(null,"La avioneta está acelerando.");
    }
    @Override
    public void frenar() {
        JOptionPane.showInputDialog(null,"La avioneta está frenando.");
    }
    @Override
    public void volar() {
        JOptionPane.showInputDialog(null,"Esto es una avioneta y vuela por el cielo.");
    }
    @Override
    public String toString() {
        // Llama al método toString() de la superclase y agrega detalles adicionales
        return super.toString() + String.format("\nAeropuerto: %s \nMax Kilos: %.2f",
                 aeropuerto, maxKg);
    }

    public void despegar(){
        JOptionPane.showInputDialog(null,"La avioneta ha despegado.");
    }
    public void aterrizar(){
        JOptionPane.showInputDialog(null,"La avioneta ha aterrizado.");
    }
}
