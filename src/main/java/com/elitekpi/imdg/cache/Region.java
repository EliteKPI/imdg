package com.elitekpi.imdg.cache;


import com.elitekpi.imdg.cache.query.SelectResults;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Lock;

public interface Region<K,V>  extends ConcurrentMap<K, V> {
    /** The region name separator character. */
    char SEPARATOR_CHAR = '/';

    /** The region name separator character, represented as a string for convenience. */
    String SEPARATOR = "/";

    String getName();
    String getFullPath();
    <PK, PV> Region<PK, PV> getParentRegion();
    void invalidateRegion() throws TimeoutException;
    void invalidateRegion(Object aCallbackArgument) throws TimeoutException;
    void localInvalidateRegion();
    void localInvalidateRegion(Object aCallbackArgument);
    void destroyRegion() throws TimeoutException;
    void destroyRegion(Object aCallbackArgument) throws TimeoutException;
    void localDestroyRegion();
    void localDestroyRegion(Object aCallbackArgument);
    void close();
    <SK, SV> Region<SK, SV> getSubregion(String path);
    Set<Region<?, ?>> subregions(boolean recursive);
    Entry<K,V> getEntry(Object key);
    V get(Object key);
    V get(Object key, Object aCallbackArgument);
    V put(K key, V value);
    V put(K key, V value, Object aCallbackArgument);
    void create(K key, V value);
    void create(K key, V value, Object aCallbackArgument);
    void invalidate(Object key);
    void invalidate(Object key, Object aCallbackArgument);
    void localInvalidate(Object key);
    void localInvalidate(Object key, Object aCallbackArgument);
    V destroy(Object key);
    V destroy(Object key, Object aCallbackArgument);
    void localDestroy(Object key);
    void localDestroy(Object key, Object aCallbackArgument);
    Set<K> keySet();
    Collection<V> values();
    Set<Region.Entry<?,?>> entrySet(boolean recursive);
    Cache getCache();
    RegionService getRegionService();
    Object getUserAttribute();
    void setUserAttribute(Object value);
    boolean isDestroyed();
    boolean containsValueForKey(Object key);
    boolean containsKey(Object key);
    Lock getRegionDistributedLock();
    Lock getDistributedLock(Object key);
    boolean existsValue(String queryPredicate);
    <E> SelectResults<E> query(String queryPredicate);
    Object selectValue(String queryPredicate);
    void becomeLockGrantor();
    void localClear();
    void clear();
    boolean containsValue(Object value);
    boolean isEmpty();
    void putAll(Map<? extends K, ? extends V> map);
    void putAll(Map<? extends K, ? extends V> map, Object aCallbackArgument);
    void removeAll(Collection<? extends K> keys);
    void removeAll(Collection<? extends K> keys, Object aCallbackArgument);
    Map<K, V> getAll(Collection<?> keys);
    <T extends K> Map<T, V> getAll(Collection<T> keys, Object aCallbackArgument);
    V remove(Object key);
    int size();
    boolean equals(Object other);
    int hashCode();
    Set<K> keySetOnServer();
    boolean containsKeyOnServer(Object key);
    V putIfAbsent(K key, V value);
    boolean remove(Object key, Object value);
    boolean replace(K key, V oldValue, V newValue);
    V replace(K key, V value);

    interface Entry<K, V> extends Map.Entry<K,V>{
        K getKey();
        V getValue();
        Region<K,V> getRegion();
        boolean isLocal();
        Object getUserAttribute();
        Object setUserAttribute(Object userAttribute);
        boolean isDestroyed();
        V setValue(V value);
    }
}
