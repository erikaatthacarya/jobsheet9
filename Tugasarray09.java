import java.util.Scanner;

public class Tugasarray09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int size = sc.nextInt();
        int[] arrayInt = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Masukkan elemen array ke-" + (i + 1) + " : ");
            arrayInt[i] = sc.nextInt();
        }

        int max = arrayInt[0];
        int min = arrayInt[0];
        double sum = 0;

        for (int i = 0; i < size; i++) {
            if (arrayInt[i] > max) {
                max = arrayInt[i];
            }
            if (arrayInt[i] < min) {
                min = arrayInt[i];
            }
            sum += arrayInt[i];
        }

        double avg = sum / size;

        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah: " + min);
        System.out.println("Nilai rata-rata: " + avg);
    }
}
    

