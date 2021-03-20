package observe;

public class GradeTwoObserver extends Observer {
    public GradeTwoObserver(Shop shop) {
        this.shop = shop;
        this.shop.attach(this);
    }

    @Override
    public void update() {
        System.out.println("大二今天吃" + this.shop.getFood());
    }
}
