public class Ejemplopersona {
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;
    private double peso;
    private double talla;

    // Métodos set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    // Métodos get
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public double getPeso() {
        return peso;
    }

    public double getTalla() {
        return talla;
    }

    // Método main para ejecutar el programa
    public static void main(String[] args) {
        Ejemplopersona persona = new Ejemplopersona();

        persona.setNombre("Maria");
        persona.setApellido("López");
        persona.setEdad(30);
        persona.setGenero("Femenino");
        persona.setPeso(60.5);
        persona.setTalla(1.50);

        System.out.println("Nombre completo: " + persona.getNombre() + " " + persona.getApellido());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Género: " + persona.getGenero());
        System.out.println("Peso: " + persona.getPeso() + " kg");
        System.out.println("Talla: " + persona.getTalla() + " m");
    }
}