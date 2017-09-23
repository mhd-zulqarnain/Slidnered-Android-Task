package zaadjava.com.crimereport;

import java.util.UUID;

/**
 * Created by zulup on 6/14/2017.
 */

public class Crime {

    private UUID mId;
    private String mTitle;

    Crime(){
        this.mId=UUID.randomUUID();
    }

    public UUID getmId() {
        return mId;
    }

    public void setmId(UUID mId) {
        this.mId = mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }
}
