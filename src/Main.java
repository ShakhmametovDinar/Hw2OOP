import Task.Task.*;
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 100);
        Plate plate = new Plate(100);
        plate.info();
        if(plate.getFood() - cat.getAppetite()>=0){
            cat.eat();
        }
        plate.setFood(plate.getFood() - cat.getAppetite());
        cat.satiety();
    }
}

