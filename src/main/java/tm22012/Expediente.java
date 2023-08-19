
package tm22012;
import java.time.LocalDateTime;

/**
 *
 * @author Test
 */
public class Expediente {
    private Mascota mascota;
    private static int numeroDeConsulta =0;
    private String diagnostico;
    private LocalDateTime fecha;
    private  String veterinario;

    public Expediente() {
    }

    public Expediente(Mascota mascota, int numeroDeConsulta, String diagnostico, LocalDateTime fecha, String veterinario) {
        Expediente.numeroDeConsulta = numeroDeConsulta++;
        this.mascota = mascota;
        this.diagnostico = diagnostico;
        this.fecha = LocalDateTime.now();
        this.veterinario = veterinario;
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

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
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
        System.out.println("Numero de consulta: "+numeroDeConsulta);
        System.out.println("Fecha de consulta: "+fecha);
        System.out.println("Diagnostico: "+diagnostico);
        System.out.println("Veterinario: "+veterinario);
        System.out.println("Edad: "+mascota.getEdad());
        System.out.println("Peso: "+mascota.getPeso());
        System.out.println("Altura: "+mascota.getAltura());
        System.out.println("Tipo de mascota: "+mascota.getTipoDeMascota());
    }


        

    



    
}
