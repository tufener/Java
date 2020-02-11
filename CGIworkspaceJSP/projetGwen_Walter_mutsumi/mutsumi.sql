-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: mutsumi
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
-- Table structure for table `articles`
--

DROP TABLE IF EXISTS `articles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `articles` (
  `idarticle` int(11) NOT NULL,
  `article` varchar(150) DEFAULT NULL,
  `description` varchar(500) DEFAULT NULL,
  `image` varchar(2083) DEFAULT NULL,
  `prix` double DEFAULT NULL,
  PRIMARY KEY (`idarticle`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `articles`
--

LOCK TABLES `articles` WRITE;
/*!40000 ALTER TABLE `articles` DISABLE KEYS */;
INSERT INTO `articles` VALUES (1,'Taiyaki','Le taiyaki est un gâteau japonais en forme de poisson. La plupart du temps, il est fourré d\'anko, une pâte de haricots rouges sucrés.','img/taiyaki.jpg',3.5),(2,'Daifuku','Le daifuku est une sucrerie japonaise qui consiste en un mochi, dont la pâte extérieure est faite de riz gluant, rempli en son centre, par exemple de pâte de haricots rouges azuki sucrée.','img/daifuku.jpg',4.5),(3,'Anpan','L’anpan est une viennoiserie japonaise fourrée au anko, une pâte de haricots rouges sucrés.','img/anpan.jpg',5),(4,'Ramen','Les rāmen sont des mets japonais constitués de pâtes dans un bouillon à base de poisson ou de viande et souvent assaisonnés au miso ou à la sauce soja.','img/ramen.jpg',9),(5,'Gyoza','Le gyoza, parfois appelé ravioli pékinois ou ravioli chinois est un aliment chinois en forme de chausson, constitué d\'une pâte de farine de blé tendre, enveloppant une farce qui peut être composée de nombreux aliments différents.','img/gyoza.jpg',6.5),(6,'Takoyaki','Le takoyaki est un mets de la cuisine japonaise et une spécialité d\'Ōsaka, se présentant sous forme de boulettes de pâte, semblable à la pâte à crêpe, contenant des morceaux de poulpe, cuites en moule, comme les gaufres.','img/takoyaki.jpg',5),(7,'Yakiniku','Le yakiniku est une méthode japonaise de cuisson des viandes et des légumes au charbon de bois, au gaz ou sur une plaque.','img/yakiniku.jpg',10.5),(8,'Onigiri','L\'onigiri est une préparation culinaire japonaise consistant en une boulette de riz, généralement enveloppée d\'une algue nori.','img/onigiri.jpg',3),(9,'Sushi','Le sushi est un plat traditionnel japonais, composé d\'un riz vinaigré appelé shari combiné avec un autre ingrédient appelé neta.','img/sushi.jpg',2),(10,'Umeshu','L\'umeshu est une boisson alcoolisée japonaise fabriquée à partir d\'alcool neutre aromatisé par macération de prunes.','img/umeshu.jpg',5.5),(11,'Sake',' Il s\'agit d\'un alcool de riz, produit comme la bière par fermentation répétée, titrant de 14 à 17°.','img/sake.jpg',6.5);
/*!40000 ALTER TABLE `articles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clients`
--

DROP TABLE IF EXISTS `clients`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clients` (
  `id` int(11) NOT NULL,
  `password` varchar(150) DEFAULT NULL,
  `nom` varchar(150) DEFAULT NULL,
  `prenom` varchar(150) DEFAULT NULL,
  `adresse` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clients`
--

LOCK TABLES `clients` WRITE;
/*!40000 ALTER TABLE `clients` DISABLE KEYS */;
INSERT INTO `clients` VALUES (1,'123','Rispal','Gwenaelle','Vincennes'),(2,'123','Hérisson','Walter','Marseille'),(5,'123','bla','bklabka',NULL);
/*!40000 ALTER TABLE `clients` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `commande`
--

DROP TABLE IF EXISTS `commande`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `commande` (
  `idcommande` int(11) NOT NULL AUTO_INCREMENT,
  `idclient` int(11) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `total` int(11) DEFAULT NULL,
  `info` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`idcommande`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `commande`
--

LOCK TABLES `commande` WRITE;
/*!40000 ALTER TABLE `commande` DISABLE KEYS */;
INSERT INTO `commande` VALUES (1,3,'2020-02-11',20,'1/1;5/2;8/1;9/1;'),(2,1,'2020-02-11',15,'1/2;2/1;3/1;'),(3,1,'2020-02-11',3,'1/1;');
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

-- Dump completed on 2020-02-11 12:56:06
