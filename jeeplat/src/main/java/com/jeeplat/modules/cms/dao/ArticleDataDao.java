package com.jeeplat.modules.cms.dao;

import com.jeeplat.common.persistence.CrudDao;
import com.jeeplat.common.persistence.annotation.MyBatisDao;
import com.jeeplat.modules.cms.entity.ArticleData;

/**
 * 文章DAO接口
 */
@MyBatisDao
public interface ArticleDataDao extends CrudDao<ArticleData> {
	
}
