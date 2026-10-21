package Momento1y2;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("1005123456", "Juan Perez");

        Foto foto1 = new Foto("vacaciones.jpg");
        Foto foto2 = new Foto("trabajo.jpg");
        Impresion impresion = new Impresion(5, 1000, "Color", new Foto[]{foto1, foto2});
        Camara camara = new Camara(2, 20000, "Canon", "EOS 250D");

        Producto[] productos = { impresion, camara };
        Pago[] pagos = new Pago[] { new Efectivo("Efectivo", 50000), new TarjetaCredito("Tarjeta de crédito", "1234567890123456", "12/25", "123"),
         new Transferencia("Transferencia", "001234567890", "bancolombia") };
    
        Pedido pedido = new Pedido(cliente, productos[1], "19/10/2026", pagos[0]);

        
       
        
        System.out.println("Cliente: " + pedido.getCliente().getnombre());
        System.out.println("Fecha: " + pedido.getFecha());
        System.out.println("Pago: " + pedido.getPago().getFormaPago());

        double total = 0;
        for (Producto p : pedido.getProducto()) {
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
       
    }
}