
package tm22012;

/**
 *
 * @author Test
 */
public class Mascota {
    private int edad;
    private float peso;
    private float altura;
    private String tipoDeMascota;

      public Mascota() {
    }

    public Mascota(int edad, float peso, float altura, String tipoDeMascota) {
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.tipoDeMascota = tipoDeMascota;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getTipoDeMascota() {
        return tipoDeMascota;
    }

    public void setTipoDeMascota(String tipoDeMascota) {
        this.tipoDeMascota = tipoDeMascota;
    }

    
    

  

    
    
}
