package n6.n4;


public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer(52045);
        System.out.println(computer.getPrice());

        Mouse mouse = new Mouse(4500);
        System.out.println(mouse.getPrice());

        Table table = new Table(5400);
        System.out.println(table.getPrice());
    }
}
