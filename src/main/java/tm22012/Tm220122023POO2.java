/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tm22012;

import java.util.Scanner;

/**
 *
 * @author Test
 */
public class Tm220122023POO2 {

    public static void main(String[] args) {

         


int opcion;
    Scanner leer = new Scanner(System.in);
    opcion = leer.nextInt();
    leer.close();
do{

    System.out.println("---Bienvenido al menu---"); 
        System.out.println("Ingrese la opcion deseada");
        System.out.println("1.  Ingresar una nueva cita");
        System.out.println("2.  Mostrar citas");
        System.out.println("0. Salir");
        
        switch (opcion) {
            case 1:
            Mascota mascota1 = new Mascota();
                System.out.println("Ingresanddo informaacion de la cita");
                System.out.println( "Ingrese la edad de su mascota");
                mascota1.setEdad(leer.nextInt());
                System.out.println("Ingrese el peso de su mascota");
                mascota1.setPeso(leer.nextFloat());
                System.out.println("Ingrese la altura de su mascota");
                mascota1.setAltura(leer.nextFloat());
                System.out.println("Ingrese el tipo de mascota");
                mascota1.setTipoDeMascota(leer.nextLine());
                Expediente expediente1 = new Expediente();
                System.out.println( "Ingrese el diagnostico de la mascota");
                expediente1.setDiagnostico(leer.nextLine());
                System.out.println("Ingrese el veterinario que atendio a la mascota");
                expediente1.setVeterinario(leer.nextLine()); 
                System.out.println("Mascota agregada con exito");  
                break;
            case 2:
                System.out.println("Seleccione la cita a mostrar");
                System.out.println(Expediente.getNumeroDeConsulta() );  

                
                break;
        
            default:
                break;
        }
    
    }
    while (opcion != 0);
}
}

        
