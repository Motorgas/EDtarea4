package Cuentas;

/**
 * la clase forma parte del paquete cuentas
 * @author Pablo	
 * @version 1.0
 * @since 07/01/2020
 */


public class Main {

    public static void main(String[] args) {
        operativa_cuenta cuenta1; 
        
//se ha cambiado el nombre de la variable "miCuenta" por "cuenta1"
        
        double saldoActual;
        
//el método operativa_cuenta, que englobe las sentencias de la clase Main que operan con el objeto cuenta1
        
        cuenta1 = new operativa_cuenta("Antonio Lopez","1000-2365-85-1230456789",2500,0, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
