import java.util.Scanner;

public class bolum1 {
    public static void main(String[] args) {
        int n;
        Scanner num = new Scanner(System.in);

        System.out.print("Sayıyı giriniz:");
        n = num.nextInt();

        int sum = 0, counter = 0;
        int i = 1;
        while (i <= n) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                sum += i;
                counter++;
            }
            i++;
        }
            double ort = sum/counter;
            if (sum!=0){
                System.out.println("0 dan "+n+ "sayısına kadar olan 3 ve 4 de bölünebilen sayıların ortalaması:" +ort);


            }else {
                System.out.println("0 dan "+ n + "kadar olan sayılarda 3 ve 4 bölünebilen sayılar yoktur ");
            }
        }


    }






