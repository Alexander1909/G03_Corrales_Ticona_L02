package cajoneria;
class Caja<T> {
    private String color;
    private T contenido;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Caja de color " + color;
    }

}