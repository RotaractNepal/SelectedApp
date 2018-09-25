package np.com.rotaractnepalapp.rotaract.Class;

public class AboutUsClass {
    private int images;
    private String name;
    private String profession;
    private String call;
    private String email;

    public AboutUsClass(){

    }

    public AboutUsClass(int images, String name, String profession, String call, String email) {
        this.images = images;
        this.name = name;
        this.profession = profession;
        this.call = call;
        this.email = email;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
