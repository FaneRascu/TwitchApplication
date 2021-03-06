package rascu.stefan.twitchanalysis.ui.navigation;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import rascu.stefan.twitchanalysis.R;
import rascu.stefan.twitchanalysis.ui.moduleMainMenu.ModuleMainMenuFragment;
import rascu.stefan.twitchanalysis.ui.moduleMainMenu.ModuleMainMenuInternalFragment;
import rascu.stefan.twitchanalysis.ui.moduleTopCommunities.ModuleTopCommunitiesFragment;
import rascu.stefan.twitchanalysis.ui.moduleTopFeaturedStreams.ModuleTopFeaturedStreamsFragment;
import rascu.stefan.twitchanalysis.ui.moduleTopGames.ModuleTopGamesFragment;
import rascu.stefan.twitchanalysis.ui.moduleTopStreams.ModuleTopStreamsFragment;

public class NavigationManager {

    // ------------------------------------------------------------------------
    // TYPES
    // ------------------------------------------------------------------------


    /**
     * Listener interface for navigation events.
     */
    public interface NavigationListener {

        /**
         * Callback on backstack changed.
         */
        void onBackstackChanged();
    }


    // ------------------------------------------------------------------------
    // STATIC FIELDS
    // ------------------------------------------------------------------------

    // ------------------------------------------------------------------------
    // STATIC METHODS
    // ------------------------------------------------------------------------

    // ------------------------------------------------------------------------
    // FIELDS
    // ------------------------------------------------------------------------

    private FragmentManager mFragmentManager;

    private NavigationListener mNavigationListener;


    // ------------------------------------------------------------------------
    // CONSTRUCTORS
    // ------------------------------------------------------------------------

    // ------------------------------------------------------------------------
    // METHODS
    // ------------------------------------------------------------------------

    /**
     * Initialize the NavigationManager with a FragmentManager, which will be used at the
     * fragment transactions.
     *
     * @param fragmentManager
     */
    public void init(FragmentManager fragmentManager) {
        mFragmentManager = fragmentManager;
        mFragmentManager.addOnBackStackChangedListener(new FragmentManager.OnBackStackChangedListener() {
            @Override
            public void onBackStackChanged() {
                if (mNavigationListener != null) {
                    mNavigationListener.onBackstackChanged();
                }
            }
        });
    }

    /**
     * Displays the next fragment
     *
     * @param fragment
     */
    private void open(Fragment fragment) {
        if (mFragmentManager != null) {
            //@formatter:off
            mFragmentManager.beginTransaction()
                    .replace(R.id.main_container, fragment)
                    .setCustomAnimations(R.anim.slide_in_left,
                            R.anim.slide_out_right,
                            R.anim.slide_in_right,
                            R.anim.slide_out_left)
                    .addToBackStack(fragment.toString())
                    .commit();
            //@formatter:on
        }
    }

    /**
     * pops every fragment and starts the given fragment as a new one.
     *
     * @param fragment
     */
    private void openAsRoot(Fragment fragment) {
        popEveryFragment();
        open(fragment);
    }


    /**
     * Pops all the queued fragments
     */
    private void popEveryFragment() {
        // Clear all back stack.
        int backStackCount = mFragmentManager.getBackStackEntryCount();
        for (int i = 0; i < backStackCount; i++) {

            // Get the back stack fragment id.
            int backStackId = mFragmentManager.getBackStackEntryAt(i).getId();

            mFragmentManager.popBackStack(backStackId, FragmentManager.POP_BACK_STACK_INCLUSIVE);

        }
    }

    /**
     * Navigates back by popping teh back stack. If there is no more items left we finish the current activity.
     *
     * @param baseActivity
     */
    public void navigateBack(Activity baseActivity) {

//        if (mFragmentManager.getBackStackEntryCount() == 0) {
//            // we can finish the base activity since we have no other fragments
//            baseActivity.finish();
//        } else {
//            mFragmentManager.popBackStackImmediate();
//        }
        Fragment fragment = ModuleMainMenuFragment.newInstance();
        openAsRoot(fragment);
    }

    public void startMainMenu() {
        Fragment fragment = ModuleMainMenuFragment.newInstance();
        openAsRoot(fragment);
    }

    public void startTopGames() {
        Fragment fragment = ModuleTopGamesFragment.newInstance();
        openAsRoot(fragment);
    }

    public void startTopStreams() {
        Fragment fragment = ModuleTopStreamsFragment.newInstance();
        openAsRoot(fragment);
    }

    public void startTopFeaturedStreams() {
        Fragment fragment = ModuleTopFeaturedStreamsFragment.newInstance();
        openAsRoot(fragment);
    }

    public void startTopCommunities() {
        Fragment fragment = ModuleTopCommunitiesFragment.newInstance();
        openAsRoot(fragment);
    }



    /**
     * @return true if the current fragment displayed is a root fragment
     */
    public boolean isRootFragmentVisible() {
        return mFragmentManager.getBackStackEntryCount() <= 1;
    }

    public NavigationListener getNavigationListener() {
        return mNavigationListener;
    }

    public void setNavigationListener(NavigationListener navigationListener) {
        mNavigationListener = navigationListener;
    }

    // ------------------------------------------------------------------------
    // GETTERS / SETTTERS
    // ------------------------------------------------------------------------
}
