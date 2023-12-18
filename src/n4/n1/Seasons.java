package n4.n1;

public enum Seasons {
    WINTER(-10), SPRING(12), AUTUMN(5), SUMMER(21) {
        @Override
        public String getDescription() {
            return "Тёплое время года";
        }
    };
    private int avgT;
    Seasons(int avgT) {
        this.avgT = avgT;
    }
    public void printLike(Seasons season) {
        switch (season) {
            case AUTUMN -> System.out.println("Я люблю осень");
            case WINTER -> System.out.println("Я люблю зиму");
            case SUMMER -> System.out.println("Я люблю лето");
            case SPRING -> System.out.println("Я люблю весну");
        }
    }
    public String getDescription() {
        return "Холодное время года";
    }

    @Override
    public String toString() {
        return super.toString() + " " + avgT + " "+ getDescription();
    }
}
