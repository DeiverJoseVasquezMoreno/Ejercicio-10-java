package src.models;

public class Notification {
    private String notificationType;
    private boolean seen;

    public Notification() {}

    public Notification(String notificationType, boolean seen) {
        this.notificationType = notificationType;
        this.seen = seen;
    }

    public String getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    public boolean isSeen() {
        return seen;
    }

    public void setSeen(boolean seen) {
        this.seen = seen;
    }

}
