public class User extends Person {
    String email;
    String password;
    Role role;

    public User(String name, int age,String CIN, String email, String password, Role role) {
        super(name, age,CIN);
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String motdepass) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }



    @Override
    public String toString() {
        return
                "------AFFICHAGE UTILISATEUR A ETE AJOUTE------\n"+
                        "Nom-------->  " + getName() +"\n"+
                        "CIN-------->  " +getCIN() +"\n"+
                        "Age-------->  "   +getAge()+"\n"+
                        "Email------>  " + getEmail() +"\n"+
                        "Role------->  " + getRole().getRolename();
    }
}