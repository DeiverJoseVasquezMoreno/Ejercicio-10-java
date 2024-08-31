package src.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Group {
    private String groupName;
    private Date creationDate;
    private int memberCount;
    private boolean isSubgroup;

    private Moderator moderator;
    private List<SubGroup> subgroups;

    public Group() {}

    public Group(String groupName, int memberCount, boolean isSubgroup, Moderator moderator) {
        this.groupName = groupName;
        this.creationDate = new Date();
        this.memberCount = memberCount;
        this.isSubgroup = isSubgroup;
        this.moderator = moderator;
        this.subgroups = new ArrayList<SubGroup>();
    }

    public Group(String groupName, Date creationDate, int memberCount, boolean isSubgroup, Moderator moderator) {
        this.groupName = groupName;
        this.creationDate = creationDate;
        this.memberCount = memberCount;
        this.isSubgroup = isSubgroup;
        this.moderator = moderator;
        this.subgroups = new ArrayList<SubGroup>();
    }

    public Group(String groupName, Date creationDate, int memberCount, boolean isSubgroup, Moderator moderator,
            List<SubGroup> subgroups) {
        this.groupName = groupName;
        this.creationDate = creationDate;
        this.memberCount = memberCount;
        this.isSubgroup = isSubgroup;
        this.moderator = moderator;
        this.subgroups = subgroups;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public int getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(int memberCount) {
        this.memberCount = memberCount;
    }

    public boolean isSubgroup() {
        return isSubgroup;
    }

    public void setSubgroup(boolean isSubgroup) {
        this.isSubgroup = isSubgroup;
    }

    public Moderator getModerator() {
        return moderator;
    }

    public void setModerator(Moderator moderator) {
        this.moderator = moderator;
    }

    public List<SubGroup> getSubgroups() {
        return subgroups;
    }

    public void setSubgroups(List<SubGroup> subgroups) {
        this.subgroups = subgroups;
    }

}