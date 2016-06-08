package demoherencia;
/**
 * @author Adrian Gutierrez
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Hola bienvenido, ¿que accion desea realizar?:");
        System.out.println("1 = Cuenta Bancaria");
        System.out.println("2 = Cuenta de Ahorro");
        System.out.println("3 = Cuenta de Cheques");
        int cuenta = entrada.nextInt();
        
        if (cuenta == 1){          
            System.out.println("Proporcione el número de la cuenta:");
            int numeroDeCuenta = entrada.nextInt();
            System.out.println("Proporcione el nombre del cliente: ");
            String nombreDelCliente = entrada.next();
            System.out.println("Proporcione los apellidos del cliente:");
            String apellidosDelCliente = entrada.next();
            Cliente cliente = new Cliente(nombreDelCliente, apellidosDelCliente);
        
            cuentaBancaria cuentaBancaria = new cuentaBancaria (numeroDeCuenta, cliente);
            int contador = 0;
            while (contador == 0){
                System.out.println("¿Que acción desea realizar?: ");
                System.out.println("1 = Introducir datos personales.");
                System.out.println("2 = Proporcionar los datos del cliente.");
                System.out.println("3 = Depositar.");
                System.out.println("4 = Retirar.");
                System.out.println("5 = Finalizar.");
                int accionARealizar = entrada.nextInt();
                
                if (accionARealizar == 1){
                    String fechaDeNacimiento;
                    System.out.println("Porporcione la fecha de nacimiento.");
                    fechaDeNacimiento = entrada.nextLine();
                    System.out.println("Porporcione su direccion: ");
                    String direccionDelCliente = entrada.nextLine();
                    System.out.println("Porporcione su acupacion: ");
                    String ocupacionDelCliente = entrada.nextLine();                
                    System.out.println("Proporcione su telefono: ");
                    String numeroDeTelefono = entrada.nextLine();                
                    System.out.println("Proporcione su email: ");
                    String emailDelCliente = entrada.nextLine();
                    cliente.setFechaDeNacimiento(fechaDeNacimiento);
                    cliente.setDireccionDelCliente(direccionDelCliente);
                    cliente.setOcupacionDelCliente(ocupacionDelCliente);
                    cliente.setNumeroDeTelefono(numeroDeTelefono);
                    cliente.setEmailDelCliente(emailDelCliente);   
                }
                else if (accionARealizar == 2){
                    System.out.println("Datos personales del Cliente...");
                    System.out.println ("El número de cuenta: " + cuentaBancaria.getNumeroDeCuenta());
                    System.out.println ("El nombre del cliente: " + cliente.getNombreDelCliente() 
                            + " " + cliente.getApellidosDelCliente());
                    System.out.println("Fecha de nacimiento: " + cliente.getFechaDeNacimiento());
                    System.out.println ("Domicilio: " + cliente.getDireccionDelCliente());
                    System.out.println("Ocupación: " + cliente.getOcupacionDelCliente());
                    System.out.println("Número telefónico: " + cliente.getNumeroDeTelefono());
                    System.out.println("Email: " + cliente.getEmailDelCliente());
                }
                else if (accionARealizar == 3){
                    System.out.println("Deposito Bancario...");
                    System.out.println("¿Cuánto desea depositar?: ");
                    double cantidad = entrada.nextDouble();
                    cuentaBancaria.depositar(cantidad);
                }
                else if (accionARealizar == 4){
                    System.out.println("¿Retiro de efectivo...");
                    System.out.println("¿Cuánto desea retirar?: ");
                    double cantidad = entrada.nextDouble();
                    cuentaBancaria.retirar(cantidad);
                }
                else if (accionARealizar == 5){
                    System.out.println("Finalizar...");
                    System.out.println("Se ha finalizado la operación bancaria.");
                    contador = 1;
                }
                double saldo = cuentaBancaria.getSaldo();
                System.out.println(saldo);
            }
        }
        else {
            System.out.println("Acción no reconocida.");
        }
        
        if (cuenta == 2){
            int numeroDeCuenta;
            String cliente;
  
            System.out.println("Ingrese el número de cuenta del cliente: ");
            numeroDeCuenta = entrada.nextInt();
            System.out.println("Ingrese el nombre del cliente: ");
            cliente = entrada.next();
            cuentaDeAhorro nuevaCuenta = new cuentaDeAhorro(numeroDeCuenta, cliente);
            
            System.out.println(nuevaCuenta.getSaldo());
            nuevaCuenta.depositar(200);
            System.out.println(nuevaCuenta.getSaldo());
            nuevaCuenta.corteMensual();
            System.out.println(nuevaCuenta.getSaldo());
            nuevaCuenta.retirar(500);
        }
        
        if (cuenta == 3){
            int numeroDeCuenta;
            String cliente;
            int contador;
            int accionARealizar;
            System.out.println("Proporcione el número de la cuenta: ");
            numeroDeCuenta = entrada.nextInt();
            System.out.println("Proporcione el nombre del cliente: ");
            cliente = entrada.next();
            cuentaDeCheques cuentaDeCheques = new cuentaDeCheques(numeroDeCuenta, cliente);
            contador = 0;
            
            while (contador == 0){
                System.out.println("¿Qué acción desea realizar?: ");
                System.out.println("1 = Depositar");
                System.out.println("2 = Retirar");
                System.out.println("3 = Finalizar");
                accionARealizar = entrada.nextInt();
                
                if (accionARealizar == 1){
                    System.out.println("Deposito bancario...");
                    System.out.println("¿Cuánto desea depositar?: ");
                    double cantidad = entrada.nextDouble();
                    cuentaDeCheques.depositar(cantidad);
                }
                else if (accionARealizar == 2){
                    System.out.println("Retiro de efectivo...");
                    System.out.println("¿Cuánto desea retirar?: ");
                    double cantidad = entrada.nextDouble();
                    cuentaDeCheques.retirar(cantidad);
                }
                else if (accionARealizar == 3){
                    System.out.println("Finalizar");
                    contador = 1;
                }
                else {
                    System.out.println("No se puede realizar la operación bancaria.");
                }
                double saldo = cuentaDeCheques.getSaldo();
                System.out.println(saldo);
            }
        }
    }
}
