public class Pelicula extends ProductoDigital{
    String titulo;
    double precio;
    int tamano;
    private int duracion;
    private String calidad;

    public Pelicula(String titulo, double precio, int tamano, int duracion, String calidad){
        super(titulo, precio, tamano);//Atributos heredados
        this.duracion=duracion;
        this.calidad=calidad;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }
    //METODOS HEREDADOS
    @Override
    public void descargar() {
        System.out.println("Descargando película " + getTitulo() +  "en calidad: " + calidad);
    }

    @Override
    public void calcularTiempoDescarga() {
        super.calcularTiempoDescarga();
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Duracion: " + duracion + "minutos ");
        System.out.println("Calidad: " + calidad);
    }
}
