package DataStructures.Arrays;

public class RotateMatrixBy90DegreeInPlace {

    /*+++++++++++++++++++++
    ROTATE SQUARE MATRIX IN ANTICLOCKWISE DIRECTION BY 90 DEGREE WITHOUT EXTRA SPACE
    +++++++++++++++++++++++++++
    * [1,2,3,4
    *  5,6,7,8
    *  9,10,11,12
    *  13,14,15,16]
    *
    *
    *  Approach first fine transpose
    *
    *  [1,5,9,13
    *  2,6,10,14
    *  3,7,11,15
    *  4,8,12,16]
    *
    *  reverse every column elements to rotate in anticlockwise
    *
    *  [4,8,12,16
    *   3,7,11,15
    *   2,6,10,14
    *   1,5,9,13]
    * */

    static void printMatrix(int[][] inp){

        for(int i=0;i<inp.length;i++){
            for(int j=0;j<inp[0].length;j++){
                System.out.print(inp[i][j]+" ");
            }
            System.out.println("");
        }
    }

    static int[][] transpose(int[][] inp){
        int temp;
        for(int i=0;i<inp.length;i++){
            for(int j=i;j<inp[0].length;j++){
               temp=inp[i][j];
                inp[i][j]=inp[j][i];
                inp[j][i]=temp;

            }
        }


        return inp;
    }

    static int[][] rotateArray90Anticlockwise(int[][] inp){
        for(int i=0 ;i<inp.length;i++)
        {
            for(int j=0,k=inp.length-1;j<k;j++,k--){
                int temp=inp[i][j];
                inp[i][j]=inp[i][k];
                inp[i][k]=temp;
            }

        }
        return inp;
    }



    public static void main(String[] args) {
        int [][] arr= new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

       printMatrix(arr);

       transpose(arr);

       System.out.println("Transposed arr:");

       printMatrix(arr);

       rotateArray90Anticlockwise(arr);

        System.out.println("Rotated arr:");

        printMatrix(arr);

    }



}
