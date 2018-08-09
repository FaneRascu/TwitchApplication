package rascu.stefan.twitchanalysis.model.games;
import com.squareup.moshi.Json;

import java.util.List;

public class GamesListContent {

    @Json(name = "_total")
    private int total;

    @Json(name = "top")
    private List<TopGame> top;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<TopGame> getTop() {
        return top;
    }

    public void setTop(List<TopGame> top) {
        this.top = top;
    }
}