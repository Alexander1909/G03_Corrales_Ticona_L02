package cajoneria;

import java.util.ArrayList;

class Cajoneria<T> {
    private ArrayList<Caja<T>> cajas = new ArrayList<>();

    public void addCaja(Caja<T> caja) {
        cajas.add(caja);
    }
    public String search(T objeto) {
        for (int i = 0; i < cajas.size(); i++) {
            if (cajas.get(i).getContenido().equals(objeto)) {
                return "Posición: " + i + ", Color: " + cajas.get(i).getColor();
            }
        }
        return "Objeto no encontrado.";
    }

    public T delete(T objeto) {
        for (int i = 0; i < cajas.size(); i++) {
            if (cajas.get(i).getContenido().equals(objeto)) {
                return cajas.remove(i).getContenido();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (Caja<T> caja : cajas) {
            sb.append(i).append(" ").append(caja.getColor()).append(" ").append(caja.getContenido()).append("\n");
            i++;
        }
        return sb.toString();
    }
}
