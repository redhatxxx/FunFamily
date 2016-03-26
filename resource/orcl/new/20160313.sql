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
  ACTIVITYTITLE   VARCHAR2(255 CHAR)
)
tablespace MOF
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64
    next 1
    minextents 1
    maxextents unlimited
  );
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
  USER_ID   NUMBER(20) not null,
  USER_NAME VARCHAR2(255 CHAR),
  PASS_WORD VARCHAR2(255 CHAR),
  EMAIL     VARCHAR2(255 CHAR)
)
tablespace MOF
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64
    next 8
    minextents 1
    maxextents unlimited
  );
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
