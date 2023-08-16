
package tm22012;
import java.time.LocalDateTime;

/**
 *
 * @author Test
 */
public class Expediente {
    private static int numeroDeConsulta =0;
    private String diagnostico;
    private LocalDateTime fecha;
    private  String veterinario;

    public Expediente() {
    }

    public Expediente(int numeroDeConsulta, String diagnostico, LocalDateTime fecha, String veterinario) {
        Expediente.numeroDeConsulta = numeroDeConsulta++;
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

        

    



    
}
