package OLD.SortTechniques;

/**
 * Created by PRudrawar on 11/15/2017.
 */
public class MergeSort {

    public void printArray(int arr[]){
        for (int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public void mergeSortAlgo(int arr[],int l,int r){
        if(l<r){
            int middle=(l+r)/2;
            mergeSortAlgo(arr,l,middle);
            mergeSortAlgo(arr,middle+1,r);
            merge(arr,l,middle,r);

        }

    }

    private void merge(int[] arr, int l, int middle, int r) {
        int n1=middle-l+1;
        int n2=r-middle;

        int left[]=new int[n1];
        int right[]=new int[n2];

        for(int i=0;i<n1;i++){
            left[i]=arr[l+i];
        }

        for (int j=0;j<n2;j++){
            right[j]=arr[middle+1+j];
        }

        int i=0,j=0;
        int k=l;

        while (i<n1 && j<n2){

            if(left[i]<right[j]){
                arr[k]=left[i];
                i++;
            }
            else {
                arr[k] =right[j];
                j++;
            }
            k++;
        }
        /* Copy remaining elements of Left[] if any */
        while(i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }

        /* Copy remaining elements of Right[] if any */

        while(j<n2){
            arr[k]=right[j];
            j++;
            k++;
        }


    }

    public static void main(String[] args) {
        MergeSort ob=new MergeSort();
        int arr[]={67,23,45,89,1,32,4,5,90};
        ob.printArray(arr);
        ob.mergeSortAlgo(arr,0,arr.length-1);

        ob.printArray(arr);


    }
}
