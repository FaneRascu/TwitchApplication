package rascu.stefan.twitchanalysis.controller.dagger;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;
import rascu.stefan.twitchanalysis.controller.dagger.modules.AppModule;
import rascu.stefan.twitchanalysis.controller.dagger.modules.DevelModule;
import rascu.stefan.twitchanalysis.controller.dagger.modules.NavigationModule;

@Singleton
@Component(modules = { AppModule.class, NavigationModule.class, DevelModule.class})
public interface MainComponent extends DaggerComponentGraph {

    final class Initializer {

        public static MainComponent init(Application app) {

            //@formatter:off
            return DaggerMainComponent.builder()
                    .appModule(new AppModule(app))
                    .navigationModule(new NavigationModule())
                    .develModule(new DevelModule())
                    .build();
            //@formatter:on
        }

    }
}