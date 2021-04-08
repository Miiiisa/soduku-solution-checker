public class Row implements Runnable{

    private int numArr[][];
    public boolean r1 = false;


    public Row(int arr[][]){
        this.numArr=arr;
    }


    @Override
    public void run() {


        //verify 1st number in each row
        for (int i = 0; i < 9; i++) {
            int prev = numArr[i][0];
            for (int j = 1; j < 9; j++) {
                if(prev == numArr[i][j]){
                    r1 = true;
                }
                else{
                }
            }
        }


        //verify 2nd number in each row
        for (int i = 0; i < 9; i++) {
            int prev = numArr[i][1];
            for (int j = 2; j < 9; j++) {
                if(prev == numArr[i][j]){
                    r1 = true;
                }
                else{
                }
            }
        }


        //verify 3rd number in each row
        for (int i = 0; i < 9; i++) {
            int prev = numArr[i][2];
            for (int j = 3; j < 9; j++) {
                if(prev == numArr[i][j]){
                    r1 = true;
                }
                else{
                }
            }
        }


        //verify 4th number in each row
        for (int i = 0; i < 9; i++) {
            int prev = numArr[i][3];
            for (int j = 4; j < 9; j++) {
                if(prev == numArr[i][j]){
                    r1 = true;
                }
                else{
                }
            }
        }


        //verify 5th number in each row
        for (int i = 0; i < 9; i++) {
            int prev = numArr[i][4];
            for (int j = 5; j < 9; j++) {
                if(prev == numArr[i][j]){
                    r1 = true;
                }
                else{
                }
            }
        }


        //verify 6th number in each row
        for (int i = 0; i < 9; i++) {
            int prev = numArr[i][5];
            for (int j = 6; j < 9; j++) {
                if(prev == numArr[i][j]){
                    r1 = true;
                }
                else{
                }
            }
        }


        //verify 7th number in each row
        for (int i = 0; i < 9; i++) {
            int prev = numArr[i][6];
            for (int j = 7; j < 9; j++) {
                if(prev == numArr[i][j]){
                    r1 = true;
                }
                else{
                }
            }
        }


        //verify 8th number in each row
        for (int i = 0; i < 9; i++) {
            int prev = numArr[i][7];
            for (int j = 8; j < 9; j++) {
                if(prev == numArr[i][j]){
                    r1 = true;
                }
                else{
                }
            }
        }

    }

}
