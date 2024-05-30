public class DiosesModernos extends Dioses {

    private String nombre;
    private long edad;
    private long gradoDeFuerza;
    private long seguidores;

    public DiosesModernos(String nombre, long edad, long gradoDeFuerza, String superPoder) {
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

    public long getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(long seguidores) {
        this.seguidores = seguidores;
    }

    @Override
    public String toString() {
        return "DiosesModernos [nombre=" + nombre + ", edad=" + edad + ", gradoDeFuerza=" + gradoDeFuerza
                + ", seguidores=" + seguidores + "]";
    }

}
