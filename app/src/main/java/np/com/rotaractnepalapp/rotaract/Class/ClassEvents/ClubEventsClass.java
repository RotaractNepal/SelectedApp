package np.com.rotaractnepalapp.rotaract.Class.ClassEvents;

public class ClubEventsClass {

    private String month;
    private String day;
    private String year;
    private String organizer;
    private String event;
    private String venue;
    private String time;
    private String call;
    private String googlemap;
    private String eventdetail;
    private String eventhighlights;



    public ClubEventsClass() {
    }

    public ClubEventsClass(String month, String day, String year, String organizer, String event, String venue, String time, String call, String googlemap, String eventdetail, String eventhighlights) {
        this.month = month;
        this.day = day;
        this.year = year;
        this.organizer = organizer;
        this.event = event;
        this.venue = venue;
        this.time = time;
        this.call = call;
        this.googlemap = googlemap;
        this.eventdetail = eventdetail;
        this.eventhighlights = eventhighlights;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public String getGooglemap() {
        return googlemap;
    }

    public void setGooglemap(String googlemap) {
        this.googlemap = googlemap;
    }

    public String getEventdetail() {
        return eventdetail;
    }

    public void setEventdetail(String eventdetail) {
        this.eventdetail = eventdetail;
    }

    public String getEventhighlights() {
        return eventhighlights;
    }

    public void setEventhighlights(String eventhighlights) {
        this.eventhighlights = eventhighlights;
    }
}
