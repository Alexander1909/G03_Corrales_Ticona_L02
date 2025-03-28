package Cajoneria;
import java.util.ArrayList;
import java.util.Iterator;

public class Caja<T> {
    private String color;
    private T contenido;

    public Caja(String color, T contenido){
        this.color=color;
        this.contenido=contenido;
    }


}
