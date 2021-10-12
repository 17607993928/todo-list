/*
Navicat MySQL Data Transfer

Source Server         : project
Source Server Version : 80015
Source Host           : localhost:3306
Source Database       : todo_list

Target Server Type    : MYSQL
Target Server Version : 80015
File Encoding         : 65001

Date: 2021-10-12 20:08:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for todo_list
-- ----------------------------
DROP TABLE IF EXISTS `todo_list`;
CREATE TABLE `todo_list` (
  `id` bigint(20) NOT NULL,
  `title` varchar(50) NOT NULL COMMENT '标题',
  `done` int(1) NOT NULL COMMENT '是否勾选 0是 1否',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of todo_list
-- ----------------------------
INSERT INTO `todo_list` VALUES ('1447895684098490369', '啊', '0', '2021-10-12 20:03:26', '2021-10-12 20:03:26');
INSERT INTO `todo_list` VALUES ('1447895689530114049', '我', '0', '2021-10-12 20:03:28', '2021-10-12 20:03:28');
INSERT INTO `todo_list` VALUES ('1447895693183352833', '放', '0', '2021-10-12 20:03:29', '2021-10-12 20:03:29');
INSERT INTO `todo_list` VALUES ('1447895698082299906', 'g ', '0', '2021-10-12 20:03:30', '2021-10-12 20:03:30');
INSERT INTO `todo_list` VALUES ('1447895702389850114', 'j', '0', '2021-10-12 20:03:31', '2021-10-12 20:03:31');
INSERT INTO `todo_list` VALUES ('1447895709901848578', '新鲜这vg', '0', '2021-10-12 20:03:33', '2021-10-12 20:03:33');
