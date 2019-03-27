DROP TABLE IF EXISTS ORGANIZATION;
CREATE TABLE ORGANIZATION (
   ID                   CHAR(32) NOT NULL COMMENT 'id',
   ORG_NAME             VARCHAR(200) COMMENT '组织名称',
   ORG_DESC             VARCHAR(800) COMMENT '组织描述',
   SEQUENCE_NUMBER      INT NOT NULL COMMENT '排序号',
   PARENT_ID            CHAR(32) COMMENT '上级id',
   CREATE_TIME          TIMESTAMP NULL COMMENT '创建时间',
   MODIFY_TIME          TIMESTAMP NULL COMMENT '修改时间',
   PRIMARY KEY (ID)
);
ALTER TABLE ORGANIZATION COMMENT '组织表';

DROP TABLE IF EXISTS AUTHORITY;
CREATE TABLE AUTHORITY
(
   AUTHORITY_CODE       VARCHAR(200) NOT NULL COMMENT '权限代码',
   AUTHORITY_NAME       VARCHAR(200) NOT NULL COMMENT '权限名称',
   AUTHORITY_GROUP_ID   VARCHAR(200) COMMENT '权限组ID',
   CREATE_TIME          TIMESTAMP NULL COMMENT '创建时间',
   MODIFY_TIME          TIMESTAMP NULL COMMENT '修改时间'
);
ALTER TABLE AUTHORITY COMMENT '权限表';

DROP TABLE IF EXISTS AUTHORITY_GROUP;
CREATE TABLE AUTHORITY_GROUP
(
   ID                   CHAR(32) NOT NULL COMMENT 'id',
   AUTHORITY_GROUP_NAME       VARCHAR(200) NOT NULL COMMENT '权限组名称',
   SEQUENCE_NUMBER      INT NOT NULL COMMENT '排序号',
   PARENT_ID            CHAR(32) COMMENT '上级id',
   CREATE_TIME          TIMESTAMP NULL COMMENT '创建时间',
   MODIFY_TIME          TIMESTAMP NULL COMMENT '修改时间',
   PRIMARY KEY (ID)
);
ALTER TABLE AUTHORITY_GROUP COMMENT '权限组表';

DROP TABLE IF EXISTS ROLE;
CREATE TABLE ROLE
(
   ID                   CHAR(32) NOT NULL COMMENT 'id',
   ROLE_NAME            VARCHAR(200) NOT NULL COMMENT '角色名称',
   ROLE_DESC            VARCHAR(800) COMMENT '角色描述',
   ROLE_TYPE            CHAR(2) NOT NULL COMMENT '00:默认、01:自定义',
   CREATE_TIME          TIMESTAMP NULL COMMENT '创建时间',
   MODIFY_TIME          TIMESTAMP NULL COMMENT '修改时间',
   PRIMARY KEY (ID)
);
ALTER TABLE ROLE COMMENT '角色表';

DROP TABLE IF EXISTS ROLE_AUTHORITY;
CREATE TABLE ROLE_AUTHORITY
(
   ROLE_CODE            CHAR(32) NOT NULL COMMENT '角色代码',
   AUTHORITY_CODE       VARCHAR(200) NOT NULL COMMENT '权限代码',
   PRIMARY KEY (ROLE_CODE, AUTHORITY_CODE)
);
ALTER TABLE ROLE_AUTHORITY COMMENT '系统角色权限关联表';

DROP TABLE IF EXISTS USER;
CREATE TABLE USER
(
   ID                   CHAR(32) NOT NULL COMMENT 'id',
   USERNAME             VARCHAR(100) COMMENT '用户名',
   PASSWORD             VARCHAR(200) COMMENT '密码',
   NICK                 VARCHAR(100) COMMENT '昵称',
   MOBILE_PREFIX        VARCHAR(10) COMMENT '手机前缀',
   MOBILE               VARCHAR(11) COMMENT '手机',
   USER_TYPE            CHAR(2) NOT NULL COMMENT '用户类型(00:系统用户、01:火车司机、02:施工人员)',
   BUILDER_USER_TYPE    CHAR(2) COMMENT '施工人员类型(00:机车、01:列车、02:施工人员、03:安全防护员、04:作业负责人、05:监理、06:其它人员)',
   BUILDER_STATUS       CHAR(2) COMMENT '施工人员状态(00:入场、01:出场)',
   ADMISSION_DATE       DATE NULL COMMENT '入场时间',
   LEAVE_DATE           DATE NULL COMMENT '离场时间',
   WRIST_STRAP_CODE     VARCHAR(60) COMMENT '手环编码',
   STATUS               VARCHAR(10) NOT NULL COMMENT '用户状态(NORMAL:正常)',
   LOGIN_TOKEN          CHAR(32) COMMENT '登录TOKEN',
   LOGIN_TOKEN_EXPIRAT_TIME TIMESTAMP NULL COMMENT '登录TOKEN失效时间',
   LOGIN_DEVICE_CODE    VARCHAR(60) COMMENT '登录设备编号',
   LAST_LOGIN_IP        VARCHAR(40) COMMENT '最后登录IP',
   FAIL_LOGIN_COUNTER   INT COMMENT '登录失败次数',
   ORGANIZATION_ID      CHAR(32) COMMENT '组织id',
   CREATE_TIME          TIMESTAMP NULL COMMENT '创建时间',
   MODIFY_TIME          TIMESTAMP NULL COMMENT '修改时间',
   PRIMARY KEY (ID),
   UNIQUE KEY UK_USERNAME(USERNAME)
);
ALTER TABLE USER COMMENT '用户表';

DROP TABLE IF EXISTS USER_ROLE;
CREATE TABLE USER_ROLE
(
   USER_ID              CHAR(32) NOT NULL COMMENT '用户编号',
   ROLE_CODE            CHAR(32) NOT NULL COMMENT '角色代码',
   PRIMARY KEY (USER_ID, ROLE_CODE)
);
ALTER TABLE USER_ROLE COMMENT '用户角色关联表';

DROP TABLE IF EXISTS MILEAGE;
CREATE TABLE MILEAGE
(
   ID                   CHAR(32) NOT NULL COMMENT 'id',
   MILEAGE_NAME         VARCHAR(200) NOT NULL COMMENT '里程点',
   MILEAGE_TYPE         CHAR(2) NOT NULL COMMENT '里程类型(00:百米标、01:公里标)',
   START_LONGITUDE		  DECIMAL(20,10) COMMENT '开始位置经度',
	 START_LATITUDE		    DECIMAL(20,7) COMMENT '开始位置纬度',
	 END_LONGITUDE		    DECIMAL(20,7) COMMENT '结束位置经度',
	 END_LATITUDE		      DECIMAL(20,7) COMMENT '结束位置纬度',
   CREATE_TIME          TIMESTAMP NULL COMMENT '创建时间',
   MODIFY_TIME          TIMESTAMP NULL COMMENT '修改时间',
   PRIMARY KEY (ID)
);
ALTER TABLE MILEAGE COMMENT '里程表';