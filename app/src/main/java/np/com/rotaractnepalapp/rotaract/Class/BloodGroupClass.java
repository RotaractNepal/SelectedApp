package np.com.rotaractnepalapp.rotaract.Class;

public class BloodGroupClass {
    private String name;
    private String bloodgroup;
    private String contact;
    private String email;
    private String address;
    private String clubname;
    private String clubshortname;

    public BloodGroupClass(){

    }

    public BloodGroupClass(String name, String bloodgroup, String contact, String email, String address, String clubname, String clubshortname) {
        this.name = name;
        this.bloodgroup = bloodgroup;
        this.contact = contact;
        this.email = email;
        this.address = address;
        this.clubname = clubname;
        this.clubshortname = clubshortname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
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

    public String getClubname() {
        return clubname;
    }

    public void setClubname(String clubname) {
        this.clubname = clubname;
    }

    public String getClubshortname() {
        return clubshortname;
    }

    public void setClubshortname(String clubshortname) {
        this.clubshortname = clubshortname;
    }
}
