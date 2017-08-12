/**
 */
package com.jeeplat.modules.cms.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeeplat.common.service.CrudService;
import com.jeeplat.modules.cms.dao.ArticleDataDao;
import com.jeeplat.modules.cms.entity.ArticleData;

/**
 * 站点Service
 */
@Service
@Transactional(readOnly = true)
public class ArticleDataService extends CrudService<ArticleDataDao, ArticleData> {

}
