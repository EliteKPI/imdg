package com.elitekpi.imdg.cache.query.types;

public interface MapType extends CollectionType {
    ObjectType getKeyType();
    StructType getEntryType();
}
