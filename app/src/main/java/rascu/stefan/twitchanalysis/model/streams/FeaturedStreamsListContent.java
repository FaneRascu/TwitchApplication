package rascu.stefan.twitchanalysis.model.streams;

import com.squareup.moshi.Json;

import java.util.List;

public class FeaturedStreamsListContent {

    @Json(name = "featured")
    private List<TopFeaturedStream> featured;

    public List<TopFeaturedStream> getFeatured() {
        return featured;
    }

    public void setFeatured(List<TopFeaturedStream> featured) {
        this.featured = featured;
    }
}
