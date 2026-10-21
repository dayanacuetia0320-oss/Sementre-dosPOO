package Momento1y2;

public class Producto {
    private int numero;
    private  double precio;

    public Producto(int numero, double precio) {
        this.numero = numero;
        this.precio = precio;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        // No se puede modificar el precio ya que es final
    }
    public void calcularPrecio(double precio) {
        precio=precio*numero;
        System.out.println("el precio total es: " + precio);
    }

}