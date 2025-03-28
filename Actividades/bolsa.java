import java.util.ArrayList;
import java.util.Iterator;
public class bolsa< T > implements Iterable<T> {
    private ArrayList < T > lista = new ArrayList<T>();
    private int tope;

    public bolsa(int tope){
        super();
        this.tope=tope;
    }

    public void add(T objeto){
        if (lista.size() >= tope);
    }else {
        throw ner RuntimeException("no cabe mas");
    }
    public Iterator < T > iterator(){
        return list.iterator();
    }

}
