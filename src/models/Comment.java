package src.models;

import java.util.Date;

import src.enums.EditorialStatus;

public class Comment {
    private String author;
    private Date date;
    private String text;
    private EditorialStatus editorialStatus;

    public Comment() {}

    public Comment(String author, String text, EditorialStatus editorialStatus) {
        this.author = author;
        this.date = new Date();
        this.text = text;
        this.editorialStatus = editorialStatus;
    }

    public Comment(String author, Date date, String text, EditorialStatus editorialStatus) {
        this.author = author;
        this.date = date;
        this.text = text;
        this.editorialStatus = editorialStatus;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public EditorialStatus getEditorialStatus() {
        return editorialStatus;
    }

    public void setEditorialStatus(EditorialStatus editorialStatus) {
        this.editorialStatus = editorialStatus;
    }

}
