package cajoneria;
public class TestGen {
    public static void main(String[] args) {
        Cajoneria<Golosina> cajoneria = new Cajoneria<>();

        cajoneria.addCaja(new Caja<>("Rojo", new Golosina("Caramelo", 10.5)));
        cajoneria.addCaja(new Caja<>("Azul", new Golosina("Gomita", 5.0)));
        cajoneria.addCaja(new Caja<>("Verde", new Golosina("Chocolate", 8.2)));
        cajoneria.addCaja(new Caja<>("Amarillo", new Golosina("Dulce", 3.5)));
        cajoneria.addCaja(new Caja<>("Morado", new Golosina("Mazapán", 7.0)));

        System.out.println("Contenido de la cajoneria:");
        System.out.println(cajoneria);

        System.out.println("\nBuscando Gomita...");
        System.out.println(cajoneria.search(new Golosina("Gomita", 5.0)));

        System.out.println("\nEliminando Caramelo...");
        System.out.println("Objeto eliminado: " + cajoneria.delete(new Golosina("Caramelo", 10.5)));

        System.out.println("\nContenido actualizado:");
        System.out.println(cajoneria);
    }
}
