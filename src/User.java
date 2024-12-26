class User extends Person {

    private String email;
    private String password;


    public User(String name, int age, String role,String email,String password) {
        super(name, age, role);
        this.email=email;
        this.password=password;
    }



    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getPassword() {return password;}

    public void setPassword(String password) {this.password = password;}

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}