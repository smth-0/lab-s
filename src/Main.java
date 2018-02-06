import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        int hight=in.nextInt(), weight=in.nextInt(), amountOfBombs=in.nextInt();
        int[][] array=new int[201][201];

        for(int i=0;i<amountOfBombs;i++){
            array[in.nextInt()][in.nextInt()]=-1;
        }

        int[] subArray1={1,1, 1,0, 0,-1,-1,-1};
        int[] subArray2={1,0,-1,1,-1, 1,-1, 0};

        for (int i = 1; i <= weight+1; i++){
            for (int j = 1; j <= hight+1; j++){
                if(array[i-1][j+1] == -1 && array[i][j] != -1)  //справа сверху
                    array[i][j]++;
                if(array[i-1][j] == -1 && array[i][j] != -1)    //сверху
                    array[i][j]++;
                if(array[i-1][j-1] == -1 && array[i][j] != -1)  //сверху слева
                    array[i][j]++;
                if(array[i][j-1] == -1 && array[i][j] != -1)    //слева
                    array[i][j]++;
                if(array[i+1][j-1] == -1 && array[i][j] != -1)  //свева внизу
                    array[i][j]++;
                if(array[i+1][j] == -1 && array[i][j] != -1)    //внизу
                    array[i][j]++;
                if(array[i+1][j+1] == -1 && array[i][j] != -1)  //внизу справа
                    array[i][j]++;
                if(array[i][j+1] == -1 && array[i][j] != -1)    //справа
                    array[i][j]++;


            }
        }

//        for(int i=1;i<=weight;++i){
//            for(int j=1;j<=hight;++j){
//                for(int z=0;z<8;++z){
//                    if(array[subArray1[z]+i][subArray2[z]+j]==-1){
//                        array[i][j]++;
//                    }
//                }
//            }
//        }

        for(int i=1;i<=weight+1;++i){
            for(int j=1;j<hight;++j) {
                char c= (char) (array[i][j]+48);
                if(c=='/'){
                    c='*';
                }
                if(c=='0'){
                    c='.';
                }
                System.out.print(c);
            }
            System.out.println();
        }

        in.close();
    }
}
