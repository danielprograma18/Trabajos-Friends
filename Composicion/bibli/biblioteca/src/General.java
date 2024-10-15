
public class General {
    private int id;
    private String nombre;
    public General() {}
    
    public General(int id, String nombre) {
        this.id = id;
        this.nombre= nombre;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void getNombre(String nombre) {
    this.nombre = nombre;
    }

}