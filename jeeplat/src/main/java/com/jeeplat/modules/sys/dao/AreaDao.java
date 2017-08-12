package com.jeeplat.modules.sys.dao;

import com.jeeplat.common.persistence.TreeDao;
import com.jeeplat.common.persistence.annotation.MyBatisDao;
import com.jeeplat.modules.sys.entity.Area;

/**
 * 区域DAO接口
 */
@MyBatisDao
public interface AreaDao extends TreeDao<Area> {
	
}
