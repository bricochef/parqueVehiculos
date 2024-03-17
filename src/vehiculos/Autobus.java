package vehiculos;
import interfaces.PuedeCircular;
import javax.swing.*;

public class Autobus extends Vehiculo implements PuedeCircular {
    private String tipoRecorrido;
    private boolean esEscolar;
    public Autobus(){
        this.matricula="123XDD";
        this.marca="Alsa";
        this.modelo="Supra";
        this.color="Azul marino";
        this.kilometros=0;
        this.numPuertas=3;
        this.numPlazas=42;
        this.tipoRecorrido="Recorrido escolar";
        this.esEscolar=true;
    }
    public Autobus(String matricula, String marca, String modelo, String color, double kilometros, int numPuertas,int numPlazas, String tipoRecorrido, boolean esEscolar) {
        super(matricula, marca, modelo, color, kilometros, numPuertas, numPlazas);
        this.tipoRecorrido=tipoRecorrido;
        this.esEscolar = esEscolar;
    }

    public String getTipoRecorrido(){
        return this.tipoRecorrido;
    }
    public void setTipoRecorrido(String tipoRecorrido){
        this.tipoRecorrido=tipoRecorrido;
    }
    public boolean getEsEscolar(){
        return this.esEscolar;
    }
    public void setEsEscolar(boolean esEscolar){
        this.esEscolar=esEscolar;
    }

    @Override
    public void arrancar() {
        JOptionPane.showInputDialog(null,"El autobús ha arrancado.");
    }
    @Override
    public void acelerar() {
        JOptionPane.showInputDialog(null,"El autobús está acelerando.");
    }
    @Override
    public void frenar() {
        JOptionPane.showInputDialog(null,"El autobús está frenando.");
    }
    @Override
    public void circular() {
        JOptionPane.showInputDialog(null,"Esto es un autobús y circula por carretera.");
    }
    @Override
    public String toString() {
        // Llama al método toString() de la superclase y agrega detalles adicionales
        return super.toString() + String.format("\nTipo recorrido: %s \nEs escolar : %s ",
                tipoRecorrido, esEscolar ? "Sí" : "No");
    }

    public void abrirPuertas(){
        JOptionPane.showInputDialog(null,"Las puertas están abiertas.");
    }
    public void aparcar() {
        JOptionPane.showInputDialog(null,"El autobús está aparcado.");
    }
}
