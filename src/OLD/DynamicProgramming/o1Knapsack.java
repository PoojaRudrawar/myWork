package OLD.DynamicProgramming;

public class o1Knapsack {

    /*input
    * val[]
    * weight[]
    * knapsack weight W
    * */
    static int[] val,wt;
    public static void main(String[] args) {
        o1Knapsack kn=new o1Knapsack();
         val= new int[]{24, 18, 18, 10};
         wt= new int[]{24, 10, 10, 7};
        int[][] result;
        int W=25;

        result=knapSack(W,val,wt,wt.length);

        checkItems(result,val.length,W);
    }

    private static void checkItems(int[][] result,int length,int w) {
            if( length>0 && w>0) {
                if (result[length-1][w] == result[length - 2][w]) {
                    checkItems(result, length - 2, w);

                } else {
                    System.out.println(val[length-2] + ":" + wt[length-1]);
                    checkItems(result, length - 1, w - wt[length-1]);
                }
            }

    }

    private static int[][] knapSack(int weight, int[] val, int[] wt, int length) {//length is number of item
        int[][] knapsack=new int[length+1][weight+1];

        for(int i=0;i<length+1;i++){
            for (int w=0;w<weight+1;w++){
                if(i==0 ||w==0){
                    knapsack[i][w]=0;
                }
                else if(wt[i-1]>w){
                    knapsack[i][w]=knapsack[i-1][w];
                }
                else {
                    knapsack[i][w]=Integer.max(knapsack[i-1][w],val[i-1]+knapsack[i-1][w-wt[i-1]]);
                }

            }
        }

return knapsack;


    }
}
