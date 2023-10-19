import edu.princeton.cs.stdlib.StdIn;
import edu.princeton.cs.stdlib.StdOut;
import java.time.LocalDate;

public class Restoran {

    private String Direccion;
    private int CantidadMesas;
    private Trabajador[] listaTrabajadores;
    private Cliente[] listaClientes;
    private Mesas[] listaMesas;
    private int capacidadMaximaProductos = 999999;
    private Producto[] listaProductos;
    private int cantidadActualTrabajadores;
    private int cantidadActualProductos;
    private int cantidadActualClientes = 0;
    private int capacidadMaxima;
    private LocalDate fechaActual = LocalDate.now();

    public int getCantidadActualTrabajadores() {
        return cantidadActualTrabajadores;
    }

    public void setCantidadActualTrabajadores(int cantidadActualTrabajadores) {
        this.cantidadActualTrabajadores = cantidadActualTrabajadores;
    }

    public int getCantidadActualProductos() {
        return cantidadActualProductos;
    }

    public void setCantidadActualProductos(int cantidadActualProductos) {
        this.cantidadActualProductos = cantidadActualProductos;
    }

    public boolean isEnUso() {
        return enUso;
    }

    public void setEnUso(boolean enUso) {
        this.enUso = enUso;
    }

    private int capacidadActual;

    public int getCantidadActualClientes() {
        return cantidadActualClientes;
    }

