package com.elitekpi.imdg.cache.query.types;

public interface StructType extends ObjectType {
    ObjectType[] getFieldTypes();
    String[] getFieldNames();
    int getFieldIndex(String fieldName);

}
