/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50711
Source Host           : localhost:3306
Source Database       : blog

Target Server Type    : MYSQL
Target Server Version : 50711
File Encoding         : 65001

Date: 2016-08-08 19:05:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for article
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `article_id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(64) DEFAULT NULL,
  `desc` varchar(128) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_time` datetime DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `click_count` int(11) DEFAULT '0',
  `article_category_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`article_id`),
  KEY `FKkpi7de60p3npqbdh8yi0taf7x` (`user_id`),
  CONSTRAINT `FKkpi7de60p3npqbdh8yi0taf7x` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of article
-- ----------------------------
INSERT INTO `article` VALUES ('1', 'a', null, 'aaaaaaaaaa', '2016-07-28 19:20:23', null, '1', '0', null);
INSERT INTO `article` VALUES ('7', 's', null, '<p>s</p>', null, null, null, '0', null);
INSERT INTO `article` VALUES ('10', 'q', null, 'Hello Summernote', null, null, null, '0', null);
INSERT INTO `article` VALUES ('12', 'cat', null, '<p style=\"text-align: center; \"><img src=\"upload/1470654185462.jpg\" style=\"width: 50%;\"></p><p><br></p>', null, null, null, '0', null);

-- ----------------------------
-- Table structure for article_category
-- ----------------------------
DROP TABLE IF EXISTS `article_category`;
CREATE TABLE `article_category` (
  `article_category_id` int(11) NOT NULL AUTO_INCREMENT,
  `article_category_name` varchar(32) DEFAULT NULL,
  `remark` varchar(128) DEFAULT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`article_category_id`),
  KEY `FKbufowlkpfrce0jxjbpoa3gvc4` (`user_id`),
  CONSTRAINT `FKbufowlkpfrce0jxjbpoa3gvc4` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of article_category
-- ----------------------------

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `comment_id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(255) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `article_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`comment_id`),
  KEY `FKt8868quske2jw98t2nw4ddig0` (`article_id`),
  CONSTRAINT `FKt8868quske2jw98t2nw4ddig0` FOREIGN KEY (`article_id`) REFERENCES `article` (`article_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comment
-- ----------------------------

-- ----------------------------
-- Table structure for hibernate_sequence
-- ----------------------------
DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hibernate_sequence
-- ----------------------------
INSERT INTO `hibernate_sequence` VALUES ('13');
INSERT INTO `hibernate_sequence` VALUES ('13');
INSERT INTO `hibernate_sequence` VALUES ('13');
INSERT INTO `hibernate_sequence` VALUES ('13');
INSERT INTO `hibernate_sequence` VALUES ('13');
INSERT INTO `hibernate_sequence` VALUES ('13');

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `person_id` int(11) NOT NULL AUTO_INCREMENT,
  `person_name` varchar(255) DEFAULT NULL,
  `age` int(11) NOT NULL,
  `birthdate` datetime DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `blog_title` varchar(32) DEFAULT NULL,
  `blog_subtitle` varchar(255) DEFAULT NULL,
  `about` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`person_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES ('1', null, '18', null, null, '官方', '小博', null, null);

-- ----------------------------
-- Table structure for tag
-- ----------------------------
DROP TABLE IF EXISTS `tag`;
CREATE TABLE `tag` (
  `tag_id` int(11) NOT NULL AUTO_INCREMENT,
  `tag_name` varchar(255) DEFAULT NULL,
  `article_id` int(11) NOT NULL,
  PRIMARY KEY (`tag_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tag
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(32) DEFAULT NULL,
  `password` varchar(32) DEFAULT NULL,
  `email` varchar(32) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `person_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  KEY `FKtjydbpktvifo7uc55n1fm2wet` (`person_id`),
  CONSTRAINT `FKtjydbpktvifo7uc55n1fm2wet` FOREIGN KEY (`person_id`) REFERENCES `person` (`person_id`),
  CONSTRAINT `user_ibfk_1` FOREIGN KEY (`person_id`) REFERENCES `person` (`person_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'demo', 'a', 'a', 'a', '1');
