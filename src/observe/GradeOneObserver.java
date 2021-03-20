package observe;

public class GradeOneObserver extends Observer {

    public GradeOneObserver(Shop shop) {
        this.shop = shop;
        this.shop.attach(this);
    }

    @Override
    public void update() {
        System.out.println("大一今天吃" + this.shop.getFood());
    }
}
