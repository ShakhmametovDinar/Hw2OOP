package Task;

public class Task {

    public static class Cat{
        private String name;
        private int appetite;
        public static boolean a = false;
        public Cat(String name, int appetite) {
            this.name = name;
            this.appetite = appetite;
        }

        public int getAppetite() {
            return appetite;
        }

        public void eat() { a = true; }

        public void satiety() {
            if(a == true){
                System.out.println("Котик сытый!");
            }
            else {
                System.out.println("Котик хочет есть!");
            }
        }
    }
    public static class Plate{
        private int food;
        public Plate(int food) {
            this.food = food;
        }

        public int getFood() {
            return food;
        }

        public void info() {
            System.out.println("plate: " + food);
        }

        public void setFood(int food) {
            if(food>=0){
                this.food = food;
            }
            else{
                System.out.println("Еды не хватает!");
            }
        }
    }


}
