package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();

        Gryffindor gryffindor1 = new Gryffindor("Гарри", "Поттер", r.nextInt(101)
                , r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101));
        Gryffindor gryffindor2 = new Gryffindor("Гермиона", "Грейнджер", r.nextInt(101)
                , r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101));
        Gryffindor gryffindor3 = new Gryffindor("Рон", "Уизли", r.nextInt(101)
                , r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101));

        Slytherin slytherin1 = new Slytherin("Драко", "Малфой", r.nextInt(101)
                , r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101)
                , r.nextInt(101), r.nextInt(101));
        Slytherin slytherin2 = new Slytherin("Грэхэм", "Монтегю", r.nextInt(101)
                , r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101)
                , r.nextInt(101), r.nextInt(101));
        Slytherin slytherin3 = new Slytherin("Грегори", "Гойл", r.nextInt(101)
                , r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101)
                , r.nextInt(101), r.nextInt(101));

        Hufflepuff hufflepuff1 = new Hufflepuff("Захария", "Смит", r.nextInt(101)
                , r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101));
        Hufflepuff hufflepuff2 = new Hufflepuff("Седрик", "Диггори", r.nextInt(101)
                , r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101));
        Hufflepuff hufflepuff3 = new Hufflepuff("Джастин", "Финч-Флетчли", r.nextInt(101)
                , r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101));

        Ravenclaw ravenclaw1 = new Ravenclaw("Чжоу", "Чанг", r.nextInt(101)
                , r.nextInt(101), r.nextInt(101), r.nextInt(101)
                , r.nextInt(101), r.nextInt(101));
        Ravenclaw ravenclaw2 = new Ravenclaw("Падма", "Патил", r.nextInt(101)
                , r.nextInt(101), r.nextInt(101), r.nextInt(101)
                , r.nextInt(101), r.nextInt(101));
        Ravenclaw ravenclaw3 = new Ravenclaw("Маркус", "Белби", r.nextInt(101)
                , r.nextInt(101), r.nextInt(101), r.nextInt(101)
                , r.nextInt(101), r.nextInt(101));


        System.out.println(gryffindor1);
        System.out.println();
        System.out.println(slytherin1);
        System.out.println();
        System.out.println(hufflepuff1);
        System.out.println();
        System.out.println(ravenclaw1);
        System.out.println();

        Gryffindor.compareFacultyProperties(gryffindor1, gryffindor3);
        System.out.println();
        Slytherin.compareFacultyProperties(slytherin1, slytherin2);
        System.out.println();
        Hufflepuff.compareFacultyProperties(hufflepuff3, hufflepuff2);
        System.out.println();
        Ravenclaw.compareFacultyProperties(ravenclaw2, ravenclaw1);
        System.out.println();

        Hogwarts.compareHogwartsProperties(slytherin3, ravenclaw2);
    }
}