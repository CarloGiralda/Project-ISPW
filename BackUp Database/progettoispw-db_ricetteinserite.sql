-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: progettoispw-db
-- ------------------------------------------------------
-- Server version	8.0.27

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
-- Table structure for table `ricetteinserite`
--

DROP TABLE IF EXISTS `ricetteinserite`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ricetteinserite` (
  `Nome` varchar(30) NOT NULL,
  `Ricetta` varchar(45) NOT NULL,
  `Ingrediente` varchar(45) NOT NULL,
  `Livello` int NOT NULL,
  `Tempo` int NOT NULL,
  `Intolleranza` varchar(45) NOT NULL,
  `Type` varchar(30) NOT NULL,
  `Description` varchar(1500) NOT NULL,
  `Ammontare` varchar(30) NOT NULL,
  `Allergies` varchar(300) NOT NULL,
  PRIMARY KEY (`Nome`,`Ricetta`,`Ingrediente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ricetteinserite`
--

LOCK TABLES `ricetteinserite` WRITE;
/*!40000 ALTER TABLE `ricetteinserite` DISABLE KEYS */;
INSERT INTO `ricetteinserite` VALUES ('ciao','Carbonara','Guanciale',1,50,'None','Main dish','Pasta','25','Eggs Meat'),('ciao','Carbonara','Pasta',1,50,'None','Main dish','Pasta','100','Eggs Meat'),('ciao','Risotto','Pasta',2,100,'None','Main dish','Pasta','100','Fish'),('ciao','Risotto','Scampi',2,100,'None','Main dish','Pasta','50','Fish'),('hi','Avocado toast','Avocado',1,15,'Vegetarian','Side dish','Tostare il pane in cassetta, preparare uova all\'occhio di bue con filo d\'uovo, salate e pepate e con un coppapasta tagliatelo della dimensione più adatta per adagiarlo su un toast. Infine tagliare a metà l\'avocado ed inciderlo o farlo a fettine e sistemarlo sul pesto.','0.5','Eggs'),('hi','Avocado toast','Pane',1,15,'Vegetarian','Side dish','Tostare il pane in cassetta, preparare uova all\'occhio di bue con filo d\'uovo, salate e pepate e con un coppapasta tagliatelo della dimensione più adatta per adagiarlo su un toast. Infine tagliare a metà l\'avocado ed inciderlo o farlo a fettine e sistemarlo sul pesto.','1','Eggs'),('hi','Avocado toast','Pepe',1,15,'Vegetarian','Side dish','Tostare il pane in cassetta, preparare uova all\'occhio di bue con filo d\'uovo, salate e pepate e con un coppapasta tagliatelo della dimensione più adatta per adagiarlo su un toast. Infine tagliare a metà l\'avocado ed inciderlo o farlo a fettine e sistemarlo sul pesto.','10','Eggs'),('hi','Avocado toast','Pesto',1,15,'Vegetarian','Side dish','Tostare il pane in cassetta, preparare uova all\'occhio di bue con filo d\'uovo, salate e pepate e con un coppapasta tagliatelo della dimensione più adatta per adagiarlo su un toast. Infine tagliare a metà l\'avocado ed inciderlo o farlo a fettine e sistemarlo sul pesto.','2','Eggs'),('hi','Avocado toast','Sale',1,15,'Vegetarian','Side dish','Tostare il pane in cassetta, preparare uova all\'occhio di bue con filo d\'uovo, salate e pepate e con un coppapasta tagliatelo della dimensione più adatta per adagiarlo su un toast. Infine tagliare a metà l\'avocado ed inciderlo o farlo a fettine e sistemarlo sul pesto.','10','Eggs'),('hi','Avocado toast','Uova',1,15,'Vegetarian','Side dish','Tostare il pane in cassetta, preparare uova all\'occhio di bue con filo d\'uovo, salate e pepate e con un coppapasta tagliatelo della dimensione più adatta per adagiarlo su un toast. Infine tagliare a metà l\'avocado ed inciderlo o farlo a fettine e sistemarlo sul pesto.','1','Eggs'),('hi','Cacio e pepe','Cacio',1,15,'Vegetarian','Main dish','Pasta','25','Milk'),('hi','Cacio e pepe','Pasta',1,15,'Vegetarian','Main dish','Pasta','100','Milk'),('hi','Cacio e pepe','Pepe',1,15,'Vegetarian','Main dish','Pasta','25','Milk'),('hi','Carbonara','Pasta',2,50,'None','Main dish','Pasta','10','Meat'),('hi','Carbonara','Uova',2,50,'None','Main dish','Pasta','5','Meat'),('hi','Carne con patate','Carne',2,5,'None','Side dish','Carne','100','Meat'),('hi','Carne con patate','Patate',2,5,'None','Side dish','Carne','50','Meat'),('hi','Cornetto alla nutella','Cornetto',1,0,'Vegan','Dessert','Dividere il cornetto e spalmare la nutella','50','No allergies'),('hi','Cornetto alla nutella','Nutella',1,0,'Vegan','Dessert','Dividere il cornetto e spalmare la nutella','10','No allergies'),('hi','Crema','Farina',1,15,'Vegetarian','Dessert','Crema','200','Eggs Milk'),('hi','Crema','Olio',1,15,'Vegetarian','Dessert','Crema','20','Eggs Milk'),('hi','Crema','Uovo',1,15,'Vegetarian','Dessert','Crema','80','Eggs Milk'),('hi','Crema','Zucchero',1,15,'Vegetarian','Dessert','Crema','100','Eggs Milk'),('hi','Finocchi ai 4 formaggi','Burro',1,15,'Vegan','Side dish','Ridurre i finocchi a fettine, cuoceteli in una padella con 20g di burro, un dito di acqua e una presa di sale per 5 minuti a recipiente coperto. Scoprite facendo sfumare il liquido, trasferite i finocchi in una pirofila e versaste sopra la sala ai formaggi, fate scladare in forno a 180° per 5 minuti.','20','Milk'),('hi','Finocchi ai 4 formaggi','Finocchio',1,15,'Vegan','Side dish','Ridurre i finocchi a fettine, cuoceteli in una padella con 20g di burro, un dito di acqua e una presa di sale per 5 minuti a recipiente coperto. Scoprite facendo sfumare il liquido, trasferite i finocchi in una pirofila e versaste sopra la sala ai formaggi, fate scladare in forno a 180° per 5 minuti.','3','Milk'),('hi','Finocchi ai 4 formaggi','Pepe',1,15,'Vegan','Side dish','Ridurre i finocchi a fettine, cuoceteli in una padella con 20g di burro, un dito di acqua e una presa di sale per 5 minuti a recipiente coperto. Scoprite facendo sfumare il liquido, trasferite i finocchi in una pirofila e versaste sopra la sala ai formaggi, fate scladare in forno a 180° per 5 minuti.','10','Milk'),('hi','Finocchi ai 4 formaggi','Sale',1,15,'Vegan','Side dish','Ridurre i finocchi a fettine, cuoceteli in una padella con 20g di burro, un dito di acqua e una presa di sale per 5 minuti a recipiente coperto. Scoprite facendo sfumare il liquido, trasferite i finocchi in una pirofila e versaste sopra la sala ai formaggi, fate scladare in forno a 180° per 5 minuti.','10','Milk'),('hi','Finocchi ai 4 formaggi','Sugo ai 4 formaggi',1,15,'Vegan','Side dish','Ridurre i finocchi a fettine, cuoceteli in una padella con 20g di burro, un dito di acqua e una presa di sale per 5 minuti a recipiente coperto. Scoprite facendo sfumare il liquido, trasferite i finocchi in una pirofila e versaste sopra la sala ai formaggi, fate scladare in forno a 180° per 5 minuti.','1','Milk'),('hi','Gelato','Gelato',1,0,'Vegan','Dessert','Gelato','10','Milk'),('hi','Panino col salame','Pane',1,0,'None','Side dish','Tagliare il pane, prendere il salame dal frigo, mettere il salame nel pane','100','Meat'),('hi','Panino col salame','Salame',1,0,'None','Side dish','Tagliare il pane, prendere il salame dal frigo, mettere il salame nel pane','50','Meat'),('hi','Pasta e ceci','Ceci',1,10,'Vegan','Main dish','Pasta','30','No allergies'),('hi','Pasta e ceci','Pasta',1,10,'Vegan','Main dish','Pasta','100','No allergies'),('hi','Pizza','Mozzarella',2,30,'Vegetarian','Main dish','Pizza','10','No allergies'),('hi','Pizza','Pomodoro',2,30,'Vegetarian','Main dish','Pizza','10','No allergies'),('hi','Salmone in crosta','Latte',2,45,'None','Side dish','Lavate e tagliate i porry e conditeli con sale e pepe. Rimuovete la pelle del salmone, stendete il rotolo di pasta sfoglia, mettete prro e salmone nella pasta sfoglia, richiudete la pasta sfoglia, spennellate col latte, cuocete a 200 gradi per 25 minuti in forno.','10','Fish Eggs'),('hi','Salmone in crosta','Pasta Brisè',2,45,'None','Side dish','Lavate e tagliate i porry e conditeli con sale e pepe. Rimuovete la pelle del salmone, stendete il rotolo di pasta sfoglia, mettete prro e salmone nella pasta sfoglia, richiudete la pasta sfoglia, spennellate col latte, cuocete a 200 gradi per 25 minuti in forno.','100','Fish Eggs'),('hi','Salmone in crosta','Pepe',2,45,'None','Side dish','Lavate e tagliate i porry e conditeli con sale e pepe. Rimuovete la pelle del salmone, stendete il rotolo di pasta sfoglia, mettete prro e salmone nella pasta sfoglia, richiudete la pasta sfoglia, spennellate col latte, cuocete a 200 gradi per 25 minuti in forno.','10','Fish Eggs'),('hi','Salmone in crosta','Porry',2,45,'None','Side dish','Lavate e tagliate i porry e conditeli con sale e pepe. Rimuovete la pelle del salmone, stendete il rotolo di pasta sfoglia, mettete prro e salmone nella pasta sfoglia, richiudete la pasta sfoglia, spennellate col latte, cuocete a 200 gradi per 25 minuti in forno.','2','Fish Eggs'),('hi','Salmone in crosta','Sale',2,45,'None','Side dish','Lavate e tagliate i porry e conditeli con sale e pepe. Rimuovete la pelle del salmone, stendete il rotolo di pasta sfoglia, mettete prro e salmone nella pasta sfoglia, richiudete la pasta sfoglia, spennellate col latte, cuocete a 200 gradi per 25 minuti in forno.','10','Fish Eggs'),('hi','Salmone in crosta','Salmone',2,45,'None','Side dish','Lavate e tagliate i porry e conditeli con sale e pepe. Rimuovete la pelle del salmone, stendete il rotolo di pasta sfoglia, mettete prro e salmone nella pasta sfoglia, richiudete la pasta sfoglia, spennellate col latte, cuocete a 200 gradi per 25 minuti in forno.','500','Fish Eggs'),('hi','Spaghetti al pesto','Noci',1,12,'Vegetarian','Main dish','Fate cuocere la pasta in acqua bollente e salata secondo i minuti riportati. Servite con pesto e completate il piatto con noci sbriciolate','20','Dried fruit'),('hi','Spaghetti al pesto','Pesto',1,12,'Vegetarian','Main dish','Fate cuocere la pasta in acqua bollente e salata secondo i minuti riportati. Servite con pesto e completate il piatto con noci sbriciolate','1','Dried fruit'),('hi','Spaghetti al pesto','Spaghetti integrali',1,12,'Vegetarian','Main dish','Fate cuocere la pasta in acqua bollente e salata secondo i minuti riportati. Servite con pesto e completate il piatto con noci sbriciolate','280','Dried fruit'),('hi','Yogurt','Yogurt',1,0,'Vegan','Dessert','Yogurt','50','Milk');
/*!40000 ALTER TABLE `ricetteinserite` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-01-31 13:15:51
