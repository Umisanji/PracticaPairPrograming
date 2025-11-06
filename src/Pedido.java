import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Linea> lineas;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.lineas = new ArrayList<>();
    }

    public void agregarLinea(Producto producto, int cantidad) {
        Linea linea = new Linea(producto, cantidad);
        this.lineas.add(linea);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Linea linea : lineas) {
            total += linea.getPrecioTotal();
        }
        return total;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public List<Linea> getLineas() {
        return lineas;
    }
}