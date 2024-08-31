package src.models;

import java.util.Date;
import java.util.List;

public class SubGroup extends Group {

    public SubGroup() {
        super();
    }

    public SubGroup(String groupName, Date creationDate, int memberCount, Moderator moderator) {
        super(groupName, creationDate, memberCount, true, moderator);
    }

    public SubGroup(
        String groupName,
        Date creationDate,
        int memberCount,
        Moderator moderator,
        List<SubGroup> subgroups
    ) {
        super(
            groupName,
            creationDate,
            memberCount,
            true,
            moderator
        );
    }

    @Override
    public boolean isSubgroup() {
        return true;
    }
}
