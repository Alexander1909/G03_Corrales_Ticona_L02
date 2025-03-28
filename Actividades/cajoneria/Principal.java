package cajoneria;

public class Principal {
    public static void main(String[] args) {
        Cajoneria <Caja> cajon = new Cajoneria<>();

        Caja c1= new Caja("Rojo");
        Caja c2= new Caja("verde");
        Caja c3= new Caja("violeta");


        for (Caja caja : cajonCajas) {
            System.out.println("Caja de color: " + caja.getColor());
    }
    System.out.println("Buscando la caja verde: " + cajon.search(c2));
    System.out.println("Eliminando la caja verde: " + cajon.delete(c2));

    System.out.println("Cajoneria después de eliminar:");
    System.out.println(cajon);
}
    }