package parque;
import vehiculos.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import static vehiculos.Vehiculo.maxVehiculos;

public class Parque {
    private ArrayList<Vehiculo> listVehicular = new ArrayList<>();
    private void mostrarMenu(){
        int opcion;
        do {
            opcion =Integer.parseInt(JOptionPane.showInputDialog(null,"1.Crear un coche (con o sin datos)"+
                    "\n2.Crear un autobús (con o sin datos)"+
                    "\n3.Crear una motocicleta (con o sin datos)"+
                    "\n4.Crear una avioneta (con o sin datos)"+
                    "\n5.Crear un yate (con o sin datos)"+
                    "\n6.Mostrar características de todos los vehículos del parque"+
                    "\n7.Salir del programa"));
            switch (opcion) {
                case 1:
                    crearCoche();
                    break;
                case 2:
                    crearAutobus();
                    break;
                case 3:
                    crearMotocicleta();
                    break;
                case 4:
                    crearAvioneta();
                    break;
                case 5:
                    crearYate();
                    break;
                case 6:
                    mostrarArray(listVehicular);
                    break;
                case 7:
                    JOptionPane.showInputDialog(null, "Saliendo del programa, gracias por entrar");
                    break;
                default:
                    JOptionPane.showInputDialog(null, "Opción no válida. Inténtelo de nuevo.");
            }
        }while (opcion != 7);
    }
    private void crearCoche(){
        if (listVehicular.size() >= maxVehiculos) {
            String respuesta = JOptionPane.showInputDialog(null, "¿Desea crear un coche con datos? (Si/No): ");
            if (respuesta.equalsIgnoreCase("Si")) {
                // Crear coche con datos
                crearCocheConDatos();
            } else {
                // Crear coche sin datos
                crearCocheSinDatos();
            }
        }else {
            JOptionPane.showMessageDialog(null, "El almacén está lleno. No se pueden fabricar más vehículos.");
        }
    }
    private void crearCocheConDatos(){
            String matricula = JOptionPane.showInputDialog("Matrícula:");
            String marca = JOptionPane.showInputDialog("Marca:");
            String modelo = JOptionPane.showInputDialog("Modelo:");
            String color = JOptionPane.showInputDialog("Color:");
            double kilometros = Double.parseDouble(JOptionPane.showInputDialog("Kilómetros:"));
            int numPuertas = Integer.parseInt(JOptionPane.showInputDialog("Número de puertas:"));
            int numPlazas = Integer.parseInt(JOptionPane.showInputDialog("Número de plazas:"));
            int numAirbags = Integer.parseInt(JOptionPane.showInputDialog("Número de airbags:"));
            boolean tieneTechoSolar = JOptionPane.showInputDialog("¿Tiene techo solar? (true/false):").equalsIgnoreCase("true");
            boolean tieneRadio = JOptionPane.showInputDialog("¿Tiene radio? (true/false):").equalsIgnoreCase("true");
            // Crear el objeto coche y agregarlo al ArrayList
            Coche coche = new Coche(matricula, marca, modelo, color, kilometros, numPuertas, numPlazas,
                    numAirbags, tieneTechoSolar, tieneRadio);
            listVehicular.add(coche);
            JOptionPane.showMessageDialog(null, "Coche fabricado y almacenado en el almacén.");
        }
    private void crearCocheSinDatos(){
        Coche coche = new Coche(); // Crear coche con valores por defecto
        listVehicular.add(coche);
        JOptionPane.showInputDialog(null,"Coche creado exitosamente.");
    }
    private void crearAutobus(){
        if (listVehicular.size() >= maxVehiculos) {
            String respuesta = JOptionPane.showInputDialog(null, "¿Desea crear un autobús con datos? (Si/No): ");
            if (respuesta.equalsIgnoreCase("Si")) {
                // Crear autobús con datos
                crearAutobusConDatos();
            } else {
                // Crear autobús sin datos
                crearAutobusSinDatos();
            }
        }else {
            JOptionPane.showMessageDialog(null, "El almacén está lleno. No se pueden fabricar más vehículos.");
        }
    }
    private void crearAutobusConDatos(){
        String matricula = JOptionPane.showInputDialog("Matrícula:");
        String marca = JOptionPane.showInputDialog("Marca:");
        String modelo = JOptionPane.showInputDialog("Modelo:");
        String color = JOptionPane.showInputDialog("Color:");
        double kilometros = Double.parseDouble(JOptionPane.showInputDialog("Kilómetros:"));
        int numPuertas = Integer.parseInt(JOptionPane.showInputDialog("Número de puertas:"));
        int numPlazas = Integer.parseInt(JOptionPane.showInputDialog("Número de plazas:"));
        String tipoRecorrido = JOptionPane.showInputDialog("¿Tipo de recorrido?");
        boolean esEscolar = JOptionPane.showInputDialog("¿Es escolar? (true/false)").equalsIgnoreCase("true");
        // Crear el objeto autobús y agregarlo al ArrayList
        Autobus autobus = new Autobus(matricula, marca, modelo, color, kilometros, numPuertas, numPlazas, tipoRecorrido, esEscolar);
        listVehicular.add(autobus);
        JOptionPane.showMessageDialog(null, "Coche fabricado y almacenado en el almacén.");
    }
    private void crearAutobusSinDatos(){
        Autobus autobus = new Autobus();
        listVehicular.add(autobus);
        JOptionPane.showInputDialog(null,"Autobús creado con éxito.");
    }
    private void crearMotocicleta(){
        if (listVehicular.size() >= maxVehiculos) {
            String respuesta = JOptionPane.showInputDialog(null, "¿Desea crear una motocicleta con datos? (Si/No): ");
            if (respuesta.equalsIgnoreCase("Si")) {
                crearMotocicletaConDatos();
            } else {
                crearMotocicletaSinDatos();
            }
        }else {
            JOptionPane.showMessageDialog(null, "El almacén está lleno. No se pueden fabricar más vehículos.");
        }
    }
    private void crearMotocicletaConDatos(){
        String matricula = JOptionPane.showInputDialog("Matrícula:");
        String marca = JOptionPane.showInputDialog("Marca:");
        String modelo = JOptionPane.showInputDialog("Modelo:");
        String color = JOptionPane.showInputDialog("Color:");
        double kilometros = Double.parseDouble(JOptionPane.showInputDialog("Kilómetros:"));
        int numPuertas = Integer.parseInt(JOptionPane.showInputDialog("Número de puertas:"));
        int numPlazas = Integer.parseInt(JOptionPane.showInputDialog("Número de plazas:"));
        int potenciaMotor = Integer.parseInt(JOptionPane.showInputDialog("Potencia de motor:"));
        boolean tieneMaletero = JOptionPane.showInputDialog("¿Tiene maletero? (true/false)").equalsIgnoreCase("true");

        Motocicleta motocicleta = new Motocicleta(matricula, marca, modelo, color, kilometros, numPuertas, numPlazas, potenciaMotor, tieneMaletero);
        listVehicular.add(motocicleta);
        JOptionPane.showMessageDialog(null, "Motocicleta fabricada y almacenada en el almacén.");
    }
    private void crearMotocicletaSinDatos(){
        Motocicleta motocicleta = new Motocicleta();
        listVehicular.add(motocicleta);
        JOptionPane.showMessageDialog(null,"Motocicleta creada con éxito.");
    }
    private void crearAvioneta(){
        if (listVehicular.size() >= maxVehiculos) {
            String respuesta = JOptionPane.showInputDialog(null, "¿Desea crear una avioneta con datos? (Si/No): ");
            if (respuesta.equalsIgnoreCase("Si")) {
                crearAvionetaConDatos();
            } else {
                crearAvionetaSinDatos();
            }
        }else {
            JOptionPane.showMessageDialog(null, "El almacén está lleno. No se pueden fabricar más vehículos.");
        }
    }
    private void crearAvionetaConDatos(){
        String matricula = JOptionPane.showInputDialog("Matrícula:");
        String marca = JOptionPane.showInputDialog("Marca:");
        String modelo = JOptionPane.showInputDialog("Modelo:");
        String color = JOptionPane.showInputDialog("Color:");
        double kilometros = Double.parseDouble(JOptionPane.showInputDialog("Kilómetros:"));
        int numPuertas = Integer.parseInt(JOptionPane.showInputDialog("Número de puertas:"));
        int numPlazas = Integer.parseInt(JOptionPane.showInputDialog("Número de plazas:"));
        String aeropuerto =JOptionPane.showInputDialog("Aeropuerto:");
        double maxKg = Double.parseDouble(JOptionPane.showInputDialog("Kilos máximos:"));

        Avioneta avioneta = new Avioneta(matricula, marca, modelo, color, kilometros, numPuertas, numPlazas, aeropuerto, maxKg);
        listVehicular.add(avioneta);
        JOptionPane.showMessageDialog(null, "Avioneta fabricada y almacenada en el almacén.");
    }
    private void crearAvionetaSinDatos(){
        Avioneta avioneta = new Avioneta();
        listVehicular.add(avioneta);
        JOptionPane.showMessageDialog(null,"Avioneta creada con éxito.");
    }
    private void crearYate(){
        if (listVehicular.size() >= maxVehiculos) {
            String respuesta = JOptionPane.showInputDialog(null, "¿Desea crear un yate con datos? (Si/No): ");
            if (respuesta.equalsIgnoreCase("Si")) {
                crearYateConDatos();
            } else {
                crearYateSinDatos();
            }
        }else {
            JOptionPane.showMessageDialog(null, "El almacén está lleno. No se pueden fabricar más vehículos.");
        }
    }
    private void crearYateConDatos(){
        String matricula = JOptionPane.showInputDialog("Matrícula:");
        String marca = JOptionPane.showInputDialog("Marca:");
        String modelo = JOptionPane.showInputDialog("Modelo:");
        String color = JOptionPane.showInputDialog("Color:");
        double kilometros = Double.parseDouble(JOptionPane.showInputDialog("Kilómetros:"));
        int numPuertas = Integer.parseInt(JOptionPane.showInputDialog("Número de puertas:"));
        int numPlazas = Integer.parseInt(JOptionPane.showInputDialog("Número de plazas:"));
        boolean tieneCocina = JOptionPane.showInputDialog("¿Tiene cocina? (true/false)").equalsIgnoreCase("true");
        int numMotores = Integer.parseInt(JOptionPane.showInputDialog("Número de motores:"));
        double metrosEslora = Double.parseDouble(JOptionPane.showInputDialog("Número de metros de eslora:"));


        Yate yate = new Yate(matricula, marca, modelo, color, kilometros, numPuertas, numPlazas, tieneCocina, numMotores, metrosEslora);
        listVehicular.add(yate);
        JOptionPane.showMessageDialog(null, "Avioneta fabricada y almacenada en el almacén.");
    }
    private void crearYateSinDatos(){
        Yate yate = new Yate();
        listVehicular.add(yate);
        JOptionPane.showMessageDialog(null,"Yate creado con éxito.");
    }
    private int tipoVehiculo(Vehiculo vehiculo) {
        return switch (vehiculo) {
            case Coche coche -> 1; // Coche

            case Autobus autobus -> 2; // Autobús

            case Motocicleta motocicleta -> 3; // Motocicleta

            case Avioneta avioneta -> 4; // Avioneta

            case Yate yate -> 5; // Yate

            case null, default -> -1; // Código de error para otros tipos de vehículos
        };
    }
    private void mostrarArray(ArrayList<Vehiculo> listVehicular) {
        for (Vehiculo vehiculo : listVehicular) {
            int tipo = tipoVehiculo(vehiculo);
            String mensaje = switch (tipo) {
                case 1 -> ((Coche) vehiculo).toString();
                case 2 -> ((Autobus) vehiculo).toString();
                case 3 -> ((Motocicleta) vehiculo).toString();
                case 4 -> ((Avioneta) vehiculo).toString();
                case 5 -> ((Yate) vehiculo).toString();
                default -> "Tipo de vehículo no reconocido.";
            };
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }
    public static void main(String[] args) {
        Parque parque = new Parque();
        parque.mostrarMenu();
    }
}


