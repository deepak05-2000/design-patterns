package proxydesignpattern;

public class RealImage implements Image {

    private final String imageName;

    public RealImage(String imageName) {this.imageName = imageName;}

    @Override
    public void display() {
        System.out.println("image " + imageName);
    }
}
