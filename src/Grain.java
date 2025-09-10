public class Grain {
    public int getMass() {
        return mass;
    }

    public void setMass() {
        this.mass++;
    }

    int mass = 0;
    String name;

    public Grain(String name) {
        this.name = name;
    }

}
