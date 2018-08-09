package rascu.stefan.twitchanalysis.ui.moduleMainMenu;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;

import butterknife.OnClick;
import rascu.stefan.twitchanalysis.R;
import rascu.stefan.twitchanalysis.controller.dagger.DaggerManager;
import rascu.stefan.twitchanalysis.ui.BaseFragment;
import rascu.stefan.twitchanalysis.ui.navigation.NavigationManager;

public class ModuleMainMenuFragment extends BaseFragment {

    // ------------------------------------------------------------------------
    // TYPES
    // ------------------------------------------------------------------------

    // ------------------------------------------------------------------------
    // STATIC FIELDS
    // ------------------------------------------------------------------------

    private static final String TAG = ModuleMainMenuFragment.class.getSimpleName();

    // ------------------------------------------------------------------------
    // STATIC METHODS
    // ------------------------------------------------------------------------

    /**
     * @return newInstance of SampleFragment
     */
    public static ModuleMainMenuFragment newInstance() {
        return new ModuleMainMenuFragment();
    }

    // ------------------------------------------------------------------------
    // FIELDS
    // ------------------------------------------------------------------------
    private View mRootView;

    @Inject
    NavigationManager mNavigationManager;

    // ------------------------------------------------------------------------
    // CONSTRUCTORS
    // ------------------------------------------------------------------------

    // ------------------------------------------------------------------------
    // METHODS
    // ------------------------------------------------------------------------

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DaggerManager.component().inject(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (mRootView == null) {
            mRootView = inflater.inflate(R.layout.fragment_module_main_menu, null);
        }
        return mRootView;
    }

    @OnClick(R.id.buttonTopGames)
    void navigateTopGames() {
        mNavigationManager.startTopGames();
    }

    @OnClick(R.id.buttonTopStreams)
    void navigateTopStreams() {
        mNavigationManager.startTopStreams();
    }

    @OnClick(R.id.buttonTopFeaturedStreams)
    void navigateTopFeaturedStreams() {
        mNavigationManager.startTopFeaturedStreams();
    }

    @OnClick(R.id.buttonTopCommunities)
    void navigateTopCommunities() {
        mNavigationManager.startTopCommunities();
    }

    // ------------------------------------------------------------------------
    // GETTERS / SETTTERS
    // ------------------------------------------------------------------------
}