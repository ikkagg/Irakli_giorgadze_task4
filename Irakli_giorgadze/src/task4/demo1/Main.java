package task4.demo1;


import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> myset = new HashSet<String>();
        myset.add("irakli");
        myset.add("nika");
        myset.add("giorgi");
        for(String x : myset){
            System.out.println(x);
        }
    }
}
