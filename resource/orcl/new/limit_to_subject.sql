/*
Navicat MySQL Data Transfer

Source Server         : password090312
Source Server Version : 50628
Source Host           : localhost:3306
Source Database       : groupuniondb

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2016-05-11 22:54:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `limit_to_subject`
-- ----------------------------
DROP TABLE IF EXISTS `limit_to_subject`;
CREATE TABLE `limit_to_subject` (
  `subject_id` int(12) NOT NULL DEFAULT '0',
  `limit_code` varchar(4) DEFAULT NULL,
  `limit_summary` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`subject_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='主题报名限制条件关联表';

-- ----------------------------
-- Records of limit_to_subject
-- ----------------------------

-- ----------------------------
-- Table structure for `permission_to_role`
-- ----------------------------
DROP TABLE IF EXISTS `permission_to_role`;
CREATE TABLE `permission_to_role` (
  `role_id` int(8) NOT NULL COMMENT '角色ID',
  `permission_id` int(3) NOT NULL COMMENT '权限ID',
  `summary` varchar(150) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of permission_to_role
-- ----------------------------

-- ----------------------------
-- Table structure for `role_to_user`
-- ----------------------------
DROP TABLE IF EXISTS `role_to_user`;
CREATE TABLE `role_to_user` (
  `user_id` int(12) NOT NULL COMMENT '用户id',
  `role_id` int(8) NOT NULL COMMENT '角色ID',
  `create_date` datetime DEFAULT NULL COMMENT '创建日期',
  `rtou_summary` varchar(122) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_to_user
-- ----------------------------

-- ----------------------------
-- Table structure for `subject_follow_item`
-- ----------------------------
DROP TABLE IF EXISTS `subject_follow_item`;
CREATE TABLE `subject_follow_item` (
  `subject_fellow_item_id` varchar(16) NOT NULL DEFAULT '' COMMENT '主题回复项ID，主题Id+四位序号，序号通过主题回复统计获取',
  `subject_id` int(12) DEFAULT NULL COMMENT '回复的主题ID',
  `subject_follow_user_id` int(12) DEFAULT NULL COMMENT '回复用户ID',
  `subject_follow_browse` int(1) DEFAULT NULL COMMENT '回复性质，1为回复内容0为预览',
  `subject_follow_item_number` int(4) DEFAULT NULL COMMENT '回复序号',
  `subject_follow_item_text` text COMMENT '回复内容',
  `subject_follow_item_date` date DEFAULT NULL COMMENT '回复日期',
  `subject_follow_item_like_hits` int(4) DEFAULT NULL COMMENT 'like',
  `subject_follow_item_hate_hits` int(4) DEFAULT NULL COMMENT 'unlike',
  `subject_follow_item_quote_item_id` varchar(16) DEFAULT NULL COMMENT '引用回复ID',
  PRIMARY KEY (`subject_fellow_item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='跟帖回复或浏览记录';

-- ----------------------------
-- Records of subject_follow_item
-- ----------------------------

-- ----------------------------
-- Table structure for `user_join_subject`
-- ----------------------------
DROP TABLE IF EXISTS `user_join_subject`;
CREATE TABLE `user_join_subject` (
  `join_user_id` int(12) NOT NULL DEFAULT '0' COMMENT '报名用户ID',
  `subject_id` int(12) DEFAULT NULL,
  `join_time` date DEFAULT NULL COMMENT '报名时间',
  `join_with_plugins` int(1) DEFAULT NULL COMMENT '是否有外挂，1有0无',
  `join_user_address` varchar(120) DEFAULT NULL COMMENT '用户地址',
  `emergency_connect_person` varchar(30) DEFAULT NULL COMMENT '紧急联系人',
  `emergency_connect_phone` int(11) DEFAULT NULL COMMENT '紧急人联系电话',
  `join_with_gear` int(1) DEFAULT NULL COMMENT '是否有装备，1有0无',
  `join_subject_summary` varchar(100) DEFAULT NULL COMMENT '报名备注',
  PRIMARY KEY (`join_user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='报名详细信息';

-- ----------------------------
-- Records of user_join_subject
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_element_status`
-- ----------------------------
DROP TABLE IF EXISTS `sys_element_status`;
CREATE TABLE `sys_element_status` (
  `status_id` int(4) NOT NULL DEFAULT '0',
  `status_code` varchar(4) DEFAULT NULL,
  `status_name` varchar(20) DEFAULT NULL,
  `status_summary` varchar(50) DEFAULT NULL COMMENT '状态表，用户团队活动等的状态枚举',
  PRIMARY KEY (`status_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of sys_element_status
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_group`
-- ----------------------------
DROP TABLE IF EXISTS `sys_group`;
CREATE TABLE `sys_group` (
  `group_id` int(12) NOT NULL DEFAULT '0' COMMENT '团队Id',
  `group_name` varchar(30) DEFAULT NULL COMMENT '团队名称',
  `group_number` int(11) DEFAULT NULL COMMENT '团队编号',
  `group_logo` varchar(100) DEFAULT NULL COMMENT '团队logo，存储路径',
  `group_type_id` int(4) DEFAULT NULL COMMENT '团队类型Id',
  `group_leader_id` int(11) DEFAULT NULL COMMENT '领队Id',
  `group_create_time` date DEFAULT NULL COMMENT '创建时间',
  `group_activity_count` int(11) DEFAULT NULL COMMENT '活动统计',
  `group_status_code` varchar(4) DEFAULT NULL COMMENT '团队状态',
  `group_is_commercial` int(1) DEFAULT NULL COMMENT '是否商业化',
  `group_summary` varchar(255) DEFAULT NULL COMMENT '简介',
  `group_qq` int(15) DEFAULT NULL COMMENT '腾讯QQ群',
  `group_wechat` varchar(30) DEFAULT NULL COMMENT '微信',
  `group_tieba_count` varchar(30) DEFAULT NULL COMMENT '贴吧',
  `group_weibo_count` varchar(30) DEFAULT NULL COMMENT '微博账号',
  PRIMARY KEY (`group_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='团队表，记录团队基本信息';

-- ----------------------------
-- Records of sys_group
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_group_industry`
-- ----------------------------
DROP TABLE IF EXISTS `sys_group_industry`;
CREATE TABLE `sys_group_industry` (
  `group_industry_id` int(4) NOT NULL DEFAULT '0' COMMENT '领域ID',
  `group_industry_code` varchar(4) DEFAULT NULL COMMENT '领域编码',
  `group_industry_name` varchar(50) DEFAULT NULL COMMENT '领域名称',
  `group_industry_summary` varchar(100) DEFAULT NULL COMMENT '领域摘要',
  PRIMARY KEY (`group_industry_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='团队类型所属领域';

-- ----------------------------
-- Records of sys_group_industry
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_group_type`
-- ----------------------------
DROP TABLE IF EXISTS `sys_group_type`;
CREATE TABLE `sys_group_type` (
  `group_type_id` int(4) NOT NULL DEFAULT '0' COMMENT '团队类型ID',
  `group_type_code` varchar(9) DEFAULT NULL COMMENT '团队类型编号',
  `group_type_name` varchar(50) DEFAULT NULL COMMENT '团队类型名称',
  `group_type_summary` varchar(100) DEFAULT NULL COMMENT '摘要',
  `group_type_industry_id` int(4) DEFAULT NULL COMMENT '所属领域 编码',
  PRIMARY KEY (`group_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='团队类型，区分每个团队的性质';

-- ----------------------------
-- Records of sys_group_type
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_leader_card`
-- ----------------------------
DROP TABLE IF EXISTS `sys_leader_card`;
CREATE TABLE `sys_leader_card` (
  `leader_card_id` int(12) NOT NULL,
  `leader_card_code` varchar(12) DEFAULT NULL,
  `leader_user_id` int(12) DEFAULT NULL,
  `leader_group_id` int(12) DEFAULT NULL,
  `leader_card_create_time` date DEFAULT NULL,
  `leader_card_status` int(4) DEFAULT NULL,
  PRIMARY KEY (`leader_card_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_leader_card
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_permission`
-- ----------------------------
DROP TABLE IF EXISTS `sys_permission`;
CREATE TABLE `sys_permission` (
  `permission_id` int(3) NOT NULL COMMENT '权限Id',
  `permission_name` varchar(255) NOT NULL COMMENT '权限名称',
  `permission_summary` varchar(255) DEFAULT NULL COMMENT '权限描述',
  PRIMARY KEY (`permission_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_permission
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_role`
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `role_id` int(8) NOT NULL COMMENT '角色Id',
  `role_name` varchar(50) DEFAULT NULL COMMENT '角色名称',
  `role_parent_id` int(8) DEFAULT NULL COMMENT '父角色ID',
  `role_summary` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_subject`
-- ----------------------------
DROP TABLE IF EXISTS `sys_subject`;
CREATE TABLE `sys_subject` (
  `subject_id` int(12) NOT NULL,
  `subject_number` varchar(12) DEFAULT NULL,
  `subject_title` varchar(50) DEFAULT NULL,
  `subject_type_id` int(4) DEFAULT NULL COMMENT '主题类型大项（活动帖，灌水，游记）',
  `subject_owner_id` int(12) DEFAULT NULL,
  `subject_create_time` date DEFAULT NULL,
  `subject_detype_id` int(4) DEFAULT NULL COMMENT '主题类型小项（活动帖下有周末，非周末，灌水有聊天，求助等）大项小项均在同一张表',
  `subject_main_text` text,
  `subject_status_id` int(4) DEFAULT NULL,
  `subject_last_browser_time` date DEFAULT NULL,
  `subject_like_hits` int(4) DEFAULT NULL,
  `subject_files` varchar(120) DEFAULT NULL,
  `subject_group_id` int(12) DEFAULT NULL,
  `subject_tags` varchar(30) DEFAULT NULL,
  `subject_addtional_base` int(4) DEFAULT NULL,
  `subject_addtional_text` int(4) DEFAULT NULL,
  `subject_is_snap` int(1) DEFAULT NULL,
  `subject_activ_start_time` date DEFAULT NULL,
  `subject_activ_end_time` date DEFAULT NULL,
  `subject_activ_memeber_limit` int(4) DEFAULT NULL,
  `subject_activ_join_count` int(4) DEFAULT NULL,
  `subject_activ_trip_way` int(8) DEFAULT NULL,
  `subject_intensity` int(4) DEFAULT NULL,
  `subject_cost` decimal(8,2) DEFAULT NULL,
  `subject_activ_gather_location` varchar(150) DEFAULT NULL,
  `subject_activ_gather_time` date DEFAULT NULL,
  `subject_follow_count` int(4) DEFAULT NULL,
  PRIMARY KEY (`subject_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_subject
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_subject_limit`
-- ----------------------------
DROP TABLE IF EXISTS `sys_subject_limit`;
CREATE TABLE `sys_subject_limit` (
  `limit_id` int(4) NOT NULL DEFAULT '0',
  `limit_code` varchar(4) DEFAULT NULL,
  `limit_name` varchar(20) DEFAULT NULL,
  `limit_summary` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`limit_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='限制信息表，报名限制条件';

-- ----------------------------
-- Records of sys_subject_limit
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_subject_plugins`
-- ----------------------------
DROP TABLE IF EXISTS `sys_subject_plugins`;
CREATE TABLE `sys_subject_plugins` (
  `join_user_id` int(11) NOT NULL DEFAULT '0' COMMENT '报名用户Id',
  `subject_id` int(11) DEFAULT NULL,
  `plugin_name` varchar(20) DEFAULT NULL COMMENT '外挂姓名',
  `plugin_connect_phone` int(11) DEFAULT NULL COMMENT '外挂联系电话',
  `plugin_summary` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`join_user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='外挂人员表';

-- ----------------------------
-- Records of sys_subject_plugins
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_subject_type`
-- ----------------------------
DROP TABLE IF EXISTS `sys_subject_type`;
CREATE TABLE `sys_subject_type` (
  `subject_type_id` int(4) NOT NULL DEFAULT '0' COMMENT '主题类型id',
  `subject_type_code` int(4) DEFAULT NULL COMMENT '主题类型编码',
  `subject_type_name` varchar(20) DEFAULT NULL COMMENT '主题类型名称',
  `subject_type_summary` varchar(50) DEFAULT NULL COMMENT '主题类型备注',
  PRIMARY KEY (`subject_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='主题类型';

-- ----------------------------
-- Records of sys_subject_type
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_users`
-- ----------------------------
DROP TABLE IF EXISTS `sys_users`;
CREATE TABLE `sys_users` (
  `user_id` int(12) NOT NULL AUTO_INCREMENT,
  `user_email` varchar(255) DEFAULT NULL COMMENT '用户注册邮箱',
  `user_phone` varchar(11) DEFAULT NULL COMMENT '用户注册手机号',
  `user_nickname` varchar(255) DEFAULT NULL COMMENT '用户昵称',
  `user_sex` int(1) DEFAULT NULL COMMENT '用户性别',
  `user_password` varchar(255) DEFAULT NULL COMMENT '密码',
  `user_photo_path` varchar(255) DEFAULT NULL COMMENT '用户头像地址',
  `user_create_date` datetime DEFAULT NULL COMMENT '用户创建日期',
  `user_qq_number` varchar(20) DEFAULT NULL COMMENT '用户qq号码',
  `user_real_name` varchar(255) DEFAULT NULL COMMENT '用户真实姓名',
  `user_weixin_account` varchar(255) DEFAULT NULL COMMENT '用户微信账号',
  `user_identity_number` varchar(30) DEFAULT NULL COMMENT '用户身份证号',
  `user_last_login` datetime DEFAULT NULL COMMENT '上次登录时间',
  `user_login_count` int(11) DEFAULT NULL COMMENT '登录累计次数',
  `user_status_code` int(4) DEFAULT NULL COMMENT '用户状态',
  `user_hold1` varchar(20) DEFAULT NULL COMMENT '保留字段',
  `user_hold2` varchar(20) DEFAULT NULL COMMENT '保留字段',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12345682 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_users
-- ----------------------------
INSERT INTO `sys_users` VALUES ('12345678', null, null, 'redhat5', '0', 'U5F', null, null, null, null, null, null, null, '0', '0', null, null);
INSERT INTO `sys_users` VALUES ('12345679', null, null, 'redhat5', '0', 'U5F', null, null, null, null, null, null, null, '0', '0', null, null);
INSERT INTO `sys_users` VALUES ('12345680', null, null, 'redhat5', '0', 'U5F', null, null, null, null, null, null, null, '0', '0', null, null);
INSERT INTO `sys_users` VALUES ('12345681', null, null, 'redhat5', '0', 'U5F', null, '2016-05-08 15:59:46', null, null, null, null, null, '0', '0', null, null);

-- ----------------------------
-- Table structure for `user_to_group`
-- ----------------------------
DROP TABLE IF EXISTS `user_to_group`;
CREATE TABLE `user_to_group` (
  `user_id` int(12) DEFAULT NULL,
  `group_id` int(12) DEFAULT NULL,
  `group_role_id` int(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_to_group
-- ----------------------------
