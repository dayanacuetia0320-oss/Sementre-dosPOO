package Momento1y2;

public class Pago {
    
    private String formaPago;

    public Pago(String formaPago) {
        this.formaPago = formaPago;
    }
    public String getFormaPago() {
        return formaPago;
    }
    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }
    public void mostrarFormasPago() {
        System.out.println("Formas de pago:" + formaPago);
       
    }
}
