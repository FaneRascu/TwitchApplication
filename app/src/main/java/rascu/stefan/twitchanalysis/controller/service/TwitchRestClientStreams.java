package rascu.stefan.twitchanalysis.controller.service;

import java.util.Map;

import rascu.stefan.twitchanalysis.model.streams.StreamsListContent;
import rascu.stefan.twitchanalysis.utils.Constants;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.QueryMap;

public interface TwitchRestClientStreams {
    @Headers({Constants.ACCEPT_HEADER, Constants.Client_ID})
    @GET(Constants.PATH_STREAMS)
    public Call<StreamsListContent> getTopStreams();

    @Headers({Constants.ACCEPT_HEADER, Constants.Client_ID})
    @GET(Constants.PATH_STREAMS)
    public Call<StreamsListContent> getTopStreams(@QueryMap Map<String, String> parameters);
}
