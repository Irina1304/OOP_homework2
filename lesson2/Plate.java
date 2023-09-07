package lesson2;

public class Plate {

    private int food;

    public int getFood() {
        return food;
    }
    
    public Plate(int food) {
        this.food = food;
    }

    public void setFood(int food) {
        if (food < 0) {
            System.out.println("В миске недостаточно еды");
        } else {
            this.food = food;
        }
    }



    public void info() {
        System.out.println("plate: " + food);
    }
    
}
