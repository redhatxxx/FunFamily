/*
Navicat MySQL Data Transfer

Source Server         : password090312
Source Server Version : 50628
Source Host           : localhost:3306
Source Database       : groupuniondb

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2016-04-18 02:51:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `permission_to_role`
-- ----------------------------
DROP TABLE IF EXISTS `permission_to_role`;
CREATE TABLE `permission_to_role` (
  `role_id` int(8) NOT NULL COMMENT '角色ID',
  `permission_id` int(3) NOT NULL COMMENT '权限ID',
  `summary` varchar(150) DEFAULT NULL COMMENT '备注'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of permission_to_role
-- ----------------------------

-- ----------------------------
-- Table structure for `role_to_user`
-- ----------------------------
DROP TABLE IF EXISTS `role_to_user`;
CREATE TABLE `role_to_user` (
  `user_id` int(20) NOT NULL COMMENT '用户id',
  `role_id` int(8) NOT NULL COMMENT '角色ID',
  `create_date` datetime DEFAULT NULL COMMENT '创建日期',
  `rtou_summary` varchar(255) DEFAULT NULL COMMENT '备注'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_to_user
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
-- Table structure for `sys_users`
-- ----------------------------
DROP TABLE IF EXISTS `sys_users`;
CREATE TABLE `sys_users` (
  `user_id` int(20) NOT NULL AUTO_INCREMENT,
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
) ENGINE=InnoDB AUTO_INCREMENT=500000010 DEFAULT CHARSET=utf8;
