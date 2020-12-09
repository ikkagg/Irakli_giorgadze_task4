package task4.demo3;



public class Main {
    public static void main(String[] args) {
        IphoneX iphoneX = new IphoneX();
        iphoneX.title="Iphone X";

        Nokia nokia = new Nokia();
        nokia.title="Nokie Lumia";
        printSmartphone(iphoneX);
        printSmartphone(nokia);
    }

    public static <Smartphone> void printSmartphone(Smartphone x){
        System.out.println("Smarphone: ");
    }
    public static <Simbian> void printSimbian(Simbian x){
        System.out.println("Smarphone: ");
    }

}
