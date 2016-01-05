package com.github.yuweiguocn.demo.greendao.db;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import com.github.yuweiguocn.demo.greendao.db.TestData;
import com.github.yuweiguocn.demo.greendao.db.TestData2;
import com.github.yuweiguocn.demo.greendao.db.TestData3;

import com.github.yuweiguocn.demo.greendao.db.TestDataDao;
import com.github.yuweiguocn.demo.greendao.db.TestData2Dao;
import com.github.yuweiguocn.demo.greendao.db.TestData3Dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig testDataDaoConfig;
    private final DaoConfig testData2DaoConfig;
    private final DaoConfig testData3DaoConfig;

    private final TestDataDao testDataDao;
    private final TestData2Dao testData2Dao;
    private final TestData3Dao testData3Dao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        testDataDaoConfig = daoConfigMap.get(TestDataDao.class).clone();
        testDataDaoConfig.initIdentityScope(type);

        testData2DaoConfig = daoConfigMap.get(TestData2Dao.class).clone();
        testData2DaoConfig.initIdentityScope(type);

        testData3DaoConfig = daoConfigMap.get(TestData3Dao.class).clone();
        testData3DaoConfig.initIdentityScope(type);

        testDataDao = new TestDataDao(testDataDaoConfig, this);
        testData2Dao = new TestData2Dao(testData2DaoConfig, this);
        testData3Dao = new TestData3Dao(testData3DaoConfig, this);

        registerDao(TestData.class, testDataDao);
        registerDao(TestData2.class, testData2Dao);
        registerDao(TestData3.class, testData3Dao);
    }
    
    public void clear() {
        testDataDaoConfig.getIdentityScope().clear();
        testData2DaoConfig.getIdentityScope().clear();
        testData3DaoConfig.getIdentityScope().clear();
    }

    public TestDataDao getTestDataDao() {
        return testDataDao;
    }

    public TestData2Dao getTestData2Dao() {
        return testData2Dao;
    }

    public TestData3Dao getTestData3Dao() {
        return testData3Dao;
    }

}
