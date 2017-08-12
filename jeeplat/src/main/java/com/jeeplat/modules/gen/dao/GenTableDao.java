package com.jeeplat.modules.gen.dao;

import com.jeeplat.common.persistence.CrudDao;
import com.jeeplat.common.persistence.annotation.MyBatisDao;
import com.jeeplat.modules.gen.entity.GenTable;

/**
 * 业务表DAO接口
 */
@MyBatisDao
public interface GenTableDao extends CrudDao<GenTable> {
	
}
