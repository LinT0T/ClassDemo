package observe;

public class GradeThreeObserver extends Observer {
    public GradeThreeObserver(Shop shop) {
        this.shop = shop;
        this.shop.attach(this);
    }

    @Override
    public void update() {
        System.out.println("大三今天吃" + this.shop.getFood());
    }
}
