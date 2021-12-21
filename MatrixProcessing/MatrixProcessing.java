package MatrixProcessing;
import java.util.Scanner;

public class MatrixProcessing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c;
        System.out.print("Введите длинну и ширину матриц:");
        int[] razmer = new int[2];
        razmer[0] = in.nextInt();
        razmer[1] = in.nextInt();
        System.out.println("Введите матрицу:");
        int[][] matrica = new int[razmer[0]][razmer[1]];
        for (int q = 0; q < razmer[0]; q++) {
            for (int w = 0; w < razmer[1]; w++) {
                matrica[q][w] = in.nextInt();
            }
        }
        System.out.println("Введите константу:");
        c = in.nextInt();
        int[][] matrica2 = new int[razmer[0]][razmer[1]];
        for (int q = 0; q < razmer[0]; q++) {
            for (int w = 0; w < razmer[1]; w++) {
                matrica2[q][w] = matrica[q][w] * c;
            }
        }
        for (int q = 0; q < razmer[0]; q++) {
            for (int w = 0; w < razmer[1]; w++) {
                System.out.print("|" + matrica3[q][w] + "|");
            }
            System.out.println();
        }
    }
}