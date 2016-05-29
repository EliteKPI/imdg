package com.elitekpi.imdg.cache.query.types;

import com.elitekpi.imdg.DataSerializable;

public interface ObjectType extends DataSerializable {
    boolean isCollectionType();boolean isMapType();
    boolean isStructType();
    String getSimpleClassName();Class resolveClass();
}
