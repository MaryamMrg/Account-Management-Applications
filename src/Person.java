public class Person {
   private String Firstname;
   private String Lastname;
   private int age;
   private String email;
   private String phone;
   private String address;
   private String role;
   private String status;

   public Person(){
       this.Firstname = Firstname;
       this.Lastname = Lastname;
       this.age = age;
       this.email = email;
       this.phone = email;
       this.address = address;
       this.role = role;
       this.status = status;
   }
//getters and setters
    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
     return "Person{" + "Firstname='" + Firstname + '\''
             + ", Lastname='" + Lastname + '\''
             + ", age=" + age
             + ", email='" + email + '\''
             + ", phone='" + phone + '\''
             + ", address='" + address + '\''
             + ", role='" + role + '\''
             + ", status='" + status + '\'' + '}';
    }
}
