package patikadev;
import java.util.Scanner;
public class artikYil {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year;
        System.out.print("bir yıl giriniz:");
        year = in.nextInt();
        if (year % 400 == 0){
            System.out.println(year+ " bir artık yıldır.");
        }else{
            System.out.println(year+" bir artık yıl değildir.");
        }
    }
}
