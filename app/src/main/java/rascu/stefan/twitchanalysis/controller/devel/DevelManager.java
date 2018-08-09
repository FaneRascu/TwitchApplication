package rascu.stefan.twitchanalysis.controller.devel;

import rascu.stefan.twitchanalysis.BuildConfig;

public class DevelManager {

    /**
     * @return a string which summarizes the build information in a user friendly way
     */
    public String getBuildDescription() {
        String buildString = "Build: debug " + BuildConfig.FLAVOR + " ";
        buildString += BuildConfig.HAS_BUILD_NUMBER ? "#" + BuildConfig.BUILD_NUMBER : " by " + BuildConfig.USERNAME + "@" + BuildConfig.COMPUTERNAME;
        buildString += " (" + BuildConfig.BUILD_TIME + ")";

        return buildString;
    }
}
