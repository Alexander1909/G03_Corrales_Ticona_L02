package cajoneria;

public class Caja {
    private String color;

    public Caja(String color) {
        this.color = color;
    }

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