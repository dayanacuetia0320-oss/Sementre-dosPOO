
package Momento1y2;

public class Impresion extends Producto {
    private String color;
    private Foto []foto;

    public Impresion(int numero, double precio,  String color, Foto []foto) {
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

    public Foto []getFoto() {
        return foto;
    }

    public void setFoto(Foto []foto) {
        this.foto = foto;
    }
    @Override
    public String toString() {
        return "Impresion [color=" + color + ", foto=" + java.util.Arrays.toString(foto) + "]";
    }
}
   