-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: restaurant
-- ------------------------------------------------------
-- Server version	5.7.12-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `article`
--

DROP TABLE IF EXISTS `article`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `article` (
  `id` int(11) NOT NULL,
  `Article` varchar(45) NOT NULL,
  `Description` varchar(45) DEFAULT NULL,
  `Prix` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `article`
--

LOCK TABLES `article` WRITE;
/*!40000 ALTER TABLE `article` DISABLE KEYS */;
INSERT INTO `article` VALUES (1,'Caramel','asd',3),(2,'Galettes','aaa',7),(3,'Crepes','bbb',5),(4,'Palets Breton','ccc',2),(5,'Bières','ddd',4),(6,'Cidre','eee',3),(7,'lambig','fff',8),(8,'Jus de pomme','ggg',2),(9,'Homard','hhh',12),(10,'Langoustine','iii',10),(11,'Huitres','jjj',6),(12,'Etrilles','kkk',7);
/*!40000 ALTER TABLE `article` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `client`
--

DROP TABLE IF EXISTS `client`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `client` (
  `Login` varchar(45) NOT NULL,
  `Nom` varchar(45) NOT NULL,
  `Prenom` varchar(45) NOT NULL,
  `mdp` varchar(45) NOT NULL,
  `Adresse` varchar(45) NOT NULL,
  PRIMARY KEY (`Login`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `client`
--

LOCK TABLES `client` WRITE;
/*!40000 ALTER TABLE `client` DISABLE KEYS */;
INSERT INTO `client` VALUES ('1','aa','bb','cc','dd'),('aa','aa','aa','aa','aa'),('ccc','ccc','ccc','ccc','ccc'),('ddd','ddd','ddd','ddd','ddd'),('ee','ee','ee','ee','ee'),('jeff40','Toto','Titi','jeff40','sdfqsdfdqljgqdfkl'),('mc35','Crenn','Emmanuel','mc35','sdfsdf');
/*!40000 ALTER TABLE `client` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `commande`
--

DROP TABLE IF EXISTS `commande`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `commande` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Login` varchar(45) NOT NULL,
  `Date` varchar(45) NOT NULL,
  `Total` int(11) NOT NULL,
  `Info` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `commande`
--

LOCK TABLES `commande` WRITE;
/*!40000 ALTER TABLE `commande` DISABLE KEYS */;
INSERT INTO `commande` VALUES (1,'2','2020-02-07 16:06:05',56,'ddd'),(2,'jf75','2020-02-10 09:32:34',56,'ddd'),(3,'jf75','2020-02-10 09:32:43',56,'ddd'),(4,'jf75','2020-02-10 09:32:59',56,'ddd'),(5,'jf75','2020-02-10 09:34:10',56,'ddd'),(6,'jf75','2020-02-10 09:35:35',56,'ddd'),(7,'aa','2020-02-10 15:14:36',37,'Caramel/4/20;Crepes/3/9;Palets Breton/2/8;'),(8,'mc35','2020-02-10 15:39:57',24,'Caramel/3/15;Crepes/3/9;'),(9,'mc35','2020-02-10 15:53:16',45,'Caramel/3/9;Cidre/4/12;lambig/3/24;'),(10,'mc35','2020-02-10 16:30:53',54,'Caramel/10/30;lambig/3/24;'),(11,'mc35','2020-02-10 16:43:41',14,'Galettes/2/14;'),(12,'mc35','2020-02-10 16:45:05',10,'Palets Breton/5/10;'),(13,'mc35','2020-02-10 16:47:12',46,'Galettes/4/28;Caramel/6/18;'),(14,'mc35','2020-02-10 16:55:58',30,'Crepes/6/30;'),(15,'mc35','2020-02-10 16:57:10',12,'Caramel/4/12;'),(16,'mc35','2020-02-10 16:58:47',9,'Caramel/3/9;'),(17,'mc35','2020-02-11 11:40:00',18,'Crepes/3/15;Cidre/1/3;'),(18,'ddd','2020-02-11 12:00:06',8,'Palets Breton/4/8;');
/*!40000 ALTER TABLE `commande` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-02-11 12:01:41
