package OLD.SortTechniques;

/**
 * Created by PRudrawar on 11/14/2017.
 */
public class InsertionSort {


    /*Time Complexity: O(n*n)

    Auxiliary Space: O(1)

    Boundary Cases: Insertion sort takes maximum time to sort if elements are sorted in reverse order. And it takes minimum time (Order of n) when elements are already sorted.

    Algorithmic Paradigm: Incremental Approach

    Sorting In Place: Yes

    Stable: Yes

    Online: Yes

    Uses: Insertion sort is used when number of elements is small. It can also be useful when input array is almost sorted, only few elements are misplaced in complete big array.

    */
    void printArray(int arr[]){
        int len=arr.length;
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+ " ");
        System.out.println();
    }

    void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
           int key=arr[i];
           int j=i-1;
           while(j>=0 && arr[j]>key){
               arr[j+1]=arr[j];
               j=j-1;
           }
           arr[j+1]=key;
        }

    }

    static void insertionSortRecursive(int arr[], int n)
    {
        // Base case
        if (n <= 1)
            return;

        // Sort first n-1 elements
        insertionSortRecursive( arr, n-1 );

        // Insert last element at its correct position
        // in sorted array.
        int last = arr[n-1];
        int j = n-2;

        /* Move elements of arr[0..i-1], that are
          greater than key, to one position ahead
          of their current position */
        while (j >= 0 && arr[j] > last)
        {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }

    public static void main(String[] args) {


        int arr[]={1,5,8,9,3,6,4,2};
        InsertionSort b=new InsertionSort();
        b.printArray(arr);

        b.insertionSort(arr);

        b.printArray(arr);

        int arr1[] = {12, 11, 13, 5, 6};

        b.printArray(arr1);
        insertionSortRecursive(arr1, arr1.length);

        b.printArray(arr1);
    }
}
