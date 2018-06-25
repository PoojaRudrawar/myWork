package DataStructures.Arrays;

public class SubarrayWithinGivenSum {

    public static void main(String[] args) {
        int arr[] = {1, 4, 20, 3, 10, 5};
        int sum=33;
        findSubArr(arr,arr.length,sum);
    }

    private static void findSubArr(int[] arr, int length,int sum) {

        int startIndex=0,currentSum=arr[0];

        for(int i=1;i<length;i++){


            while(currentSum>sum && startIndex<i-1){
                currentSum=currentSum-arr[startIndex];
                startIndex++;
            }

            if(currentSum==sum){
                System.out.println("Subarray from "+startIndex+" to "+i);
                return;
            }


            currentSum=currentSum+arr[i];

        }

        System.out.println("No subarray found for given sum");
    }
}
