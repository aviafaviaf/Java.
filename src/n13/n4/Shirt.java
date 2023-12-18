package n13.n4;

public class Shirt {
    public String id;
    public String name;
    public String color;
    public String size;

    public Shirt(String string) {
        String[] parts = string.split(",");

        id = parts[0];
        name = parts[1];
        color = parts[2];
        size = parts[3];
    }

    public String toString() {
        return "Футболка: " + '\n' + "id: " + id + '\n' + "name: " + name + '\n' + "color: " + color + '\n' + "size: " + size + '\n';
    }
}
