import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Ədədi daxil edin: ");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int cem=0;
        for(;a!=0;a/=10){
            cem+=(a%10);
        }
        System.out.println("Daxil edilən ədədin rəqəmləri cəmi= "+cem);
    }
}