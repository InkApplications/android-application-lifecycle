package com.inkapplications.android.applicationlifecycle;

import android.app.Application;

/**
 * Base class for Subscribers used to handle memory Events.
 *
 * This class just makes the other lifecycle events optional. If you find
 * yourself using them, your class might not be an memory manager and can just
 * implement the `ApplicationLifecycleSubscriber` interface.
 *
 * @author Renee Vandervelde (Renee@ReneeVandervelde.com)
 */
abstract public class MemoryManager implements ApplicationLifecycleSubscriber {
    @Override public void onCreate(Application application) {}
    @Override public void onTerminate(Application application) {}
}
