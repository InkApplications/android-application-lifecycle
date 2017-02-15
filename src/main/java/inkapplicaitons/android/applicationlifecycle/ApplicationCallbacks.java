package com.inkapplications.android.applicationlifecycle;

import android.app.Application;

/**
 * A collection of Application callback subscribers that can be invoked as a group.
 *
 * This contains an array of `ApplicationLifecycleSubscriber`, and is also a
 * `ApplicationLifecycleSubscriber` itself. When each of the callbacks are
 * invoked, this class invokes the method on each of the subscribers in the
 * collection
 *
 * @author Renee Vandervelde
 */
public class ApplicationCallbacks implements ApplicationLifecycleSubscriber {
    final private ApplicationLifecycleSubscriber[] applicationCallbacks;

    public ApplicationCallbacks(ApplicationLifecycleSubscriber... applicationCallbacks) {
        this.applicationCallbacks = applicationCallbacks;
    }

    public void onCreate(Application application) {
        for (ApplicationLifecycleSubscriber callbacks : this.applicationCallbacks) {
            callbacks.onCreate(application);
        }
    }

    public void onLowMemory(Application application) {
        for (ApplicationLifecycleSubscriber callbacks : this.applicationCallbacks) {
            callbacks.onLowMemory(application);
        }
    }

    public void onTrimMemory(Application application, int level) {
        for (ApplicationLifecycleSubscriber callbacks : this.applicationCallbacks) {
            callbacks.onTrimMemory(application, level);
        }
    }

    public void onTerminate(Application application) {
        for (ApplicationLifecycleSubscriber callbacks : this.applicationCallbacks) {
            callbacks.onTerminate(application);
        }
    }
}
