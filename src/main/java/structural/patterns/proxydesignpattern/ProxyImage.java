package structural.patterns.proxydesignpattern;

public class ProxyImage implements Image {

    private RealImage realImage;
    private String imageName;
    ProxyImage(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public void display() {
        if(realImage == null) {
            realImage = new RealImage(imageName); // lazy loading
        }
        realImage.display();
    }
}
