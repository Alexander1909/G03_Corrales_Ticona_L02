package Bolsa;
import java.util.ArrayList;
import java.util.Iterator;
public class bolsa< T > implements Iterable<T> {
    private ArrayList < T > lista = new ArrayList<T>();
    private int tope;

    public bolsa(int tope){
        super();
        this.tope=tope;
    }

    public void add(T objeto) {
        if (lista.size() >= tope) {  
            lista.add(objeto);
        } else {
            throw new RuntimeException("no caben más");
        }
    }
    public Iterator < T > iterator(){
        return list.iterator();
    }

}
