package tech.rtsproduction.amritsartourguide;

public class LocationClass {

    private String locationTitle,locationAddress,locationSubtitle;
    private int locationPhoto;

    public LocationClass(String locationTitle, String locationAddress, int locationPhoto, String locationSubtitle) {
        this.locationTitle = locationTitle;
        this.locationAddress = locationAddress;
        this.locationPhoto = locationPhoto;
        this.locationSubtitle = locationSubtitle;
    }

    public String getLocationTitle() {
        return locationTitle;
    }

    public void setLocationTitle(String locationTitle) {
        this.locationTitle = locationTitle;
    }

    public String getLocationAddress() {
        return locationAddress;
    }

    public void setLocationAddress(String locationAddress) {
        this.locationAddress = locationAddress;
    }

    public int getLocationPhoto() {
        return locationPhoto;
    }

    public void setLocationPhoto(int locationPhoto) {
        this.locationPhoto = locationPhoto;
    }

    public String getLocationSubtitle() {
        return locationSubtitle;
    }

    public void setLocationSubtitle(String locationSubtitle) {
        this.locationSubtitle = locationSubtitle;
    }
}
