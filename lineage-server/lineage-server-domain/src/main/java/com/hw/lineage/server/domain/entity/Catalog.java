package com.hw.lineage.server.domain.entity;

import com.alibaba.fastjson2.JSONObject;
import com.hw.lineage.common.enums.CatalogType;
import com.hw.lineage.server.domain.entity.basic.BasicEntity;
import com.hw.lineage.server.domain.repository.basic.Entity;
import com.hw.lineage.server.domain.vo.CatalogId;
import com.hw.lineage.server.domain.vo.PluginId;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @description: Catalog
 * @author: HamaWhite
 * @version: 1.0.0
 */
@Data
@Accessors(chain = true)
public class Catalog extends BasicEntity implements Entity {

    private CatalogId catalogId;

    private PluginId pluginId;

    private String catalogName;

    private CatalogType catalogType;

    private String defaultDatabase;

    private String descr;

    private JSONObject catalogProperties;

    private Boolean defaultCatalog;
}
