//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Videojuego juego= new Videojuego("Gta V", 80, 50000, "PS5");
        Pelicula peli= new Pelicula("Tadeo Jones", 15, 2500, 180, "4K");
        Audiolibro libro= new Audiolibro("El Quijote", 20, 1000, "Iago");

        System.out.println("---VIDEOJUEGO---");
        juego.mostrarInfo();
        juego.descargar();
        juego.calcularTiempoDescarga();
        System.out.println("---PELÍCULA---");
        peli.mostrarInfo();
        peli.descargar();
        peli.calcularTiempoDescarga();
        System.out.println("---AUDIOLIBRO---");
        libro.mostrarInfo();
        libro.descargar();
        peli.calcularTiempoDescarga();
    }
}