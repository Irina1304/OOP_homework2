package lesson2;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety = false;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }
    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
    
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void getSatiety(){
        if (satiety) {
            System.out.printf("%s сытый\n", name);
        } else {
            System.out.printf("%s голодный\n", name);
        }
    }
    
    public void eat(int food){
        if (!satiety && appetite <= food){
            this.satiety = true;
            System.out.printf("%s поел\n", name);
        } else {
            System.out.printf("%s не поел\n", name);
        }
    }
    
}
