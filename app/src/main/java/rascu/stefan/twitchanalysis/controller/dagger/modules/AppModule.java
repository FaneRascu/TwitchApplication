package rascu.stefan.twitchanalysis.controller.dagger.modules;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private final Application app;

    public AppModule(Application application) {
        app = application;
    }

    @Provides
    @Singleton
    protected Application provideApplication() {
        return app;
    }

    @Provides
    @Singleton
    protected Context provideApplicationContext() {
        return app;
    }

    @Provides
    @Singleton
    protected Resources provideResources() {
        return app.getResources();
    }

    @Provides
    @Singleton
    protected SharedPreferences provideSharedPreferences() {
        return PreferenceManager.getDefaultSharedPreferences(app);
    }
}