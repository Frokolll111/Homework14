public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int faithful;
    private int honest;

    public Hufflepuff(String name, String surname, String faculty, int hardworking, int faithful, int honest,int thePowerOfMagic, int transgressions) {
        super(name, surname, faculty,thePowerOfMagic,transgressions);
        this.hardworking = hardworking;
        this.faithful = faithful;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(String hardworking) {
        this.hardworking = Integer.parseInt(hardworking);
    }

    public int getFaithful() {
        return faithful;
    }

    public void setFaithful(String faithful) {
        this.faithful = Integer.parseInt(faithful);
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(String honest) {
        this.honest = Integer.parseInt(honest);
    }

    @Override
    public String toString() {
        return " " + hardworking + " - Трудолюбивы," + faithful + " - Верны," + honest + " - Честны";
    }
}

