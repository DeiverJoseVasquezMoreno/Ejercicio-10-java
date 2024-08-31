package src.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import src.enums.EditorialStatus;

public class Article {
    private static long idCounter = 0;
    private long id;
    private Date creationDate;
    private String author;
    private String summary;
    private String content;
    private EditorialStatus editorialStatus;

    private List<Comment> comments;

    public Article() {
        Article.idCounter++;
        this.id = Article.idCounter;
    }

    public Article(
        String author,
        String summary,
        String content,
        EditorialStatus editorialStatus
    ) {
        this();
        this.creationDate = new Date();
        this.author = author;
        this.summary = summary;
        this.content = content;
        this.editorialStatus = editorialStatus;
        this.comments = new ArrayList<Comment>();
    }

    public Article(
        String author,
        String summary,
        String content,
        EditorialStatus editorialStatus,
        List<Comment> comments
    ) {
        this();
        this.creationDate = new Date();
        this.author = author;
        this.summary = summary;
        this.content = content;
        this.editorialStatus = editorialStatus;
        this.comments = comments;
    }

    public Article(
        Date creationDate,
        String author,
        String summary,
        String content,
        EditorialStatus editorialStatus
    ) {
        this();
        this.creationDate = creationDate;
        this.author = author;
        this.summary = summary;
        this.content = content;
        this.editorialStatus = editorialStatus;
        this.comments = new ArrayList<Comment>();
    }

    public Article(
        Date creationDate,
        String author,
        String summary,
        String content,
        EditorialStatus editorialStatus,
        List<Comment> comments
    ) {
        this();
        this.creationDate = creationDate;
        this.author = author;
        this.summary = summary;
        this.content = content;
        this.editorialStatus = editorialStatus;
        this.comments = comments;
    }

    public long getId() {
        return id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public EditorialStatus getEditorialStatus() {
        return editorialStatus;
    }

    public void setEditorialStatus(EditorialStatus editorialStatus) {
        this.editorialStatus = editorialStatus;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

}