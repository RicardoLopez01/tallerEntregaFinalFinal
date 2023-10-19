public class Mesas {

    private int numeroMesa;
    private int posicionMesa;
    private boolean disponibilidad;


    public Mesas(int numeroMesa, int posicionMesa, boolean disponibilidad){
        this.numeroMesa = numeroMesa;
        this.posicionMesa = posicionMesa;
        this.disponibilidad = true;

    }

    public int getNumeroMesa() {return numeroMesa;}
    public void setNumeroMesa(int numeroMesa) {this.numeroMesa = numeroMesa;}


    public int getPosicionMesa() {return posicionMesa;}
    public void setPosicionMesa(int posicionMesa) {this.posicionMesa = posicionMesa;}


    public boolean isDisponibilidad() {return disponibilidad;}
    public void setDisponibilidad(boolean disponibilidad) {this.disponibilidad = disponibilidad;}
}
