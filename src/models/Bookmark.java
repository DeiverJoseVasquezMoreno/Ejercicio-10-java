package src.models;

public class Bookmark {
    private Article article;

    public Bookmark() {}

    public Bookmark(Article article) {
        this.article = article;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

}