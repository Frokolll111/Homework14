
public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри", " Поттер", " Гриффиндор", 54, 28, 64,16,84),
                new Gryffindor("Гермиона", " Грейнджер", " Гриффиндор", 71, 71, 25,94,6),
                new Gryffindor("Рон", " Уизли", " Гриффиндор", 81, 31, 9,6,32),
        };
        System.out.println();
        allStudent(gryffindors);
        theBestStudentGryffindor(gryffindors);

        Slytherin[] slytherins = {
                new Slytherin("Драко", " Малфой", " Слизерин", 68, 32, 81, 18, 88,85,81),
                new Slytherin("Грэхэм", " Монтегю", " Слизерин", 32, 16, 74, 19, 96,22,25),
                new Slytherin("Грегори", " Гойл", " Слизерин", 66, 84, 38, 41, 100,62,11),
        };
        System.out.println();
        allStudent(slytherins);
        theBestStudentSlytherin(slytherins);

        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария", " Смит", " Пуффендуй", 84, 89, 74,27,70),
                new Hufflepuff("Седрик", " Диггори", " Пуффендуй", 6, 16, 74,95,12),
                new Hufflepuff("Джастин", " Финч-Флетчли", " Пуффендуй", 84, 73, 84,66,26),
        };
        System.out.println();
        allStudent(hufflepuffs);
        theBestStudentHufflepuff(hufflepuffs);

        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу", " Чанг", " Когтевран", 34, 55, 43, 25,68,90),
                new Ravenclaw("Падма", " Патил", " Когтевран", 21, 98, 11, 39,49,26),
                new Ravenclaw("Маркус", " Белби", " Когтевран", 75, 25, 37, 70,74,59),
        };
        System.out.println();
        allStudent(ravenclaws);
        theBestStudentRavenclaw(ravenclaws);
        System.out.println();
        thePowerOfMagic(allStudent(gryffindors));
    }


    public static Hogwarts[] allStudent(Hogwarts[] hogwarts) {
        for (Hogwarts people : hogwarts) {
            System.out.println(people.getName() + people.getSurname() + people.getFaculty() + people);
        }

        return hogwarts;
    }

    public static Gryffindor theBestStudentGryffindor(Gryffindor[] gryffindors) {
        Gryffindor max = gryffindors[0];
        int maxBall = gryffindors[0].getNobility() + gryffindors[0].getHonor() + gryffindors[0].getBravery();
        for (Gryffindor gryffindor : gryffindors) {
            if (gryffindor.getNobility() + gryffindor.getHonor() + gryffindor.getBravery() > maxBall) {
                maxBall = gryffindor.getNobility() + gryffindor.getHonor() + gryffindor.getBravery();
                max = gryffindor;
            }
        }
        System.out.println("Максималься баллов в факульте Гриффиндора у студента " + max.getName() + max.getSurname() + ", " + maxBall);
        return max;
    }

    public static Slytherin theBestStudentSlytherin(Slytherin[] slytherins) {
        Slytherin max = slytherins[0];
        int maxBall = slytherins[0].getTricky() + slytherins[0].getDetermination() + slytherins[0].getAmbition() + slytherins[0].getResourcefulness() + slytherins[0].getLustForPower();
        for (Slytherin slytherin : slytherins) {
            if (slytherin.getTricky() + slytherin.getDetermination() + slytherin.getAmbition() + slytherin.getResourcefulness() + slytherin.getLustForPower() > maxBall) {
                maxBall = slytherin.getTricky() + slytherin.getDetermination() + slytherin.getAmbition() + slytherin.getResourcefulness() + slytherin.getLustForPower();
                max = slytherin;
            }
        }
        System.out.println("Максималься баллов в факульте Слизерин у студента " + max.getName() + max.getSurname() + ", " + maxBall);
        return max;
    }

    public static Hufflepuff theBestStudentHufflepuff(Hufflepuff[] hufflepuffs) {
        Hufflepuff max = hufflepuffs[0];
        int maxBall = hufflepuffs[0].getHardworking() + hufflepuffs[0].getFaithful() + hufflepuffs[0].getHonest();
        for (Hufflepuff hufflepuff : hufflepuffs) {
            if (hufflepuff.getHardworking() + hufflepuff.getFaithful() + hufflepuff.getHonest() > maxBall) {
                maxBall = hufflepuff.getHardworking() + hufflepuff.getFaithful() + hufflepuff.getHonest();
                max = hufflepuff;
            }
        }
        System.out.println("Максималься баллов в факульте Пуффендуй у студента " + max.getName() + max.getSurname() + ", " + maxBall);
        return max;
    }

    public static Ravenclaw theBestStudentRavenclaw(Ravenclaw[] ravenclaws) {
        Ravenclaw max = ravenclaws[0];
        int maxBall = ravenclaws[0].getSmart() + ravenclaws[0].getWise() + ravenclaws[0].getWitty() + ravenclaws[0].getFullOfCreativity();
        for (Ravenclaw ravenclaw : ravenclaws) {
            if (ravenclaw.getSmart() + ravenclaw.getWise() + ravenclaw.getWitty() + ravenclaw.getFullOfCreativity() > maxBall) {
                maxBall = ravenclaw.getSmart() + ravenclaw.getWise() + ravenclaw.getWitty() + ravenclaw.getFullOfCreativity();
                max = ravenclaw;
            }
        }
        System.out.println("Максималься баллов в факульте Когтевран у студента " + max.getName() + max.getSurname() + ", " + maxBall);
        return max;
    }


    public static void thePowerOfMagic(Hogwarts [] hogwarts) {
        Hogwarts student = hogwarts[0];
        Hogwarts student1 = hogwarts[2];
            if (student.getThePowerOfMagic() + student.getTransgressions() > student1.getThePowerOfMagic() + student1.getTransgressions()) {
                System.out.println(student.getName() + student.getSurname() + " обладает большей мощностью магии, чем " + student1.getName() + student1.getSurname());
            }else
                System.out.println(student1.getName() + student1.getSurname()+ " обладает большей мощностью магии, чем " + student.getName() + student.getSurname());
        }
}