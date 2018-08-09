package rascu.stefan.twitchanalysis.ui.moduleTopCommunities;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import rascu.stefan.twitchanalysis.R;
import rascu.stefan.twitchanalysis.controller.dagger.DaggerManager;
import rascu.stefan.twitchanalysis.ui.BaseFragment;

public class ModuleTopCommunitiesFragment extends BaseFragment {

    // ------------------------------------------------------------------------
    // TYPES
    // ------------------------------------------------------------------------

    // ------------------------------------------------------------------------
    // STATIC FIELDS
    // ------------------------------------------------------------------------

    private static final String TAG = ModuleTopCommunitiesFragment.class.getSimpleName();

    // ------------------------------------------------------------------------
    // STATIC METHODS
    // ------------------------------------------------------------------------

    /**
     * @return newInstance of SampleFragment
     */
    public static ModuleTopCommunitiesFragment newInstance() {
        return new ModuleTopCommunitiesFragment();
    }

    // ------------------------------------------------------------------------
    // FIELDS
    // ------------------------------------------------------------------------
    private View mRootView;

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
            mRootView = inflater.inflate(R.layout.fragment_module_top_communities, null);
        }
        return mRootView;
    }

    // ------------------------------------------------------------------------
    // GETTERS / SETTTERS
    // ------------------------------------------------------------------------
}
