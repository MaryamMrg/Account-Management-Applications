public class Person {
    String name ;
    int age;
    String CIN;

    public Person(String name, int age,String CIN) {
        this.name = name;
        this.age = age;
        this.CIN = CIN;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getCIN() {return CIN;}

    public void setCIN(String CIN) {this.CIN = CIN;}
}