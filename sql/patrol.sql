/*
 Navicat Premium Data Transfer

 Source Server         : patrol
 Source Server Type    : MySQL
 Source Server Version : 80013
 Source Host           : localhost
 Source Database       : patrol

 Target Server Type    : MySQL
 Target Server Version : 80013
 File Encoding         : utf-8

 Date: 09/20/2019 09:32:10 AM
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `username` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '用户名',
  `password` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '密码',
  `gmt_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_modified` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
--  Records of `user`
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES ('1', 'zhangsan', 'aaa', '2018-10-21 05:50:03', '2018-10-21 05:50:11'), ('2', 'lisi', 'bbb', '2018-10-21 05:50:14', '2018-10-21 05:50:48'), ('3', 'wangwu', 'ccc', '2018-10-21 05:50:15', '2018-10-21 05:50:50'), ('4', 'zhaoliu', 'ddd', '2018-10-21 05:50:17', '2018-10-21 05:50:54'), ('5', 'tianqi', 'eee', '2018-10-21 05:50:18', '2018-10-21 05:50:56'), ('6', 'xiaoming', 'fff', '2018-10-21 05:50:19', '2018-10-21 05:51:07'), ('7', 'erming', 'ggg', '2018-10-21 05:50:21', '2018-10-21 05:51:14'), ('8', 'xiaogang', 'hhh', '2018-10-21 05:50:25', '2018-10-21 05:51:18'), ('9', 'lili', 'kkk', '2018-10-21 05:50:28', '2018-10-21 05:51:23'), ('10', 'nalan', 'lll', '2018-10-21 05:50:37', '2018-10-21 05:51:29'), ('11', 'xiaoya', 'mmm', '2018-10-21 05:50:39', '2018-10-21 05:51:47'), ('12', 'yaer', 'nnn', '2018-10-21 05:50:41', '2018-10-21 05:51:50');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
