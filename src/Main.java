
public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри", " Поттер", " Гриффиндор", 54, 28, 64),
                new Gryffindor("Гермиона", " Грейнджер", " Гриффиндор", 71, 71, 25),
                new Gryffindor("Рон", " Уизли", " Гриффиндор", 81, 31, 9),
        };
        System.out.println();
        allStudent(gryffindors);
        theBestStudentGryffindor(gryffindors);

        Slytherin[] slytherins = {
                new Slytherin("Драко", " Малфой", " Слизерин", 68, 32, 81, 18, 88),
                new Slytherin("Грэхэм", " Монтегю", " Слизерин", 32, 16, 74, 19, 96),
                new Slytherin("Грегори", " Гойл", " Слизерин", 66, 84, 38, 41, 100),
        };
        System.out.println();
        allStudent(slytherins);
        theBestStudentSlytherin(slytherins);

        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария", " Смит", " Пуффендуй", 84, 89, 74),
                new Hufflepuff("Седрик", " Диггори", " Пуффендуй", 6, 16, 74),
                new Hufflepuff("Джастин", " Финч-Флетчли", " Пуффендуй", 84, 73, 84),
        };
        System.out.println();
        allStudent(hufflepuffs);
        theBestStudentHufflepuff(hufflepuffs);

        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу", " Чанг", " Когтевран", 34, 55, 43, 25),
                new Ravenclaw("Падма", " Патил", " Когтевран", 21, 98, 11, 39),
                new Ravenclaw("Маркус", " Белби", " Когтевран", 75, 25, 37, 70),
        };
        System.out.println();
        allStudent(ravenclaws);
        theBestStudentRavenclaw(ravenclaws);
        System.out.println();
        thePowerOfMagic(gryffindors, slytherins);
    }


    public static void allStudent(Hogwarts[] hogwarts) {
        for (Hogwarts people : hogwarts) {
            System.out.println(people.getName() + people.getSurname() + people.getFaculty() + people);
        }

    }

    public static Gryffindor theBestStudentGryffindor(Gryffindor[] hogwarts) {
        Gryffindor max = hogwarts[0];
        int maxBall = hogwarts[0].getNobility() + hogwarts[0].getHonor() + hogwarts[0].getBravery();
        for (Gryffindor gryffindor : hogwarts) {
            if (gryffindor.getNobility() + gryffindor.getHonor() + gryffindor.getBravery() > maxBall) {
                maxBall = gryffindor.getNobility() + gryffindor.getHonor() + gryffindor.getBravery();
                max = gryffindor;
            }
        }
        System.out.println("Максималься баллов в факульте Гриффиндора у студента " + max.getName() + max.getSurname() + ", " + maxBall);
        return max;
    }

    public static Slytherin theBestStudentSlytherin(Slytherin[] hogwarts) {
        Slytherin max = hogwarts[0];
        int maxBall = hogwarts[0].getTricky() + hogwarts[0].getDetermination() + hogwarts[0].getAmbition() + hogwarts[0].getResourcefulness() + hogwarts[0].getLustForPower();
        for (Slytherin slytherin : hogwarts) {
            if (slytherin.getTricky() + slytherin.getDetermination() + slytherin.getAmbition() + slytherin.getResourcefulness() + slytherin.getLustForPower() > maxBall) {
                maxBall = slytherin.getTricky() + slytherin.getDetermination() + slytherin.getAmbition() + slytherin.getResourcefulness() + slytherin.getLustForPower();
                max = slytherin;
            }
        }
        System.out.println("Максималься баллов в факульте Слизерин у студента " + max.getName() + max.getSurname() + ", " + maxBall);
        return max;
    }

    public static Hufflepuff theBestStudentHufflepuff(Hufflepuff[] hogwarts) {
        Hufflepuff max = hogwarts[0];
        int maxBall = hogwarts[0].getHardworking() + hogwarts[0].getFaithful() + hogwarts[0].getHonest();
        for (Hufflepuff hufflepuff : hogwarts) {
            if (hufflepuff.getHardworking() + hufflepuff.getFaithful() + hufflepuff.getHonest() > maxBall) {
                maxBall = hufflepuff.getHardworking() + hufflepuff.getFaithful() + hufflepuff.getHonest();
                max = hufflepuff;
            }
        }
        System.out.println("Максималься баллов в факульте Пуффендуй у студента " + max.getName() + max.getSurname() + ", " + maxBall);
        return max;
    }

    public static Ravenclaw theBestStudentRavenclaw(Ravenclaw[] hogwarts) {
        Ravenclaw max = hogwarts[0];
        int maxBall = hogwarts[0].getSmart() + hogwarts[0].getWise() + hogwarts[0].getWitty() + hogwarts[0].getFullOfCreativity();
        for (Ravenclaw ravenclaw : hogwarts) {
            if (ravenclaw.getSmart() + ravenclaw.getWise() + ravenclaw.getWitty() + ravenclaw.getFullOfCreativity() > maxBall) {
                maxBall = ravenclaw.getSmart() + ravenclaw.getWise() + ravenclaw.getWitty() + ravenclaw.getFullOfCreativity();
                max = ravenclaw;
            }
        }
        System.out.println("Максималься баллов в факульте Когтевран у студента " + max.getName() + max.getSurname() + ", " + maxBall);
        return max;
    }


    public static void thePowerOfMagic(Gryffindor[] gryffindors, Slytherin[] slytherins) {
        Gryffindor student = gryffindors[0];
        Slytherin student1 = slytherins[0];
            if (student.getNobility() + student.getHonor() + student.getBravery() > student1.getTricky() + student1.getDetermination() + student1.getAmbition() + student1.getResourcefulness() + student1.getLustForPower()) {
                System.out.println(student.getName() + student.getSurname() + " обладает большей мощностью магии, чем " + student1.getName() + student1.getSurname());
            }else
                System.out.println(student1.getName() + student1.getSurname()+ " обладает большей мощностью магии, чем " + student.getName() + student.getSurname());
        }
}