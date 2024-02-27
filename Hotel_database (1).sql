CREATE DATABASE  IF NOT EXISTS `hotel` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `hotel`;
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: hotel
-- ------------------------------------------------------
-- Server version	8.0.36

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `categoria_de_usuario`
--

DROP TABLE IF EXISTS `categoria_de_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categoria_de_usuario` (
  `ID_CATEGORIA` int NOT NULL AUTO_INCREMENT,
  `NOME_CATEGORIA` varchar(50) NOT NULL,
  PRIMARY KEY (`ID_CATEGORIA`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categoria_de_usuario`
--

LOCK TABLES `categoria_de_usuario` WRITE;
/*!40000 ALTER TABLE `categoria_de_usuario` DISABLE KEYS */;
INSERT INTO `categoria_de_usuario` VALUES (1,'GERENTE'),(2,'ATENDENTE');
/*!40000 ALTER TABLE `categoria_de_usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hospedes`
--

DROP TABLE IF EXISTS `hospedes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hospedes` (
  `ID_HOSPEDES` int NOT NULL AUTO_INCREMENT,
  `NOME_HOSPEDES` varchar(50) NOT NULL,
  `SOBRENOME_HOSPEDES` varchar(50) NOT NULL,
  `DATA_NASCIMENTO` varchar(10) DEFAULT NULL,
  `NACIONALIDADE` varchar(50) DEFAULT NULL,
  `TELEFONE` varchar(18) DEFAULT NULL,
  `ID_USUARIO` int NOT NULL,
  PRIMARY KEY (`ID_HOSPEDES`),
  KEY `ID_USUARIO` (`ID_USUARIO`),
  CONSTRAINT `hospedes_ibfk_1` FOREIGN KEY (`ID_USUARIO`) REFERENCES `usuario` (`ID_USUARIO`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hospedes`
--

LOCK TABLES `hospedes` WRITE;
/*!40000 ALTER TABLE `hospedes` DISABLE KEYS */;
INSERT INTO `hospedes` VALUES (1,'ROBERTO','MENDES','11/11/2000','Brasil','(61) 98207-9825',1),(2,'JUAN ','MANUEL FANGIO','12/08/1958','ARGENTINO','(62) 92069-5255',1),(3,'ALAIN ','MARIE PASCAL PROST','14/12/1955','FRANÇA','(36) 89746-5464',1),(4,'LEWIS ','HAMILTON SCHUMACHER','11/06/1999','ALEMÃO ','(69) 87565-4654',1),(5,'RUBENS','MAURO FERNANDE','11/02/1975','BRASIL','(61) 95245-9684',1),(6,'MAURO','COSTA SILVA\'','11/11/2002','MONGOL','(64) 16546-5468',1),(7,'MAURO ','CID OLIVEIRA','15/02/1958','TURCO','(65) 65465-4651',1),(8,'GUILHERME','MEIRELES','15/06/1996','RUSSO','(66) 46468-4684',1),(9,'MAURO CID','MALACOI','30/02/1986','BRASIL','(65) 54684-6464',1);
/*!40000 ALTER TABLE `hospedes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservas`
--

DROP TABLE IF EXISTS `reservas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reservas` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `DATA_ENTRADA` varchar(16) DEFAULT NULL,
  `DATA_SAIDA` varchar(16) DEFAULT NULL,
  `VALOR` varchar(8) DEFAULT NULL,
  `Forma_Pagamento` varchar(50) DEFAULT NULL,
  `ID_USUARIO` int NOT NULL,
  `ID_HOSPEDES` int NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID_USUARIO` (`ID_USUARIO`),
  KEY `ID_HOSPEDES` (`ID_HOSPEDES`),
  CONSTRAINT `reservas_ibfk_1` FOREIGN KEY (`ID_USUARIO`) REFERENCES `usuario` (`ID_USUARIO`),
  CONSTRAINT `reservas_ibfk_2` FOREIGN KEY (`ID_HOSPEDES`) REFERENCES `hospedes` (`ID_HOSPEDES`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservas`
--

LOCK TABLES `reservas` WRITE;
/*!40000 ALTER TABLE `reservas` DISABLE KEYS */;
INSERT INTO `reservas` VALUES (1,'25/02/2024 10:38','30/02/2024 10:38','R$120,25','DEBITO',2,1),(2,'15/05/2024 15:20','16/05/2024 19:05','R$148,25','PIX',1,3),(6,'25/02/2023 07:58','29/02/2023 07:58','R$568,60','DEPOSITO',1,1),(7,'25/03/2023 07:58','05/04/2023 07:58','R$100,00','PIX',1,5),(8,'25/02/2023 07:58','25/02/2023 09:00','R$500,00','PIX',1,1),(9,'11/11/2011 11:11','12/11/2021 12:00','R$555,55','DEBITO',1,9);
/*!40000 ALTER TABLE `reservas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `ID_USUARIO` int NOT NULL AUTO_INCREMENT,
  `NOME_USUARIO` varchar(50) NOT NULL,
  `SENHA` varchar(50) NOT NULL,
  `ID_CATEGORIA` int NOT NULL,
  PRIMARY KEY (`ID_USUARIO`),
  KEY `ID_CATEGORIA` (`ID_CATEGORIA`),
  CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`ID_CATEGORIA`) REFERENCES `categoria_de_usuario` (`ID_CATEGORIA`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'WALLACE','HOTEL123',1),(2,'LUCAS','HOTEL321',2),(3,'BENITES','058',2),(4,'GAY TONY','GAY',2);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-02-27 15:46:41
