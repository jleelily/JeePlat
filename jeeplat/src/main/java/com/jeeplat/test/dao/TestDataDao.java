package com.jeeplat.test.dao;

import com.jeeplat.common.persistence.CrudDao;
import com.jeeplat.common.persistence.annotation.MyBatisDao;
import com.jeeplat.test.entity.TestData;

/**
 * 单表生成DAO接口
 */
@MyBatisDao
public interface TestDataDao extends CrudDao<TestData> {
	
}