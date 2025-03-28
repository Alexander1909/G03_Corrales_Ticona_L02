import java.util.ArrayList;
import java.util.Iterator;
public class Cajoneria <T> implements Iterable<T> {
    private Arraylist <T> lista = new ArrayList<T>();
    private int tope;

    public Cajoneria(int tope){
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
