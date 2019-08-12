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
  NICK                 VARCHAR(200) COMMENT '昵称',
  MOBILE_PREFIX        VARCHAR(10) COMMENT '手机前缀',
  MOBILE               VARCHAR(11) COMMENT '手机',
  USER_TYPE            CHAR(2) NOT NULL COMMENT '用户类型(00:系统用户、01:注册用户)',
  BUILDER_USER_TYPE    CHAR(2) COMMENT '施工人员类型(00:机车、01:列车、02:作业人员、03:作业负责人、04:安全员、05:防护员、06:监理、07:其它人员)',
  BUILDER_STATUS       CHAR(2) COMMENT '施工人员状态(00:入场、01:出场)',
  ADMISSION_DATE       DATE NULL COMMENT '入场时间',
  LEAVE_DATE           DATE NULL COMMENT '离场时间',
  WRIST_STRAP_CODE     VARCHAR(60) COMMENT '手环编码',
  STATUS               VARCHAR(10) NOT NULL COMMENT '用户状态(NORMAL:正常)',
  LOGIN_TOKEN          CHAR(32) COMMENT '登录TOKEN',
  LOGIN_TOKEN_EXPIRAT_TIME TIMESTAMP NULL COMMENT '登录TOKEN失效时间',
  LOGIN_DEVICE_CODE    VARCHAR(60) COMMENT '登录设备编号',
  OPERATING_SYSTEM     VARCHAR(20) COMMENT '操作系统(ANDROID:Android、IOS:ios)',
  OPERATING_SYSTEM_SUB VARCHAR(20) COMMENT '操作系统子版本',
  MESSAGING_TOKEN      VARCHAR(200) COMMENT '消息推送Token',
  LAST_LOGIN_IP        VARCHAR(40) COMMENT '最后登录IP',
  FAIL_LOGIN_COUNTER   INT COMMENT '登录失败次数',
  ORGANIZATION_ID      CHAR(32) COMMENT '组织id',
  USER_PICTURE         VARCHAR(200) COMMENT '用户图片',
  CREATE_TIME          TIMESTAMP NULL COMMENT '创建时间',
  MODIFY_TIME          TIMESTAMP NULL COMMENT '修改时间',
  PRIMARY KEY (ID),
  UNIQUE KEY UK_USERNAME(USERNAME),
  UNIQUE KEY UK_WRIST_STRAP_CODE(WRIST_STRAP_CODE)
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

DROP TABLE IF EXISTS USER_FOLLOW;
CREATE TABLE USER_FOLLOW
(
  USER_ID              CHAR(32) NOT NULL COMMENT '用户id',
  USER_FOLLOW_ID       CHAR(32) NOT NULL COMMENT '用户关注id',
  FOLLOW_TYPE          CHAR(2) NOT NULL COMMENT '关注类型(00:用户、01:机械)',
  CREATE_TIME          TIMESTAMP NULL COMMENT '创建时间',
  MODIFY_TIME          TIMESTAMP NULL COMMENT '修改时间',
  PRIMARY KEY (USER_ID, USER_FOLLOW_ID, FOLLOW_TYPE)
);
ALTER TABLE USER_FOLLOW COMMENT '用户关注表';

DROP TABLE IF EXISTS MILEAGE;
CREATE TABLE MILEAGE
(
  ID                   CHAR(32) NOT NULL COMMENT 'id',
  MILEAGE_NAME         VARCHAR(200) NOT NULL COMMENT '里程点',
  MILEAGE_TYPE         CHAR(2) NOT NULL COMMENT '里程类型(00:百米标、01:公里标)',
  START_LONGITUDE		   DECIMAL(30,20) NOT NULL COMMENT '开始位置经度',
	START_LATITUDE		   DECIMAL(30,20) NOT NULL COMMENT '开始位置纬度',
	END_LONGITUDE		     DECIMAL(30,20) NOT NULL COMMENT '结束位置经度',
	END_LATITUDE		     DECIMAL(30,20) NOT NULL COMMENT '结束位置纬度',
  CREATE_TIME          TIMESTAMP NULL COMMENT '创建时间',
  MODIFY_TIME          TIMESTAMP NULL COMMENT '修改时间',
  PRIMARY KEY (ID)
);
ALTER TABLE MILEAGE COMMENT '里程表';

