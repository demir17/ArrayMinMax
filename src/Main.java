import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = {64,35,1,6542,6220,-5632,4621,52,6,4};
        int min = 0, max=0;
        System.out.println(Arrays.toString(list));
        System.out.println("Lütfen bir sayı giriniz: ");
        int n = sc.nextInt();

        Arrays.sort(list);

        for(int i : list){
            if(i< n){
                min = i;
            }
            if(i > n){
                max = i;
                break;
            }



        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + max);
    }
}
