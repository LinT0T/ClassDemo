package bulid;

public class Main {
    public static void main(String[] args) {
        Computer computer=new Computer.Builder("因特尔","三星")
                .setKeyboard("罗技")
                .setUsbCount(2)
                .build();
        System.out.println(computer.toString());
    }
}
