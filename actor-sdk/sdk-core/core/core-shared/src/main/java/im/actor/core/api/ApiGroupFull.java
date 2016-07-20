package im.actor.core.api;
/*
 *  Generated by the Actor API Scheme generator.  DO NOT EDIT!
 */

import im.actor.runtime.bser.*;
import im.actor.runtime.collections.*;
import static im.actor.runtime.bser.Utils.*;
import im.actor.core.network.parser.*;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import com.google.j2objc.annotations.ObjectiveCName;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class ApiGroupFull extends BserObject {

    private int id;
    private long createDate;
    private Integer ownerUid;
    private List<ApiMember> members;
    private String theme;
    private String about;
    private ApiMapValue ext;
    private Boolean isAsyncMembers;
    private Boolean canViewMembers;
    private Boolean canInvitePeople;
    private Boolean isSharedHistory;
    private Boolean canEditGroupInfo;
    private String shortName;
    private Boolean canEditShortName;
    private Boolean canEditAdminList;
    private Boolean canViewAdminList;
    private Boolean canEditAdminSettings;
    private Boolean canInviteViaLink;
    private Boolean canDelete;
    private Boolean canLeave;

    public ApiGroupFull(int id, long createDate, @Nullable Integer ownerUid, @NotNull List<ApiMember> members, @Nullable String theme, @Nullable String about, @Nullable ApiMapValue ext, @Nullable Boolean isAsyncMembers, @Nullable Boolean canViewMembers, @Nullable Boolean canInvitePeople, @Nullable Boolean isSharedHistory, @Nullable Boolean canEditGroupInfo, @Nullable String shortName, @Nullable Boolean canEditShortName, @Nullable Boolean canEditAdminList, @Nullable Boolean canViewAdminList, @Nullable Boolean canEditAdminSettings, @Nullable Boolean canInviteViaLink, @Nullable Boolean canDelete, @Nullable Boolean canLeave) {
        this.id = id;
        this.createDate = createDate;
        this.ownerUid = ownerUid;
        this.members = members;
        this.theme = theme;
        this.about = about;
        this.ext = ext;
        this.isAsyncMembers = isAsyncMembers;
        this.canViewMembers = canViewMembers;
        this.canInvitePeople = canInvitePeople;
        this.isSharedHistory = isSharedHistory;
        this.canEditGroupInfo = canEditGroupInfo;
        this.shortName = shortName;
        this.canEditShortName = canEditShortName;
        this.canEditAdminList = canEditAdminList;
        this.canViewAdminList = canViewAdminList;
        this.canEditAdminSettings = canEditAdminSettings;
        this.canInviteViaLink = canInviteViaLink;
        this.canDelete = canDelete;
        this.canLeave = canLeave;
    }

    public ApiGroupFull() {

    }

    public int getId() {
        return this.id;
    }

    public long getCreateDate() {
        return this.createDate;
    }

    @Nullable
    public Integer getOwnerUid() {
        return this.ownerUid;
    }

    @NotNull
    public List<ApiMember> getMembers() {
        return this.members;
    }

    @Nullable
    public String getTheme() {
        return this.theme;
    }

    @Nullable
    public String getAbout() {
        return this.about;
    }

    @Nullable
    public ApiMapValue getExt() {
        return this.ext;
    }

    @Nullable
    public Boolean isAsyncMembers() {
        return this.isAsyncMembers;
    }

    @Nullable
    public Boolean canViewMembers() {
        return this.canViewMembers;
    }

    @Nullable
    public Boolean canInvitePeople() {
        return this.canInvitePeople;
    }

    @Nullable
    public Boolean isSharedHistory() {
        return this.isSharedHistory;
    }

    @Nullable
    public Boolean canEditGroupInfo() {
        return this.canEditGroupInfo;
    }

    @Nullable
    public String getShortName() {
        return this.shortName;
    }

    @Nullable
    public Boolean canEditShortName() {
        return this.canEditShortName;
    }

    @Nullable
    public Boolean canEditAdminList() {
        return this.canEditAdminList;
    }

    @Nullable
    public Boolean canViewAdminList() {
        return this.canViewAdminList;
    }

    @Nullable
    public Boolean canEditAdminSettings() {
        return this.canEditAdminSettings;
    }

    @Nullable
    public Boolean canInviteViaLink() {
        return this.canInviteViaLink;
    }

    @Nullable
    public Boolean canDelete() {
        return this.canDelete;
    }

    @Nullable
    public Boolean canLeave() {
        return this.canLeave;
    }

    @Override
    public void parse(BserValues values) throws IOException {
        this.id = values.getInt(1);
        this.createDate = values.getLong(6);
        this.ownerUid = values.optInt(5);
        List<ApiMember> _members = new ArrayList<ApiMember>();
        for (int i = 0; i < values.getRepeatedCount(12); i ++) {
            _members.add(new ApiMember());
        }
        this.members = values.getRepeatedObj(12, _members);
        this.theme = values.optString(2);
        this.about = values.optString(3);
        this.ext = values.optObj(7, new ApiMapValue());
        this.isAsyncMembers = values.optBool(11);
        this.canViewMembers = values.optBool(8);
        this.canInvitePeople = values.optBool(9);
        this.isSharedHistory = values.optBool(10);
        this.canEditGroupInfo = values.optBool(13);
        this.shortName = values.optString(14);
        this.canEditShortName = values.optBool(15);
        this.canEditAdminList = values.optBool(16);
        this.canViewAdminList = values.optBool(17);
        this.canEditAdminSettings = values.optBool(18);
        this.canInviteViaLink = values.optBool(19);
        this.canDelete = values.optBool(20);
        this.canLeave = values.optBool(21);
        if (values.hasRemaining()) {
            setUnmappedObjects(values.buildRemaining());
        }
    }

    @Override
    public void serialize(BserWriter writer) throws IOException {
        writer.writeInt(1, this.id);
        writer.writeLong(6, this.createDate);
        if (this.ownerUid != null) {
            writer.writeInt(5, this.ownerUid);
        }
        writer.writeRepeatedObj(12, this.members);
        if (this.theme != null) {
            writer.writeString(2, this.theme);
        }
        if (this.about != null) {
            writer.writeString(3, this.about);
        }
        if (this.ext != null) {
            writer.writeObject(7, this.ext);
        }
        if (this.isAsyncMembers != null) {
            writer.writeBool(11, this.isAsyncMembers);
        }
        if (this.canViewMembers != null) {
            writer.writeBool(8, this.canViewMembers);
        }
        if (this.canInvitePeople != null) {
            writer.writeBool(9, this.canInvitePeople);
        }
        if (this.isSharedHistory != null) {
            writer.writeBool(10, this.isSharedHistory);
        }
        if (this.canEditGroupInfo != null) {
            writer.writeBool(13, this.canEditGroupInfo);
        }
        if (this.shortName != null) {
            writer.writeString(14, this.shortName);
        }
        if (this.canEditShortName != null) {
            writer.writeBool(15, this.canEditShortName);
        }
        if (this.canEditAdminList != null) {
            writer.writeBool(16, this.canEditAdminList);
        }
        if (this.canViewAdminList != null) {
            writer.writeBool(17, this.canViewAdminList);
        }
        if (this.canEditAdminSettings != null) {
            writer.writeBool(18, this.canEditAdminSettings);
        }
        if (this.canInviteViaLink != null) {
            writer.writeBool(19, this.canInviteViaLink);
        }
        if (this.canDelete != null) {
            writer.writeBool(20, this.canDelete);
        }
        if (this.canLeave != null) {
            writer.writeBool(21, this.canLeave);
        }
        if (this.getUnmappedObjects() != null) {
            SparseArray<Object> unmapped = this.getUnmappedObjects();
            for (int i = 0; i < unmapped.size(); i++) {
                int key = unmapped.keyAt(i);
                writer.writeUnmapped(key, unmapped.get(key));
            }
        }
    }

    @Override
    public String toString() {
        String res = "struct GroupFull{";
        res += "id=" + this.id;
        res += ", createDate=" + this.createDate;
        res += ", ownerUid=" + this.ownerUid;
        res += ", members=" + this.members;
        res += ", theme=" + this.theme;
        res += ", about=" + this.about;
        res += ", isAsyncMembers=" + this.isAsyncMembers;
        res += ", canViewMembers=" + this.canViewMembers;
        res += ", canInvitePeople=" + this.canInvitePeople;
        res += ", isSharedHistory=" + this.isSharedHistory;
        res += ", canEditGroupInfo=" + this.canEditGroupInfo;
        res += ", shortName=" + this.shortName;
        res += ", canEditShortName=" + this.canEditShortName;
        res += ", canEditAdminList=" + this.canEditAdminList;
        res += ", canViewAdminList=" + this.canViewAdminList;
        res += ", canEditAdminSettings=" + this.canEditAdminSettings;
        res += ", canInviteViaLink=" + this.canInviteViaLink;
        res += ", canDelete=" + this.canDelete;
        res += "}";
        return res;
    }

}
