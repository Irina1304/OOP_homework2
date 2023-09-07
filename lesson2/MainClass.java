package lesson2;

public class MainClass {

    public static void main(String[] args) {

        Cat[] cats = {
            new Cat("Плюша", 5),
            new Cat("Ася", 6),
            new Cat("Джем", 10),
            new Cat("Марсик", 9),
            new Cat("Том", 8),
        };

        Plate plate = new Plate(100);

        plate.info();


        for (Cat cat:cats) {
            cat.eat(plate.getFood());
            plate.setFood(plate.getFood() - cat.getAppetite());
        }

        plate.info();

        for (Cat cat:cats) {
            cat.getSatiety();
        }

    }
    
}
