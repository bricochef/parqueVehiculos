package vehiculos;
import interfaces.PuedeCircular;
import javax.swing.*;

public class Coche extends Vehiculo implements PuedeCircular {
    private int numAirbags;
    private boolean techoSolar;
    private boolean tieneRadio;

    //El constructor sin parámetros es heredado de la superclase y en este caso no es necesario modificarlo.
    public Coche(){
        this.matricula="123JGG";
        this.marca="Seat";
        this.modelo="Altea";
        this.color="Blanco";
        this.kilometros=0;
        this.numPuertas=4;
        this.numPlazas=5;
    }
    //Constructor con argumentos.
    public Coche(String matricula,String marca,String modelo,String color,double kilometros,int numPuertas,int numPlazas,int numAirbags,boolean techoSolar,boolean tieneRadio){
        super(matricula,marca,modelo,color,kilometros,numPuertas,numPlazas);
        this.numAirbags=numAirbags;
        this.techoSolar=techoSolar;
        this.tieneRadio=tieneRadio;

    }

    public int getNumAirbags(){
         return this.numAirbags;
    }
    public void setNumAirbags(int numAirbags) {
        this.numAirbags = numAirbags;
    }

    public boolean getTechoSolar() {
        return techoSolar;
    }

    public void setTechoSolar(boolean techoSolar) {
        this.techoSolar = techoSolar;
    }
    public boolean getTieneRadio() {
        return tieneRadio;
    }
    public void setTieneRadio(boolean tieneRadio) {
        this.tieneRadio = tieneRadio;
    }

    @Override
    public void arrancar() {
        JOptionPane.showInputDialog(null,"El coche ha arrancado.");
    }
    @Override
    public void acelerar(){
        JOptionPane.showInputDialog(null,"El coche está acelerando.");
    }
    @Override
    public void frenar(){
        JOptionPane.showInputDialog(null,"El coche está frenando.");
    }
    @Override
    public void circular() {
        JOptionPane.showInputDialog(null,"Esto es un coche y puede circular por carreterras");
    }
    @Override
    public String toString() {
        // Llama al método toString() de la superclase y agrega detalles adicionales
        return super.toString() + String.format("\nNúmero de airbags: %d \nTecho solar: %s \nTiene radio: %s",
                numAirbags, techoSolar ? "Sí" : "No", tieneRadio ? "Sí" : "No");
    }

    public void tunear(String color) {
        // Deja el cuentakilómetros a cero
        this.kilometros = 0;
        // Instala un techo solar si no está instalado
        if (!techoSolar) {
            this.techoSolar = true;
        }
        // Pinta el coche del color elegido
        this.color = color;
        // Muestra un mensaje indicando la operación
        JOptionPane.showInputDialog(null,"El coche ha sido tuneado. Cuentakilómetros reiniciado, techo solar instalado y pintado de color " + color + ".");
    }
    public void aparcar() {
        JOptionPane.showInputDialog(null,"El coche está aparcado.");
    }
}
