package com.zcsoft.rc.common.dao;

import com.sharingif.cube.persistence.mybatis.dao.ICubeMyBatisDAO;

import java.io.Serializable;

public interface BaseDAO<T, ID extends Serializable> extends ICubeMyBatisDAO<T, ID> {
}
