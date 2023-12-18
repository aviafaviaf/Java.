package n2.n4;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Computer> computers = new ArrayList<Computer>();
    public void addComputer(String name) {
        computers.add(new Computer(name));
    }
    public void deleteComputer(String name) {
        for (Computer computer : computers) {
            if (computer.getName().equals(name)) {
                computers.remove(computer);
            }
        }
    }
    public Computer findComputer(String name) {
        for (Computer computer : computers) {
            if (computer.getName().equals(name)) {
                return computer;
            }
        }
        return null;
    }
}
