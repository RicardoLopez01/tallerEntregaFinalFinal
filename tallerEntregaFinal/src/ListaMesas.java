public class ListaMesas {

    private Mesas[] mesas;
    private int numeroMesa;
    private int posicionMesa;

    public ListaMesas(Mesas[] mesas, int numeroMesa, int posicionMesa) {
        this.mesas = mesas;
        this.numeroMesa = numeroMesa;
        this.posicionMesa = posicionMesa;
    }


    public Mesas[] getMesas() {
        return mesas;
    }

    public void setMesas(Mesas[] mesas) {
        this.mesas = mesas;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public int getPosicionMesa() {
        return posicionMesa;
    }

    public void setPosicionMesa(int posicionMesa) {
        this.posicionMesa = posicionMesa;
    }
}
