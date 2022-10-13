-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: conectamais
-- ------------------------------------------------------
-- Server version	8.0.30

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
-- Table structure for table `instituicaoensino`
--

DROP TABLE IF EXISTS `instituicaoensino`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `instituicaoensino` (
  `idInstEnsino` int NOT NULL AUTO_INCREMENT,
  `NomeInstEnsino` varchar(80) DEFAULT NULL,
  `categoria` varchar(50) DEFAULT NULL,
  `logradouroIE` varchar(120) DEFAULT NULL,
  `cidadeIE` varchar(30) DEFAULT NULL,
  `estadoIE` varchar(30) DEFAULT NULL,
  `cepIE` varchar(15) DEFAULT NULL,
  `qtdAlunos` int DEFAULT NULL,
  `telefoneIE` varchar(20) DEFAULT NULL,
  `sobreIE` varchar(500) DEFAULT NULL,
  `emailIE` varchar(60) DEFAULT NULL,
  `senhaIE` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`idInstEnsino`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `instituicaoensino`
--

LOCK TABLES `instituicaoensino` WRITE;
/*!40000 ALTER TABLE `instituicaoensino` DISABLE KEYS */;
INSERT INTO `instituicaoensino` VALUES (1,'E.E Senador Roberto de Freitas','Ensino médio','Rua X, 1678 - Bairro L','São Paulo','SP','05298-012',400,'(11) 00000-0000','Sobre aqui','escolarobertofreitas@escolas.com','ABCDEFG'),(2,'E.E Paulo Gomes','Ensino Fundamental','Rua G, 49 - Bairro T','Belo Horizonte','MG','38475-082',500,'(31) 00000-0000','Sobre aqui','escolapaulogomes@escolas.com',NULL);
/*!40000 ALTER TABLE `instituicaoensino` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-10-04  0:10:10
