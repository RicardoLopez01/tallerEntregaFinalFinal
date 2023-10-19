public class OrdenCliente {
    private Producto producto;
    private Producto stock;
    private Mesas numeroMesa;
    private Trabajador nombre;

    public OrdenCliente(Producto producto, int cantidad, Mesas numeroMesa, Trabajador nombre) {
        this.producto = producto;
        this.stock = stock;
        this.numeroMesa = numeroMesa;
        this.nombre = nombre;
    }


    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Producto getStock() {
        return stock;
    }

    public void setStock(Producto stock) {
        this.stock = stock;
    }

    public Mesas getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(Mesas numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public Trabajador getNombre() {
        return nombre;
    }

    public void setNombre(Trabajador nombre) {
        this.nombre = nombre;
    }
}