package com.ruyuan.nacos.cmdb;

import com.alibaba.nacos.api.cmdb.pojo.Entity;
import com.alibaba.nacos.api.cmdb.pojo.EntityEvent;
import com.alibaba.nacos.api.cmdb.pojo.Label;
import com.alibaba.nacos.api.cmdb.spi.CmdbService;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CmdbServiceImpl implements CmdbService {

    public Set<String> getLabelNames() {
        return null;
    }

    public Set<String> getEntityTypes() {
        return null;
    }

    public Label getLabel(String s) {
        return null;
    }

    public String getLabelValue(String s, String s1, String s2) {
        return null;
    }

    public Map<String, String> getLabelValues(String s, String s1) {
        return null;
    }

    public Map<String, Map<String, Entity>> getAllEntities() {
        return null;
    }

    public List<EntityEvent> getEntityEvents(long l) {
        return null;
    }

    public Entity getEntity(String s, String s1) {
        return null;
    }

}
