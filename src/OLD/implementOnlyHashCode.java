package OLD;

public class implementOnlyHashCode {
    int age;

    @Override
    public int hashCode() {
        return 1;
    }
    implementOnlyHashCode(int age){
        this.age=age;
    }

    public static void main(String[] args) {
        implementOnlyHashCode t=new implementOnlyHashCode(12);
        implementOnlyHashCode t1=new implementOnlyHashCode(12);

        System.out.println(t==t1);
        System.out.println(t.equals(t1));

     /*   List<Integer> qrtzAllInfo=null;

        System.out.println(qrtzAllInfo.size());*/
    }
}
