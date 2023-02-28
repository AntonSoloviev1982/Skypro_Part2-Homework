package org.example;

import java.util.Objects;

public class Gryffindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, String surname, int powerOfMagic, int transgressionDistance
            , int nobility, int honor, int courage) {
        super(name, surname, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    public static void compareFacultyProperties(Gryffindor g1, Gryffindor g2) {
        if (g1.getNobility() + g1.getHonor() + g1.getCourage()
                > g2.getNobility() + g2.getHonor() + g2.getCourage()) {
            System.out.printf("%s лучший Гриффиндорец, чем %s\n", g1.getName(), g2.getName());
        } else if (g1.getNobility() + g1.getHonor() + g1.getCourage()
                < g2.getNobility() + g2.getHonor() + g2.getCourage()) {
            System.out.printf("%s лучший Гриффиндорец, чем %s\n", g2.getName(), g1.getName());
        }
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", powerOfMagic=" + getPowerOfMagic() +
                ", transgressionDistance=" + getTransgressionDistance() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage +
                '}';
    }



}
