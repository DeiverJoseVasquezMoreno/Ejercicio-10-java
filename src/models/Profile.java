package src.models;

import java.util.Date;

public class Profile {
    private String websiteURL;
    private String location;
    private Date dateOfBirth;
    private String photo;
    private String description;

    public Profile() {}

    public Profile(String websiteURL, String location, Date dateOfBirth, String photo, String description) {
        this.websiteURL = websiteURL;
        this.location = location;
        this.dateOfBirth = dateOfBirth;
        this.photo = photo;
        this.description = description;
    }

    public String getWebsiteURL() {
        return websiteURL;
    }

    public void setWebsiteURL(String websiteURL) {
        this.websiteURL = websiteURL;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}