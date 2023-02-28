package org.example;

import java.util.Objects;

public class Hogwarts {
    private String name;
    private String surname;
    private int powerOfMagic;
    private int transgressionDistance;

    public Hogwarts(String name, String surname, int powerOfMagic, int transgressionDistance) {
        this.name = name;
        this.surname = surname;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public static void compareHogwartsProperties(Hogwarts h1, Hogwarts h2) {
        if (h1.getPowerOfMagic() + h1.getTransgressionDistance()
                > h2.getPowerOfMagic() + h2.getPowerOfMagic()) {
            System.out.printf("%s обладает бОльшей мощностью магии, чем %s", h1.getName(), h2.getName());
        } else if (h1.getPowerOfMagic() + h1.getTransgressionDistance()
                < h2.getPowerOfMagic() + h2.getPowerOfMagic()) {
            System.out.printf("%s обладает бОльшей мощностью магии, чем %s", h2.getName(), h1.getName());
        }
    }


    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }


}
