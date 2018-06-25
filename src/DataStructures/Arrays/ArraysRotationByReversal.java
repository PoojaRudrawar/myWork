package DataStructures.Arrays;



public class ArraysRotationByReversal {


    public static void main(String[] args) {
        int[] input={3,4,6,7,1,3,4};

        int rotateCount=3;

        int[] leftArray=new int[3];
        int[] rightArray=new int[4];
        int j=0,k=0;
        for(int i=0;i<input.length;i++){
            if(i<rotateCount){
                System.out.println(input[i]);
                leftArray[j]=input[i];
                System.out.println(leftArray[j]);
                j++;
            }else{
                rightArray[k]=input[i];
                k++;
            }
        }

        System.out.println(leftArray+"leftArray");
        leftArray=reverseArray(leftArray,leftArray.length);
        System.out.println(leftArray);
        rightArray=reverseArray(rightArray,rightArray.length);

        System.out.println(rightArray);
        j=0;
        k=0;
        for(int i=0;i<input.length;i++){
            if(i<rotateCount){
                input[i]=leftArray[j];
                j++;
            }else{
                input[i]=rightArray[k];
                k++;
            }
        }

        input=reverseArray(input,input.length);

        System.out.println(input);



    }

    private static int[] reverseArray(int[] givenArray,int length) {
        int[] temp=new int[length];
        int j=0;
        for(int i=givenArray.length;i>0;i--){
            temp[j]=givenArray[i-1];
            j++;
        }
        return temp;
    }
}
