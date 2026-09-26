package CLASE_5;

public class CuentaBancaria {
    private String titular;
    private int numeroCuenta;
    private double saldo;

    public CuentaBancaria(String titular, int numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public CuentaBancaria(String titular, int numeroCuenta) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular == null || titular.isEmpty()) {
            throw new IllegalArgumentException("El titular no puede ser nulo o vacío.");
        }
        this.titular = titular;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("El saldo no puede ser negativo.");
        }
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a depositar debe ser mayor que cero.");
        }
        saldo += monto;
    }

    public void  extraer(double monto) {
        if (monto <= 0 || monto > saldo) {
            throw new IllegalArgumentException("El monto a extraer debe ser mayor que cero y menor o igual al saldo disponible.");
        }
        saldo -= monto;
    }
}
