package Bolsa;
public class principal {
    public static void main(String[] args) {
        //Bolsa Chocolatina
        bolsa <Chocolatina> bolsaCho = new bolsa <Chocolatina>();
        Chocolatina c = new Chocolatina("milka");
        Chocolatina c1 = new Chocolatina("milka");
        Chocolatina c2 = new Chocolatina("ferrero");

        for(Chocolatina chocolatina: bolsaCho){
            System.out.println(chocolatina.getMarca());
        }

        //Bolsa de Golosina
        bolsa <Golosina> bolsaGolo =new bolsa<Golosina>()
        Golosina g1= new Golosina("Caramelo", 10.5);
        Golosina g2= new Golosina("Gomita", 5.0);
        Golosina g3= new Golosina("Paleta", 15.0);

        for(Golosina golosina : bolsaGolo){
            System.out.println(golosina.getNombre() + "-" + golosina.getPeso());
        }
        

        
        
    }
}
