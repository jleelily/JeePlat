package com.jeeplat.modules.test.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeeplat.common.service.CrudService;
import com.jeeplat.modules.test.entity.Test;
import com.jeeplat.modules.test.dao.TestDao;

/**
 * 测试Service
 */
@Service
@Transactional(readOnly = true)
public class TestService extends CrudService<TestDao, Test> {

}
