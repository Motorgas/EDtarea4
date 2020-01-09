package Cuentas;



public class CCuenta {

	/**
	 * La clase pertenece al paquete Cuentas
	 * @author PabloOH
	 * @version 1.0
	 * @since 07/01/2020
	 */

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    
/**
 * Se han encapsulado los atributos de la clase CCuenta que ahora se llama operativa_cuenta
 */
    
    public CCuenta()
    {
    }
/**
 * se ha introducido el m�todo operativa_cuenta, que engloba las sentencias de la clase Main que operan con el objeto cuenta1
 * @param nom Nombre del titular
 * @param cue N�mero de cuenta del titular
 * @param sal Saldo disponible
 * @param tipo Tipo de inter�s
 */
    
    public CCuenta(String nom, String cue, double sal, double tipo)
    /**
     *Se ha a�adido un nuevo par�metro al m�todo operativa_cuenta, de nombre cantidad y de tipo float

     */
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
/**
 * 
 * @return Devuelve el saldo disponible
 */
    public double estado()
    {
        return getSaldo();
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

	String getNombre() {
		return nombre;
	}

	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	String getCuenta() {
		return cuenta;
	}

	void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	double getSaldo() {
		return saldo;
	}

	void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	double getTipoInteres() {
		return tipoInteres;
	}

	void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
