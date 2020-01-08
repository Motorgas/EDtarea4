package Cuentas;

/**
 * la clase forma parte del paquete cuentas
 * @author Pablo	
 * @version 1.0
 * @since 07/01/2020
 */


public class operativa_cuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    
//se han encapsulado los atributos de la clase CCuenta que ahora se llama operativa_cuenta
    
    public operativa_cuenta()
    {
    }
//se ha introducido el método operativa_cuenta, que engloba las sentencias de la clase Main que operan con el objeto cuenta1
    
    public operativa_cuenta(String nom, String cue, double sal, double tipo, float cantidad)
    
//se ha añadido un nuevo parámetro al método operativa_cuenta, de nombre cantidad y de tipo float
    
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

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
