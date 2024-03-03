
// Ali Eren KÖSE 04/03/2024 01:45

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;
        System.out.print("N sayısı giriniz: "); // N sayısı iste ve kaydet
        int number = scanner.nextInt();
        double[] list = new double[number];  // n sayısı ile liste oluştur
        for (int i = 0; i < list.length; i++) {  // listenin harmonik serisini hesapla
            list[i] = (double) 1 / (i + 1);
            sum += list[i];
        }
        double average = list.length / sum;  //harmonik ortalama işlemini yap ve yazdır
        System.out.println("Harmonic ortalaması : " + average);
    }
}