package OLD;

/**
 * Created by PRudrawar on 1/10/2018.
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        int number=12321;

        int sum=0,copy=number,r;

        while(copy>0){
            r=copy%10;
            sum=(sum*10)+r;
            copy=copy/10;
        }

        if(sum==number){
            System.out.println("Palindrome number"+number);
        }
        else {

            System.out.println("Non-Palindrome number"+number);
        }
        }
    }

