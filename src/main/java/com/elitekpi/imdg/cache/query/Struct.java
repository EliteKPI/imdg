package com.elitekpi.imdg.cache.query;

import com.elitekpi.imdg.cache.query.types.StructType;

public interface Struct {
  Object get(String fieldName);
  Object[] getFieldValues();
  StructType getStructType();
}
