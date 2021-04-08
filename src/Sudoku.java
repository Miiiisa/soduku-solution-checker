import java.io.*;
import java.util.*;

public class Sudoku {
    public static void main(String[] args) throws IOException {
        int arr[][] = new int[9][9];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the full path of the sudoku solution file: ");
        String location = sc.nextLine();
        BufferedReader br = new BufferedReader(new FileReader(location));
        for (int i = 0; i < 9; i++) {
            String[] st = br.readLine().trim().split(" ");
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st[j]);
            }
        }

        //Prints solution
        for (int i = 0; i < 9; i++) {
            System.out.println();
            for (int j = 0; j < 9; j++) {
                System.out.print(arr[i][j]);
                System.out.print("  ");
            }
        }
        System.out.println();

        //Creates 3 new thread
        Row rRow=new Row(arr);
        Column rColumn=new Column(arr);
        Block rBlock=new Block(arr);
        Thread th0 = new Thread(rRow);
        Thread th1 = new Thread(rColumn);
        Thread th2 = new Thread(rBlock);

        //Start and join them together
        th0.start();
        th1.start();
        th2.start();
        try{
            th0.join();
            th1.join();
            th2.join();
            //Print out the result
            if(rRow.r1==true|rColumn.r2==true|rBlock.r3==true){
                System.out.println("This solution is incorrect");
            }
            else{
                System.out.println("This solution is correct");
            }


        }catch(InterruptedException e){}


    }
}
