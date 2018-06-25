package OLD; /**
 * Created by PRudrawar on 8/29/2017.
 */

import java.lang.StringBuffer;
public class reverseWordOrder {
    StringBuffer str=new StringBuffer("Son Poojas & Kunal Darsh. am I ");

    public static void main(String[] args) {
        reverseWordOrder rObject=new reverseWordOrder();
        rObject.reverse();
    }

    private void reverse() {
        int i=0,j=0,k=0;
        do{

            if(str.charAt(i)==' ' ||i==str.length()){
                k=i-1;
                swap(j,k);
                j=i+1;
            }

            i++;
        }while(i < str.length());
        System.out.println(str);
        swap(0,str.length()-1);
        System.out.println(str);
    }

    private void swap(int j, int k) {
        String partOfString=str.substring(j,k);
        System.out.println(partOfString);
        while(j<k){
            char x;
            x=str.charAt(j);
            str.setCharAt(j,str.charAt(k));
            str.setCharAt(k,x);
            j++;
            k--;
        }
    }

}
