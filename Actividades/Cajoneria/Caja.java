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

    public String getColor(){
        return this.color;
    }

    public T getContenido(){
        return contenido;
    }

    public void setContenido(T contenido){
        this.contenido=contenido;
    }

    @Override
    public String toString(){
        return "Caja de color"+ color + "contiene :"+ contenido;
    }

}
