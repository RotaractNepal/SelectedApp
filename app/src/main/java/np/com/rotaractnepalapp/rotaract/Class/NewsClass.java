package np.com.rotaractnepalapp.rotaract.Class;

public class NewsClass {

    private String Beneficiaries;
    private String Club;
    private String Date;
    private String Description;
    private String Image;
    private String Location;
    private String Objective;
    private String Title;
    private String Type;
    private String ClubName;
    private String DImage;

    public NewsClass() {
    }

    public NewsClass(String beneficiaries, String club, String date, String description, String image, String location, String objective, String title, String type, String clubName, String DImage) {
        Beneficiaries = beneficiaries;
        Club = club;
        Date = date;
        Description = description;
        Image = image;
        Location = location;
        Objective = objective;
        Title = title;
        Type = type;
        ClubName = clubName;
        this.DImage = DImage;
    }

    public String getBeneficiaries() {
        return Beneficiaries;
    }

    public void setBeneficiaries(String beneficiaries) {
        Beneficiaries = beneficiaries;
    }

    public String getClub() {
        return Club;
    }

    public void setClub(String club) {
        Club = club;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getObjective() {
        return Objective;
    }

    public void setObjective(String objective) {
        Objective = objective;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getClubName() {
        return ClubName;
    }

    public void setClubName(String clubName) {
        ClubName = clubName;
    }

    public String getDImage() {
        return DImage;
    }

    public void setDImage(String DImage) {
        this.DImage = DImage;
    }
}
