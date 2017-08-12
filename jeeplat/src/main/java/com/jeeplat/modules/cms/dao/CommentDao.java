package com.jeeplat.modules.cms.dao;

import com.jeeplat.common.persistence.CrudDao;
import com.jeeplat.common.persistence.annotation.MyBatisDao;
import com.jeeplat.modules.cms.entity.Comment;

/**
 * 评论DAO接口
 */
@MyBatisDao
public interface CommentDao extends CrudDao<Comment> {

}
