package demoherencia;
/**
 * @author Adrian Gutierrez
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Hola bien venido, que accion desea realizar");
        System.out.println("1 = Cuenta Bancaria");
        System.out.println("2 = Cuenta de Ahorro");
        System.out.println("3 = Cuenta de Cheques");
        int cuenta = entrada.nextInt();
        
        if (cuenta == 1){       
        cuentaBancaria misAhorros = new cuentaBancaria(1, "Adrián Gutiérrez");
        System.out.println("Saldo: " + misAhorros.getSaldo());
        misAhorros.depositar(1000.0);
        System.out.println("Saldo: " + misAhorros.getSaldo());
        misAhorros.retirar(200.0);
        System.out.println("Saldo: " + misAhorros.getSaldo());
        misAhorros.depositar(300.0);
        misAhorros.depositar(400.0);
        misAhorros.retirar(500.0);
        System.out.println("Saldo: " + misAhorros.getSaldo());
    }

    }
}
