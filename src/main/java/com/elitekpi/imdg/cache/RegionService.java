package com.elitekpi.imdg.cache;

import com.elitekpi.imdg.cache.query.QueryService;

import java.util.Set;

public interface RegionService extends AutoCloseable {
    <K,V> Region<K,V> getRegion(String path);
    Set<Region<?,?>> rootRegions();
    QueryService getQueryService();
    void close();
    boolean isClosed();
}
