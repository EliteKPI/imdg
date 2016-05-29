package com.elitekpi.imdg.cache.query.types;

public interface CollectionType extends ObjectType {
    ObjectType getElementType();
    boolean allowsDuplicates();
    boolean isOrdered();
}
