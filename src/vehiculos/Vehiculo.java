package vehiculos;


public abstract class Vehiculo {
    protected String matricula;
    protected String marca;
    protected String modelo;
    protected String color;
    protected double kilometros;
    protected int numPuertas;
    protected int numPlazas;
    private static int numVehiculos=0;
    public static final int maxVehiculos=5;
    public Vehiculo(){
        this.matricula="123JGG";
        this.marca="Seat";
        this.modelo="Altea";
        this.color="Blanco";
        this.kilometros=0;
        this.numPuertas=4;
        this.numPlazas=5;
        numVehiculos++;
    }
    public Vehiculo(String matricula, String marca, String modelo, String color, double kilometros, int numPuertas, int numPlazas){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.kilometros = kilometros;
        this.numPuertas = numPuertas;
        this.numPlazas = numPlazas;
        numVehiculos++;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getKilometros() {
        return kilometros;
    }
    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }
    public int getNumPuertas() {
        return numPuertas;
    }
    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    public int getNumPlazas() {
        return numPlazas;
    }
    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }
    public static int getNumVehiculos() {
        return numVehiculos;
    }
    public static void setNumVehiculos(int numVehiculos) {
        Vehiculo.numVehiculos = numVehiculos;
    }
    public static int getMaxvehiculos() {
        return maxVehiculos;
    }
    public abstract void arrancar();
    public abstract void acelerar();
    public abstract void frenar();
    @Override
    public String toString() {
        return "Matrícula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo + "\nColor: " + color + "\nKilómetros: " + kilometros + "\nNúmero de puertas: " + numPuertas + "\nNúmero de plazas: " + numPlazas;
    }

}
