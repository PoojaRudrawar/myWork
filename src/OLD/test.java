package OLD;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by PRudrawar on 1/3/2018.
 */
public class test {
    public static void main(String[] args) {
        int age=12;

        String str1="abc";
        String[] strArr=str1.split(",");
        for(String val:strArr){
            System.out.println(val);
        }
        outer:
            while(age<21){
            if(age==16) {
                System.out.println("Get your driving license");
                age++;
                continue outer;
            }
                System.out.println("another year");
                age++;



        }

        /*count number of words in a string*/
        String a="I am  a Girl. My Name id Pooja";
        String arr[]=a.split("\\s+");
        System.out.println(arr.length);

        Scanner s = new Scanner(System.in);
        String numberOfTestCases = s.nextLine();

        String str=s.nextLine();
        System.out.println(str);
        String[] input=(str.split("\\s+"));

        for(int j=0;j<Integer.parseInt(numberOfTestCases);j++){
            for(int i=1;i<=Integer.parseInt(input[j]);i++){
                if(i%3==0 &&i%5==0){
                    System.out.println("FIZZBUZZ");
                }else if(i%3==0){
                    System.out.println("FIZZ");
                }else if(i%5==0){
                    System.out.println("BUZZ");
                }else{
                    System.out.println(i);
                }
            }

        }

        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println(Arrays.stream(new int[]{1,2,3,4}).map(n ->n*3+1).filter(i -> i>10).average());
        System.out.println("+++++++++++++++++++++++++++++++++++++");
    }
}
