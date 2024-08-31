package src.models;

import java.util.Date;

public class PrivateMessage {
    private String sender;
    private String receiver;
    private Date date;
    private String content;

    public PrivateMessage() {}

    public PrivateMessage(String sender, String receiver, Date date, String content) {
        this.sender = sender;
        this.receiver = receiver;
        this.date = date;
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
