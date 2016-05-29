package com.elitekpi.imdg.cache.query;

import com.elitekpi.imdg.cache.query.types.*;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface SelectResults<E> extends Collection<E> {
  boolean isModifiable();
  Set<E> asSet();
  List<E> asList();
  CollectionType getCollectionType();
  void setElementType(ObjectType elementType);
}