DROP TABLE IF EXISTS MILEAGE_SEGMENT;
CREATE TABLE MILEAGE_SEGMENT
(
  ID                   CHAR(32) NOT NULL COMMENT 'id',
  MILEAGE_SEGMENT_NAME VARCHAR(200) NOT NULL COMMENT '里程区间名称',
  START_MILEAGE_ID     CHAR(32) NOT NULL COMMENT '开始里程点id',
  START_MILEAGE_NAME   VARCHAR(200) NOT NULL COMMENT '开始里程点',
  END_MILEAGE_ID       CHAR(32) NOT NULL COMMENT '结束里程点id',
  END_MILEAGE_NAME     VARCHAR(200) NOT NULL COMMENT '结束里程点',
  START_LONGITUDE		   DECIMAL(30,20) NOT NULL COMMENT '开始位置经度',
	START_LATITUDE		   DECIMAL(30,20) NOT NULL COMMENT '开始位置纬度',
	END_LONGITUDE		     DECIMAL(30,20) NOT NULL COMMENT '结束位置经度',
	END_LATITUDE		     DECIMAL(30,20) NOT NULL COMMENT '结束位置纬度',
	WORKING_CYCLE        INT NOT NULL COMMENT '作业周期',
  CREATE_TIME          TIMESTAMP NULL COMMENT '创建时间',
  MODIFY_TIME          TIMESTAMP NULL COMMENT '修改时间',
  PRIMARY KEY (ID)
);
ALTER TABLE MILEAGE_SEGMENT COMMENT '里程区间表';

DROP TABLE IF EXISTS WORK_SEGMENT;
CREATE TABLE WORK_SEGMENT
(
  ID                   CHAR(32) NOT NULL COMMENT 'id',
  WORK_SEGMENT_NAME    VARCHAR(200) NOT NULL COMMENT '作业面名称',
  MILEAGE_SEGMENT_ID   VARCHAR(32) NOT NULL COMMENT '里程区间id',
  MILEAGE_SEGMENT_NAME VARCHAR(200) NOT NULL COMMENT '里程区间名称',
  START_MILEAGE_ID     CHAR(32) NOT NULL COMMENT '开始里程点id',
  START_MILEAGE_NAME   VARCHAR(200) NOT NULL COMMENT '开始里程点',
  END_MILEAGE_ID       CHAR(32) NOT NULL COMMENT '结束里程点id',
  END_MILEAGE_NAME     VARCHAR(200) NOT NULL COMMENT '结束里程点',
  START_LONGITUDE		   DECIMAL(30,20) NOT NULL COMMENT '开始位置经度',
	START_LATITUDE		   DECIMAL(30,20) NOT NULL COMMENT '开始位置纬度',
	END_LONGITUDE		     DECIMAL(30,20) NOT NULL COMMENT '结束位置经度',
	END_LATITUDE		     DECIMAL(30,20) NOT NULL COMMENT '结束位置纬度',
	WORK_TYPE            CHAR(2) NOT NULL COMMENT '作业类型(00:上行、01:下行)',
	WORK_DATE            DATE NULL COMMENT '作业时间',
  SAFETY_PROTECTION_PERSONNEL INT NOT NULL COMMENT '安全防护人员数',
  WORK_PERSONNEL       INT NOT NULL COMMENT '现场人员数',
  SUBMIT_USER_ID       CHAR(32) NOT NULL COMMENT '提交人员id',
  SUBMIT_USER_NAME     VARCHAR(200) NOT NULL COMMENT '提交人员名称',
  SUBMIT_USER_ORG_ID   CHAR(32) COMMENT '提交人组织id',
  SUBMIT_TIME          TIMESTAMP NULL COMMENT '提交时间',
  CREATE_TIME          TIMESTAMP NULL COMMENT '创建时间',
  MODIFY_TIME          TIMESTAMP NULL COMMENT '修改时间',
  PRIMARY KEY (ID)
);
ALTER TABLE WORK_SEGMENT COMMENT '作业面表';

DROP TABLE IF EXISTS WORK_SEGMENT_DATA_TIME;
CREATE TABLE WORK_SEGMENT_DATA_TIME
(
  ID                   CHAR(32) NOT NULL COMMENT 'id',
  WORK_SEGMENT_ID      CHAR(32) NOT NULL COMMENT '作业面id',
  STARTWORK_TIME       TIMESTAMP NULL COMMENT '开始作业时间',
  END_WORK_TIME        TIMESTAMP NULL COMMENT '结束作业时间',
  PRIMARY KEY (ID)
);
ALTER TABLE WORK_SEGMENT_DATA_TIME COMMENT '作业面作业时间表';

