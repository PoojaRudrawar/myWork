package OLD.DynamicProgramming;

public class LargestPalindrome {

    public static void main(String[] args) {
        int[] input={1,3,4,5,6,4,1};
        int length=input.length;
        int[][] developMatrix=new int[length][length];

        for(int i=0;i<length;i++)
        {
            developMatrix[i][i]=1;
        }
        for(int i=2;i<=length;i++){//i=1 means length=i+1 and ...
            for(int j=0;j<length-i+1;j++){
                int k=j+i-1;
                if(input[j]==input[k]){
                    developMatrix[j][k]=2+developMatrix[j+1][k-1];
                }
                else{
                    developMatrix[j][k]=Integer.max(developMatrix[j][k-1],developMatrix[j+1][k]);
                }
            }
        }


        printMatrix(length, developMatrix);
    }

    private static void printMatrix(int length, int[][] developMatrix) {
        for(int i=0;i<length;i++)
        {
            for (int j=0;j<length;j++){
                System.out.print(developMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
