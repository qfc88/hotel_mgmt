-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: 20.2.232.152    Database: HMS
-- ------------------------------------------------------
-- Server version	8.0.36-0ubuntu0.20.04.1

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
-- Table structure for table `Booking`
--

DROP TABLE IF EXISTS `Booking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Booking` (
  `BookingID` int NOT NULL AUTO_INCREMENT,
  `CustomerID` int NOT NULL,
  `RoomNumber` int NOT NULL,
  `CheckinDate` date DEFAULT NULL,
  `CheckoutDate` date DEFAULT NULL,
  `NoOfDays` int DEFAULT NULL,
  `Status` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`BookingID`),
  KEY `CustomerID` (`CustomerID`),
  KEY `RoomNumber` (`RoomNumber`),
  CONSTRAINT `Booking_ibfk_1` FOREIGN KEY (`CustomerID`) REFERENCES `Customer` (`CustomerID`),
  CONSTRAINT `Booking_ibfk_2` FOREIGN KEY (`RoomNumber`) REFERENCES `Room` (`RoomNumber`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Booking`
--

LOCK TABLES `Booking` WRITE;
/*!40000 ALTER TABLE `Booking` DISABLE KEYS */;
INSERT INTO `Booking` VALUES (1,4,2,'2024-05-09','2024-05-17',8,'Confirm');
INSERT INTO `Booking` VALUES (2,5,10,'2024-05-08','2024-05-15',7,'Confirm');
INSERT INTO `Booking` VALUES (3,6,5,'2024-05-21','2024-05-25',4,'Confirm');
INSERT INTO `Booking` VALUES (4,7,10,'2024-05-09','2024-05-16',7,'Confirm');
INSERT INTO `Booking` VALUES (7,19,2,'2024-05-18','2024-05-20',2,'Confirm');
INSERT INTO `Booking` VALUES (8,23,5,'2024-05-09','2024-05-15',6,'Confirm');
INSERT INTO `Booking` VALUES (9,25,13,'2024-05-27','2024-05-31',4,'Confirm');
INSERT INTO `Booking` VALUES (10,26,5,'2024-05-02','2024-05-08',6,'Confirm');
INSERT INTO `Booking` VALUES (11,27,5,'2024-05-16','2024-05-23',7,'Confirm');
INSERT INTO `Booking` VALUES (12,28,10,'2024-05-09','2024-05-21',12,'Confirm');
INSERT INTO `Booking` VALUES (13,29,20,'2024-05-01','2024-05-13',12,'Confirm');
INSERT INTO `Booking` VALUES (14,30,2,'2024-05-23','2024-05-26',3,'Confirm');
INSERT INTO `Booking` VALUES (15,31,3,'2024-05-19','2024-05-25',6,'Confirm');
INSERT INTO `Booking` VALUES (16,32,5,'2024-07-14','2024-07-20',6,'Confirm');
INSERT INTO `Booking` VALUES (17,33,5,'2024-05-19','2024-05-25',6,'Confirm');
INSERT INTO `Booking` VALUES (18,34,8,'2024-08-18','2024-08-21',3,'Confirm');
INSERT INTO `Booking` VALUES (19,35,18,'2024-05-19','2024-05-21',2,'Confirm');
INSERT INTO `Booking` VALUES (20,36,11,'2024-09-11','2024-09-20',9,'Confirm');
INSERT INTO `Booking` VALUES (21,37,8,'2024-05-20','2024-05-22',2,'Pending');
INSERT INTO `Booking` VALUES (22,38,18,'2024-05-21','2024-05-25',4,'Confirm');
INSERT INTO `Booking` VALUES (23,39,18,'2024-05-18','2024-05-22',4,'Confirm');
INSERT INTO `Booking` VALUES (24,40,10,'2024-05-22','2024-05-31',9,'Confirm');
INSERT INTO `Booking` VALUES (26,42,19,'2024-05-20','2024-05-26',6,'Confirm');
INSERT INTO `Booking` VALUES (27,42,19,'2024-05-20','2024-05-26',6,'Confirm');
INSERT INTO `Booking` VALUES (28,44,20,'2024-05-20','2024-05-23',3,'Confirm');
/*!40000 ALTER TABLE `Booking` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Customer`
--

DROP TABLE IF EXISTS `Customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Customer` (
  `CustomerID` int NOT NULL AUTO_INCREMENT,
  `UID` int NOT NULL,
  `CName` varchar(50) NOT NULL,
  `DateOfBirth` date DEFAULT NULL,
  `Address` varchar(70) DEFAULT NULL,
  `Email` varchar(70) DEFAULT NULL,
  `Country` varchar(20) DEFAULT NULL,
  `Phone` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`CustomerID`),
  KEY `UID` (`UID`),
  CONSTRAINT `Customer_ibfk_1` FOREIGN KEY (`UID`) REFERENCES `User` (`UID`)
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Customer`
--

LOCK TABLES `Customer` WRITE;
/*!40000 ALTER TABLE `Customer` DISABLE KEYS */;
INSERT INTO `Customer` VALUES (4,4,'Gabriel Jesus','2000-05-16','Arsenal','js@gmail.com','Brazil','0564324643');
INSERT INTO `Customer` VALUES (5,4,'Thomas Partey','2000-05-21','Arsenal','TP@gmail.com','Ghana','0546982317');
INSERT INTO `Customer` VALUES (6,5,'Nguyen Nguyen','1997-02-27','152 Tran Phu, Nha Trang','nguyennguyentran@gmail.com','Vietnam','09873628918');
INSERT INTO `Customer` VALUES (7,4,'Gabriel Martinelli','2000-05-17','Arsenal','GM@gmail.com','Brazil','0569846231');
INSERT INTO `Customer` VALUES (19,1,'Viet Nam','2000-05-11','Thu Duc','abc@gmail.com','Vietnam','0192836475');
INSERT INTO `Customer` VALUES (23,4,'Zichenko','2000-05-15','Arsenal','z30@gmail.com','Afghanistan','0564978356');
INSERT INTO `Customer` VALUES (25,2,'William','1980-01-01','LA','william@gmail.com','United States','0123524168');
INSERT INTO `Customer` VALUES (26,4,'Gabriel','2000-05-01','Arsenal','G@gmail.com','Brazil','569846231');
INSERT INTO `Customer` VALUES (27,4,'Jorginho','2000-05-22','Arsenal','J20@gmail.com','Italy','0579862341');
INSERT INTO `Customer` VALUES (28,4,'Benjamin White','2000-05-16','Arsenal','b4@gmail.com','United Kingdom','0453261789');
INSERT INTO `Customer` VALUES (29,4,'David Raya','2000-05-10','Arsenal','gk@gmail.com','Spain','0154693741');
INSERT INTO `Customer` VALUES (30,2,'Alice','1989-10-25','Pakis','a@gmail.com','Pakistan','3216410629');
INSERT INTO `Customer` VALUES (31,5,'Eric Krylova','1985-12-26','Vico Giganti, 13, 06049-Bazzano Inferiore PG','EricKrylova@jourrapide.com','Russian Federation','+39 366 0158925');
INSERT INTO `Customer` VALUES (32,5,'Đào Kim Tâm','2002-05-26','13/65 Nguyen Thai Hoc, Q1, HCMC','DaoKimTam@dayrep.com','Vietnam','0908497879');
INSERT INTO `Customer` VALUES (33,5,'Rahmana Viderman','1998-01-09','3535 Driftwood Road Oakland, CA 94612','RahmanaViderman@jourrapide.com','United States','+1 408-403-7158');
INSERT INTO `Customer` VALUES (34,5,'Harald Andreuzzi','2004-11-29','2311 Jerry Toth Drive Kodiak, AK 99615','HaraldAndreuzzi@dayrep.com','United States','+1 907-486-9747');
INSERT INTO `Customer` VALUES (35,5,'Julia Kaitainen','1987-11-02','51, place de Miremont 47300 VILLENEUVE-SUR-LOT','JuliaKaitainen@armyspy.com','France','+33576561911');
INSERT INTO `Customer` VALUES (36,5,'Mee Pan','1992-01-27','73, rue du Gue Jacquet 36000 CHÂTEAUROUX','MeePan@teleworm.us','France','+33218412541');
INSERT INTO `Customer` VALUES (37,8,'Rinkimirikakuta','1997-02-06','Belgrád rkp. 25.','Rinkimirikakuta@teleworm.us','Hungary','9434795');
INSERT INTO `Customer` VALUES (38,8,'Bowman Brownlock','1950-03-15','3876 rue Parc Sherbrooke, QC J1H 1R6','BowmanBrownlock@dayrep.com','Canada','8195789160');
INSERT INTO `Customer` VALUES (39,9,'Johny Deep','1999-08-01','345 VoVanNgan ','nganhminh23@gmail.com','Vietnam','0556783241');
INSERT INTO `Customer` VALUES (40,9,'Pham Nam','1995-02-09','237 nguyen xi','jj7777@gmail.com','Vietnam','0837213458');
INSERT INTO `Customer` VALUES (41,11,'Nguyễn Mai Anh Nam ','2003-11-07','Thủ Đức, Tp HCM','nguyenmaianhnam@gmail.com','Vietnam','0901798826');
INSERT INTO `Customer` VALUES (42,12,'Khang Tran','2003-07-18','11 St French','khang1@gmail.com','French Guiana','0914589789');
INSERT INTO `Customer` VALUES (43,12,'Khang Tran','2003-07-18','11 St French','khang1@gmail.com','French Guiana','0914589789');
INSERT INTO `Customer` VALUES (44,9,'Michelle Yang','1982-05-05','23 northcoast','MY1982@gmail.com','United States','0228901182');
/*!40000 ALTER TABLE `Customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Employee`
--

DROP TABLE IF EXISTS `Employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Employee` (
  `EmployeeID` int NOT NULL AUTO_INCREMENT,
  `HotelID` int DEFAULT '10',
  `FirstName` varchar(25) DEFAULT NULL,
  `MiddleName` varchar(25) DEFAULT NULL,
  `LastName` varchar(25) NOT NULL,
  `Role` varchar(25) NOT NULL,
  `Salary` decimal(10,2) DEFAULT NULL,
  `DateOfBirth` date DEFAULT NULL,
  `HireDate` date DEFAULT NULL,
  `Phone` varchar(15) DEFAULT NULL,
  `Email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`EmployeeID`),
  KEY `HotelID` (`HotelID`),
  CONSTRAINT `Employee_ibfk_1` FOREIGN KEY (`HotelID`) REFERENCES `Hotel` (`HotelID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Employee`
--

LOCK TABLES `Employee` WRITE;
/*!40000 ALTER TABLE `Employee` DISABLE KEYS */;
INSERT INTO `Employee` VALUES (1,10,'PDM','Hotel','Group 6','manager',2000.00,'2000-11-11','2020-11-11','0882837487','hcmiu@gmail.com');
INSERT INTO `Employee` VALUES (2,10,'John','','Lee','Receptionist',NULL,'2000-05-11','2024-05-01','0564392768','Lee@gmail.com');
INSERT INTO `Employee` VALUES (3,10,'Martin','','Odegaard','Chef',NULL,'2000-05-10','2024-05-01','0536159753','o8@gmail.com');
INSERT INTO `Employee` VALUES (4,10,'Kai','','Harvert','Waiter',NULL,'2000-05-13','2024-05-01','0264563289','King@gmail.com');
INSERT INTO `Employee` VALUES (5,10,'Bukayo ','','Saka','Housekeeping',NULL,'2000-05-17','2024-05-01','0456987465','spicy@gmail.com');
INSERT INTO `Employee` VALUES (6,10,'Declan','','Rice','Reservation',NULL,'2000-05-03','2024-05-01','0365426987','100m@gmail.com');
INSERT INTO `Employee` VALUES (7,10,'William','','Saliba','Bell man',NULL,'2000-05-03','2024-05-01','0365426987','Salibo@gmail.com');
/*!40000 ALTER TABLE `Employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Hotel`
--

DROP TABLE IF EXISTS `Hotel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Hotel` (
  `HotelID` int NOT NULL DEFAULT '10',
  `Name` varchar(50) DEFAULT 'HCMIU',
  `Address` varchar(100) DEFAULT 'Quarter 6, Linh Trung ward, Thu Duc, HCMC',
  `Phone` varchar(15) DEFAULT '(028) 37244270',
  `Email` varchar(100) DEFAULT 'info@hcmiu.edu.vn',
  `Quality` int DEFAULT '5',
  PRIMARY KEY (`HotelID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Hotel`
--

LOCK TABLES `Hotel` WRITE;
/*!40000 ALTER TABLE `Hotel` DISABLE KEYS */;
INSERT INTO `Hotel` VALUES (10,'HCMIU','Quarter 6, Linh Trung ward, Thu Duc, HCMC','(028) 37244270','info@hcmiu.edu.vn',5);
/*!40000 ALTER TABLE `Hotel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Management`
--

DROP TABLE IF EXISTS `Management`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Management` (
  `MID` int NOT NULL AUTO_INCREMENT,
  `EmployeeID` int NOT NULL,
  `EmpUsername` varchar(10) DEFAULT NULL,
  `PASSWORD` varchar(64) NOT NULL,
  PRIMARY KEY (`MID`),
  KEY `EmployeeID` (`EmployeeID`),
  CONSTRAINT `Management_ibfk_1` FOREIGN KEY (`EmployeeID`) REFERENCES `Employee` (`EmployeeID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Management`
--

LOCK TABLES `Management` WRITE;
/*!40000 ALTER TABLE `Management` DISABLE KEYS */;
INSERT INTO `Management` VALUES (1,1,'hcmiu','1234');
/*!40000 ALTER TABLE `Management` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Payment`
--

DROP TABLE IF EXISTS `Payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Payment` (
  `PaymentID` int NOT NULL AUTO_INCREMENT,
  `BookingID` int NOT NULL,
  `Amount` decimal(10,2) DEFAULT NULL,
  `PaymentDate` date DEFAULT NULL,
  `PaymentMethod` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`PaymentID`),
  KEY `BookingID` (`BookingID`),
  CONSTRAINT `Payment_ibfk_1` FOREIGN KEY (`BookingID`) REFERENCES `Booking` (`BookingID`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Payment`
--

LOCK TABLES `Payment` WRITE;
/*!40000 ALTER TABLE `Payment` DISABLE KEYS */;
INSERT INTO `Payment` VALUES (5,3,320.00,'2024-05-18','Card');
INSERT INTO `Payment` VALUES (6,4,1750.00,'2024-05-17','Cash');
INSERT INTO `Payment` VALUES (7,1,4000.00,'2024-05-18','Card');
INSERT INTO `Payment` VALUES (8,2,1750.00,'2024-05-18','Card');
INSERT INTO `Payment` VALUES (9,7,1000.00,'2024-05-18','Card');
INSERT INTO `Payment` VALUES (11,8,480.00,'2024-05-16','Card');
INSERT INTO `Payment` VALUES (12,9,1200.00,'2024-05-23','Cash');
INSERT INTO `Payment` VALUES (13,10,480.00,'2024-05-23','Cash');
INSERT INTO `Payment` VALUES (14,11,560.00,'2024-05-22','Cash');
INSERT INTO `Payment` VALUES (15,12,3000.00,'2024-05-22','Cash');
INSERT INTO `Payment` VALUES (16,13,1560.00,'2024-05-22','Cash');
INSERT INTO `Payment` VALUES (17,14,1500.00,'2024-05-22','Membership');
INSERT INTO `Payment` VALUES (18,15,2100.00,'2024-05-21','Card');
INSERT INTO `Payment` VALUES (19,16,480.00,'2024-05-29','Cash');
INSERT INTO `Payment` VALUES (20,17,480.00,'2024-05-23','Cash');
INSERT INTO `Payment` VALUES (21,18,630.00,'2024-05-25','Cash');
INSERT INTO `Payment` VALUES (22,19,700.00,'2024-05-25','Membership');
INSERT INTO `Payment` VALUES (23,20,2700.00,'2024-05-25','Card');
INSERT INTO `Payment` VALUES (24,23,1400.00,'2024-05-18','Card');
INSERT INTO `Payment` VALUES (25,24,2250.00,'2024-05-20','Cash');
INSERT INTO `Payment` VALUES (26,28,390.00,'2024-05-19','Membership');
INSERT INTO `Payment` VALUES (27,26,1200.00,'2024-05-25','Cash');
INSERT INTO `Payment` VALUES (28,27,1200.00,'2024-05-31','Cash');
INSERT INTO `Payment` VALUES (29,27,1200.00,'2024-05-21','Card');
INSERT INTO `Payment` VALUES (31,22,1400.00,'2024-05-25','Card');
INSERT INTO `Payment` VALUES (32,22,1400.00,'2024-05-25','Card');
/*!40000 ALTER TABLE `Payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Room`
--

DROP TABLE IF EXISTS `Room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Room` (
  `RoomNumber` int NOT NULL AUTO_INCREMENT,
  `TypeID` int DEFAULT NULL,
  `Status` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`RoomNumber`),
  KEY `TypeID` (`TypeID`),
  CONSTRAINT `Room_ibfk_1` FOREIGN KEY (`TypeID`) REFERENCES `RoomType` (`TypeID`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Room`
--

LOCK TABLES `Room` WRITE;
/*!40000 ALTER TABLE `Room` DISABLE KEYS */;
INSERT INTO `Room` VALUES (2,2,'Ready');
INSERT INTO `Room` VALUES (3,3,'Ready');
INSERT INTO `Room` VALUES (4,4,'Ready');
INSERT INTO `Room` VALUES (5,5,'Ready');
INSERT INTO `Room` VALUES (6,6,'Ready');
INSERT INTO `Room` VALUES (7,7,'Ready');
INSERT INTO `Room` VALUES (8,8,'Ready');
INSERT INTO `Room` VALUES (9,9,'Ready');
INSERT INTO `Room` VALUES (10,10,'Ready');
INSERT INTO `Room` VALUES (11,11,'Ready');
INSERT INTO `Room` VALUES (12,12,'Ready');
INSERT INTO `Room` VALUES (13,13,'Ready');
INSERT INTO `Room` VALUES (14,14,'Ready');
INSERT INTO `Room` VALUES (15,15,'Used');
INSERT INTO `Room` VALUES (16,16,'Ready');
INSERT INTO `Room` VALUES (17,17,'Ready');
INSERT INTO `Room` VALUES (18,18,'Ready');
INSERT INTO `Room` VALUES (19,19,'Ready');
INSERT INTO `Room` VALUES (20,20,'Ready');
INSERT INTO `Room` VALUES (21,21,'Cleaning');
INSERT INTO `Room` VALUES (22,22,'Ready');
INSERT INTO `Room` VALUES (23,23,'Ready');
INSERT INTO `Room` VALUES (24,24,'Cleaning');
INSERT INTO `Room` VALUES (25,25,'Cleaning');
/*!40000 ALTER TABLE `Room` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `RoomType`
--

DROP TABLE IF EXISTS `RoomType`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `RoomType` (
  `TypeID` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(50) DEFAULT NULL,
  `Description` varchar(255) DEFAULT NULL,
  `Price` decimal(10,2) DEFAULT NULL,
  `Capacity` int DEFAULT NULL,
  `HotelID` int DEFAULT '10',
  PRIMARY KEY (`TypeID`),
  KEY `HotelID` (`HotelID`),
  CONSTRAINT `RoomType_ibfk_1` FOREIGN KEY (`HotelID`) REFERENCES `Hotel` (`HotelID`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `RoomType`
--

LOCK TABLES `RoomType` WRITE;
/*!40000 ALTER TABLE `RoomType` DISABLE KEYS */;
INSERT INTO `RoomType` VALUES (1,'Superior Room','King room ',300.00,4,10);
INSERT INTO `RoomType` VALUES (2,'Superior Room','excellent',300.00,4,10);
INSERT INTO `RoomType` VALUES (3,'Queen Room','excellent',200.00,3,10);
INSERT INTO `RoomType` VALUES (4,'Queen Room','excellent',200.00,3,10);
INSERT INTO `RoomType` VALUES (5,'Single Room','good',30.00,1,10);
INSERT INTO `RoomType` VALUES (6,'Single Room','good',30.00,1,10);
INSERT INTO `RoomType` VALUES (7,'Single Room','good',30.00,1,10);
INSERT INTO `RoomType` VALUES (8,'Studio Room','good',60.00,3,10);
INSERT INTO `RoomType` VALUES (9,'Studio Room','nice',60.00,3,10);
INSERT INTO `RoomType` VALUES (10,'Deluxe Room','very nice',100.00,3,10);
INSERT INTO `RoomType` VALUES (11,'Queen Room','excellent',200.00,2,10);
INSERT INTO `RoomType` VALUES (12,'Deluxe Room','very nice',100.00,3,10);
INSERT INTO `RoomType` VALUES (13,'Deluxe Room','very nice',100.00,4,10);
INSERT INTO `RoomType` VALUES (14,'Single Room','normal',30.00,1,10);
INSERT INTO `RoomType` VALUES (15,'Single Room','normal',30.00,1,10);
INSERT INTO `RoomType` VALUES (16,'Studio Room','',60.00,2,10);
INSERT INTO `RoomType` VALUES (17,'Studio Room','good',60.00,2,10);
INSERT INTO `RoomType` VALUES (18,'Superior Room','King room',300.00,1,10);
INSERT INTO `RoomType` VALUES (19,'Deluxe Room','nice',100.00,2,10);
INSERT INTO `RoomType` VALUES (20,'Single Room','nice',30.00,2,10);
INSERT INTO `RoomType` VALUES (21,'Single Room','nice',30.00,2,10);
INSERT INTO `RoomType` VALUES (22,'Single Room','nice',30.00,2,10);
INSERT INTO `RoomType` VALUES (23,'Superior Room','good',300.00,1,10);
INSERT INTO `RoomType` VALUES (24,'Superior Room','good',300.00,1,10);
INSERT INTO `RoomType` VALUES (25,'Single Room','',30.00,1,10);
/*!40000 ALTER TABLE `RoomType` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `User`
--

DROP TABLE IF EXISTS `User`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `User` (
  `UID` int NOT NULL AUTO_INCREMENT,
  `Username` varchar(16) NOT NULL,
  `Email` varchar(32) NOT NULL,
  `Password` varchar(32) NOT NULL,
  PRIMARY KEY (`UID`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `User`
--

LOCK TABLES `User` WRITE;
/*!40000 ALTER TABLE `User` DISABLE KEYS */;
INSERT INTO `User` VALUES (1,'Manager','nothing','!@#$%^&*()Qwerty123');
INSERT INTO `User` VALUES (2,'nam','test@gmail.com','123');
INSERT INTO `User` VALUES (3,'vietnam','yuenan@gmail.com','abcxyz');
INSERT INTO `User` VALUES (4,'Heius','asasa@gmail.com','123456');
INSERT INTO `User` VALUES (5,'PhuongTran','nypd.vn.swat@gmail.com','1234');
INSERT INTO `User` VALUES (6,'Tommy','12345@gmail.com','12345');
INSERT INTO `User` VALUES (7,'abcxyz','abcxyz@gmail.com','abcxyz');
INSERT INTO `User` VALUES (8,'man','tset-3002@gmail.com','123');
INSERT INTO `User` VALUES (9,'Johny','nganhminh23@gmail.com','01qD0110');
INSERT INTO `User` VALUES (10,'Anhnam','nguyenmaianhnam@gmail.com','nguyenmaianhnam');
INSERT INTO `User` VALUES (11,'camcam71103','anhnam11b7@gmail.com','nguyenmaianhnam');
INSERT INTO `User` VALUES (12,'Khang12345','khang1@gmail.com','12345');
/*!40000 ALTER TABLE `User` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-18 12:30:00