DROP TABLE IF EXISTS MACHINERY;
CREATE TABLE MACHINERY
(
  ID                   CHAR(32) NOT NULL COMMENT 'id',
  PLATE_NUMBER         VARCHAR(100) NOT NULL COMMENT '车牌号',
  MACHINERY_NAME       VARCHAR(200) NOT NULL COMMENT '机械名称',
  MACHINERY_TYPE       VARCHAR(20) NOT NULL COMMENT '机械类型(SMALL:小型、MEDIUM:中型、LARGE:大型)',
  USER_ID              CHAR(32) NOT NULL COMMENT '用户id',
  NICK                 VARCHAR(200) NOT NULL COMMENT '司机',
  MOBILE               VARCHAR(11) NOT NULL COMMENT '手机',
  WORK_RADIUS          INT COMMENT '作业半径',
  WRIST_STRAP_CODE     VARCHAR(60) NOT NULL COMMENT '手环编码',
  CREATE_TIME          TIMESTAMP NULL COMMENT '创建时间',
  MODIFY_TIME          TIMESTAMP NULL COMMENT '修改时间',
  PRIMARY KEY (ID)
);
ALTER TABLE MACHINERY COMMENT '机械表';

DROP TABLE IF EXISTS WORK_WARNING;
CREATE TABLE WORK_WARNING
(
  ID                   CHAR(32) NOT NULL COMMENT 'id',
  WORK_WARNING_ID      VARCHAR(100) NOT NULL COMMENT '警告id',
  MILEAGE_SEGMENT_ID   VARCHAR(32) NOT NULL COMMENT '里程区间id',
  MILEAGE_SEGMENT_NAME VARCHAR(200) NOT NULL COMMENT '里程区间名称',
  WORK_SEGMENT_ID      CHAR(32) NOT NULL COMMENT '作业面id',
  WORK_SEGMENT_NAME    VARCHAR(200) NOT NULL COMMENT '作业面名称',
  WORK_SEGMENT_START_LONGITUDE		  DECIMAL(30,20) NOT NULL COMMENT '作业面开始位置经度',
	WORK_SEGMENT_START_LATITUDE		    DECIMAL(30,20) NOT NULL COMMENT '作业面开始位置纬度',
	WORK_SEGMENT_END_LONGITUDE		    DECIMAL(30,20) NOT NULL COMMENT '作业面结束位置经度',
	WORK_SEGMENT_END_LATITUDE		      DECIMAL(30,20) NOT NULL COMMENT '作业面结束位置纬度',
	USER_ID              CHAR(32) NOT NULL COMMENT '用户id',
	BUILDER_USER_TYPE    CHAR(2) NOT NULL COMMENT '施工人员类型(00:机车、01:列车、02:作业人员、03:作业负责人、04:安全员、05:防护员、06:监理、07:其它人员)',
	DEP_ID               CHAR(32) NOT NULL COMMENT '部门id',
	DEP_NAME             VARCHAR(200) NOT NULL COMMENT '部门名称',
	ORG_ID               CHAR(32) NOT NULL COMMENT '组织id',
  ORG_NAME             VARCHAR(200) COMMENT '组织名称',
	NICK                 VARCHAR(200) COMMENT '昵称',
	MOBILE               VARCHAR(11) COMMENT '手机',
  STATUS               VARCHAR(20) NOT NULL COMMENT '状态(CREATE:创建、FINISH:结束)',
  TYPE                 CHAR(2) NOT NULL COMMENT '类型(00:接近警告线)',
  LONGITUDE		         DECIMAL(30,20) NOT NULL COMMENT '警告位置经度',
  LATITUDE		         DECIMAL(30,20) NOT NULL COMMENT '警告位置纬度',
  CREATE_TIME          TIMESTAMP NULL COMMENT '创建时间',
  MODIFY_TIME          TIMESTAMP NULL COMMENT '修改时间',
  PRIMARY KEY (ID)
);
ALTER TABLE WORK_WARNING COMMENT '作业警告表';

DROP TABLE IF EXISTS SYS_PARAMETER;
CREATE TABLE SYS_PARAMETER
(
  ID					          CHAR(32) NOT NULL COMMENT 'id',
  CHANNEL	              CHAR(2) NOT NULL COMMENT '渠道(00:所有平台、01:APP、02:管理平台)',
	VERSION		            VARCHAR(100) NOT NULL COMMENT '版本(ALL:所有版本)',
	PARAMETER_NAME		    VARCHAR(200) NOT NULL COMMENT '参数名称',
	PARAMETER_VALUE		    VARCHAR(200) NOT NULL COMMENT '参数值',
	PARAMETER_DESC		    VARCHAR(200) NOT NULL COMMENT '参数说明',
	TYPE                  CHAR(3) NOT NULL COMMENT '类型(000:通知、001:安全红线、002:线缆、003:列车、004:GPS)',
	CREATE_TIME			      TIMESTAMP NULL COMMENT '创建时间',
  MODIFY_TIME			      TIMESTAMP NULL COMMENT '修改时间',
	PRIMARY KEY (ID)
);
ALTER TABLE SYS_PARAMETER COMMENT '系统参数表';

