public class Ravenclaw extends  Hogwarts{
    private int smart;
    private int wise;
    private int witty;
    private int fullOfCreativity;

    public Ravenclaw(String name, String surname, String faculty, int smart, int wise, int witty, int fullOfCreativity,int thePowerOfMagic, int transgressions) {
        super(name, surname, faculty,thePowerOfMagic,transgressions);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(String smart) {
        this.smart = Integer.parseInt(smart);
    }

    public int getWise() {
        return wise;
    }

    public void setWise(String wise) {
        this.wise = Integer.parseInt(wise);
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(String witty) {
        this.witty = Integer.parseInt(witty);
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public void setFullOfCreativity(String fullOfCreativity) {
        this.fullOfCreativity = Integer.parseInt(fullOfCreativity);
    }

    @Override
    public String toString() {
        return  "  "+ smart  + " - Умны," + wise + " - Мудры," + witty  + " - Остроумны," + fullOfCreativity+ " - Полны творчества ";
    }
}
