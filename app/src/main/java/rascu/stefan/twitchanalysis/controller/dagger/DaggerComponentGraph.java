package rascu.stefan.twitchanalysis.controller.dagger;

import rascu.stefan.twitchanalysis.TwitchAnalysis;
import rascu.stefan.twitchanalysis.ui.BaseActivity;
import rascu.stefan.twitchanalysis.ui.MainActivity;
import rascu.stefan.twitchanalysis.ui.SampleFragment;
import rascu.stefan.twitchanalysis.ui.drawer.DrawerManager;
import rascu.stefan.twitchanalysis.ui.moduleMainMenu.ModuleMainMenuFragment;
import rascu.stefan.twitchanalysis.ui.moduleMainMenu.ModuleMainMenuInternalFragment;
import rascu.stefan.twitchanalysis.ui.moduleTopCommunities.ModuleTopCommunitiesFragment;
import rascu.stefan.twitchanalysis.ui.moduleTopFeaturedStreams.ModuleTopFeaturedStreamsFragment;
import rascu.stefan.twitchanalysis.ui.moduleTopGames.ModuleTopGamesFragment;
import rascu.stefan.twitchanalysis.ui.moduleTopStreams.ModuleTopStreamsFragment;

public interface DaggerComponentGraph {

    void inject(TwitchAnalysis app);

    void inject(BaseActivity baseActivity);

    void inject(SampleFragment sampleFragment);

    void inject(ModuleTopStreamsFragment rulesOverviewFragment);

    void inject(MainActivity baseActivity);

    void inject(DrawerManager drawerManager);

    void inject(ModuleTopGamesFragment conditionsOverviewFragment);

    void inject(ModuleTopCommunitiesFragment eventsOverviewFragment);

    void inject(ModuleMainMenuFragment actionsOverviewFragment);

    void inject(ModuleTopFeaturedStreamsFragment historyListFragment);

    void inject(ModuleMainMenuInternalFragment module1InternalFragment);
}