DROP TABLE IF EXISTS NOTICE;
CREATE TABLE NOTICE (
  ID                   CHAR(32) NOT NULL COMMENT 'id',
  TYPE                 CHAR(2) NOT NULL COMMENT '通知类型(00:接近警告线)',
  OPERATING_SYSTEM     VARCHAR(20) NOT NULL COMMENT '操作系统(ANDROID:Android、IOS:ios)',
  OPERATING_SYSTEM_SUB VARCHAR(20) COMMENT '操作系统子版本',
  MESSAGING_TOKEN      VARCHAR(200) COMMENT '消息推送Token',
  CONTENT              VARCHAR(200) NOT NULL COMMENT '通知内容',
  DATA_ID              CHAR(32) COMMENT '数据ID',
  STATUS      			   VARCHAR(20) NOT NULL COMMENT '状态(UNTREATED:未处理、PROCESSING:处理中、SUCCESS:成功、FAIL:失败)',
  CREATE_TIME          TIMESTAMP NULL COMMENT '创建时间',
  MODIFY_TIME          TIMESTAMP NULL COMMENT '修改时间',
  PRIMARY KEY (ID)
);
ALTER TABLE NOTICE COMMENT '通知表';

DROP TABLE IF EXISTS RAILWAY_LINES;
CREATE TABLE RAILWAY_LINES (
  ID                   CHAR(32) NOT NULL COMMENT 'id',
  RAILWAY_LINES_NAME   VARCHAR(200) NOT NULL COMMENT '站点名称',
  TYPE                 CHAR(2) NOT NULL COMMENT '类型(00:站点)',
  START_MILEAGE_ID     CHAR(32) NOT NULL COMMENT '开始里程点id',
  START_MILEAGE_NAME   VARCHAR(200) NOT NULL COMMENT '开始里程点',
  END_MILEAGE_ID       CHAR(32) NOT NULL COMMENT '结束里程点id',
  END_MILEAGE_NAME     VARCHAR(200) NOT NULL COMMENT '结束里程点',
  START_LONGITUDE		   DECIMAL(30,20) NOT NULL COMMENT '开始位置经度',
	START_LATITUDE		   DECIMAL(30,20) NOT NULL COMMENT '开始位置纬度',
	END_LONGITUDE		     DECIMAL(30,20) NOT NULL COMMENT '结束位置经度',
	END_LATITUDE		     DECIMAL(30,20) NOT NULL COMMENT '结束位置纬度',
	PREVIOUS_STATION_ID  VARCHAR(200) COMMENT '上一站站点id',
	PREVIOUS_STATION_NAME     VARCHAR(200) COMMENT '上一站站点名称',
	CREATE_TIME          TIMESTAMP NULL COMMENT '创建时间',
  MODIFY_TIME          TIMESTAMP NULL COMMENT '修改时间',
  PRIMARY KEY (ID)
);
ALTER TABLE RAILWAY_LINES COMMENT '铁路线路表';

DROP TABLE IF EXISTS TRAIN_WARNING;
CREATE TABLE TRAIN_WARNING
(
  ID                   CHAR(32) NOT NULL COMMENT 'id',
  WORK_WARNING_ID      VARCHAR(100) NOT NULL COMMENT '警告id',
	NICK                 VARCHAR(200) COMMENT '昵称',
	MOBILE               VARCHAR(11) COMMENT '手机',
	USER_ID              CHAR(32) NOT NULL COMMENT '用户id',
	DIRECTION            CHAR(1) NOT NULL COMMENT '上/下行(0:上行、1:下行)',
  STATUS               VARCHAR(20) NOT NULL COMMENT '状态(CREATE:创建、FINISH:结束)',
  TYPE                 CHAR(2) NOT NULL COMMENT '类型(00:列车临站、01:列车接近)',
  LONGITUDE		         DECIMAL(30,20) NOT NULL COMMENT '警告位置经度',
  LATITUDE		         DECIMAL(30,20) NOT NULL COMMENT '警告位置纬度',
  WORK_SEGMENT_ID      CHAR(32) COMMENT '作业面id',
  WORK_SEGMENT_NAME    VARCHAR(200) COMMENT '作业面名称',
  RAILWAY_LINES_ID     VARCHAR(200) COMMENT '站点id',
  RAILWAY_LINES_NAME   VARCHAR(200) COMMENT '站点名称',
  CREATE_TIME          TIMESTAMP NULL COMMENT '创建时间',
  MODIFY_TIME          TIMESTAMP NULL COMMENT '修改时间',
  PRIMARY KEY (ID)
);
ALTER TABLE TRAIN_WARNING COMMENT '火车警告表';