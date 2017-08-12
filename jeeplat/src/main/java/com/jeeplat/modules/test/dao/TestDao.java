package com.jeeplat.modules.test.dao;

import com.jeeplat.common.persistence.CrudDao;
import com.jeeplat.common.persistence.annotation.MyBatisDao;
import com.jeeplat.modules.test.entity.Test;

/**
 * 测试DAO接口
 */
@MyBatisDao
public interface TestDao extends CrudDao<Test> {
	
}
