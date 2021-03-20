package observe;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        new GradeOneObserver(shop);
        new GradeTwoObserver(shop);
        new GradeThreeObserver(shop);

        System.out.println("早上上菜：一人三十个肉包子");
        shop.setFood("三十个肉包子");
        System.out.println("中午上菜：二十个汉堡加十杯可乐");
        shop.setFood("二十个汉堡");
        System.out.println("晚上全村吃席");
        shop.setFood("全村吃席");
    }
}
