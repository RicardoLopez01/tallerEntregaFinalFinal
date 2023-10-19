public class Producto {

    private String productos;
    private int precio;
    private String categoria;
    private int stock;


    public Producto(String producto, int precio, String categoria, int stock) {
        this.productos = producto;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
    }

    public String getProducto() {return productos;}
    public void setProducto(String producto) {this.productos = producto;}


    public int getPrecio() {return precio;}
    public void setPrecio(int precio) {this.precio = precio;}


    public String getCategoria() {return categoria;}
    public void setCategoria(String categoria) {this.categoria = categoria;}


    public int getStock() {return stock;}
    public void setStock(int stock) {this.stock = stock;}
}
