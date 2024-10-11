public class Ratones {
    private String nombre;
    private double peso;
    private double tasaCrecimiento;
    private int edad;

    public Ratones(String nombreRaton) {
        nombre = nombreRaton;
        peso = 1.0;
        edad = 0;
    }
    public void setTasaCrecimiento(double tasa) {
        tasaCrecimiento = tasa;
    }
    public void crecerUnDia() {
        edad++;
        peso = peso + 0.1 * tasaCrecimiento * edad;
    }
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " días");
        System.out.println("Peso: " + peso + " gramos");
    }
}
