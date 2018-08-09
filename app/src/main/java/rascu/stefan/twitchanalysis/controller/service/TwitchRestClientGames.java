package rascu.stefan.twitchanalysis.controller.service;

import java.util.Map;

import rascu.stefan.twitchanalysis.model.games.GamesListContent;
import rascu.stefan.twitchanalysis.utils.Constants;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.QueryMap;

public interface TwitchRestClientGames {

    @Headers({Constants.ACCEPT_HEADER, Constants.Client_ID})
    @GET(Constants.PATH_GAMES)
    public Call<GamesListContent> getTopGames();

    @Headers({Constants.ACCEPT_HEADER, Constants.Client_ID})
    @GET(Constants.PATH_GAMES)
    public Call<GamesListContent> getTopGames(@QueryMap Map<String, String> parameters);
}
