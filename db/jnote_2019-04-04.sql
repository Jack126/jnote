# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.7.21)
# Database: jnote
# Generation Time: 2019-04-04 02:26:08 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table jnote_admin
# ------------------------------------------------------------

DROP TABLE IF EXISTS `jnote_admin`;

CREATE TABLE `jnote_admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `member_id` int(11) DEFAULT NULL COMMENT '用户id',
  `department_id` int(11) DEFAULT NULL COMMENT '部门id',
  `role_id` int(11) DEFAULT NULL COMMENT '角色id',
  `status` tinyint(1) DEFAULT NULL COMMENT '状态 1正常 0禁用 2删除',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

LOCK TABLES `jnote_admin` WRITE;
/*!40000 ALTER TABLE `jnote_admin` DISABLE KEYS */;

INSERT INTO `jnote_admin` (`id`, `member_id`, `department_id`, `role_id`, `status`)
VALUES
	(1,1,1,1,1);

/*!40000 ALTER TABLE `jnote_admin` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table jnote_blog
# ------------------------------------------------------------

DROP TABLE IF EXISTS `jnote_blog`;

CREATE TABLE `jnote_blog` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) NOT NULL DEFAULT '' COMMENT '标题',
  `image` varchar(255) DEFAULT '' COMMENT '缩略图',
  `description` varchar(255) DEFAULT '' COMMENT '描述',
  `blog_category_id` char(20) NOT NULL DEFAULT '' COMMENT '话题分类id(多个id,分割)',
  `tag_id` char(20) DEFAULT '' COMMENT '标签tag id，多个id用英文逗号分割',
  `createdby_id` int(11) DEFAULT NULL COMMENT '创建人',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `status` tinyint(3) unsigned DEFAULT '0' COMMENT '0 禁用 1正常 2删除',
  PRIMARY KEY (`id`),
  KEY `title` (`title`),
  KEY `blog_category_id` (`blog_category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# Dump of table jnote_blog_blogcategoryid_relation
# ------------------------------------------------------------

DROP TABLE IF EXISTS `jnote_blog_blogcategoryid_relation`;

