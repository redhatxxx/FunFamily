-- Create sequence 团队ID自增序列
create sequence GROUP_ID_SEQUENCE
minvalue 2000000
maxvalue 4999999
start with 2000021
increment by 1
cache 20;

-- Create table 团队表
create table FUN_GROUP
(
  GROUP_ID             NUMBER not null,
  GROUP_NAME           VARCHAR2(255) not null,
  GROUP_NUMBER         VARCHAR2(40) not null,
  GROUP_CREAT_DATE     DATE,
  GROUP_LEADER_ID      NUMBER(20) not null,
  GROUP_LOGO           VARCHAR2(255),
  GROUP_QQ_NUMBER      VARCHAR2(20),
  GROUP_WEIXIN_NUMBER  VARCHAR2(255),
  GROUP_XINLANG_NUMBER VARCHAR2(255),
  GROUP_TIEBA          VARCHAR2(255),
  GROUP_SUMMARY        VARCHAR2(2555),
  GROUP_HOLD1          VARCHAR2(255),
  GROUP_HOLD2          VARCHAR2(255),
  GROUP_HOLD3          VARCHAR2(255),
  GROUP_HOLD4          VARCHAR2(255),
  GROUP_HOLD5          VARCHAR2(255),
  GROUP_TYPE           VARCHAR2(255)
)
tablespace MOF
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64
    minextents 1
    maxextents unlimited
  );
-- Add comments to the columns 
comment on column FUN_GROUP.GROUP_ID
  is '团队ID';
comment on column FUN_GROUP.GROUP_NAME
  is '团队名称';
comment on column FUN_GROUP.GROUP_NUMBER
  is '团队序号';
comment on column FUN_GROUP.GROUP_CREAT_DATE
  is '创建日期';
comment on column FUN_GROUP.GROUP_LEADER_ID
  is '团队领导者';
comment on column FUN_GROUP.GROUP_LOGO
  is '团队logo存储路径';
comment on column FUN_GROUP.GROUP_QQ_NUMBER
  is '团队qq号码';
comment on column FUN_GROUP.GROUP_WEIXIN_NUMBER
  is '团队微信账号';
comment on column FUN_GROUP.GROUP_XINLANG_NUMBER
  is '团队新浪微博账号';
comment on column FUN_GROUP.GROUP_TIEBA
  is '团队贴吧账号';
comment on column FUN_GROUP.GROUP_SUMMARY
  is '团队简介';
comment on column FUN_GROUP.GROUP_HOLD1
  is '备用字段';
comment on column FUN_GROUP.GROUP_HOLD2
  is '备用字段';
comment on column FUN_GROUP.GROUP_HOLD3
  is '备用字段';
comment on column FUN_GROUP.GROUP_HOLD4
  is '备用字段';
comment on column FUN_GROUP.GROUP_HOLD5
  is '备用字段';
comment on column FUN_GROUP.GROUP_TYPE
  is '团队类型';
-- Create/Recreate primary, unique and foreign key constraints 
alter table FUN_GROUP
  add constraint GROUP_ID primary key (GROUP_ID)
  using index 
  tablespace MOF
  pctfree 10
  initrans 2
  maxtrans 255;

  -- Create table 团队临时表
create table FUN_TMP_GROUP
(
  GROUP_TMP_ID         NUMBER not null,
  GROUP_NAME           VARCHAR2(255) not null,
  GROUP_NUMBER         VARCHAR2(40) not null,
  GROUP_CREAT_DATE     DATE,
  GROUP_LEADER_ID      NUMBER(20) not null,
  GROUP_LOGO           VARCHAR2(255),
  GROUP_QQ_NUMBER      VARCHAR2(20),
  GROUP_WEIXIN_NUMBER  VARCHAR2(255),
  GROUP_XINLANG_NUMBER VARCHAR2(255),
  GROUP_TIEBA          VARCHAR2(255),
  GROUP_SUMMARY        VARCHAR2(2555),
  GROUP_HOLD1          VARCHAR2(255),
  GROUP_HOLD2          VARCHAR2(255),
  GROUP_HOLD3          VARCHAR2(255),
  GROUP_HOLD4          VARCHAR2(255),
  GROUP_HOLD5          VARCHAR2(255),
  GROUP_TYPE           VARCHAR2(255)
)
tablespace MOF
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 16
    next 1
    minextents 1
    maxextents unlimited
  );
-- Add comments to the columns 
comment on column FUN_TMP_GROUP.GROUP_TMP_ID
  is '团队ID';
comment on column FUN_TMP_GROUP.GROUP_NAME
  is '团队名称';
comment on column FUN_TMP_GROUP.GROUP_NUMBER
  is '团队序号';
comment on column FUN_TMP_GROUP.GROUP_CREAT_DATE
  is '创建日期';
comment on column FUN_TMP_GROUP.GROUP_LEADER_ID
  is '团队领导者';
comment on column FUN_TMP_GROUP.GROUP_LOGO
  is '团队logo存储路径';
comment on column FUN_TMP_GROUP.GROUP_QQ_NUMBER
  is '团队qq号码';
comment on column FUN_TMP_GROUP.GROUP_WEIXIN_NUMBER
  is '团队微信账号';
comment on column FUN_TMP_GROUP.GROUP_XINLANG_NUMBER
  is '团队新浪微博账号';
comment on column FUN_TMP_GROUP.GROUP_TIEBA
  is '团队贴吧账号';
comment on column FUN_TMP_GROUP.GROUP_SUMMARY
  is '团队简介';
comment on column FUN_TMP_GROUP.GROUP_HOLD1
  is '备用字段';
comment on column FUN_TMP_GROUP.GROUP_HOLD2
  is '备用字段';
comment on column FUN_TMP_GROUP.GROUP_HOLD3
  is '备用字段';
comment on column FUN_TMP_GROUP.GROUP_HOLD4
  is '备用字段';
comment on column FUN_TMP_GROUP.GROUP_HOLD5
  is '备用字段';
comment on column FUN_TMP_GROUP.GROUP_TYPE
  is '团队类型';
-- Create/Recreate primary, unique and foreign key constraints 
alter table FUN_TMP_GROUP
  add constraint GROUP_TMP_ID primary key (GROUP_TMP_ID)
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

