package vehiculos;

import interfaces.PuedeNavegar;

import javax.swing.*;

public class Yate extends Vehiculo implements PuedeNavegar {
    private boolean tieneCocina;
    private int numMotores;
    private double metrosEslora;

    public Yate(){
        this.matricula="123KRB";
        this.marca="Bavaria Yatchs";
        this.modelo="Bavaria Cruiser 46";
        this.color="Blanco";
        this.kilometros=0;
        this.numPuertas=0;
        this.numPlazas=20;
        this.tieneCocina=false;
        this.numMotores=2;
        this.metrosEslora=12.5;
    }
    public Yate(String matricula, String marca, String modelo, String color, double kilometros, int numPuertas, int numPlazas, boolean tieneCocina, int numMotores, double metrosEslora) {
        super(matricula, marca, modelo, color, kilometros, numPuertas, numPlazas);
        this.tieneCocina = tieneCocina;
        this.numMotores = numMotores;
        this.metrosEslora = metrosEslora;
    }

    public boolean getTieneCocina(){
        return this.tieneCocina;
    }
    public void setTieneCocina(boolean tieneCocina){
        this.tieneCocina=tieneCocina;
    }
    public int getNumMotores(){
        return this.numMotores;
    }
    public void setNumMotores(int numMotores){
        this.numMotores=numMotores;
    }
    public double getMetrosEslora(){
        return this.metrosEslora;
    }
    public void setMetrosEslora(double metrosEslora){
        this.metrosEslora=metrosEslora;
    }

    @Override
    public void arrancar() {
        JOptionPane.showInputDialog(null,"El yate ha arrancado.");
    }
    @Override
    public void acelerar() {
        JOptionPane.showInputDialog(null,"El yate está acelerando.");
    }
    @Override
    public void frenar() {
        JOptionPane.showInputDialog(null,"El yate está frenando.");
    }
    @Override
    public void navegar() {
        JOptionPane.showInputDialog(null,"Esto es un yate y navega por el mar.");
    }
    @Override
    public String toString() {
        // Llama al método toString() de la superclase y agrega detalles adicionales
        return super.toString() + String.format("\nTiene cocina: %s \nMotores : %d \nMetros eslora: %.2f",
                 tieneCocina ? "Sí" : "No", numMotores, metrosEslora);
    }

    public void zarpar(){
        JOptionPane.showInputDialog(null,"El yate ha zarpado.");
    }
    public void atracar(){
        JOptionPane.showInputDialog(null,"El yate ha atracado.");
    }
}
