package OLD.SortTechniques;

/**
 * Created by PRudrawar on 11/16/2017.
 */
public class QuickSort {
    int pi;

    public void printArray(int arr[]){
        for (int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QuickSort ob=new QuickSort();
        int arr[]={67,23,45,89,1,32,4,5,90};
        ob.printArray(arr);
        ob.quickSortAlgo(arr,0,arr.length-1);

        ob.printArray(arr);

    }

    private void quickSortAlgo(int[] arr, int low, int high) {
        if(low<high) {
            pi = partition(arr, low, high);

            quickSortAlgo(arr, low, pi - 1);

            quickSortAlgo(arr, pi + 1, high);
        }

    }

    private int partition(int[] arr, int low, int high) {
        //here we are taking last member as a pivot & placing it in correct position.
        // elements less than pivot shifted to left and elements greater than pivot shifted to right of the pivot
        int pivot=arr[high],i,j;



        i=low-1;

        for(j=low;j<high;j++){

            // If current element is smaller than or
            // equal to pivot

            if(arr[j]<=pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        int temp=arr[i+1];
        arr[i+1]=pivot;
        arr[high]=temp;

        return i+1;
    }


}
