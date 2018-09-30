package np.com.rotaractnepalapp.rotaract.Class.ClassClubVI;

public class ClubVI4Class {

    private int images;
    private String title;
    private int bimages;
    private String name;
    private String ridno;
    private String call;
    private String email;

    public ClubVI4Class(){

    }

    public ClubVI4Class(int images, String title, int bimages, String name, String ridno, String call, String email) {
        this.images = images;
        this.title = title;
        this.bimages = bimages;
        this.name = name;
        this.ridno = ridno;
        this.call = call;
        this.email = email;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getBimages() {
        return bimages;
    }

    public void setBimages(int bimages) {
        this.bimages = bimages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRidno() {
        return ridno;
    }

    public void setRidno(String ridno) {
        this.ridno = ridno;
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
