package NEW.Tree.Heap;

public class HeapSort {

    public static void main(String args[])
    {
        int arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;

        HeapSort ob = new HeapSort();
        ob.sort(arr);

        System.out.println("Sorted array is");
        printArray(arr);
    }

    private void sort(int[] arr) {
        int len=arr.length;

        for(int i=len/2-1;i>=0;i--){
            heapify(arr,i,len);
        }

        for(int i=len-1;i>=0;i--){
            int max=arr[0];
            arr[0]=arr[i];
            arr[i]=max;

            heapify(arr,0,i);
        }
    }

    private void heapify(int[] arr, int i, int len) {

        int left=2*i;
        int right=2*i+1;
        int largest=i;
        if(left<len && arr[left]>arr[i])
            largest=left;

        if(right<len && arr[right]>arr[largest])
            largest=right;

        if(largest!=i){
            int swap=arr[largest];
            arr[largest]=arr[i];
            arr[i]=swap;

            heapify(arr,largest,len);
        }
    }

    private static void printArray(int[] arr) {
    int len=arr.length;
    for(int i=0;i<len;i++)
        System.out.print(arr[i]+" ");
    }
}
