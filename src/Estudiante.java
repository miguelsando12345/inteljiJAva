public class Estudiante {
    // Atributos del estudiante
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

    // Método principal para ejecutar el programa
    public static void main(String[] args) {
        // Crear un objeto Estudiante
        Estudiante estudiante = new Estudiante("Miguel", "M1234", "Ingeniería en Sistemas");

        // Imprimir los datos del estudiante
        estudiante.imprimirDatos();
    }
}
