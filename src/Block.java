public class Block implements Runnable{

    private int numArr[][];
    public boolean r3 = false;
    int blockArr[] = new int[9];
    int k = 0;


    public Block(int arr[][]){
        this.numArr=arr;
    }


    @Override
    public void run() {


        //verify 1st block
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                blockArr[k] = numArr[i][j];
                k++;
            }
        }

        for (int m=0;m<9;m++){
            for (int n=m+1;n<9;n++){
                if (n!=m && blockArr[n] == blockArr[m])
                    r3=true;
            }
        }


        //verify 2nd block
        k = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 3; j < 6; j++){
                blockArr[k] = numArr[i][j];
                k++;
            }
        }

        for (int m=0;m<9;m++){
            for (int n=m+1;n<9;n++){
                if (n!=m && blockArr[n] == blockArr[m])
                    r3=true;
            }
        }


        //verify 3rd block
        k = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 6; j < 9; j++){
                blockArr[k] = numArr[i][j];
                k++;
            }
        }

        for (int m=0;m<9;m++){
            for (int n=m+1;n<9;n++){
                if (n!=m && blockArr[n] == blockArr[m])
                    r3=true;
            }
        }


        //verify 4th block
        k = 0;
        for(int i = 3; i < 6; i++){
            for(int j = 0; j < 3; j++){
                blockArr[k] = numArr[i][j];
                k++;
            }
        }

        for (int m=0;m<9;m++){
            for (int n=m+1;n<9;n++){
                if (n!=m && blockArr[n] == blockArr[m])
                    r3=true;
            }
        }


        //verify 5th block
        k = 0;
        for(int i = 3; i < 6; i++){
            for(int j = 3; j < 6; j++){
                blockArr[k] = numArr[i][j];
                k++;
            }
        }

        for (int m=0;m<9;m++){
            for (int n=m+1;n<9;n++){
                if (n!=m && blockArr[n] == blockArr[m])
                    r3=true;
            }
        }


        //verify 6th block
        k = 0;
        for(int i = 3; i < 6; i++){
            for(int j = 6; j < 9; j++){
                blockArr[k] = numArr[i][j];
                k++;
            }
        }

        for (int m=0;m<9;m++){
            for (int n=m+1;n<9;n++){
                if (n!=m && blockArr[n] == blockArr[m])
                    r3=true;
            }
        }


        //verify 7th block
        k = 0;
        for(int i = 6; i < 9; i++){
            for(int j = 0; j < 3; j++){
                blockArr[k] = numArr[i][j];
                k++;
            }
        }

        for (int m=0;m<9;m++){
            for (int n=m+1;n<9;n++){
                if (n!=m && blockArr[n] == blockArr[m])
                    r3=true;
            }
        }


        //verify 8th block
        k = 0;
        for(int i = 6; i < 9; i++){
            for(int j = 3; j < 6; j++){
                blockArr[k] = numArr[i][j];
                k++;
            }
        }

        for (int m=0;m<9;m++){
            for (int n=m+1;n<9;n++){
                if (n!=m && blockArr[n] == blockArr[m])
                    r3=true;
            }
        }


        //verify 9th block
        k = 0;
        for(int i = 6; i < 9; i++){
            for(int j = 6; j < 9; j++){
                blockArr[k] = numArr[i][j];
                k++;
            }
        }

        for (int m=0;m<9;m++){
            for (int n=m+1;n<9;n++){
                if (n!=m && blockArr[n] == blockArr[m])
                    r3=true;
            }
        }


    }

}
