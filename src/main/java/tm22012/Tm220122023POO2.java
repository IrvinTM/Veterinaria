package tm22012;

import java.util.Scanner;

public class Tm220122023POO2 {

    public static void main(String[] args) {

        int opcion =0 ;
        
        
        Veterinaria local1 = new Veterinaria();


        do {
            try {
                System.out.println("------------------------------");
                System.out.println("  *** Bienvenido al menu  ***");
                System.out.println("  *** Ingrese una opcion ***");
                System.out.println("------------------------------");
                System.out.println("1. Ingresar una nueva cita");
                System.out.println("2. Mostrar citas");
                System.out.println("3. Salir");
                System.out.println("------------------------------");
                
                System.out.print("Seleccione una opcion: ");
    
        Scanner teclado = new Scanner(System.in);
        opcion = teclado.nextInt();



        switch (opcion) {
            case 1:
            Mascota mascota1 = new Mascota();
            Expediente expediente1 = new Expediente();
                System.out.println("Ingresanddo informaacion de la cita");
                System.out.println("------------------------------");
                System.out.println("Ingrese la edad de su mascota en años");
                mascota1.setEdad(teclado.nextInt());
                System.out.println("Ingrese el peso de su mascota(lb)");
                mascota1.setPeso(teclado.nextFloat());
                System.out.println("Ingrese la altura de su mascota(cm)");
                mascota1.setAltura(teclado.nextFloat());
                teclado.nextLine();
                System.out.println("Ingrese el tipo de mascota(perro, gato, etc)");
                mascota1.setTipoDeMascota(teclado.nextLine());
                
                System.out.println("Ingrese la informacion del expediente");
                System.out.println("------------------------------");
                expediente1.setMascota(mascota1);
                System.out.println("Ingrese el diagnostico de la mascota");
                expediente1.setDiagnostico(teclado.nextLine());
                System.out.println("Ingrese el veterinario que atendio a la mascota");
                expediente1.setVeterinario(teclado.nextLine());
                try {
                local1.agregarExpediente(expediente1);
                System.out.println("------------------------------");
                System.out.println("Numero de expedientes en archivo"+local1.expedientes.size());
                System.out.println("Registro exitoso");
                }
                    
                 catch (Exception e) {
                    System.out.println(e);
                 }
                break;
            case 2:
            int opt;
            int nCita;
               System.out.println("--------------CITAS----------------");
                System.out.println("Ingrese el numero de cita a mostrar");
                System.out.println("Citas disponibles:  "+ local1.expedientes.size());
                if (local1.expedientes.isEmpty()) {
                    System.out.println("No hay citas disponibles");
                    break;
                }
                nCita = (teclado.nextInt()-1);
                System.out.println("Cita numero: "+ (nCita+1) +" escojida");
                System.out.println("------------------------------");
                System.out.println("-----Seleccione una opcion-----");
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
                System.out.println("._. ._.");
        
                break;
        }
                
            } catch (Exception e) {
                System.out.println("Entrada no valida intente de nuevo !!!");
            }
           
        } while (opcion != 3);

        

    }
}

        
