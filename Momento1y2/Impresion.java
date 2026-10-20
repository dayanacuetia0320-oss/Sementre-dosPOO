
package Momento1y2;

public class Impresion extends Producto {
    private String color;
    private foto foto;

    public Impresion(int numero, double precio,  String color, foto foto) {
        super(numero, precio);
       
        this.color = color;
        this.foto = foto;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public foto getFoto() {
        return foto;
    }

    public void setFoto(foto foto) {
        this.foto = foto;
    }
    @Override
    public String toString() {
        return "Impresion [color=" + color + ", foto=" + foto + "]";
    }
}
   