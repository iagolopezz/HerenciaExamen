public class Videojuego extends ProductoDigital{
     String titulo;
     double precio;
     int tamano;
    private String plataforma;

    public Videojuego(String titulo, double precio, int tamano, String plataforma){
        super(titulo, precio, tamano);//Atributos heredados: la herencia son los atributos o metodos que estan en la clase padre y que se utilizan en sus hijas obligatoriamente
        this.plataforma=plataforma;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
//METODOS HEREDADOS
    @Override
    public void descargar(){//Metodo heredado
        System.out.println("Iniciando descarga del videojuego " + getTitulo() + "para " + plataforma);
        //Polimorfismo es cuando un metodo es heredado y varia lo que printea mientras que sigue siendo el mismo metodo
    }

    @Override
    public void calcularTiempoDescarga() {
        super.calcularTiempoDescarga();
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Plataforma: " + plataforma);
    }
}
