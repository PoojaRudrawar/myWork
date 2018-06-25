package OLD;

public class testpubmatic {
    public static void main(String[] args) {
        int val=budgetShopping(50,new int[]{20,19},new int[]{24,20});
        System.out.println(val);
    }
    static int budgetShopping(int n, int[] bundleQuantities, int[] bundleCosts) {
        int noOfBooks=0,costOfBundle=0;
        int length=bundleQuantities.length;
        int[] booksbybundle=new int[length];
        int amountleftArr[]=new int[length];
        int amountleft=n;
        for(int i=0;i<bundleQuantities.length;i++){
            while(amountleft>bundleCosts[i]){
                amountleft=amountleft-bundleCosts[i];
                noOfBooks=noOfBooks+bundleQuantities[i];
            }
            booksbybundle[i]=noOfBooks;
            amountleftArr[i]=amountleft;
            amountleft=n;
            noOfBooks=0;
        }

        int max=0,index=0;
        for(int i=0;i<length;i++){
            if(booksbybundle[i]>max){
                max=booksbybundle[i];
                index=i;
            }
        }

        int leftAmount=amountleftArr[index];
        noOfBooks=max;
        for(int j=0;j<length;j++){
            while(bundleCosts[j]<=leftAmount){
                leftAmount=leftAmount-bundleCosts[j];
                noOfBooks=noOfBooks+bundleQuantities[j];

            }
        }



        return noOfBooks;
    }
}
