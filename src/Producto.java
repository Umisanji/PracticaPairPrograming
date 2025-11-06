public class Producto {
    private String nombre;
    private double precio;
    private String SKU;

    public Producto(String nombre, double precio, String SKU) {
        this.nombre = nombre;
        this.precio = precio;
        this.SKU = SKU;
    }

    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public String getSKU() {
        return SKU;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setSKU(String SKU) {
        this.SKU = SKU;
    }
}