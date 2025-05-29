abstract class ProductoDigital { //Clase padre
    private String titulo;
    private double precio;
    private int tamano;

    public ProductoDigital( String titulo, double precio, int tamano) {
        this.titulo=titulo;
        this.precio=precio;
        this.tamano=tamano;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getPrecio() {
        return precio;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }



    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getTamano() {
        return tamano;
    }

    public void descargar(){
        System.out.println("Descargando...");
    }

   public void calcularTiempoDescarga(){
       System.out.println( "Tiempo en segundos:" + getTamano() * 60   );}

    public void mostrarInfo(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Precio: " + precio + " €");
        System.out.println("Tamaño: " + tamano + " Megabytes");
    }
}