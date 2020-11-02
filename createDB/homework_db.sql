-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Nov 02, 2020 at 02:31 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `homework_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `Achievement`
--

CREATE TABLE `Achievement` (
  `ID` int(8) NOT NULL,
  `Achievement_Name` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `Achievement`
--

INSERT INTO `Achievement` (`ID`, `Achievement_Name`) VALUES
(1, 'Học sinh Giỏi'),
(2, 'Học sinh Tiên tiến '),
(3, NULL),
(4, 'Dịp đặc biệt');

-- --------------------------------------------------------

--
-- Table structure for table `Event`
--

CREATE TABLE `Event` (
  `ID` int(8) NOT NULL,
  `Name` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Year` year(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `Event`
--

INSERT INTO `Event` (`ID`, `Name`, `Year`) VALUES
(2, 'Trung thu', 2020),
(3, 'Tết thiếu nhi', 2020),
(4, 'Cuối năm học', 2020);

-- --------------------------------------------------------

--
-- Table structure for table `Family`
--

CREATE TABLE `Family` (
  `ID` int(8) NOT NULL,
  `Father` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Mother` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Address` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `Family`
--

INSERT INTO `Family` (`ID`, `Father`, `Mother`, `Address`) VALUES
(1, 'Lê Việt Hùng ', 'Trần Thanh Hà ', 'Hà Nội '),
(2, 'Phạm Tùng', 'Nguyễn Dương', 'Hà Nội '),
(3, 'Lê Mạnh Hùng', 'Nguyễn Thanh Hải', ''),
(4, 'Phạm Tùng     ', 'Nguyễn Hoài Thu', ''),
(5, 'Lê Mạnh Hùng', 'Nguyễn Thị Hoài', 'Hà Nội'),
(6, 'Nguyễn Hùng', 'Lê Thỏ', 'Hà Nội'),
(15, 'Nguyễn Đức Hào', 'Bùi Thị Trà', 'Hà Nội'),
(17, 'Nguyễn Hoàng Mạnh', 'Nguyễn Thị Ngọc', 'Hải Dương');

-- --------------------------------------------------------

--
-- Table structure for table `Gift`
--

CREATE TABLE `Gift` (
  `ID` int(8) NOT NULL,
  `Gift_Name` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Cost` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `Gift`
--

INSERT INTO `Gift` (`ID`, `Gift_Name`, `Cost`) VALUES
(1, 'Bánh', 10000),
(2, 'Kẹo', 5000),
(3, 'Hoa quả', 5000),
(4, 'Hoa quả', 10000),
(27, 'Bánh', 15000);

-- --------------------------------------------------------

--
-- Table structure for table `Receive_Gift`
--

CREATE TABLE `Receive_Gift` (
  `ID` int(8) NOT NULL,
  `ID_Recipient` int(8) NOT NULL,
  `ID_Gift` int(8) NOT NULL,
  `ID_Event` int(8) NOT NULL,
  `ID_Achievement` int(8) NOT NULL,
  `Quantity` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `Receive_Gift`
--

INSERT INTO `Receive_Gift` (`ID`, `ID_Recipient`, `ID_Gift`, `ID_Event`, `ID_Achievement`, `Quantity`) VALUES
(1, 1, 1, 2, 1, 5),
(2, 1, 1, 3, 1, 5),
(9, 9, 27, 2, 4, 10),
(10, 10, 27, 2, 4, 10),
(11, 11, 27, 2, 4, 10);

-- --------------------------------------------------------

--
-- Table structure for table `Recipient`
--

CREATE TABLE `Recipient` (
  `ID` int(8) NOT NULL,
  `Name` varchar(50) COLLATE utf8_vietnamese_ci NOT NULL,
  `Age` int(4) NOT NULL,
  `Sex` varchar(50) COLLATE utf8_vietnamese_ci DEFAULT NULL,
  `School` varchar(50) COLLATE utf8_vietnamese_ci NOT NULL,
  `ID_Family` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `Recipient`
--

INSERT INTO `Recipient` (`ID`, `Name`, `Age`, `Sex`, `School`, `ID_Family`) VALUES
(1, 'Lê Mạnh Tú', 10, NULL, 'HUST', 1),
(2, 'Nguyễn Thu Thảo', 19, NULL, 'TMU ', 1),
(8, 'Nguyễn Đình Hùng', 20, 'Nam', 'HUST', 15),
(9, 'Nguyễn Hoàng Long', 17, 'Nam', 'HUST', 17),
(10, 'Nguyễn Hoàng Hải', 17, 'Nam', 'HUST', 17),
(11, 'Nguyễn Hoàng Lộc', 17, 'Nam', 'HUST', 17);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Achievement`
--
ALTER TABLE `Achievement`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `Event`
--
ALTER TABLE `Event`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `Family`
--
ALTER TABLE `Family`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `Gift`
--
ALTER TABLE `Gift`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `Receive_Gift`
--
ALTER TABLE `Receive_Gift`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FK_RG_Recipient` (`ID_Recipient`),
  ADD KEY `FK_RG_Gift` (`ID_Gift`),
  ADD KEY `FK_RG_Event` (`ID_Event`),
  ADD KEY `FK_RG_Achievement` (`ID_Achievement`);

--
-- Indexes for table `Recipient`
--
ALTER TABLE `Recipient`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FK_Family_Recipient` (`ID_Family`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Achievement`
--
ALTER TABLE `Achievement`
  MODIFY `ID` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `Event`
--
ALTER TABLE `Event`
  MODIFY `ID` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `Family`
--
ALTER TABLE `Family`
  MODIFY `ID` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `Gift`
--
ALTER TABLE `Gift`
  MODIFY `ID` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT for table `Receive_Gift`
--
ALTER TABLE `Receive_Gift`
  MODIFY `ID` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `Recipient`
--
ALTER TABLE `Recipient`
  MODIFY `ID` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `Receive_Gift`
--
ALTER TABLE `Receive_Gift`
  ADD CONSTRAINT `FK_RG_Achievement` FOREIGN KEY (`ID_Achievement`) REFERENCES `Achievement` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_RG_Event` FOREIGN KEY (`ID_Event`) REFERENCES `Event` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_RG_Gift` FOREIGN KEY (`ID_Gift`) REFERENCES `Gift` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_RG_Recipient` FOREIGN KEY (`ID_Recipient`) REFERENCES `Recipient` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `Recipient`
--
ALTER TABLE `Recipient`
  ADD CONSTRAINT `FK_Family_Recipient` FOREIGN KEY (`ID_Family`) REFERENCES `Family` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
