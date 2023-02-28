package org.example;

public class Ravenclaw extends Hogwarts{
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, String surname, int powerOfMagic, int transgressionDistance
            , int intelligence, int wisdom, int wit, int creativity) {
        super(name, surname, powerOfMagic, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public static void compareFacultyProperties(Ravenclaw r1, Ravenclaw r2) {
        if (r1.getIntelligence() + r1.getWisdom() + r1.getWit() + r1.getCreativity()
                > r2.getIntelligence() + r2.getWisdom() + r2.getWit() + r2.getCreativity()) {
            System.out.printf("%s лучший Когтевранец, чем %s\n", r1.getName(), r2.getName());
        } else if (r1.getIntelligence() + r1.getWisdom() + r1.getWit() + r1.getCreativity()
                < r2.getIntelligence() + r2.getWisdom() + r2.getWit() + r2.getCreativity()) {
            System.out.printf("%s лучший Когтевранец, чем %s\n", r2.getName(), r1.getName());
        }
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", powerOfMagic=" + getPowerOfMagic() +
                ", transgressionDistance=" + getTransgressionDistance() +
                ", intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                '}';
    }
}
