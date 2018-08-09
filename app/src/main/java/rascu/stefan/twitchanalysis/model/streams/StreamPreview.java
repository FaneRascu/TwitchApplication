package rascu.stefan.twitchanalysis.model.streams;

import com.squareup.moshi.Json;

import java.io.Serializable;

public class StreamPreview implements Serializable {
    @Json(name = "large")
    private String large;

    @Json(name = "medium")
    private String medium;

    @Json(name = "small")
    private String small;

    @Json(name = "template")
    private String template;

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    @Override
    public String toString() {
        return "StreamPreview{" +
                "large='" + large + '\'' +
                ", medium='" + medium + '\'' +
                ", small='" + small + '\'' +
                ", template='" + template + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StreamPreview streamPreview = (StreamPreview) o;

        if (large != null ? !large.equals(streamPreview.large) : streamPreview.large != null) return false;
        if (medium != null ? !medium.equals(streamPreview.medium) : streamPreview.medium != null) return false;
        if (small != null ? !small.equals(streamPreview.small) : streamPreview.small != null) return false;
        return !(template != null ? !template.equals(streamPreview.template) : streamPreview.template != null);

    }

    @Override
    public int hashCode() {
        int result = large != null ? large.hashCode() : 0;
        result = 31 * result + (medium != null ? medium.hashCode() : 0);
        result = 31 * result + (small != null ? small.hashCode() : 0);
        result = 31 * result + (template != null ? template.hashCode() : 0);
        return result;
    }
}