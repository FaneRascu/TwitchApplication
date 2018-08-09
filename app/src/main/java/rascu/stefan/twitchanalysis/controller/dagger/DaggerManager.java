package rascu.stefan.twitchanalysis.controller.dagger;

import rascu.stefan.twitchanalysis.TwitchAnalysis;

public class DaggerManager {
// ------------------------------------------------------------------------
    // TYPES
    // ------------------------------------------------------------------------

    private static class Holder {
        static final DaggerManager INSTANCE = new DaggerManager();
    }

    // ------------------------------------------------------------------------
    // STATIC FIELDS
    // ------------------------------------------------------------------------

    // ------------------------------------------------------------------------
    // STATIC METHODS
    // ------------------------------------------------------------------------

    /**
     * @return the Gagger generate graph
     */
    public static DaggerComponentGraph component() {
        return getInstance().graph;
    }

    public static DaggerManager getInstance() {
        return Holder.INSTANCE;
    }

    // ------------------------------------------------------------------------
    // FIELDS
    // ------------------------------------------------------------------------

    /**
     * Dagger component graph
     */
    private DaggerComponentGraph graph;

    // ------------------------------------------------------------------------
    // CONSTRUCTORS
    // ------------------------------------------------------------------------

    // Just make it private
    private DaggerManager() {
    }

    /**
     * Rebuilds the dagger generated object graph
     */
    public void buildComponentAndInject(TwitchAnalysis app) {
        graph = DaggerMainComponent.Initializer.init(app);
        graph.inject(app);
    }

    // ------------------------------------------------------------------------
    // METHODS
    // ------------------------------------------------------------------------

    // ------------------------------------------------------------------------
    // GETTERS / SETTTERS
    // ------------------------------------------------------------------------
}
