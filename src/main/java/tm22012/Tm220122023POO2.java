/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
---------COSAS POR TEMINAR EN EL PROGRAMA----------
---- crear un metodo para imprimir el expediente y la mascota por separado y agregar la opcion al menu 
----agregar el atributo de el precio con el metodo para clacularlo
---- arreglar la fecha automatica
----arreglar que no imprime el tipo de mascota
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
                System.out.println("Ingrese el tipo de mascota");
                mascota1.setTipoDeMascota(teclado.nextLine());
                //limpiando
                teclado.nextLine();
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
                //System.out.println("Seleccione la cita a mostrar");
               // System.out.println(Expediente.getNumeroDeConsulta());
               System.out.println("Mostrar los detalles de las citas");
                System.out.println("Ingrese el numero de cita a mostrar");
                local1.imprimirInformacionExpediente(teclado.nextInt());
        

                break;

            default:
                System.out.println("Gracias por usar el programa");
                break;
        }
        } while (opcion != 0);

        

    }
}

        