    public void setCantidadActualClientes(int cantidadActualClientes) {
        this.cantidadActualClientes = cantidadActualClientes;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public Restoran(String direccion, int cantidadMesas) {
        Direccion = direccion;
        CantidadMesas = cantidadMesas;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public int getCantidadMesas() {
        return CantidadMesas;
    }

    public void setCantidadMesas(int cantidadMesas) {
        CantidadMesas = cantidadMesas;
    }

    public Trabajador[] getListaTrabajadores() {
        return listaTrabajadores;
    }

    public void setListaTrabajadores(Trabajador[] listaTrabajadores) {
        this.listaTrabajadores = listaTrabajadores;
    }

    public Cliente[] getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(Cliente[] listaClientes) {
        this.listaClientes = listaClientes;
    }

    public Mesas[] getListaMesas() {
        return listaMesas;
    }

    public void setListaMesas(Mesas[] listaMesas) {
        this.listaMesas = listaMesas;
    }

    public Producto[] getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(Producto[] listaProductos) {
        this.listaProductos = listaProductos;
    }


    // Requisito 1: Coordinar la disponibilidad de las mesas dentro del local

    public void atenderCliente() {
        StdOut.println("Ingrese su nombre");
        String nombre = StdIn.readString();
        StdOut.println("Ingrese su nombre");
        int edad = StdIn.readInt();

        Cliente nuevoCliente = new Cliente(nombre, edad);
        this.listaClientes[cantidadActualClientes] = nuevoCliente;
        this.cantidadActualClientes++;
    }


    boolean enUso = true;

    public boolean disponibilidad() {
        return enUso;


    }

    public void ocuparMesa(Cliente nombre, Cliente edad) {
        this.enUso = true;

    }

    public void consultarDisponibilidad(Mesas numeroMesa, Cliente nombre, Cliente edad) {
        if (enUso) {
            StdOut.println("La mesa" + numeroMesa + "esta ocupada por" + nombre + "de " + edad);
        } else {
            StdOut.println("La mesa" + numeroMesa + " esta disponible");
        }
    }

    public void ocuparMesa(Mesas numeroMesa, Cliente nombre, Cliente edad) {
        if (numeroMesa.equals(1)) {


        }


    }
    // Requerimiento 2: Gestionar inventario

    public void agregarProducto() {
        StdOut.println("Ingrese nombre del producto");
        String producto = StdIn.readString();
        StdOut.println("Ingrese precio del producto");
        int precio = StdIn.readInt();
        StdOut.println("Ingrese categoria del producto");
        String categoria = StdIn.readString();
        StdOut.println("Ingrese stock del producto");
        int stock = StdIn.readInt();

        Producto nuevoProducto = new Producto(producto, precio, categoria, stock);

        this.listaProductos[cantidadActualProductos] = nuevoProducto;
        this.cantidadActualProductos++;


    }
    // :^)
    public void eliminarProducto() {
        for (int i = 0; i < capacidadActual;i++){
            if (this.listaProductos[i] != null) {
                StdOut.println("Ingrese el producto a Eliminar");
                String productoEliminado = StdIn.readString();
                if (this.listaProductos[i].getProducto().equalsIgnoreCase(productoEliminado)) {
                    StdOut.println("el producto " + productoEliminado + " ha sido eliminado");
                    productoEliminado = null;
                }
            }
        }


    }
    public void actualizarProducto(){
        if(this.cantidadActualProductos > 0) {
            for (int i = 0; i < this.capacidadActual; i++) {
                if (this.listaProductos[i] != null) {
                    StdOut.println("Ingrese el producto a actualizar");
                    String productoActualizado = StdIn.readString();
                    if(this.listaProductos[i].getProducto().equalsIgnoreCase(productoActualizado)){
                        StdOut.println("Ingrese dato a actualizar");
                        StdOut.println("1 Precio");
                        StdOut.println("2 Stock");
                        StdOut.println("3 Categoria");
                        int opcion = StdIn.readInt();
                        if(opcion == 1){
                            StdOut.println("Ingrese precio nuevo");
                            int precioActualizado = StdIn.readInt();
                            this.listaProductos[i].setPrecio(precioActualizado);
                        }
                        if(opcion == 2){
                            StdOut.println("Ingrese stock nuevo");
                            int stockActualizado = StdIn.readInt();
                            this.listaProductos[i].setStock(stockActualizado);
                        }
                        if(opcion == 3){
                            StdOut.println("Ingrese categoria nuevo");
                            String categoriaActualizada = StdIn.readString();
                            this.listaProductos[i].setCategoria(categoriaActualizada);
                        }
                    }else{
                        StdOut.println("Ingrese una opcion valida");
                        break;
                    }
                }
            }
        }
    }

    public void mostrarInventario() {
        for (int i = 0; i > cantidadActualProductos; i++) {
            if (this.listaProductos != null) {
                StdOut.println("Nombre producto:" + listaProductos[i].getProducto());
                StdOut.println("Precio:" + listaProductos[i].getPrecio());
                StdOut.println("Categoria:" + listaProductos[i].getCategoria());
                StdOut.println("Stock:" + listaProductos[i].getStock());
            }
        }
    }


    // Requerimiento 3: Administración de trabajadores

    public void contratarTrabajadores(){
        StdOut.println("Ingrese nombre del Trabajador");
        String nombre = StdIn.readString();
        StdOut.println("Ingrese edad Del trabajador");
        int edad = StdIn.readInt();
        StdOut.println("Ingrese tipo de contrato");
        String tipoDeContrato= StdIn.readString();
        StdOut.println("Ingrese fecha de contratacion");
        String fechaDeContratacion = StdIn.readString();

        Trabajador nuevoTrabajador = new Trabajador(nombre,edad,tipoDeContrato,fechaDeContratacion);

        this.listaTrabajadores[cantidadActualTrabajadores] = nuevoTrabajador;
        this.cantidadActualTrabajadores++;
    }
    // intenta ver si pillas como eliminar, si no, no nos calentemeos y vamos por la orden cliente
    // yo terminare los demas requisitos que andan sueltos
    public void renovarContrato(){
        if(this.cantidadActualTrabajadores >0){
            for(int i = 0; i >cantidadActualTrabajadores; i++){
                if(this.listaTrabajadores[i] != null) {
                    StdOut.println("Ingrese el trabajador a renovar");
                    String trabajadorRenovado = StdIn.readString();
                    StdOut.println("Ingrese la fecha actual en formato DD/MM/YY");
                    String fechaDeContratacion = StdIn.readString();
                        if(this.listaTrabajadores[i].getNombre().equalsIgnoreCase(trabajadorRenovado)){
                            this.listaTrabajadores[i].setTipoDeContrato("Indefinido");
                            this.listaTrabajadores[i].setFechaDeContratacion(fechaDeContratacion);
                        }
                }
            }
        }
    }

    public void darIndefinido(){
            if(this.cantidadActualTrabajadores > 0) {
                for (int i = 0; i > this.cantidadActualTrabajadores; i++) {
                    if(this.listaTrabajadores[i] != null){
                        StdOut.println("Ingrese trabajador a buscar");
                        String trabajadorIndefinido = StdIn.readString();
                        StdOut.println("Ingrese fecha actual en el formato DD/MM/YY");
                        String fechaActual = StdIn.readString();
                        if(this.listaTrabajadores[i].getNombre().equalsIgnoreCase(trabajadorIndefinido)){
                            this.listaTrabajadores[i].setTipoDeContrato("definido");
                            this.listaTrabajadores[i].setFechaDeContratacion(fechaActual);
                            // Intente con LocalDate pero no me daba
                            // this.listaTrabajadores[i].setFechaDeContratacion(LocalDate);
                        }
                    }
                }
            }
    }


    public void mostrarTrabajadores() {
        for(int i = 0; i >cantidadActualTrabajadores; i++){
            if(this.listaTrabajadores != null) {
                StdOut.println("Nombre producto:" + listaTrabajadores[i].getNombre());
                StdOut.println("Edad:" + listaTrabajadores[i].getEdad());
                StdOut.println("Tipo de contrato:" + listaTrabajadores[i].getTipoDeContrato());
                StdOut.println("Fecha de contratacion:" + listaTrabajadores[i].getFechaDeContratacion());
            }
        }
    }


    // Requerimiento 4: Procesar las órdenes de los clientes

        private void tomarOrden(Mesas Mesa, ListaProductos listaProductos,){
            StdOut.println("El trabajador que atendera esta mesa es" + listaTrabajadores[cantidadActualTrabajadores]);
            StdOut.println("Que producto desea?");
            productos = StdIn.readString();
            StdOut.println("Desea pedir la cuenta? Ingrese 1 para si y 2 para no");
            int pedirCuenta = StdIn.readInt();








    }
}
