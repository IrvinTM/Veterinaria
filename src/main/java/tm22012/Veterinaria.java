
package tm22012;
import java.util.ArrayList;


public class Veterinaria {

    public ArrayList<Expediente> expedientes = new ArrayList<Expediente>();

    public void agregarExpediente(Expediente Expediente) {
     expedientes.add(Expediente);
    }

    public void imprimirInformacionExpediente(int indice) {
        if (indice >= 0 && indice < expedientes.size()) {
            Expediente expediente1 = expedientes.get(indice);
            expediente1.calcularPrecio();
            expediente1.imprimirInformacion();
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }
    public void imprimirInformacionMascota(int indice) {
        if (indice >= 0 && indice < expedientes.size()) {
            Expediente expediente1 = expedientes.get(indice);
            expediente1.imprimirMascota();
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }
    
}
