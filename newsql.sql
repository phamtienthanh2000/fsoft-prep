-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: employee-management
-- ------------------------------------------------------
-- Server version	8.0.34

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
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `department` (
  `dept_no` int NOT NULL AUTO_INCREMENT,
  `dept_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`dept_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `department_employee`
--

DROP TABLE IF EXISTS `department_employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `department_employee` (
  `dept_no` int DEFAULT NULL,
  `emp_no` int DEFAULT NULL,
  `from_date` date DEFAULT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  `to_date` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKgr2sd4ybl9mgocw2muyhftmoh` (`dept_no`),
  KEY `FKpiej2hscmevrfxxir1xi0qrx7` (`emp_no`),
  CONSTRAINT `FKgr2sd4ybl9mgocw2muyhftmoh` FOREIGN KEY (`dept_no`) REFERENCES `department` (`dept_no`),
  CONSTRAINT `FKpiej2hscmevrfxxir1xi0qrx7` FOREIGN KEY (`emp_no`) REFERENCES `employee` (`emp_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `department_manager`
--

DROP TABLE IF EXISTS `department_manager`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `department_manager` (
  `dept_no` int DEFAULT NULL,
  `emp_no` int DEFAULT NULL,
  `from_date` date DEFAULT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  `to_date` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK7rd7b3pwhddfc3vnbbchf9nd5` (`dept_no`),
  KEY `FK49jc7dq3hc2bk6edutbjef6iu` (`emp_no`),
  CONSTRAINT `FK49jc7dq3hc2bk6edutbjef6iu` FOREIGN KEY (`emp_no`) REFERENCES `employee` (`emp_no`),
  CONSTRAINT `FK7rd7b3pwhddfc3vnbbchf9nd5` FOREIGN KEY (`dept_no`) REFERENCES `department` (`dept_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `birth_date` date DEFAULT NULL,
  `emp_no` int NOT NULL AUTO_INCREMENT,
  `hire_date` date DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `gender` enum('M','F') DEFAULT NULL,
  PRIMARY KEY (`emp_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `salaries`
--

DROP TABLE IF EXISTS `salaries`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `salaries` (
  `emp_no` int DEFAULT NULL,
  `from_date` date DEFAULT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  `salary` int NOT NULL,
  `to_date` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKpopuigdvcs49ur2jw8x05fki2` (`emp_no`),
  CONSTRAINT `FKpopuigdvcs49ur2jw8x05fki2` FOREIGN KEY (`emp_no`) REFERENCES `employee` (`emp_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `titles`
--

DROP TABLE IF EXISTS `titles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `titles` (
  `emp_no` int DEFAULT NULL,
  `from_date` date DEFAULT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  `to_date` date DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKisp43v0ebf0moo29588mx6b73` (`emp_no`),
  CONSTRAINT `FKisp43v0ebf0moo29588mx6b73` FOREIGN KEY (`emp_no`) REFERENCES `employee` (`emp_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-01-23 14:54:46
