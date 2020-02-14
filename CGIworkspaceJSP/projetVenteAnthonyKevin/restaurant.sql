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
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL,
  `prix` int(11) NOT NULL,
  `type` varchar(45) NOT NULL,
  `img` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idarticle_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `article`
--

LOCK TABLES `article` WRITE;
/*!40000 ALTER TABLE `article` DISABLE KEYS */;
INSERT INTO `article` VALUES (10,'Gigabyte H370 HD3','Jeu, Socket 1151, Intel H370, 2 ports PCI-Express 16x, 2666 MHz (DDR4), SATA Revision 3.0 (6 Gb/s), 1 port M.2 (SATA & PCIE) + 1 port M.2 (PCIE), 1 port USB 3.1 (type A), ATX, 305 x 225 mm',113,'1','img/10.jpg'),(12,'Gigabyte H370 AORUS GAMING 3 WIFI','Jeu, Socket 1151, Intel H370, 2 ports PCI-Express 16x, 2666 MHz (DDR4), SATA Revision 3.0 (6 Gb/s), 1 port M.2 (SATA & PCIE) + 1 port M.2 (PCIE), 2 ports USB 3.1 (1 type A + 1 type C), ATX, 305 x 244 mm',140,'1','img/12.jpg'),(13,'MSI MPG Z390 GAMING PLUS','Intel Z390 - Socket LGA1151 - ATX - Coffe Lake S - Audio Boost - Compatible processeurs Intel Core 9ème génér',155,'1','img/13.jpg'),(14,'MSI MPG Z390 GAMING PRO CARBON AC','Intel Z390 - Socket LGA1151 - ATX - Wi-Fi - M.2 Shield FROZR - Intel Core 9ème génération - Audio Boost 4 - Mystic Light',250,'1','img/14.jpg'),(15,'ASUS Z390 ROG MAXIMUS XI HERO','Carte mère ATX Chipset Z390, Intel Core Coffee lake S refresh (9eme génération)',345,'1','img/15.jpg'),(16,'ASUS Z390 ROG MAXIMUS XI FORMULA','Carte mère ATX Chipset Z390, Intel Core Coffee lake S refresh (9eme génération)',524,'1','img/16.jpg'),(21,'Intel Core i5 9600K','6 coeurs, 6 threads, 3.70 GHz, 9 Mo, HD Graphics, Coffee Lake Refresh, 95 Watts, BX80684I59600K',260,'2','img/21.jpg'),(22,'Intel Core i7 7700','4 coeurs, 8 threads, 3.60 GHz, 8 Mo, HD Graphics, Kaby Lake, 65 Watts, BX80677I77700',370,'2','img/22.jpg'),(23,'Intel Core i9 9900K','8 coeurs, 16 threads, 3.60 GHz, 16 Mo, HD Graphics, Coffee Lake Refresh, 95 Watts, BX80684I99900K',566,'2','img/23.jpg'),(24,'AMD Ryzen 7 3700X','8 coeurs, 3,60 GHz, 32 Mo, AMD Ryzen, 65 Watts',349,'2','img/24.jpg'),(25,'AMD Ryzen 9 3900X','12 coeurs, 3,80 GHz, 70 Mo, AMD Ryzen, 105 Watts',525,'2','img/25.jpg'),(26,'AMD Ryzen 9 3950X','16 coeurs, 3,50 GHz, 64 Mo, AMD Ryzen, 105 Watts',939,'2','img/26.jpg'),(32,'MSI GeForce GTX 1050 Ti Gaming X - 4 Go','GeForce GTX 1050 Ti, 1354 MHz (1290 MHz en mode Silent / 1379 MHz en mode OC), PCI-Express 16x, 4 Go, 7008 MHz Mode Gaming & Silent (7108 MHz mode OC)',199,'3','img/32.jpg'),(33,'Asus GeForce GTX 1650 SUPER ROG STRIX A4G','GeForce GTX 1650 Super, PCI-Express 16x, 4 Go GDDR6',235,'3','img/33.jpg'),(34,'Asus GeForce RTX 2060 Phoenix','GeForce RTX 2060, PCI-Express 16x, 6 Go GDDR6',435,'3','img/34.jpg'),(35,'EVGA GeForce RTX 2080 SUPER XC Ultra','PCI-Express 16x, 8 Go GDDR6',834,'3','img/35.jpg'),(36,'Gigabyte Aorus GeForce RTX 2080 Ti Xtreme Waterforce','GeForce RTX 2080 Ti, 11 Go, Radiateur 2 x 120mm',1549,'3','img/36.jpg'),(37,'Asus RX 5500 XT Dual OC EVO','Radeon RX 5500 XT, PCI-Express 16x 4.0, GDDR6',269,'3','img/37.jpg'),(38,'Asus Radeon RX 5700 ROG STRIX OC','Radeon RX 5700, PCI-Express 16x 4.0, GDDR6',505,'3','img/38.jpg'),(39,'Gigabyte Radeon VII HBM2 16G','Radeon VII, 1400 MHz, PCI-Express 16x, 16 Go HBM2',815,'3','img/39.jpg'),(40,'HyperX Predator DDR4 1 x 8 Go 3000 MHz CAS 15','RAM PC, DDR4, 8 Go, 3000 MHz - PC24000, 15-17-17, 1,35 Volts, HX430C15PB3/8',56,'4','img/40.jpg'),(41,'G.Skill Aegis DDR4 16 Go 2133 MHz CAS 15RAM PC, DDR4, 16 Go, 2133 MHz - PC17066, 15-15-15-35, 1,20 Volts, F4-2133C15S-16GIS','RAM PC, DDR4, 16 Go, 2133 MHz - PC17066, 15-15-15-35, 1,20 Volts, F4-2133C15S-16GIS',75,'4','img/41.jpg'),(42,'G.Skill Aegis DDR4 2 x 8 Go 3000 MHz CAS 16','RAM PC, DDR4, 16 Go, 3000 MHz - PC24000, 16-18-18-38, 1,20 Volts, F4-3000C16D-16GISB',81,'4','img/42.jpg'),(43,'G.Skill Sniper X Urban Camo DDR4 2 X 8 Go 3000 MHz CAS 16','RAM PC, DDR4, 16 Go, 3000 MHz - PC24000, 16-18-18-38, 1,35 Volts, F4-3000C16D-16GSXWB',90,'4','img/43.jpg'),(44,'Corsair Vengeance RGB PRO DDR4 2 x 8 Go 2666 MHz CAS 16','RAM PC, DDR4, 16 Go, 2666 MHz - PC21300, 16-18-18-35, 1,20 Volts, CMW16GX4M2A2666C16',125,'4','img/44.jpg'),(45,'Ballistix Elite 16 Go (2 x 8 Go) DDR4 4000 MHz CAS 18','Kit Dual Channel, 16 Go, 2 barrettes de RAM, DDR4 PC4-32000, CAS 18-19-19-39, 1.35 Volts, Noir, BLE2K8G4D40BEEAK',296,'4','img/45.jpg'),(46,'Ballistix Sport LT DDR4 4 x 16 Go 3000 MHz CAS 15 DR Rouge','RAM PC, DDR4, 64 Go, 3000 MHz - PC24000, 15-16-16, 1,35 Volts, BLS4K16G4D30AESE, Rouge',329,'4','img/46.jpg'),(51,'Aorus P750W - 750W','750W, Full-modulaire, 80 PLUS Or',139,'5','img/51.jpg'),(52,'Be Quiet Dark Power Pro 11 - 650W','Alimentation 650W, Full Modulaire, 80 PLUS Platinum, 2 x +12V CPU, BN251',180,'5','img/52.jpg'),(53,'FSP Fortron Hydro G 850W','850W, Full modulaire, 80 PLUS Or',190,'5','img/53.jpg'),(54,'Corsair RM1000x - 1000W','1000W, Full modulaire, 80 PLUS Or',239,'5','img/54.jpg'),(55,'Enermax Platimax DF 1200W','1200W, Full modulaire, 80 PLUS Platinum',279,'5','img/55.jpg'),(56,'Asus ROG Thor 850W','850W, Full-modulaire, 80 PLUS Platinium',299,'5','img/56.jpg');
/*!40000 ALTER TABLE `article` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `client`
--

DROP TABLE IF EXISTS `client`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `client` (
  `id` int(11) NOT NULL,
  `password` varchar(45) NOT NULL,
  `nom` varchar(45) NOT NULL,
  `prenom` varchar(45) NOT NULL,
  `adresse` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idclient_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `client`
--

LOCK TABLES `client` WRITE;
/*!40000 ALTER TABLE `client` DISABLE KEYS */;
INSERT INTO `client` VALUES (1,'1','Tutu','Toto','cghhjh'),(2,'é','2','2','2'),(12,'123','dupond','titi','fhdjkorododiffodod'),(13,'123','dupond','toto','etyuuiiuiuitrtyyu'),(15,'123','dupond','titi','fhdjkorododiffodod'),(16,'','arthur','martin','fyuidfghjkjhgfdrtyuio'),(20,'123','ertyj','ertyh','zertyuiol'),(33,'123','rtyuj','tyui','fyuidfghjkjhgfdrtyuio'),(34,'123','rtyuj','tyui','fyuidfghjkjhgfdrtyuio'),(44,'123','arthur','ertyh','fyuidfghjkjhgfdrtyuio'),(45,'123','fghj','rtyu','fghjklmù'),(345,'123','rtyuj','tyui','fyuidfghjkjhgfdrtyuio');
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
  `id_client` int(11) NOT NULL,
  `date` varchar(50) NOT NULL,
  `total` int(11) NOT NULL,
  `info` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `commande`
