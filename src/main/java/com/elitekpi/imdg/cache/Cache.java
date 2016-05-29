package com.elitekpi.imdg.cache;

public interface Cache extends ImdgCache {
    <K, V> Region<K, V> createRegion(String name);
    int getLockTimeout();
    void setLockTimeout(int seconds);
    int getMessageSyncInterval();
    void setMessageSyncInterval(int seconds);
    int getSearchTimeout();
    void setSearchTimeout(int seconds);
}

