/*
Navicat MySQL Data Transfer

Source Server         : password090312
Source Server Version : 50628
Source Host           : localhost:3306
Source Database       : groupuniondb

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2016-11-17 23:12:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `sys_fun_user`
-- ----------------------------
DROP TABLE IF EXISTS `sys_fun_user`;
CREATE TABLE `sys_fun_user` (
  `user_id` varchar(32) NOT NULL COMMENT '用户唯一ID',
  `user_name` varchar(255) NOT NULL COMMENT '用户名',
  `user_password` varchar(32) NOT NULL COMMENT '用户密码',
  `user_sex` int(1) DEFAULT '1' COMMENT '性别，1为男0为女',
  `user_email` varchar(255) DEFAULT NULL COMMENT '用户邮箱',
  `user_regist_time` datetime DEFAULT NULL COMMENT '注册时间',
  `user_last_login_time` datetime DEFAULT NULL COMMENT '用户最后一次登录时间',
  `sculptrue_path` varchar(255) DEFAULT NULL COMMENT '头像路径',
  `user_repassword` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
