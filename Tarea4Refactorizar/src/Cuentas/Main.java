package Cuentas;

public class Main {

    public static void main(String[] args) {
       /** 
        * M�todo Main hemos cambiado el nombre de la variable "miCuenta" por "cuenta1"
        */
    	CCuenta cuenta1;             
        double saldoActual;        

        cuenta1 = new CCuenta("Antonio Lopez","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es "+ saldoActual );

        operativa_cuenta(cuenta1, 0);
    }

	private static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
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
