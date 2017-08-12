package com.jeeplat.modules.sys.dao;

import com.jeeplat.common.persistence.TreeDao;
import com.jeeplat.common.persistence.annotation.MyBatisDao;
import com.jeeplat.modules.sys.entity.Office;

/**
 * 机构DAO接口
 */
@MyBatisDao
public interface OfficeDao extends TreeDao<Office> {
	
}
