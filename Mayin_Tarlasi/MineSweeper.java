import java.util.Random;
import java.util.Scanner;
public class MineSweeper {
    int rows, cols, mayinSayisi;
    String[][] matrix;
    String[][] mayinlar;
    Scanner input = new Scanner(System.in);
    Random rando = new Random();


    MineSweeper(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = new String[rows][cols];
        this.mayinlar = new String[rows][cols];
        this.mayinSayisi = (rows * cols) / 4;
    }
    public void start(){
        gameBoard();
        mayinlarLokasyon();

        int satir,sutun;
        System.out.println("\n----*> Mayın Tarlası <*----\n ");

        int mayinSayisi = 0;
        while (true){
            printArr(matrix);

            System.out.print("\n Satır Giriniz : ");
            satir = input.nextInt();
            System.out.print("Sütün Giriniz : ");
            sutun = input.nextInt();

            if(satir >= 0 && sutun >= 0 && satir <=rows && sutun <= cols){
                if(matrix[satir][sutun] == " -"){
                    continue;
                }
                if(!mayinlar[satir][sutun].equals(" *")){
                    mayinSayisi = mineControl(satir,sutun);
                    matrix[satir][sutun] = " "+ mayinSayisi + String.valueOf("");

                } else if (mayinlar[satir][sutun].equals(" *")) {
                    System.out.println("Kaybettiniz.");
                    printArr(mayinlar);
                    break;
                }
                if(this.mayinSayisi == isWin()){
                    System.out.println("Tebrikler Hiçbir Mayına Basmadan Oyunu Tamamladınız !!!");
                    printArr(matrix);
                    break;
                }
            }
            else{
                System.out.println("Hatalı satır veya sütün seçimi yaptınız lütfen tekrar deneyin.");
            }
        }
    }

    public void printArr(String[][] arr) {
        System.out.print("      ");
        for (int colNumber = 0; colNumber < arr.length; colNumber++) {
            if (colNumber > 10) {
                System.out.print(" " + colNumber);
            } else
                System.out.print("  " + colNumber);
        }
        System.out.println();
        System.out.print("      ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("  -");
        }

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (i >= 10)
                System.out.print(i + "- [ ");
            else
                System.out.print(i + " - [ ");
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println(" ] ");
            System.out.println();
        }
    }
    public void gameBoard() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = " X";
                mayinlar[i][j] = " X";
            }
        }
    }

    public void mayinlarLokasyon() {
        int satir, sutun, count = 0;
        while (count != mayinSayisi) {
            satir = rando.nextInt(rows);
            sutun = rando.nextInt(cols);

            if (mayinlar[satir][sutun] != " *") {
                mayinlar[satir][sutun] = " *";
                count++;
            }
        }

    }

    public int mineControl(int satir, int sutun) {
        int count = 0;
        int tempRow, tempCol;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                tempRow = satir + 1;
                tempCol = sutun + 1;


                if (tempCol >= 0 && tempRow >= 0 && tempRow < rows && tempCol < cols) {
                    if (mayinlar[tempRow][tempCol] == " *") {
                        count++;
                    }
                    if (mayinlar[tempRow][tempCol] != " *" && matrix[tempRow][tempCol] != " -") {
                        String eleman = matrix[tempRow][tempCol];
                        try {
                            Integer.parseInt(eleman);

                        } catch (NumberFormatException e) {
                            matrix[tempRow][tempCol] = " -";
                        }
                    }
                }
            }
        }
        return count;
    }

    public int isWin(){
        int acilanKutu = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0 ; j < matrix.length; j++){
                if (matrix[i][j] == " X"){
                    acilanKutu ++;
                }
            }
        }
        return acilanKutu;
    }

}
