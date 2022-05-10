use sunqian;
drop table if exists `account`;

CREATE TABLE `account` (
                           `id` int NOT NULL AUTO_INCREMENT,
                           `username` varchar(20) DEFAULT NULL,
                           `password` varchar(20) DEFAULT NULL,
                           `perms` varchar(20) DEFAULT NULL,
                           `role` varchar(20) DEFAULT NULL,
                           PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

LOCK TABLES `account` WRITE;
INSERT INTO `account` VALUES (1,'zs','123123','',''),(2,'ls','123123','manage',''),(3,'ww','123123','manage','administrator');
UNLOCK TABLES;

