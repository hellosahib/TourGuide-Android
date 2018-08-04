package tech.rtsproduction.amritsartourguide;

public class Location {

    private String locationTitle, locationAddress, locationSubtitle;
    private int locationPhoto;

    public Location(String locationTitle, String locationAddress, int locationPhoto, String locationSubtitle) {
        this.locationTitle = locationTitle;
        this.locationAddress = locationAddress;
        this.locationPhoto = locationPhoto;
        this.locationSubtitle = locationSubtitle;
    }

    public String getLocationTitle() {
        return locationTitle;
    }

    public String getLocationAddress() {
        return locationAddress;
    }

    public int getLocationPhoto() {
        return locationPhoto;
    }

    public String getLocationSubtitle() {
        return locationSubtitle;
    }
}
