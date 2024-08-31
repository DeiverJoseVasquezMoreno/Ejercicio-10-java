import java.util.Date;

import src.enums.EditorialStatus;
import src.models.*;

public class Main {
    public static void main(String[] args) {
        // Crear algunos usuarios
        User user1 = new User("user1", "pass1", "user1@example.com", "123456789", "http://user1.com", "City A", new Date(), "photo1.jpg", "User 1 Description", true, true);
        User user2 = new User("user2", "pass2", "user2@example.com", "987654321", "http://user2.com", "City B", new Date(), "photo2.jpg", "User 2 Description", true, true);

        // Crear perfiles para los usuarios
        Profile profile1 = new Profile("http://user1.com", "City A", new Date(), "photo1.jpg", "User 1 Description");
        Profile profile2 = new Profile("http://user2.com", "City B", new Date(), "photo2.jpg", "User 2 Description");

        user1.setProfile(profile1);
        user2.setProfile(profile2);

        // Crear algunos grupos y moderadores
        Moderator mod1 = new Moderator();
        Group group1 = new Group("Group 1", new Date(), 100, false, mod1);

        Moderator mod2 = new Moderator();
        Group group2 = new Group("Group 2", new Date(), 150, false, mod2);

        mod1.getManagedGroups().add(group1);
        mod2.getManagedGroups().add(group2);

        // Subscribir usuarios a los grupos
        user1.subscribeToGroup(group1);
        user2.subscribeToGroup(group2);

        // Crear algunos artículos
        Article article1 = new Article("User 1", "Summary 1", "Content 1", EditorialStatus.SENT);
        Article article2 = new Article("User 2", "Summary 2", "Content 2", EditorialStatus.APPROVED);

        user1.getArticles().add(article1);
        user2.getArticles().add(article2);

        // Crear comentarios para los artículos
        Comment comment1 = new Comment("User 2", new Date(), "Great article!", EditorialStatus.APPROVED);
        Comment comment2 = new Comment("User 1", new Date(), "Thanks for the feedback!", EditorialStatus.APPROVED);

        article1.getComments().add(comment1);
        article2.getComments().add(comment2);

        // Crear mensajes privados
        PrivateMessage message1 = new PrivateMessage("User 1", "User 2", new Date(), "Hello, how are you?");
        PrivateMessage message2 = new PrivateMessage("User 2", "User 1", new Date(), "I'm fine, thanks!");

        user1.getSentMessages().add(message1);
        user2.getSentMessages().add(message2);

        // Crear notificaciones para los usuarios
        Notification notification1 = new Notification("New Article", false);
        Notification notification2 = new Notification("New Comment", false);

        user1.getNotifications().add(notification1);
        user2.getNotifications().add(notification2);

        // Crear marcadores
        Bookmark bookmark1 = new Bookmark(article1);
        Bookmark bookmark2 = new Bookmark(article2);

        user1.getBookmarks().add(bookmark1);
        user2.getBookmarks().add(bookmark2);

        // Imprimir algunos datos para demostrar las relaciones
        System.out.println("User 1 is subscribed to: " + user1.getSubscribedGroups().get(0).getGroupName());
        System.out.println("User 2 is subscribed to: " + user2.getSubscribedGroups().get(0).getGroupName());

        System.out.println("User 1 posted an article with summary: " + user1.getArticles().get(0).getSummary());
        System.out.println("User 2 commented: " + article1.getComments().get(0).getText());
    }
}
