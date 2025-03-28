
import jdk.jshell.execution.Util;

public class TestGen {
    public static <T> boolean exist(T[] array, T elemnto){
        for (T item : array){
            if(item.equals(elemnto)){
                return true;
            }
        
        }
        return false;
    }

    public static void main(String[] args) {
        Golosina[] golosinas={new Golosina("Caramelo", 10.5), new Golosina("Gomita", 5.2)};
        Chocolatina[] chocolatinas={new Chocolatina("Milka"), new Chocolatina("Ferrero")};

        System.out.println(Util.exist(golosinas, new Golosina("Caramelo", 10.5)));//true
        System.out.println(Util.exist(chocolatinas, new Chocolatina("Oreo")));


    }
}


