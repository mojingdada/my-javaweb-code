/*
 Navicat MySQL Data Transfer

 Source Server         : ted
 Source Server Type    : MySQL
 Source Server Version : 50718
 Source Host           : localhost
 Source Database       : jkxystudent

 Target Server Type    : MySQL
 Target Server Version : 50718
 File Encoding         : utf-8

 Date: 02/12/2019 12:42:41 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `studentinfo`
-- ----------------------------
DROP TABLE IF EXISTS `studentinfo`;
CREATE TABLE `studentinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nicheng` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `truename` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `xb` bit(1) DEFAULT NULL,
  `csrq` date DEFAULT NULL,
  `zy` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `kc` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `xq` char(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `bz` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Table structure for `usertable`
-- ----------------------------
DROP TABLE IF EXISTS `usertable`;
CREATE TABLE `usertable` (
  `username` char(10) COLLATE utf8_unicode_ci NOT NULL,
  `password` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

SET FOREIGN_KEY_CHECKS = 1;
