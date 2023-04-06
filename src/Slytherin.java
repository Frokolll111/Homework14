public class Slytherin extends Hogwarts{
    private int tricky;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, String surname, String faculty,int tricky, int determination, int ambition, int resourcefulness, int lustForPower,int thePowerOfMagic, int transgressions) {
        super(name,surname,faculty,thePowerOfMagic,transgressions);
        this.tricky = tricky;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getTricky() {
        return tricky;
    }

    public void setTricky(String tricky) {
        this.tricky = Integer.parseInt(tricky);
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(String determination) {
        this.determination = Integer.parseInt(determination);
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(String ambition) {
        this.ambition = Integer.parseInt(ambition);
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(String resourcefulness) {
        this.resourcefulness = Integer.parseInt(resourcefulness);
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(String lustForPower) {
        this.lustForPower = Integer.parseInt(lustForPower);
    }

    @Override
    public String toString() {
        return " " + tricky + " - Хитрость," + determination + " - Решительность," + ambition + " - Амбициозность," + resourcefulness + " - Находчивость," + lustForPower+" - Жажда власти";
    }
}
