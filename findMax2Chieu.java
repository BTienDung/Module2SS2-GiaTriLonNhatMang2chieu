package season_2.TimMaxMang2Chieu;

import java.util.Scanner;

public class findMax2Chieu {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.printf("Nhap so cot: ");
        int cot = sc.nextInt();
        System.out.printf("Nhap so hang: ");
        int hang = sc.nextInt();
        int arr[][] = new int[cot][hang];
        int max = arr[0][0];

        for (int i=0; i<cot; i++){
            for (int j=0 ; j<hang;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i=0; i<cot; i++){
            for (int j=0 ; j<hang;j++){
                if (max<arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("\nGia tri lon nhat la: "+max);
    }
}
