public class Pais extends General {
    private String nombre;
    
    public Pais() {
    }
    
    public Pais(int id, String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}