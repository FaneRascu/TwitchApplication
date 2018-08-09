package rascu.stefan.twitchanalysis.controller.dagger.modules;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import rascu.stefan.twitchanalysis.controller.devel.DevelManager;

@Module
public class DevelModule {

    @Provides
    @Singleton
    protected DevelManager providesDevelManager() {
        return new DevelManager();
    }
}