--

LOCK TABLES `commande` WRITE;
/*!40000 ALTER TABLE `commande` DISABLE KEYS */;
INSERT INTO `commande` VALUES (1,12,'11-02-2020 17:07:57',339,''),(2,12,'11-02-2020 17:08:54',678,''),(3,12,'11-02-2020 17:09:23',1017,''),(4,12,'11-02-2020 17:10:31',1582,''),(5,12,'11-02-2020 17:16:55',500,'14/2/500;'),(6,12,'13-02-2020 17:15:30',880,'10/1/113;'),(7,2,'14-02-2020 14:17:27',525,'13/1/155;22/1/370;'),(8,2,'14-02-2020 14:18:52',113,'10/1/113;'),(9,2,'14-02-2020 14:19:38',113,'10/1/113;'),(10,2,'14-02-2020 14:19:49',113,'10/1/113;'),(11,12,'14-02-2020 14:20:15',458,'15/1/345;'),(12,12,'14-02-2020 14:20:33',458,'15/1/345;'),(13,12,'14-02-2020 14:21:28',458,'15/1/345;'),(14,1,'14-02-2020 15:30:35',1205,'10/2/226;21/3/780;32/1/199;');
/*!40000 ALTER TABLE `commande` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'restaurant'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-02-14 15:33:03
