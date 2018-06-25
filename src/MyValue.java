import java.io.Serializable;
public class MyValue implements  Serializable {

    private String firstName;
    private String lastName;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String value) {
        this.firstName = value;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String value) {
        this.lastName = value;
    }

    public String toXML() {

        //Just to show the way xml is outputted

        String myString = "<xml>";
        myString += "<childrens>";
        myString += "<child id='firstName'>" + this.firstName + "</child>";
        myString += "<child id='secondName'>" + this.lastName + "</child>";
        myString += "</xml>";

        return myString;
    }

    public static void main(String args[]) {
        MyValue my = new MyValue();
        my.setFirstName("Ilya");
        my.setLastName("Netchitailo");
        System.out.println(my.toXML());

        String abc="";
        System.out.println(abc=="");
    }
}