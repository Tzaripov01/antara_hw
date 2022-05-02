package Model;

public class Kotik {

    private int weight;
    private int prettiness;
    private String name;
    private String meow;
    private static int NumberOfCats = 0;
    private int satiety = 0;


    public Kotik(int inputPrettiness, String inputName, int inputWeight, String inputMeow) {
        NumberOfCats += 1;
        this.setKotik(inputPrettiness, inputName, inputWeight, inputMeow);
    }

    public Kotik() {
        NumberOfCats += 1;
    }

    public boolean eat() {
        return this.eat(1, "milk");
    }

    public boolean eat(int inputSatiety) {
        satiety += inputSatiety;
        System.out.println("The cat has eaten.");
        return true;
    }

    public boolean eat(int inputSatiety, String food) {
        satiety += inputSatiety;
        System.out.println("The cat has eaten a " + food);
        return true;
    }

    public boolean play() {
        if (satiety <= 0) {
            System.out.print("The cat hasn't played. Feed the cat! ");
            return false;
        } else {
            System.out.println("The cat has played!");
            return true;
        }
    }

    public boolean sleep() {
        if (satiety <= 0) {
            System.out.print("The cat hasn't slept. Feed the cat! ");
            return false;
        } else {
            System.out.println("The cat has slept!");
            return true;
        }
    }

    public boolean chaseMouse() {
        if (satiety <= 0) {
            System.out.print("The cat hasn't chased mouse. Feed the cat! ");
            return false;
        } else {
            System.out.println("The cat has catch the mouse!");
            return true;
        }
    }

    public boolean cuddle() {
        if (satiety <= 0) {
            System.out.print("The cat hasn't cuddle. Feed the cat! ");
            return false;
        } else {
            System.out.println("The cat has cuddle!");
            return true;
        }
    }

    public void liveAnotherDay() {
        for (int i = 0; i <= 24; i++) {
            switch ((int) (Math.random() * 5 + 1)) {
                case 1:
                    eat();
                    break;
                case 2:
                    if (!play()) {
                        eat();
                    }
                    break;
                case 3:
                    if (!sleep()) {
                        eat();
                    }
                    break;
                case 4:
                    if (!chaseMouse()) {
                        eat();
                    }
                    break;
                case 5:
                    if (!cuddle()) {
                        eat();
                    }
                    break;
            }
        }
    }

    public void setKotik(int prettiness, String name, int weight, String meow) {
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
    }

    public static int getNumberOfCats() {
        return NumberOfCats;
    }

    public int getSatiety() {
        return satiety;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrettiness() {
        return prettiness;
    }

    public String getName() {
        return name;
    }

    public String getMeow() {
        return meow;
    }
}