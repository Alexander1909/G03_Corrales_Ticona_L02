package cajoneria;
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
        return lista.iterator();
    }

    public String search(T objeto){
        int index= lista.indexOF(objeto);
        if (index != -1) {
            return "Objeto encontrado en posición " + (index + 1);
        }
        return "Objeto no encontrado";
    
    }

    public T delete(T objeto){
        return lista.remove(objeto) ? objeto : null;
    }

    @Override
    public String toString(){
        

    }
}
