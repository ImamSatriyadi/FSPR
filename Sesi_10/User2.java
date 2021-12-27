package Sesi_10;

public class User2 {
    int id;
    private String firstname;

    private String lastname;

    public User2() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append("User{").append("id=").append(id)
                .append(", Fistname=").append(firstname)
                .append(", Lastname=").append(lastname)
                .append("}");

        return builder.toString();
    }

}
