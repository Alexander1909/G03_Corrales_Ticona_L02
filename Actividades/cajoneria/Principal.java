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

}
