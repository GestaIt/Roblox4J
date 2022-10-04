package net.gestalt.roblox.payloads;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;
import net.gestalt.roblox.groups.Owner;
import net.gestalt.roblox.groups.Shout;

public interface GroupPayloads {
    @Getter
    class GetGroupPayload {
        @Expose
        private long id;
        @Expose
        private String name, description;
        @Expose
        private int memberCount;
        @Expose
        private boolean isBuildersClubOnly, publicEntryAllowed, hasVerifiedBadge, isLocked;
        @Expose
        private Owner owner;
        @Expose
        private Shout shout;
    }
    @Getter
    @Setter
    class SetNamePayload {
        @Expose
        private String name;
    }
    @Getter
    @Setter
    class SetDescriptionPayload {
        @Expose
        private String description;
    }
    @Getter
    @Setter
    class SendShoutPayload {
        @Expose
        private String message;
    }
    @Getter
    @Setter
    class SetOwnerPayload {
        @Expose
        private long userId;
    }
}