package ua.intita.qa.homework13.task_b;

public class DemoGenerics {
    public static void main(String[] args) {

        Bike<String> bike1 = new Bike<>("Specialized", "XL", 28, 29);
        Bike<Integer> bike2 = new Bike<>("Cube", 52, 24, 26);

        String frameSize1 = bike1.getFrameSize();
        Integer frameSize2 = bike2.getFrameSize();

        System.out.println("Size of frame " + bike1.getName() + " is " + frameSize1);
        System.out.println("Size of frame " + bike2.getName() + " is " + frameSize2);

        Clothes<String, Integer> clothes1 = new Clothes<>("suit", "man", 52, "grey");
        Clothes<Character, String> clothes2 = new Clothes<>("dress", 'w', "XS", "blue");

        String gender1 = clothes1.getGender();
        Character gender2 = clothes2.getGender();

        Integer size1 = clothes1.getSize();
        String size2 = clothes2.getSize();

        System.out.println("Clothes 1: " + gender1 + " " + size1);
        System.out.println("Clothes 2: " + gender2 + " " + size2);

        Route<Integer, String, Float> route1 = new Route<>(1, "easy", 10.6f);
        Route<String, Integer, Integer> route2 = new Route<>("Relax", 1, 7);

        Integer name1 = route1.getName();
        String name2 = route2.getName();

        String difficulty1 = route1.getDifficulty();
        Integer difficulty2 = route2.getDifficulty();

        Float length1 = route1.getLength();
        Integer length2 = route2.getLength();

        System.out.println("Route1: " + name1 + " " + difficulty1 + " " + length1);
        System.out.println("Route2: " + name2 + " " + difficulty2 + " " + length2);
    }
}
