package pl.gornik.shape;

public enum Color {

    RED("Czerwony"),
    BLUE("Niebieski"),
    YELLOW("Żółty"),
    GREEN("Zielony"),
    PURPLE("Fioletowy");

    private String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
