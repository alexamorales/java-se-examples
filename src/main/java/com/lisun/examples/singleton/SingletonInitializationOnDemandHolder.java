package com.lisun.examples.singleton;

/**
 * @author Alex
 * @since 19.11.2014
 */
public class SingletonInitializationOnDemandHolder {
    private SingletonInitializationOnDemandHolder() {
    }

    private static class InstanceHolder {
        private static final SingletonInitializationOnDemandHolder INSTANCE = new SingletonInitializationOnDemandHolder();
    }

    /**
     * @return
     */
    public static SingletonInitializationOnDemandHolder getInstance() {
        return InstanceHolder.INSTANCE;
    }
}
