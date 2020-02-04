-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: hopital
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
-- Table structure for table `authentification`
--

DROP TABLE IF EXISTS `authentification`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `authentification` (
  `login` varchar(45) NOT NULL,
  `mdp` varchar(45) DEFAULT NULL,
  `nom` varchar(45) DEFAULT NULL,
  `metier` int(11) DEFAULT NULL,
  PRIMARY KEY (`login`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `authentification`
--

LOCK TABLES `authentification` WRITE;
/*!40000 ALTER TABLE `authentification` DISABLE KEYS */;
INSERT INTO `authentification` VALUES ('med1','mdp','Dr Claude',1),('med2','mdp','Dr Michel',1),('med3','mdp','Dr Antoine',2),('secr1','mdp','Chantal',0);
/*!40000 ALTER TABLE `authentification` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medicament`
--

DROP TABLE IF EXISTS `medicament`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `medicament` (
  `idmed` int(11) NOT NULL,
  `nom` varchar(45) DEFAULT NULL,
  `prix` int(11) DEFAULT NULL,
  `quantite` int(11) DEFAULT NULL,
  PRIMARY KEY (`idmed`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicament`
--

LOCK TABLES `medicament` WRITE;
/*!40000 ALTER TABLE `medicament` DISABLE KEYS */;
INSERT INTO `medicament` VALUES (1,'Doliprane 1000mg ',3,100),(2,'Novorapid 100U/ml',10,75),(3,'Velcade     3,5mg',150,80),(4,'Ibuprofene 400mg',3,95),(5,'Doliprane   500mg',2,45);
/*!40000 ALTER TABLE `medicament` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient`
--

DROP TABLE IF EXISTS `patient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `patient` (
  `id` int(11) NOT NULL,
  `nom` varchar(45) DEFAULT NULL,
  `prenom` varchar(45) DEFAULT NULL,
  `complement` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient`
--

LOCK TABLES `patient` WRITE;
/*!40000 ALTER TABLE `patient` DISABLE KEYS */;
INSERT INTO `patient` VALUES (1,'Durand','David',NULL),(2,'Guillaume','Marie','0654874521'),(3,'Michel','Jean',NULL),(4,'McLeod','Alice',NULL),(5,'Dupond','Didier',NULL),(6,'titi','toto',NULL),(10,'Dupont','Michel',NULL);
/*!40000 ALTER TABLE `patient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `visite`
--

DROP TABLE IF EXISTS `visite`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `visite` (
  `nbVisite` int(11) NOT NULL AUTO_INCREMENT,
  `id_patient` int(11) DEFAULT NULL,
  `date` varchar(45) DEFAULT NULL,
  `nume_salle` int(11) DEFAULT NULL,
  `medecin` varchar(45) DEFAULT NULL,
  `tarif` int(11) DEFAULT NULL,
  `ordonance` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`nbVisite`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `visite`
--

LOCK TABLES `visite` WRITE;
/*!40000 ALTER TABLE `visite` DISABLE KEYS */;
INSERT INTO `visite` VALUES (1,5,'2020-01-27 15:26:04',2,'Dr Antoine',23,NULL),(2,4,'2020-01-27 15:26:50',1,'Dr Michel',23,NULL),(3,1,'2020-01-27 15:30:02',1,'Dr claude',23,NULL),(4,6,'2020-01-27 15:30:16',2,'Dr Antoine',23,NULL),(5,3,'2020-01-27 15:31:12',1,'Dr Michel',23,NULL),(6,1,'2020-01-27 15:31:12',1,'Dr claude',23,NULL),(7,10,'2020-01-28 10:20:53',2,'Dr Antoine',23,NULL),(8,1,'2020-01-28 22:24:46',1,'Dr Michel',813,'Novorapid 30(4,40);Velcade(5,750);'),(9,5,'2020-01-28 22:27:19',1,'Dr Claude',813,'Novorapid 30(4,40);Velcade(5,750);'),(10,2,'2020-01-28 22:27:19',2,'Dr Antoine',31,'Doliprane 500mg(4,8);'),(11,3,'2020-01-28 22:27:19',1,'Dr Claude',23,NULL),(12,1,'2020-01-28 22:30:14',1,'Dr Michel',813,'Novorapid 30(4,40);Velcade(5,750);'),(13,2,'2020-01-28 22:30:14',2,'Dr Antoine',31,'Doliprane 500mg(4,8);'),(14,4,'2020-01-28 22:30:14',1,'Dr Claude',23,NULL),(15,1,'2020-01-28 22:30:14',2,'Dr Antoine',183,'Velcade(1,150);Doliprane 500mg(5,10);'),(16,6,'2020-01-28 22:32:36',1,'Dr Michel',23,NULL);
/*!40000 ALTER TABLE `visite` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-29 10:59:18
