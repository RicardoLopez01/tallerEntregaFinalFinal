public class ListaClientes {

    private Cliente[] clientes;
    private int cantidadActualClientes;

    public ListaClientes(Cliente[] clientes, int cantidadActualClientes) {
        this.clientes = clientes;
        this.cantidadActualClientes = cantidadActualClientes;
    }


    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public int getCantidadActualClientes() {
        return cantidadActualClientes;
    }

    public void setCantidadActualClientes(int cantidadActualClientes) {
        this.cantidadActualClientes = cantidadActualClientes;
    }
}

