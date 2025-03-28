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
    // Metodo Buscar
    public String search(T objeto){
        int index= lista.indexOF(objeto);
        if (index != -1) {
            return "Objeto encontrado en posición " + (index + 1);
        }
        return "Objeto no encontrado";
    
    }
    // Metodo Borrar
    public T delete(T objeto){
        return lista.remove(objeto) ? objeto : null;
    }
    // Metodo toString
    @Override
    public String toString(){
        StringBuilder resultado = new StringBuilder("Contenido de la cajonería:\n");
        for (int i = 0; i < lista.size(); i++) {
            resultado.append((i + 1)).append(". ").append(lista.get(i).toString()).append("\n");
        }
        return resultado.toString(); 

    }
}
