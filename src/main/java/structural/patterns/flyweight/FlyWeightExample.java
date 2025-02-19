package structural.patterns.flyweight;

public class FlyWeightExample {
    public static void main(String[] args) {
        Forest forest = new Forest();

        forest.plantTree(10, 20, "Oak", "Green", "Rough");
        forest.plantTree(15, 30, "Pine", "Dark Green", "Smooth");
        forest.plantTree(10, 20, "Oak", "Green", "Rough"); // This should reuse the previous Oak tree type
        forest.plantTree(25, 35, "Pine", "Dark Green", "Smooth"); // Reuse Pine
        forest.render();
    }
}
