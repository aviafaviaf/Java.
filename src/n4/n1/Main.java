package n4.n1;

public class Main {
    public static void main(String[] args) {
        Seasons favouriteSeason = Seasons.SUMMER;
        System.out.println(favouriteSeason.getDescription());
        for (Seasons season : Seasons.values()) {
            System.out.println(season);
        }
    }
}
