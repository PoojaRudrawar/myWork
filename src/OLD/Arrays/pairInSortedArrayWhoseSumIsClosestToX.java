package OLD.Arrays;

public class pairInSortedArrayWhoseSumIsClosestToX {

    /*
    * ===================================================
    * Given a sorted array and a number x, find the pair in array whose sum is closest to x
    * ++++++++++++++++++++++++++++++++++++++++++++++++++++
    *
    *
    * */

    public static void main(String[] args) {
        int arr[]= {10, 22, 28, 29, 30, 40};
        int sum=54;

        calculatePairClosesttoSum(arr,sum);
    }

    private static void calculatePairClosesttoSum(int[] arr, int sum) {

        int start=0,end=arr.length-1;
        int difference=Integer.MAX_VALUE;
        int res_start=0,res_end=0;

        while (end>start){
            if((arr[start]+arr[end]-sum)<difference) {
                difference = Math.abs(arr[start] + arr[end] - sum);
                res_start=start;
                res_end=end;
            }

            if(arr[start]+arr[end]>sum){
                end--;
            }
            else {
                start++;
            }
        }

        System.out.println("the values are:"+arr[res_start] +" and "+arr[res_end]);

    }

}
