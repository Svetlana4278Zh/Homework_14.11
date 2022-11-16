public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int age = 24;
        if (age>=18) {
            System.out.println("Поздравляем, Вы совершеннолетний!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил. Нужно немного подождать.");
        }
        //Задача 2
        System.out.println("\nЗадача 2");
        if (age>=7&&age<18){
            System.out.println("Ребенок ходит в школу.");
        } else if (age>=18&&age<24){
            System.out.println("Человек уже закончил школу и может отправляться в университет.");
        } else if (age>=24) {
            System.out.println("Человек окончил университет и ему пора искать работу.");
        }
        //Задача 3
        System.out.println("\nЗадача 3");
        int trainCapacity=102;
        int sittingPlaces=60;
        int standingPlaces=trainCapacity-sittingPlaces;
        int sittingPlacesOccupied=60;
        int staningPlacesOccupied=42;
        if (staningPlacesOccupied>=standingPlaces&&sittingPlacesOccupied>=sittingPlaces){
            System.out.println("Вагон полный. Свободных мест нет.");
        } else {
            if (sittingPlacesOccupied < sittingPlaces) {
                System.out.println("Свободно " + (sittingPlaces - sittingPlacesOccupied) + " сидячих мест.");
            }
            if (staningPlacesOccupied < standingPlaces) {
                System.out.println("Свободно " + (standingPlaces - staningPlacesOccupied) + " стоячих мест.");
            }
        }
        //Задача 4
        System.out.println("\nЗадача 4");
        int age1 = 18;
        if (age1<2) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему не нужно никуда ходить.");
        } else {
            System.out.print("Если возраст человека равен " + age1 + ", то ему нужно ходить");
            if (age1 >= 2 && age1 < 7) {
                System.out.println(" в детский сад.");
            } else if (age1 <= 18) {
                System.out.println(" в школу.");
            } else if (age1 < 24) {
                System.out.println(" в университет.");
            } else {
                System.out.println(" на работу.");
            }
        }
        //Задача 5
        System.out.println("\nЗадача 5");
        System.out.print("Если возраст человека равен " + age1);
        if (age1<5) {
            System.out.println(", то ему нельзя кататься на аттракционе.");
        } else if (age1<14){
            System.out.println(", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else {
            System.out.println(", то он может кататься без сопровождения взрослого.");
        }
        //Задача 6
        System.out.println("\nЗадача 6");
        int one = 5;
        int two = 6;
        int three = 4;
        if (one>=two&&one>=three){
            System.out.println("Самое большое число - "+one);
        } else if (two>three){
            System.out.println("Самое большое число - "+two);
        } else {
            System.out.println("Самое большое число - "+three);
        }
    }
}