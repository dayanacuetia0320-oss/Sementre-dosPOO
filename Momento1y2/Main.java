package Momento1y2;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("1005123456", "Juan Perez");

        foto foto =  new foto("vacaciones.jpg");
        Impresion impresion = new Impresion(5, 1000, "Color", foto);
        Camara camara = new Camara(2, 20000, "Canon", "EOS 250D");

        Producto[] productos = { impresion, camara };
        Pedido pedido = new Pedido(cliente, productos[1], "19/10/2026");

        // Se muestran las 3 formas de pago y se escoge una (1, 2 o 3)
        System.out.println("Formas de pago:");
        pedido.mostrarFormasPago();
        pedido.elegirFormaPago(2);

        System.out.println();
        System.out.println("Cliente: " + pedido.getCliente().getnombre());
        System.out.println("Fecha: " + pedido.getFecha());
        System.out.println("Forma de pago: " + pedido.getFormaPagoElegida());
        System.out.println();

        double total = 0;
        for (Producto p : new Producto[]{pedido.getProducto()}) {
            // Se revisa si el producto es una Impresion o una Camara
            String tipo = "";
            if (p instanceof Impresion) {
                tipo = "Impresion";
            } else if (p instanceof Camara) {
                tipo = "Camara";
            }

            System.out.println("Producto: " + tipo);
            System.out.println("Cantidad (numero): " + p.getNumero());
            System.out.println("Valor: " + p.getPrecio());
            System.out.println("Valor a pagar: " + p.getNumero() + " x " + p.getPrecio()
                    + " = " + p.getNumero() * p.getPrecio());
            System.out.println();

            total = total + p.getNumero() * p.getPrecio();
        }

        System.out.println("TOTAL A PAGAR: " + total);
        System.out.println("Pago con: " + pedido.getFormaPagoElegida());
    }
}