public class App {
    public static void main(String[] args) throws Exception {
        
        Producto coca = new Producto("Coca-Cola", 15, "B1000");
        Producto empanadas = new Producto("Empanadas", 12, "A2000");
        Producto pizza = new Producto("Pizza", 50, "A3000");
        Producto torta= new Producto("Torta", 25, "A4000");


        Cliente estudiante1 = new Cliente("Luis", "S24016730");


        Pedido pedido1 = new Pedido(estudiante1);


        pedido1.agregarLinea(coca, 2);
        pedido1.agregarLinea(empanadas, 3);
        double totalPedido1 = pedido1.calcularTotal();
        System.out.println("pedido de cliente: " + pedido1.getCliente().getNombre());
        
        System.out.println("------Detalles del pedido-------");
        for (Linea linea : pedido1.getLineas()) {
            System.out.println(linea.getCantidad() + " x " + linea.getProducto().getNombre() + " - Subtotal: $" + linea.getPrecioTotal());
        }

System.out.println("-------------------------------");
        System.out.println("Total del pedido: $" + totalPedido1);

    }
}







