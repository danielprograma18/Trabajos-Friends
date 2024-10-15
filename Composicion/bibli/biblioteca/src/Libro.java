public class Libro {
    private int edicion;
    private int añoPublicacion;

public Libro() {

}
//contructor
public Libro(int codigo,int edicion, int añoPublicacion) {
    this.edicion = edicion;
    this.añoPublicacion = añoPublicacion;
}
public int getStock() {
    return 10;
}
public int getEdicion(){
    return edicion;
}
public void setEdicion(int edicion){
    this.edicion = edicion;
}
public int getAñoPublicacion() {
    return añoPublicacion;
}
public void setAñopublicacion (int añoPublicacion) {
    this.añoPublicacion = añoPublicacion;
}
}