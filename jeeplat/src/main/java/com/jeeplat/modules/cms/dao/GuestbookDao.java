package com.jeeplat.modules.cms.dao;

import com.jeeplat.common.persistence.CrudDao;
import com.jeeplat.common.persistence.annotation.MyBatisDao;
import com.jeeplat.modules.cms.entity.Guestbook;

/**
 * 留言DAO接口
 */
@MyBatisDao
public interface GuestbookDao extends CrudDao<Guestbook> {

}
