package com.jeeplat.test.dao;

import com.jeeplat.common.persistence.TreeDao;
import com.jeeplat.common.persistence.annotation.MyBatisDao;
import com.jeeplat.test.entity.TestTree;

/**
 * 树结构生成DAO接口
 */
@MyBatisDao
public interface TestTreeDao extends TreeDao<TestTree> {
	
}