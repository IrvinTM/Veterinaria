
package tm22012;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Test
 */
public class Expediente {
    private Mascota mascota;
    private static int numeroDeConsulta =0;
    private String diagnostico;
    private  String fecha;
    private  String veterinario;
    private int id;
    private float precioConsulta;
    public static DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("EEEE, dd/MMMM/yyyy hh:mm a");


    public Expediente() {
        numeroDeConsulta++;
        this.id = numeroDeConsulta;
        this.fecha = LocalDateTime.now().format(formatoFecha);

    }

    public Expediente(Mascota mascota, int numeroDeConsulta, String diagnostico, LocalDateTime fecha, String veterinario) {
        this.mascota = mascota;
        this.diagnostico = diagnostico;
        this.fecha = LocalDateTime.now().format(formatoFecha);
        this.veterinario = veterinario;
        this.id = numeroDeConsulta;
    }

    public void setPrecioConsulta(float precioConsulta) {
        this.precioConsulta = precioConsulta;
    }

    public float getPrecioConsulta() {
        return precioConsulta;
    }

    public static int getNumeroDeConsulta() {
        return Expediente.numeroDeConsulta; 
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }


    public String getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Mascota getMascota() {
        return mascota;
    }
///nota crear un metodo para imprimir el expediente y la mascota por separado

    public void imprimirInformacion(){
        System.out.println("Numero de consulta: "+id);
        System.out.println("Fecha de consulta: "+fecha);
        System.out.println("Diagnostico: "+diagnostico);
        System.out.println("Veterinario: "+veterinario);
        System.out.println("Precio de la consulta: "+precioConsulta);
    }

    public void imprimirMascota(){
        System.out.println("Edad: "+mascota.getEdad());
        System.out.println("Peso: "+mascota.getPeso());
        System.out.println("Altura: "+mascota.getAltura());
        System.out.println("Tipo de mascota: "+mascota.getTipoDeMascota());
    }

    public void calcularPrecio(){
        if(mascota.getEdad()<2){
            setPrecioConsulta(10);
            
        }else if(mascota.getEdad()>=2 && mascota.getEdad()<=7){
            setPrecioConsulta(25);
            
        }
        else if(mascota.getEdad()>7){
            setPrecioConsulta(35);
        }
    }
}

