package com.elitekpi.imdg.cache.query;

public interface Query {
    Object execute();
    Object execute(Object[] params);
}
