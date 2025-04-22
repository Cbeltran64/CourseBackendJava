package model;

public class User {
    private int id;
    private String name;
    private String email;
    private String address;
    private int phoneNumber;

    public User(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "\nid=" + id +
                ", \nname='" + name + '\'' +
                ", \nemail='" + email + '\'' +
                ", \naddress='" + address + '\'' +
                ", \nphoneNumber=" + phoneNumber;
    }
}
