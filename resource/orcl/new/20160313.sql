-- Create sequence 临时序列
create sequence ACTIVITY_ID_SEQUENCE
minvalue 100000000
maxvalue 499999999
start with 100000020
increment by 1
cache 20;

-- Create sequence 临时序列
create sequence USER_ID_SEQUENCE
minvalue 1
maxvalue 999999999
start with 500000010
increment by 1
cache 10;

-- Create table 临时活动表
create table FUN_TMP_ACTIVITYS
(
  ACTIVITYID      NUMBER(10) not null,
  ACTIVCREATEDATE DATE,
  ACTIVITYLEADER  VARCHAR2(255 CHAR),
  ACTIVITYTITLE   VARCHAR2(255 CHAR),
  GROUP_ID        NUMBER
)
tablespace MOF
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 16K
    next 8K
    minextents 1
    maxextents unlimited
  );
-- Add comments to the columns 
comment on column FUN_TMP_ACTIVITYS.ACTIVITYID
  is '活动ID';
comment on column FUN_TMP_ACTIVITYS.ACTIVCREATEDATE
  is '活动创建日期';
comment on column FUN_TMP_ACTIVITYS.ACTIVITYLEADER
  is '活动创建者';
comment on column FUN_TMP_ACTIVITYS.ACTIVITYTITLE
  is '活动名称';
comment on column FUN_TMP_ACTIVITYS.GROUP_ID
  is '隶属团队ID';
-- Create/Recreate primary, unique and foreign key constraints 
alter table FUN_TMP_ACTIVITYS
  add primary key (ACTIVITYID)
  using index 
  tablespace MOF
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

  
  -- Create table 临时用户表
create table FUN_TMP_USER
(
  USER_ID         NUMBER(20) not null,
  USER_NAME       VARCHAR2(255 CHAR),
  PASS_WORD       VARCHAR2(255 CHAR),
  EMAIL           VARCHAR2(255 CHAR),
  USER_PHOTOGRAPH VARCHAR2(255 CHAR)
)
tablespace MOF
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 16K
    next 8K
    minextents 1
    maxextents unlimited
  );
-- Add comments to the columns 
comment on column FUN_TMP_USER.USER_ID
  is '用户ID';
comment on column FUN_TMP_USER.USER_NAME
  is '用户名';
comment on column FUN_TMP_USER.PASS_WORD
  is '密码';
comment on column FUN_TMP_USER.EMAIL
  is '邮箱';
comment on column FUN_TMP_USER.USER_PHOTOGRAPH
  is '头像';
-- Create/Recreate primary, unique and foreign key constraints 
alter table FUN_TMP_USER
  add primary key (USER_ID)
  using index 
  tablespace MOF
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

