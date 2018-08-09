package rascu.stefan.twitchanalysis.controller.dagger.modules;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import rascu.stefan.twitchanalysis.ui.drawer.DrawerManager;
import rascu.stefan.twitchanalysis.ui.navigation.NavigationManager;

@Module
public class NavigationModule {


    @Provides
    @Singleton
    protected NavigationManager provideNavigationManager() {
        return new NavigationManager();
    }

    @Provides
    @Singleton
    protected DrawerManager provideDrawerManager() {
        return new DrawerManager();
    }
}
