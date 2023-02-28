package org.example;

public class Hufflepuff extends Hogwarts{
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, String surname, int powerOfMagic, int transgressionDistance
            , int diligence, int loyalty, int honesty) {
        super(name, surname, powerOfMagic, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public static void compareFacultyProperties(Hufflepuff h1, Hufflepuff h2) {
        if (h1.getDiligence() + h1.getLoyalty() + h1.getHonesty()
                > h2.getDiligence() + h2.getLoyalty() + h2.getHonesty()) {
            System.out.printf("%s лучший Пуффендуец, чем %s\n", h1.getName(), h2.getName());
        } else if (h1.getDiligence() + h1.getLoyalty() + h1.getHonesty()
                < h2.getDiligence() + h2.getLoyalty() + h2.getHonesty()) {
            System.out.printf("%s лучший Пуффендуец, чем %s\n", h2.getName(), h1.getName());
        }
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", powerOfMagic=" + getPowerOfMagic() +
                ", transgressionDistance=" + getTransgressionDistance() +
                ", diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }
}
