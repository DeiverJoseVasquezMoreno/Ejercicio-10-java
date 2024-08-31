package src.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
    private String username;
    private String password;
    private String email;
    private String phone;
    private String websiteURL;
    private String location;
    private Date dateOfBirth;
    private String photo;
    private String description;
    private boolean emailVerified;
    private boolean active;

    private Profile profile;
    private List<Group> subscribedGroups;
    private List<Article> articles;
    private List<PrivateMessage> sentMessages;
    private List<Notification> notifications;
    private List<Bookmark> bookmarks;

    public User() {}

    public User(
        String username,
        String password,
        String email,
        String phone,
        String websiteURL,
        String location,
        Date dateOfBirth,
        String photo,
        String description,
        boolean emailVerified,
        boolean active
    ) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.websiteURL = websiteURL;
        this.location = location;
        this.dateOfBirth = dateOfBirth;
        this.photo = photo;
        this.description = description;
        this.emailVerified = emailVerified;
        this.active = active;
        this.subscribedGroups = new ArrayList<Group>();
        this.articles = new ArrayList<Article>();
        this.sentMessages = new ArrayList<PrivateMessage>();
        this.notifications = new ArrayList<Notification>();
        this.bookmarks = new ArrayList<Bookmark>();
    }

    public User(
        String username,
        String password,
        String email,
        String phone,
        String websiteURL,
        String location,
        Date dateOfBirth,
        String photo,
        String description,
        boolean emailVerified,
        boolean active,
        Profile profile
    ) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.websiteURL = websiteURL;
        this.location = location;
        this.dateOfBirth = dateOfBirth;
        this.photo = photo;
        this.description = description;
        this.emailVerified = emailVerified;
        this.active = active;
        this.profile = profile;
        this.subscribedGroups = new ArrayList<Group>();
        this.articles = new ArrayList<Article>();
        this.sentMessages = new ArrayList<PrivateMessage>();
        this.notifications = new ArrayList<Notification>();
        this.bookmarks = new ArrayList<Bookmark>();
    }

    public User(
        String username,
        String password,
        String email,
        String phone,
        String websiteURL,
        String location,
        Date dateOfBirth,
        String photo,
        String description,
        boolean emailVerified,
        boolean active,
        Profile profile,
        List<Group> subscribedGroups,
        List<Article> articles,
        List<PrivateMessage> sentMessages,
        List<Notification> notifications,
        List<Bookmark> bookmarks
    ) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.websiteURL = websiteURL;
        this.location = location;
        this.dateOfBirth = dateOfBirth;
        this.photo = photo;
        this.description = description;
        this.emailVerified = emailVerified;
        this.active = active;
        this.profile = profile;
        this.subscribedGroups = subscribedGroups;
        this.articles = articles;
        this.sentMessages = sentMessages;
        this.notifications = notifications;
        this.bookmarks = bookmarks;
    }

    public void subscribeToGroup(Group group) {
        this.subscribedGroups.add(group);
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
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
    public boolean isEmailVerified() {
        return emailVerified;
    }
    public void setEmailVerified(boolean emailVerified) {
        this.emailVerified = emailVerified;
    }
    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
    public Profile getProfile() {
        return profile;
    }
    public void setProfile(Profile profile) {
        this.profile = profile;
    }
    public List<Group> getSubscribedGroups() {
        return subscribedGroups;
    }
    public void setSubscribedGroups(List<Group> subscribedGroups) {
        this.subscribedGroups = subscribedGroups;
    }
    public List<Article> getArticles() {
        return articles;
    }
    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
    public List<PrivateMessage> getSentMessages() {
        return sentMessages;
    }
    public void setSentMessages(List<PrivateMessage> sentMessages) {
        this.sentMessages = sentMessages;
    }
    public List<Notification> getNotifications() {
        return notifications;
    }
    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }
    public List<Bookmark> getBookmarks() {
        return bookmarks;
    }
    public void setBookmarks(List<Bookmark> bookmarks) {
        this.bookmarks = bookmarks;
    }
}