CREATE TABLE `jnote_blog_blogcategoryid_relation` (
  `blog_id` int(11) DEFAULT NULL COMMENT 'blog id',
  `blog_category_id` int(10) DEFAULT NULL COMMENT 'blog category id',
  KEY `blog_id` (`blog_id`) USING BTREE,
  KEY `blog_category_id` (`blog_category_id`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8;



# Dump of table jnote_blog_category
# ------------------------------------------------------------

DROP TABLE IF EXISTS `jnote_blog_category`;

CREATE TABLE `jnote_blog_category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL DEFAULT '' COMMENT '名称',
  `name_en` varchar(100) DEFAULT '' COMMENT '英文名',
  `image` varchar(255) DEFAULT '' COMMENT '缩略图',
  `description` varchar(255) DEFAULT '' COMMENT '描述',
  `department_id` int(11) DEFAULT '0' COMMENT '部门id',
  `createdby_id` int(11) DEFAULT '0' COMMENT '创建人id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `status` tinyint(3) unsigned DEFAULT '0' COMMENT '0 禁用 1正常 2删除',
  PRIMARY KEY (`id`),
  KEY `name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# Dump of table jnote_blog_comment
# ------------------------------------------------------------

DROP TABLE IF EXISTS `jnote_blog_comment`;

CREATE TABLE `jnote_blog_comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `blog_id` int(11) NOT NULL DEFAULT '0' COMMENT 'blog id',
  `parent_comment_id` int(11) DEFAULT '0' COMMENT '父级回复id',
  `at_comment_id` int(11) DEFAULT '0' COMMENT '回复内容id',
  `content` mediumtext COMMENT '内容',
  `member_id` int(11) NOT NULL DEFAULT '0' COMMENT '用户id',
  `at_member_id` int(11) DEFAULT '0' COMMENT '回复用户id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `status` tinyint(3) unsigned DEFAULT '0' COMMENT '0 禁用 1正常 2删除',
  PRIMARY KEY (`id`),
  KEY `blog_id` (`blog_id`),
  KEY `parent_comment_id` (`parent_comment_id`),
  KEY `member_id` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# Dump of table jnote_blog_content
# ------------------------------------------------------------

DROP TABLE IF EXISTS `jnote_blog_content`;

CREATE TABLE `jnote_blog_content` (
  `blog_id` int(11) NOT NULL COMMENT 'blog id',
  `content` mediumtext COMMENT '内容',
  PRIMARY KEY (`blog_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;



# Dump of table jnote_blog_like
# ------------------------------------------------------------

DROP TABLE IF EXISTS `jnote_blog_like`;

CREATE TABLE `jnote_blog_like` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `blog_id` int(11) NOT NULL DEFAULT '0' COMMENT '话题id',
  `member_id` int(11) NOT NULL DEFAULT '0' COMMENT '用户id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `status` tinyint(3) unsigned DEFAULT '0' COMMENT '0 禁用 1正常 2删除',
  PRIMARY KEY (`id`),
  UNIQUE KEY `blog_member_id` (`blog_id`,`member_id`),
  KEY `blog_id` (`blog_id`),
  KEY `member_id` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# Dump of table jnote_blog_viewcount
# ------------------------------------------------------------

DROP TABLE IF EXISTS `jnote_blog_viewcount`;

CREATE TABLE `jnote_blog_viewcount` (
  `blog_id` int(11) NOT NULL DEFAULT '0' COMMENT '话题id',
  `viewcount` int(11) NOT NULL DEFAULT '0' COMMENT '浏览数',
  PRIMARY KEY (`blog_id`),
  UNIQUE KEY `blog_id` (`blog_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `jnote_blog_viewcount` WRITE;
/*!40000 ALTER TABLE `jnote_blog_viewcount` DISABLE KEYS */;

INSERT INTO `jnote_blog_viewcount` (`blog_id`, `viewcount`)
VALUES
	(1,20090);

/*!40000 ALTER TABLE `jnote_blog_viewcount` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table jnote_department
# ------------------------------------------------------------

DROP TABLE IF EXISTS `jnote_department`;

CREATE TABLE `jnote_department` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL DEFAULT '' COMMENT '部门名称',
  `createdby_id` int(10) DEFAULT '0' COMMENT '创建人id',
  `updatedby_id` int(10) DEFAULT '0' COMMENT '更新人id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `status` tinyint(3) unsigned DEFAULT '0' COMMENT '0 禁用 1正常 2删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# Dump of table jnote_department_module_relation
# ------------------------------------------------------------

DROP TABLE IF EXISTS `jnote_department_module_relation`;

CREATE TABLE `jnote_department_module_relation` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `department_id` int(11) NOT NULL DEFAULT '0' COMMENT '部门id',
  `module_id` int(11) NOT NULL DEFAULT '0' COMMENT '模块id',
  `order` int(11) NOT NULL DEFAULT '0' COMMENT '排序',
  `position` tinyint(1) DEFAULT '0' COMMENT '1 左上角 2左侧栏',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `status` tinyint(3) unsigned DEFAULT '0' COMMENT '0 禁用 1正常 2删除',
  PRIMARY KEY (`id`),
  KEY `department_id` (`department_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# Dump of table jnote_job
# ------------------------------------------------------------

DROP TABLE IF EXISTS `jnote_job`;

CREATE TABLE `jnote_job` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL DEFAULT '' COMMENT '岗位名称',
  `department_id` int(11) NOT NULL DEFAULT '0' COMMENT '部门id',
  `createdby_id` int(11) DEFAULT '0' COMMENT '创建人id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `status` tinyint(3) unsigned DEFAULT '0' COMMENT '0 禁用 1正常 2删除',
  PRIMARY KEY (`id`),
  KEY `department_id` (`department_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# Dump of table jnote_login
# ------------------------------------------------------------

DROP TABLE IF EXISTS `jnote_login`;

CREATE TABLE `jnote_login` (
  `id` int(11) NOT NULL,
  `member_id` int(11) DEFAULT NULL,
  `login_times` int(11) DEFAULT NULL COMMENT '登陆次数',
  `last_login_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后登录时间',
  PRIMARY KEY (`id`),
  KEY `member_id` (`member_id`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8;



# Dump of table jnote_login_error_log
# ------------------------------------------------------------

DROP TABLE IF EXISTS `jnote_login_error_log`;

CREATE TABLE `jnote_login_error_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `member_id` int(11) DEFAULT NULL,
  `ip` int(10) DEFAULT NULL COMMENT 'ip',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `member_id` (`member_id`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8;



# Dump of table jnote_module
# ------------------------------------------------------------

DROP TABLE IF EXISTS `jnote_module`;

CREATE TABLE `jnote_module` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT '' COMMENT '名称',
  `alias` varchar(100) DEFAULT '' COMMENT '别名',
  `url` varchar(150) DEFAULT '' COMMENT 'url',
  `position` tinyint(1) DEFAULT '0' COMMENT '1 右上角 2左侧栏',
  `version` char(10) DEFAULT '' COMMENT '版本号',
  `is_admin` tinyint(1) DEFAULT '0' COMMENT '是否管理员可见 1是 0否',
  `is_default` tinyint(1) DEFAULT '0' COMMENT '是否默认 1是 0否',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `status` tinyint(3) unsigned DEFAULT '0' COMMENT '0 禁用 1正常 2删除',
  PRIMARY KEY (`id`),
  KEY `alias` (`alias`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# Dump of table jnote_product
# ------------------------------------------------------------

DROP TABLE IF EXISTS `jnote_product`;

CREATE TABLE `jnote_product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT '' COMMENT '名称',
  `description` varchar(255) DEFAULT '' COMMENT '简介',
  `url` varchar(150) DEFAULT '' COMMENT 'url',
  `image` varchar(200) DEFAULT '' COMMENT '图片',
  `department_id` int(11) DEFAULT '0' COMMENT '部门id',
  `createdby_id` int(11) NOT NULL DEFAULT '0' COMMENT '创建人id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `status` tinyint(3) unsigned DEFAULT '0' COMMENT '0 禁用 1正常 2删除',
  PRIMARY KEY (`id`),
  KEY `name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# Dump of table jnote_product_doc
# ------------------------------------------------------------

DROP TABLE IF EXISTS `jnote_product_doc`;

CREATE TABLE `jnote_product_doc` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) DEFAULT NULL COMMENT '文档名称',
  `description` varchar(255) DEFAULT NULL COMMENT '简介',
  `image` varchar(255) DEFAULT NULL COMMENT '图片',
  `product_id` int(10) NOT NULL DEFAULT '0' COMMENT '产品id',
  `department_id` int(10) DEFAULT '0' COMMENT '部门id',
  `createdby_id` int(10) DEFAULT NULL COMMENT '创建人id',
  `updatedby_id` int(10) DEFAULT NULL COMMENT '更新人id',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `status` tinyint(3) DEFAULT '0' COMMENT '0 禁用 1正常 2删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# Dump of table jnote_product_doc_content
# ------------------------------------------------------------

DROP TABLE IF EXISTS `jnote_product_doc_content`;

CREATE TABLE `jnote_product_doc_content` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `product_doc_id` int(10) DEFAULT NULL COMMENT '产品文档id',
  `version` char(10) DEFAULT NULL COMMENT '版本号',
  `content` mediumtext COMMENT '内容',
  `updatedby_id` int(10) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  KEY `product_doc_id` (`product_doc_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# Dump of table jnote_role
# ------------------------------------------------------------

DROP TABLE IF EXISTS `jnote_role`;

CREATE TABLE `jnote_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `jnote_role` WRITE;
/*!40000 ALTER TABLE `jnote_role` DISABLE KEYS */;

INSERT INTO `jnote_role` (`id`, `name`)
VALUES
	(1,'超级管理员');

/*!40000 ALTER TABLE `jnote_role` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table jnote_role_user
# ------------------------------------------------------------

DROP TABLE IF EXISTS `jnote_role_user`;

CREATE TABLE `jnote_role_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) DEFAULT '2',
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `rid` (`role_id`),
  KEY `roles_user_ibfk_2` (`user_id`),
  CONSTRAINT `roles_member_ibfk_1` FOREIGN KEY (`role_id`) REFERENCES `jnote_role` (`id`),
  CONSTRAINT `roles_member_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `jnote_user` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# Dump of table jnote_user
# ------------------------------------------------------------

DROP TABLE IF EXISTS `jnote_user`;

CREATE TABLE `jnote_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) NOT NULL DEFAULT '' COMMENT '姓名',
  `nickname` varchar(100) DEFAULT '' COMMENT '昵称',
  `name_en` varchar(100) DEFAULT '' COMMENT '英文名',
  `photo` varchar(255) DEFAULT '' COMMENT '头像',
  `password` varchar(150) NOT NULL DEFAULT '' COMMENT '密码',
  `department_id` int(11) NOT NULL DEFAULT '0' COMMENT '部门id',
  `job_id` int(11) NOT NULL DEFAULT '0' COMMENT '岗位id',
  `sex` tinyint(3) unsigned DEFAULT '0' COMMENT '0 保密 1 男 2 女',
  `phone` char(12) DEFAULT '' COMMENT '手机号',
  `weixin` char(50) DEFAULT '' COMMENT '微信',
  `email` char(100) DEFAULT '' COMMENT '邮箱',
  `job_description` varchar(255) DEFAULT '' COMMENT '岗位职责',
  `no` char(20) DEFAULT '' COMMENT '员工编号',
  `blogname` varchar(120) DEFAULT NULL COMMENT 'blog name',
  `salt` char(6) NOT NULL DEFAULT '' COMMENT 'salt 加密字符串',
  `is_acceptinvitation` tinyint(1) DEFAULT '0' COMMENT '是否接受邀请（1 是 0 否）',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `status` tinyint(3) unsigned DEFAULT '0' COMMENT '0 禁用 1正常 2删除',
  PRIMARY KEY (`id`),
  UNIQUE KEY `email` (`email`),
  UNIQUE KEY `phone` (`phone`),
  UNIQUE KEY `unique_name_name_en` (`username`,`name_en`),
  KEY `name_name_en_nickname` (`username`,`name_en`,`nickname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `jnote_user` WRITE;
/*!40000 ALTER TABLE `jnote_user` DISABLE KEYS */;

INSERT INTO `jnote_user` (`id`, `username`, `nickname`, `name_en`, `photo`, `password`, `department_id`, `job_id`, `sex`, `phone`, `weixin`, `email`, `job_description`, `no`, `blogname`, `salt`, `is_acceptinvitation`, `create_time`, `update_time`, `status`)
VALUES
	(1,'admin','admin','admin','','202cb962ac59075b964b07152d234b70',1,1,1,'13312311231','','admin@admin2.com','','','YRnKm1','123123',0,'2016-12-22 17:13:55','2019-04-03 16:01:15',1);

/*!40000 ALTER TABLE `jnote_user` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table jnote_viewcount
# ------------------------------------------------------------

DROP TABLE IF EXISTS `jnote_viewcount`;

CREATE TABLE `jnote_viewcount` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `module_id` tinyint(3) DEFAULT NULL COMMENT 'module 对应id',
  `primary_id` int(11) DEFAULT NULL COMMENT 'module对应模型中主键id',
  `viewcount` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `module_id` (`module_id`) USING BTREE,
  KEY `primary_id` (`primary_id`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8;




/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
