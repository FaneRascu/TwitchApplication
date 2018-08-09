package rascu.stefan.twitchanalysis.model.communities;

import java.util.List;
import com.squareup.moshi.Json;

public class CommunityListContent {

    @Json(name = "_cursor")
    private String cursor;

    @Json(name = "_total")
    private String total;

    @Json(name = "communities")
    private List<TopCommunity> communities;

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public List<TopCommunity> getCommunities() {
        return communities;
    }

    public void setCommunities(List<TopCommunity> communities) {
        this.communities = communities;
    }


}
