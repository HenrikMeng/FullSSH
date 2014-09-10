# SQL Manager 2005 Lite for MySQL 3.6.5.8
# ---------------------------------------
# Host     : localhost
# Port     : 3306
# Database : accp


SET FOREIGN_KEY_CHECKS=0;

DROP DATABASE IF EXISTS `accp`;

CREATE DATABASE `accp`
    CHARACTER SET 'utf8'
    COLLATE 'utf8_general_ci';

USE `accp`;

#
# Structure for the `liebie` table : 
#

DROP TABLE IF EXISTS `liebie`;

CREATE TABLE `liebie` (
  `leibieId` int(11) NOT NULL auto_increment,
  `leibieName` varchar(20) default NULL,
  PRIMARY KEY  (`leibieId`),
  KEY `leibieId` (`leibieId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Structure for the `person` table : 
#

DROP TABLE IF EXISTS `person`;

CREATE TABLE `person` (
  `pid` int(11) NOT NULL auto_increment,
  `pname` varchar(20) default NULL,
  `pgender` varchar(20) default NULL,
  PRIMARY KEY  (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for the `person` table  (LIMIT 0,500)
#

INSERT INTO `person` (`pid`, `pname`, `pgender`) VALUES 
  (1,'a','?'),
  (2,'b','?');

COMMIT;

#
# Structure for the `product` table : 
#

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `productId` int(11) NOT NULL auto_increment,
  `productName` varchar(20) NOT NULL,
  `productPrice` float(9,3) NOT NULL,
  `liebieId` int(11) default NULL,
  PRIMARY KEY  (`productId`),
  KEY `liebieId` (`liebieId`),
  CONSTRAINT `product_fk` FOREIGN KEY (`liebieId`) REFERENCES `liebie` (`leibieId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Structure for the `son` table : 
#

DROP TABLE IF EXISTS `son`;

CREATE TABLE `son` (
  `sid` int(11) NOT NULL auto_increment,
  `sage` int(11) default NULL,
  `spid` int(11) default NULL,
  `sname` varchar(20) default NULL,
  PRIMARY KEY  (`sid`),
  KEY `spid` (`spid`),
  CONSTRAINT `son_fk` FOREIGN KEY (`spid`) REFERENCES `person` (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for the `son` table  (LIMIT 0,500)
#

INSERT INTO `son` (`sid`, `sage`, `spid`, `sname`) VALUES 
  (1,33,1,NULL),
  (2,22,2,NULL);

COMMIT;

#
# Structure for the `student` table : 
#

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `sid` int(11) NOT NULL auto_increment,
  `sname` varchar(20) default NULL,
  `sage` int(11) default NULL,
  `sinfor` varchar(50) default NULL,
  PRIMARY KEY  (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for the `student` table  (LIMIT 0,500)
#

INSERT INTO `student` (`sid`, `sname`, `sage`, `sinfor`) VALUES 
  (1,'lcai',22,NULL),
  (2,'songjiao',33,NULL);

COMMIT;

#
# Structure for the `user` table : 
#

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `uid` int(11) NOT NULL auto_increment,
  `upwd` varchar(20) default NULL,
  `uinfor` varchar(20) default NULL,
  `uname` varchar(20) default NULL,
  PRIMARY KEY  (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for the `user` table  (LIMIT 0,500)
#

INSERT INTO `user` (`uid`, `upwd`, `uinfor`, `uname`) VALUES 
  (2,'111111','??','lcai');

COMMIT;

#
# Structure for the `userinfo` table : 
#

DROP TABLE IF EXISTS `userinfo`;

CREATE TABLE `userinfo` (
  `userid` int(11) NOT NULL auto_increment,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY  (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Structure for the `users` table : 
#

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `uid` int(11) NOT NULL auto_increment,
  `uname` varchar(20) default NULL,
  PRIMARY KEY  (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for the `users` table  (LIMIT 0,500)
#

INSERT INTO `users` (`uid`, `uname`) VALUES 
  (1,'lcai'),
  (2,'xinxin'),
  (3,'hbwang');

COMMIT;

