import Model.Kotik;

public class Application {

    public static void main(String[] args) {
        Kotik cat1 = new Kotik(75, "Light", 7, "meow");
        Kotik cat2 = new Kotik();
        cat2.setKotik(100, "Gold", 9, "meow");
        cat2.liveAnotherDay();
        System.out.println("Cats name:" + cat2.getName() + " Weight cat:" + cat2.getWeight());
        if (cat1.getMeow().equals(cat2.getMeow())) {
            System.out.println("These two cats have equal voices!");
        } else {
            System.out.println("These two cats don't have equal voices! " + cat1.getName() + " says: " + cat1.getMeow() + " And " + cat2.getName() + " says: " + cat2.getMeow());
        }
        System.out.println("Number Of Cats: " + Kotik.getNumberOfCats());
    }
}