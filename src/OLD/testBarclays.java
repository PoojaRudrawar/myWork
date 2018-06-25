package OLD;/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class testBarclays {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner s = new Scanner(System.in);
        int numberOfInput = Integer.parseInt(s.nextLine());
        System.out.println("enter x and y coordinates");
        int[] x=new int[numberOfInput];
        int[] y=new int[numberOfInput];
        HashMap<Integer,point> pointMap=new HashMap<>();
        for (int i=0;i<numberOfInput;i++){
            String input=s.nextLine();
            String[] inputArr=input.split(" ");
            x[i]= Integer.parseInt(inputArr[0]);
            y[i]=Integer.parseInt(inputArr[1]);
            point p=new point(x[i],y[i]);
            pointMap.put(i,p);
        }

        for(int p:pointMap.keySet()){
            point currentPoint=pointMap.get(p);
            double[] distanceArray=new double[x.length];
            for(int i=0;i<x.length;i++){
                distanceArray[i]=distance(currentPoint.x,currentPoint.y,x[i],y[i]);
            }
            ThreeSmallestValues(distanceArray);
            //find minimum 2 lengths
            indexoffirstPoint= Arrays.asList(distanceArray).indexOf(min2);
            indexofsecondpoint=Arrays.asList(distanceArray).indexOf(min3);

            finalsum=finalsum+min2+min3;
        }

        DecimalFormat numberFormat = new DecimalFormat("#.000000");

        System.out.println("Output"+finalsum/2);



    }
    static double finalsum;
    static double min1;
    static double min2;
    static double min3;

    static int indexoffirstPoint,indexofsecondpoint;

    static void ThreeSmallestValues(double[] a)
    {
        min1=min2=min3=Double.MAX_VALUE;

        for(int i=0;i<a.length;i++){

            double d=a[i];
            if(d<min1){
                min3=min2;
                min2=min1;
                min1=d;
            }else if(d<min2){
                min3=min2;
                min2=d;
            }else if(d<min3){
                min3=d;
            }
        }
    }

    public static double distance(int x1,int y1,int x2,int y2){

        return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
    }
    static class point{
        int x,y;
        point(int x,int y){
            this.x=x;
            this.y=y;
        }
    }

}
