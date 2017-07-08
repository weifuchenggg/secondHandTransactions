/*
SQLyog 企业版 - MySQL GUI v7.14 
MySQL - 5.5.22 : Database - secondhandtransactions
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`secondhandtransactions` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `secondhandtransactions`;

/*Table structure for table `comm` */

DROP TABLE IF EXISTS `comm`;

CREATE TABLE `comm` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `comname` varchar(20) NOT NULL,
  `comdesc` varchar(100) DEFAULT NULL,
  `comtype` varchar(20) DEFAULT NULL,
  `comcount` int(11) DEFAULT NULL,
  `comprice` float NOT NULL,
  `author` varchar(10) NOT NULL,
  `phone` varchar(12) NOT NULL,
  `sex` varchar(2) DEFAULT NULL,
  `useyear` int(11) DEFAULT NULL,
  `usemonth` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_comm` (`comtype`),
  CONSTRAINT `FK_comm` FOREIGN KEY (`comtype`) REFERENCES `comtype` (`comtypename`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `comm` */

insert  into `comm`(`id`,`comname`,`comdesc`,`comtype`,`comcount`,`comprice`,`author`,`phone`,`sex`,`useyear`,`usemonth`) values (3,'das','das','ad',1,2,'eeq','223','男',2000,1),(8,'sadasd','das','fdsfsdf',1,23,'21321','321321','?',2003,5),(9,'bbbbbb','dasdabbb','ad',1,2,'eeq','223.0','?',2000,1),(10,'aaaaaaaa','dasdasdas','ad',9985,5,'5453','4343.0','?',2000,1);

/*Table structure for table `comtype` */

DROP TABLE IF EXISTS `comtype`;

CREATE TABLE `comtype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `comtypename` varchar(20) NOT NULL,
  `comtypedesc` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`comtypename`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

/*Data for the table `comtype` */

insert  into `comtype`(`id`,`comtypename`,`comtypedesc`) values (8,'???','?????'),(5,'ad','dsadasdasdas'),(7,'fdsfsdf','fdsfsdfsd');

/*Table structure for table `salesrecond` */

DROP TABLE IF EXISTS `salesrecond`;

CREATE TABLE `salesrecond` (
  `id` int(11) NOT NULL,
  `商品名` varchar(20) DEFAULT NULL,
  `数量` int(11) DEFAULT NULL,
  `总价` float DEFAULT NULL,
  `日期` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `salesrecond` */

insert  into `salesrecond`(`id`,`商品名`,`数量`,`总价`,`日期`) values (10,'aaaaaaaa',2,10,1),(10,'aaaaaaaa',1,5,20166),(10,'aaaaaaaa',6,30,20167);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`username`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`username`,`password`) values (7,'',''),(14,'a','a'),(16,'ab','ab'),(25,'ad','ad'),(17,'avc','a'),(3,'dsa','dsa'),(9,'dsaaa','dsad'),(4,'dsad','das'),(2,'ewq','ewq'),(23,'ss','s'),(27,'sss','1111'),(1,'wfc','1234567');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
