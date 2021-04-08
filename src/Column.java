public class Column implements Runnable{

    private int numArr[][];
    public boolean r2 = false;


    public Column(int arr[][]){
        this.numArr=arr;
    }


    @Override
    public void run() {


        //verify 1st number in each column
        for (int i = 0; i < 9; i++) {
            int prev = numArr[0][i];
            for (int j = 1; j < 9; j++) {
                if(prev == numArr[j][i]){
                    r2 = true;
                }
                else{
                }
            }
        }


        //verify 2nd number in each column
        for (int i = 0; i < 9; i++) {
            int prev = numArr[1][i];
            for (int j = 2; j < 9; j++) {
                if(prev == numArr[j][i]){
                    r2 = true;
                }
                else{
                }
            }
        }


        //verify 3rd number in each column
        for (int i = 0; i < 9; i++) {
            int prev = numArr[2][i];
            for (int j = 3; j < 9; j++) {
                if(prev == numArr[j][i]){
                    r2 = true;
                }
                else{
                }
            }
        }


        //verify 4th number in each column
        for (int i = 0; i < 9; i++) {
            int prev = numArr[3][i];
            for (int j = 4; j < 9; j++) {
                if(prev == numArr[j][i]){
                    r2 = true;
                }
                else{
                }
            }
        }


        //verify 5th number in each column
        for (int i = 0; i < 9; i++) {
            int prev = numArr[4][i];
            for (int j = 5; j < 9; j++) {
                if(prev == numArr[j][i]){
                    r2 = true;
                }
                else{
                }
            }
        }


        //verify 6th number in each column
        for (int i = 0; i < 9; i++) {
            int prev = numArr[5][i];
            for (int j = 6; j < 9; j++) {
                if(prev == numArr[j][i]){
                    r2 = true;
                }
                else{
                }
            }
        }


        //verify 7th number in each column
        for (int i = 0; i < 9; i++) {
            int prev = numArr[6][i];
            for (int j = 7; j < 9; j++) {
                if(prev == numArr[j][i]){
                    r2 = true;
                }
                else{
                }
            }
        }


        //verify 8th number in each column
        for (int i = 0; i < 9; i++) {
            int prev = numArr[7][i];
            for (int j = 8; j < 9; j++) {
                if(prev == numArr[j][i]){
                    r2 = true;
                }
                else{
                }
            }
        }


    }

}
