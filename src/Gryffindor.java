public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, String surname, String faculty, int nobility, int honor, int bravery,int thePowerOfMagic, int transgressions) {
        super(name, surname, faculty,thePowerOfMagic,transgressions);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;

    }
    public int getNobility() {
        return nobility;
    }

    public void setNobility(String nobility) {
        this.nobility = Integer.parseInt(nobility);
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(String honor) {
        this.honor = Integer.parseInt(honor);
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(String bravery) {
        this.bravery = Integer.parseInt(bravery);
    }

    @Override
    public String toString() {
        return "  " +nobility + " - Благородство," + honor+ " - Честь," + bravery+ " - Храбрость";
    }
}
