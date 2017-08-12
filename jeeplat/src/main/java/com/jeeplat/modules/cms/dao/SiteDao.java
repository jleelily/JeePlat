package com.jeeplat.modules.cms.dao;

import com.jeeplat.common.persistence.CrudDao;
import com.jeeplat.common.persistence.annotation.MyBatisDao;
import com.jeeplat.modules.cms.entity.Site;

/**
 * 站点DAO接口
 */
@MyBatisDao
public interface SiteDao extends CrudDao<Site> {

}
