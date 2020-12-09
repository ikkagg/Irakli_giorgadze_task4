package task4.demo2;

public class Main {
    public static void main(String[] args) {
        Sumable s = (int x, int y) -> {return x + y;};
        System.out.println(s.sum(10,11));
    }
}
