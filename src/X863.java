public class X863 {

    static void addTwo(int varA) {
        varA += 3;
    }

    public static void main(String[] args) {
        int varA = 0;
        addTwo(varA++);
        System.out.println(varA);

        double number = 189563245.4567d;
        String numberAsString = String.format ("%,.2f", number);
        System.out.println(numberAsString);
    }
}