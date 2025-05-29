public class Audiolibro extends ProductoDigital{
    String titulo;
    double precio;
    int tamano;
    private String narrador;

    public Audiolibro(String titulo, double precio, int tamano, String narrador){
        super(titulo, precio, tamano);
        this.narrador=narrador;
    }

    public String getNarrador() {
        return narrador;
    }

    public void setNarrador(String narrador) {
        this.narrador = narrador;
    }
    //METODOS HEREDADOS
    @Override
    public void descargar() {
        System.out.println("Descargando audiolibro: " + getTitulo() + "narrado por "  + narrador);
    }

    @Override
    public void calcularTiempoDescarga() {
        super.calcularTiempoDescarga();
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Narrador: " + narrador);
    }
}

