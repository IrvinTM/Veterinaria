/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
---------COSAS POR TEMINAR EN EL PROGRAMA----------
---- crear un metodo para imprimir el expediente y la mascota por separado y agregar la opcion al menu
----sumar uno al sub menu de citas para que coincida y sea mas intuitivo//done 
----agregar el atributo de el precio con el metodo para clacularlo
---- arreglar la fecha automatica
----arreglar que no imprime el tipo de mascota y quye imprime el mis objeto mascota siempre
----
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
        Mascota mascota1 = new Mascota();
        Expediente expediente1 = new Expediente();
        Veterinaria local1 = new Veterinaria();


        do {
            System.out.println("---Bienvenido al menu---");
        System.out.println("Ingrese la opcion deseada");
        System.out.println("1.  Ingresar una nueva cita");
        System.out.println("2.  Mostrar citas");
        System.out.println("0. Salir");
        Scanner teclado = new Scanner(System.in);
        opcion = teclado.nextInt();
        

        switch (opcion) {
            case 1:
                System.out.println("Ingresanddo informaacion de la cita");
                System.out.println("Ingrese la edad de su mascota");
                mascota1.setEdad(teclado.nextInt());
                System.out.println("Ingrese el peso de su mascota");
                mascota1.setPeso(teclado.nextFloat());
                System.out.println("Ingrese la altura de su mascota");
                mascota1.setAltura(teclado.nextFloat());
                teclado.nextLine();
                System.out.println("Ingrese el tipo de mascota");
                mascota1.setTipoDeMascota(teclado.nextLine());
                
                System.out.println("Ingrese la informacion del expediente");
                expediente1.setMascota(mascota1);
                System.out.println("Ingrese el diagnostico de la mascota");
                expediente1.setDiagnostico(teclado.nextLine());
                System.out.println("Ingrese el veterinario que atendio a la mascota");
                expediente1.setVeterinario(teclado.nextLine());
                try {
                local1.agregarExpediente(expediente1);
                System.out.println("Numero de expedientes en archivo"+local1.expedientes.size());
                System.out.println("Mascota agregada con exito");
                }
                    
                 catch (Exception e) {
                    System.out.println(e);
                 }
                break;
            case 2:
            int opt;
            int nCita;
                //System.out.println("Seleccione la cita a mostrar");
               // System.out.println(Expediente.getNumeroDeConsulta());
               System.out.println("Mostrar los detalles de las citas");
                System.out.println("Ingrese el numero de cita a mostrar");
                System.out.println("Citas disponibles: "+ local1.expedientes.size());
                nCita = (teclado.nextInt()-1);
                System.out.println("Cita numero: "+ (nCita+1) +" escojida");

                System.out.println("1. Mostrar informacion del expediente");
                System.out.println("2. Mostrar informacion de la mascota");
                opt = teclado.nextInt();
                switch (opt) {
                    case 1:
                        local1.imprimirInformacionExpediente(nCita);
                        
                        break;
                    case 2:
                    local1.imprimirInformacionMascota(nCita);
                        break;
                
                    default:
                    System.out.println("Opcion no valida");
                        break;
                }

                break;

            default:
                System.out.println("Gracias por usar el programa");
                break;
        }
        } while (opcion != 0);

        

    }
}

        
