package rascu.stefan.twitchanalysis.model.streams;

import com.squareup.moshi.Json;

import java.util.List;

public class StreamsListContent {

    @Json(name = "_total")
    private int total;

    @Json(name = "streams")
    private List<Stream> streams;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<Stream> getStreams() {
        return streams;
    }

    public void setStreams(List<Stream> streams) {
        this.streams = streams;
    }
}