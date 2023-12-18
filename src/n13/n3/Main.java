package n13.n3;


public class Main {
    public static void main(String[] args) {
        Address[] addresses = {
                Address.getAddress("Россия; Москва; Москва; 2-я хуторская; 6/14; 3; 40"),
        };

        for (Address address : addresses) System.out.println(address);
    }
}
