package com.jeeplat.test.dao;

import com.jeeplat.common.persistence.CrudDao;
import com.jeeplat.common.persistence.annotation.MyBatisDao;
import com.jeeplat.test.entity.TestDataMain;

/**
 * 主子表生成DAO接口
 */
@MyBatisDao
public interface TestDataMainDao extends CrudDao<TestDataMain> {
	
}