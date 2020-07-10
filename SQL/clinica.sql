-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: clinica
-- ------------------------------------------------------
-- Server version	5.7.18-log

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
-- Table structure for table `coleta`
--

DROP TABLE IF EXISTS `coleta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `coleta` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idcadastro` int(11) NOT NULL,
  `idpaciente` int(11) NOT NULL,
  `idade` tinyint(4) NOT NULL,
  `materialcoletado` varchar(100) NOT NULL,
  `comorbidade` tinyint(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `coleta`
--

LOCK TABLES `coleta` WRITE;
/*!40000 ALTER TABLE `coleta` DISABLE KEYS */;
INSERT INTO `coleta` VALUES (1,3,3,1,'ASPIRADOTRAQUEAL',1),(2,3,3,0,'ASPIRADOBRONQUICO',0),(3,3,3,1,'ASPIRADOTRAQUEAL',1),(4,3,3,0,'SWABDENASOFARINGE',1);
/*!40000 ALTER TABLE `coleta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `exame`
--

DROP TABLE IF EXISTS `exame`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `exame` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idresponsaveltecnico` int(11) NOT NULL,
  `idpaciente` int(11) NOT NULL,
  `idcoleta` int(11) NOT NULL,
  `numeroteste` int(11) NOT NULL,
  `resultado` varchar(45) NOT NULL,
  `data` date NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_exame_usuario_idx` (`idresponsaveltecnico`),
  KEY `fk_exame_paciente_idx` (`idpaciente`),
  KEY `jk_exame_coleta_idx` (`idcoleta`),
  CONSTRAINT `fk_exame_paciente` FOREIGN KEY (`idpaciente`) REFERENCES `usuario` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_exame_usuario` FOREIGN KEY (`idresponsaveltecnico`) REFERENCES `usuario` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `jk_exame_coleta` FOREIGN KEY (`idcoleta`) REFERENCES `coleta` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exame`
--

LOCK TABLES `exame` WRITE;
/*!40000 ALTER TABLE `exame` DISABLE KEYS */;
INSERT INTO `exame` VALUES (1,4,3,1,36,'INCONCLUSIVO','2020-07-01'),(2,4,3,3,3,'DETECTADO','2020-07-01');
/*!40000 ALTER TABLE `exame` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(45) NOT NULL,
  `senha` varchar(45) NOT NULL,
  `tipousuario` varchar(45) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `datanasc` date NOT NULL,
  `gruporisco` tinyint(4) NOT NULL,
  `cidade` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'admin','123','ADMINISTRADOR','Stephanye','1992-12-26',0,'Prudentopolis'),(2,'super','123','SUPERVISOR','Lucas Santos Faria','1995-07-14',0,'Juiz de Fora'),(3,'pac','123','PACIENTE','Aparecida Santos','1960-10-01',1,'Juiz de Fora'),(4,'responsa','123','RESPONSAVELTECNICO','Rogerio Castellano','1971-11-17',1,'Curitiba'),(5,'cad','123','CADASTRO','Vivien Viridiane Vignatti','1973-07-28',1,'Araucaria');
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

-- Dump completed on 2020-07-01 18:45:49
