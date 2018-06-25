import com.sun.org.apache.bcel.internal.generic.SWAP;

/**
 * Created by PRudrawar on 1/10/2018.
 */
public class AllPermutationsOfString {
    public void swap(char a,char b){
        char temp=a;
        a=b;
        b=temp;
    }

    public void getPermutations(String input,int l,int r){

        if(l==r){
            System.out.println(input);
        }
        else {
            for (int i = l; i <= r; i++) {
               input=swapChar(input,l,i);
               getPermutations(input,l+1,r);
               input=swapChar(input,l,i);
            }
        }
    }

    private String swapChar(String input,int l,int r) {
            char[] temp=input.toCharArray();

            char tempChar=temp[l];
            temp[l]=temp[r];
            temp[r]=tempChar;

            return String.valueOf(temp);
    }

    public static void main(String[] args) {
        AllPermutationsOfString aps=new AllPermutationsOfString();
        aps.getPermutations("abcde",0,4);
    }
}
