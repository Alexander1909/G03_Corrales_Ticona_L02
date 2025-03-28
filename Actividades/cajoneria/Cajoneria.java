package cajoneria;
class Cajoneria<T> {
    private ArrayList<Caja<T>> cajas = new ArrayList<>();

    public void addCaja(Caja<T> caja) {
        cajas.add(caja);
    }

