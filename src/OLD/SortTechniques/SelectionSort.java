package OLD.SortTechniques;

/**
 * Created by PRudrawar on 11/14/2017.
 */
public class SelectionSort {


    void printArray(int arr[]){
        int len=arr.length;
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+ " ");
        System.out.println();
    }

    public void selectionsort(int arr[]){
        for (int i=0;i<arr.length-1; i++){
            int min_idx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }
            int temp=arr[min_idx];
            arr[min_idx]=arr[i];
            arr[i]=temp;
        }
    }

    public static void main(String[] args) {
        SelectionSort ss=new SelectionSort();
        int arr[]={1,5,8,9,3,6,4,2};

        ss.printArray(arr);

        ss.selectionsort(arr);

        ss.printArray(arr);
    }
}
