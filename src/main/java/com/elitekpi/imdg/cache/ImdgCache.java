package com.elitekpi.imdg.cache;

import com.elitekpi.imdg.distributed.DistributedSystem;

import java.util.Properties;

public interface ImdgCache extends RegionService {
  String getName();
  DistributedSystem getDistributedSystem();
  void setCopyOnRead(boolean copyOnRead);
  boolean getCopyOnRead();
  Properties getInitializerProps();
}
