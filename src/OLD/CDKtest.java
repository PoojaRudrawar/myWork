package OLD;

public class CDKtest {

   static int total;
   static int x=0;
   static {
       System.out.println(10/x);
   }
    public static void main(String[] args) {
       CDKtest obj=new CDKtest();
       for(int i=2;i<9;i++) {
           obj.fun(i);

           System.out.println("input:"+i+" total:"+total);
            total=0;
       }






       }

    private int fun(int i) {

total++;
        //System.out.println("Hello");
        return ((i<3)?1:fun(i-1)+fun(i-2));


    }


}
