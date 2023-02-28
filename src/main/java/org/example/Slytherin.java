package org.example;

public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, String surname, int powerOfMagic, int transgressionDistance
            , int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, surname, powerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public static void compareFacultyProperties(Slytherin s1, Slytherin s2) {
        if (s1.getCunning() + s1.getDetermination() + s1.getAmbition() + s1.getResourcefulness()
                + s1.getLustForPower() > s2.getCunning() + s2.getDetermination() + s2.getAmbition()
                + s2.getResourcefulness() + s2.getLustForPower()) {
            System.out.printf("%s лучший Слизеринец, чем %s\n", s1.getName(), s2.getName());
        } else if (s1.getCunning() + s1.getDetermination() + s1.getAmbition() + s1.getResourcefulness()
                + s1.getLustForPower() < s2.getCunning() + s2.getDetermination() + s2.getAmbition()
                + s2.getResourcefulness() + s2.getLustForPower()) {
            System.out.printf("%s лучший Слизеринец, чем %s\n", s2.getName(), s1.getName());
        }
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", powerOfMagic=" + getPowerOfMagic() +
                ", transgressionDistance=" + getTransgressionDistance() +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                '}';
    }
}
