package MatrixProcessing;
import java.util.Scanner;

public class MatrixProcessing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c;
        int a;
        int[] razmer = new int[2];
        int[] razmer2 = new int[2];
        int[][] matrica2;
        int[][] matrica3;
        int[][] matrica;
        for (; ; ) {
            System.out.println("1.Сумма матриц\n"+
                    "2.Умножение на константу\n"+
                    "3.Умножение матриц\n"+
                    "4.Выход");
            System.out.print("Ваш выбор:");
            a = in.nextInt();
            if (a==4){
                System.exit(0);
            }
            System.out.print("Введите длинну и ширину матриц:");
            razmer[0] = in.nextInt();
            razmer[1] = in.nextInt();
            matrica = new int[razmer[0]][razmer[1]];
            System.out.println("Введите матрицу:");
            for (int q = 0; q < razmer[0]; q++) {
                for (int w = 0; w < razmer[1]; w++) {
                    matrica[q][w] = in.nextInt();
                }
                matrica2 = new int[razmer[0]][razmer[1]];
                if (a==1) {
                    System.out.println("Введите вторую матрицу");
                    matrica3 = new int[razmer[0]][razmer[1]];
                    for (int q = 0; q < razmer[0]; q++) {
                        for (int w = 0; w < razmer[1]; w++) {
                            matrica2[q][w] = in.nextInt();
                        }
                    }
                    for (int q = 0; q < razmer[0]; q++) {
                        for (int w = 0; w < razmer[1]; w++) {
                            matrica3[q][w] = matrica[q][w] + matrica2[q][w];
                        }
                    }
                    for (int q = 0; q < razmer[0]; q++) {
                        for (int w = 0; w < razmer[1]; w++) {
                            System.out.print("|" + matrica2[q][w] + "|");
                        }
                        System.out.println();
                    }
                }else if (a==2){
                    System.out.println("Введите константу:");
                    c = in.nextInt();
                    for (int q = 0; q < razmer[0]; q++) {
                        for (int w = 0; w < razmer[1]; w++) {
                            matrica2[q][w] = matrica[q][w]*c;
                        }
                    }
                    for (int q = 0; q < razmer[0]; q++) {
                        for (int w = 0; w < razmer[1]; w++) {
                            System.out.print("|" + matrica2[q][w] + "|");
                        }
                        System.out.println();
                    }
                }else if (a==3){
                    System.out.print("Введите размер второй матрицы:");
                    razmer[0] = in.nextInt();
                    razmer[1] = in.nextInt();
                    matrica2 = new int [razmer[0]][razmer[1]];
                    System.out.println("Введите вторую матрицу:");
                    for (int i = 0; i < razmer[0]; i++) {
                        for (int i1 = 0; i1 < razmer[1]; i1++) {
                            matrica2[i][i1] = in.nextInt();
                        }
                    }
                    matrica3 = new int [razmer[0]][razmer[1]];
                    for (int q = 0; q < razmer[0]; q++) {
                        for (int w = 0; w < razmer[1]; w++) {
                            matrica3[q][w] = 0;
                        }
                    }
                    if (razmer[1] == razmer2[0]) {
                        for (int q = 0; q < razmer[0]; q++) {
                            for (int w = 0; w < razmer[1]; w++) {
                                for (int e = 0; e < razmer[1]; e++) {
                                    matrica3[q][w] = matrica3[q][w] + matrica[q][e]* matrica2[e][w];
                                }
                            }
                        }
                        for (int q = 0; q < razmer[0]; q++) {
                            for (int w = 0; w < razmer[1]; w++) {
                                System.out.print("|" + matrica2[q][w] + "|");
                            }
                            System.out.println();
                        }
                    }else {
                        System.out.println("ERROR");
                    }
                }else {
                    System.out.println("ERROR");
            }
        }
    }
}