package com.jeeplat.modules.gen.dao;

import com.jeeplat.common.persistence.CrudDao;
import com.jeeplat.common.persistence.annotation.MyBatisDao;
import com.jeeplat.modules.gen.entity.GenScheme;

/**
 * 生成方案DAO接口
 */
@MyBatisDao
public interface GenSchemeDao extends CrudDao<GenScheme> {
	
}
