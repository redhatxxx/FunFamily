-- Create sequence 临时领队卡序列
create sequence LEADER_ID_SEQUENCE
minvalue 99999999
maxvalue 499999999
start with 100000000
increment by 1
cache 20;

-- Create table 领队卡表
create table FUN_LEADER_CARD
(
  CARD_ID    NUMBER(10) not null,
  CARD_NO    VARCHAR2(255 CHAR),
  CREATEDATE DATE,
  USER_ID    NUMBER(10)
)
tablespace MOF
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 8K
    minextents 1
    maxextents unlimited
  );
-- Add comments to the columns 
comment on column FUN_LEADER_CARD.CARD_ID
  is '领队卡ID';
comment on column FUN_LEADER_CARD.CARD_NO
  is '领队卡卡号';
comment on column FUN_LEADER_CARD.CREATEDATE
  is '创建日期';
comment on column FUN_LEADER_CARD.USER_ID
  is '关联用户ID';
-- Create/Recreate primary, unique and foreign key constraints 
alter table FUN_LEADER_CARD
  add primary key (CARD_ID)
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
