public class Dioses {

    private String nombre;
    private long edad;
    private long gradoDeFuerza;
    private String superPoder;

    public Dioses(String nombre, long edad, long gradoDeFuerza, String superPoder) {
        this.nombre = nombre;
        this.edad = edad;
        this.gradoDeFuerza = gradoDeFuerza;
        this.superPoder = superPoder;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getEdad() {
        return edad;
    }

    public void setEdad(long edad) {
        this.edad = edad;
    }

    public long getGradoDeFuerza() {
        return gradoDeFuerza;
    }

    public void setGradoDeFuerza(long gradoDeFuerza) {
        this.gradoDeFuerza = gradoDeFuerza;
    }

    public String getSuperPoder() {
        return superPoder;
    }

    public void setSuperPoder(String superPoder) {
        this.superPoder = superPoder;
    }

    @Override
    public String toString() {
        return "Dioses [nombre=" + nombre + ", edad=" + edad + "]";
    }

}
