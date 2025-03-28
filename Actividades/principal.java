
public class principal {
    public static void main(String[] args) {
        bolsa <Chocolatina> bolsaCho = new bolsa <Chocolatina>();
        Chocolatina c = new Chocolatina("milka");
        Chocolatina c1 = new Chocolatina("milka");
        Chocolatina c2 = new Chocolatina("ferrero");

        for(Chocolatina chocolatina: bolsaCho){
            System.err.println(chocolatina.getMarca());
        }

    }
}
