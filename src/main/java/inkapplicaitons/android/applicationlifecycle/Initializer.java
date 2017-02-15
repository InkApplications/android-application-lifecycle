package com.inkapplications.android.applicationlifecycle;

import android.app.Application;

/**
 * Base class for Subscribers used to initialize services in `onCreate`
 *
 * This class just makes the other lifecycle events optional. If you find
 * yourself using them, your class might not be an initializer and can just
 * implement the `ApplicationLifecycleSubscriber` interface.
 *
 * @author Renee Vandervelde (Renee@ReneeVandervelde.com)
 */
abstract public class Initializer implements ApplicationLifecycleSubscriber {
    @Override public void onLowMemory(Application application) {}
    @Override public void onTrimMemory(Application application, int level) {}
    @Override public void onTerminate(Application application) {}
}
