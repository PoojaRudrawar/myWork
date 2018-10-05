package NEW.Tree.Heap;

public class kLargestElements {

    public static void main(String args[])
    {
        int arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;

        kLargestElements ob = new kLargestElements();
        ob.buildHeap(arr);

        ob.getKLargetElemnts(arr,3);
    ob.printArray(arr,3);
    }

    private void getKLargetElemnts(int[] arr,int k) {
int len=arr.length;
        for(int i=len-1;i>=len-k;i--){
            int max=arr[0];
            arr[0]=arr[i];
            arr[i]=max;

            heapify(arr,0,i);
        }

    }

    private void buildHeap(int[] arr) {
        int len=arr.length;

        for(int i=len/2-1;i>=0;i--){
            heapify(arr,i,len);
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

    private static void printArray(int[] arr,int k) {
        int len=arr.length;
        for(int i=len-k;i<len;i++)
            System.out.print(arr[i]+" ");
    }
}
