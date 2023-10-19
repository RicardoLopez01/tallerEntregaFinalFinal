public class Trabajador {

    private String nombre;
    private int edad;
    private String tipoDeContrato;
    private String fechaDeContratacion;

    public Trabajador(String nombre, int edad, String tipoDeContrato, String fechaDeContratacion){
        this.nombre =               nombre;
        this.edad   =               edad;
        this.tipoDeContrato=        tipoDeContrato;
        this.fechaDeContratacion=   fechaDeContratacion;

    }
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public int getEdad() {return edad;}
    public void setEdad(int edad) {this.edad = edad;}
    public String getTipoDeContrato() {return tipoDeContrato;}
    public void setTipoDeContrato(String tipoDeContrato) {this.tipoDeContrato = tipoDeContrato;}
    public String getFechaDeContratacion() {return fechaDeContratacion;}
    public void setFechaDeContratacion(String fechaDeContratacion) {this.fechaDeContratacion = fechaDeContratacion;}
}