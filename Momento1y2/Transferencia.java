package Momento1y2;

public class Transferencia extends Pago {
    private String numeroCuenta;
    private String banco;

    public Transferencia(String formaPago, String numeroCuenta, String banco) {
        super(formaPago);
        this.numeroCuenta = numeroCuenta;
        this.banco = banco;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String toString() {
        return "Trasferencia [numeroCuenta=" + numeroCuenta + ", banco=" + banco + "]";
    }
}