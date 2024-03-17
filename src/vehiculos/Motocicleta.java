package vehiculos;
import interfaces.PuedeCircular;
import javax.swing.*;

public class Motocicleta extends Vehiculo implements PuedeCircular {
    private int potenciaMotor;
    private boolean tieneMaletero;

    // Reescribimos el constructor para adaptarlo a las caráctericas de esta clase.
    public Motocicleta(){
        this.matricula="123HVK";
        this.marca="Ducati";
        this.modelo="HyperMotard 698";
        this.color="Negro";
        this.kilometros=0;
        this.numPuertas=0;
        this.numPlazas=2;
        this.potenciaMotor=230;
        this.tieneMaletero=false;
    }
    //Constructor con parámetros.
    public Motocicleta(String matricula, String marca, String modelo, String color, double kilometros, int numPuertas, int numPlazas, int potenciaMotor, boolean tieneMaletero) {
        super(matricula, marca, modelo, color, kilometros, numPuertas, numPlazas);
        this.potenciaMotor = potenciaMotor;
        this.tieneMaletero = tieneMaletero;
    }

    public int getPotenciaMotor(){
        return this.potenciaMotor;
    }
    public void setPotenciaMotor(int potenciaMotor){
        this.potenciaMotor=potenciaMotor;
    }
    public boolean getTieneMaletero(){
        return this.tieneMaletero;
    }
    public void setTieneMaletero(boolean tieneMaletero){
        this.tieneMaletero=tieneMaletero;
    }

    @Override
    public void arrancar() {
        JOptionPane.showInputDialog(null,"La motocicleta ha arrancado.");
    }
    @Override
    public void acelerar() {
        JOptionPane.showInputDialog(null,"La motocicleta está acelerando.");
    }
    @Override
    public void frenar() {
        JOptionPane.showInputDialog(null,"La motocicleta está frenando.");
    }
    @Override
    public void circular() {
        JOptionPane.showInputDialog(null,"Esto es una motocicleta y circula por carretera");
    }
    @Override
    public String toString() {
        // Llama al método toString() de la superclase y agrega detalles adicionales
        return super.toString() + String.format("\nPotencia: %d \nTiene maletero: %s",
                potenciaMotor,tieneMaletero ? "Sí" : "No" );
    }

    public void brincar(){
        JOptionPane.showInputDialog(null,"La moto ha pegado un salto.");
    }
    public void aparcar(){
        JOptionPane.showInputDialog(null,"La moto está aparcada");
    }
}
