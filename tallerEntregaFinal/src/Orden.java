public class Orden {


    //LISTA PRODUCTOS PARA REQUERIMIENTO:
    //Listado de productos + precio unitario + total acumulado.
    private Producto producto;
    private int totalOrden;
    private Trabajador nombreTrabajador;
    private Mesas numeroMesa;

    public Orden(Producto producto, int totalOrden, Trabajador nombreTrabajador, Mesas numeroMesa) {
        this.producto = producto;
        this.totalOrden = totalOrden;
        this.nombreTrabajador = nombreTrabajador;
        this.numeroMesa = numeroMesa;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getTotalOrden() {
        return totalOrden;
    }

    public void setTotalOrden(int totalOrden) {
        this.totalOrden = totalOrden;
    }

    public Trabajador getNombreTrabajador() {
        return nombreTrabajador;
    }

    public void setNombreTrabajador(Trabajador nombreTrabajador) {
        this.nombreTrabajador = nombreTrabajador;
    }

    public Mesas getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(Mesas numeroMesa) {
        this.numeroMesa = numeroMesa;
    }
}
