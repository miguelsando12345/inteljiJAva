// Estudiante.java
public class Estudiante {
    // Atributos
    private String nombre;
    private String matricula;
    private String carrera;

    // Constructor
    public Estudiante(String nombre, String matricula, String carrera) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.carrera = carrera;
    }

    // Método para imprimir los datos del estudiante
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Carrera: " + carrera);
    }
}
