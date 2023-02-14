import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("3 adet kenar uzunluğu girin:");

        int kenar1,kenar2,kenar3;
        kenar1=input.nextInt();
        kenar2=input.nextInt();
        kenar3=input.nextInt();

        int u= (kenar1+kenar2+kenar3)/2;
        double alan = Math.pow((u*(u-kenar1)*(u-kenar2)*(u-kenar3)),0.5);
        System.out.println(alan);

    }
}