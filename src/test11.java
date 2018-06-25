import java.util.List;

public class test11 {
    int age;

    @Override
    public int hashCode() {
        return 1;
    }
    test11(int age){
        this.age=age;
    }

    public static void main(String[] args) {
        test11 t=new test11(12);
        test11 t1=new test11(12);

        System.out.println(t==t1);
        System.out.println(t.equals(t1));

     /*   List<Integer> qrtzAllInfo=null;

        System.out.println(qrtzAllInfo.size());*/
    }
}
