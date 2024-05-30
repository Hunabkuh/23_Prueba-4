public class DiosesDelOlimpo extends Dioses {

    private String nombre;
    private long edad;
    private long gradoDeFuerza;
    private String superPoder;

    public DiosesDelOlimpo(String nombre, long edad, long gradoDeFuerza, String superPoder) {
        super(nombre, edad, gradoDeFuerza, superPoder);
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
        return "DiosesDelOlimpo [Nombre=" + nombre + ", edad=" + edad + ", gradoDeFuerza=" + gradoDeFuerza
                + ", superPoder=" + superPoder + "]";
    }

}
