
import java.util.Scanner;

public class CargarLibro {
    
    public static void main(String[] args) {
        CargarLibro cargador = new CargarLibro();
        Libro libro = cargador.cargarLibro();
        cargador.imprimirLibro(libro);
    }
    
    public Libro cargarLibro() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el código del libro:");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        
        System.out.println("Ingrese el nombre del libro:");
        String nombre = scanner.nextLine();
        
        System.out.println("Ingrese la edición del libro:");
        int edicion = scanner.nextInt();
        
        System.out.println("Ingrese el año de publicación del libro:");
        int anioPublicacion = scanner.nextInt();
        
        return new Libro(codigo, nombre, edicion, añoPublicacion);
    }
    
    public void imprimirLibro(Libro libro) {
        System.out.println("Detalles del libro:");
        System.out.println("Código: " + libro.getCodigo());
        System.out.println("Nombre: " + libro.getNombre());
        System.out.println("Edición: " + libro.getEdicion());
        System.out.println("Año de publicación: " + libro.getAñoPublicacion());
        System.out.println("Stock: " + libro.getStock());
    }
}