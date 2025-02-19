package proxydesignpattern;

public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("high_res_image.jpg");
        image.display();
        image.display();
    }
}
