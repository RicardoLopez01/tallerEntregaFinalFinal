public class ListaProductos {
    private Producto[] productos;
    private int cantidadActualProductos;

    public ListaProductos(Producto[] productos, int cantidadActualProductos) {
        this.productos = productos;
        this.cantidadActualProductos = cantidadActualProductos;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public int getCantidadActualProductos() {
        return cantidadActualProductos;
    }

    public void setCantidadActualProductos(int cantidadActualProductos) {
        this.cantidadActualProductos = cantidadActualProductos;
    }
}
