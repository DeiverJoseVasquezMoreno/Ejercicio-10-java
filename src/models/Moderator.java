package src.models;

import java.util.ArrayList;
import java.util.List;

public class Moderator {
    private static long idCounter = 0;
    private long id;
    private List<Group> managedGroups;

    public void approveRequest() {
        //TODO: Logic to approve request
    }

    public void rejectRequest() {
        //TODO: Logic to reject request
    }

    public void expelUser() {
        //TODO: Logic to expel user
    }

    public Moderator() {
        Moderator.idCounter++;
        this.id = Moderator.idCounter;
        this.managedGroups = new ArrayList<Group>();
    }

    public Moderator(List<Group> managedGroups) {
        this.managedGroups = managedGroups;
    }

    public long getId() {
        return id;
    }

    public List<Group> getManagedGroups() {
        return managedGroups;
    }

    public void setManagedGroups(List<Group> managedGroups) {
        this.managedGroups = managedGroups;
    }

}