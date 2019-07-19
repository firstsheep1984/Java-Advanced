-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 19, 2019 at 04:31 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `javalibrary`
--

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE `book` (
  `bookId` int(30) NOT NULL,
  `title` varchar(30) NOT NULL,
  `subject` varchar(40) DEFAULT NULL,
  `rackNo` varchar(30) DEFAULT NULL,
  `ISBN` varchar(20) DEFAULT NULL,
  `publisher` varchar(20) DEFAULT NULL,
  `bookBarcode` varchar(30) DEFAULT NULL,
  `userid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`bookId`, `title`, `subject`, `rackNo`, `ISBN`, `publisher`, `bookBarcode`, `userid`) VALUES
(5, 'Harry Porter 1', '', '', '', '', '', 5),
(6, '1231', '123', '', '', '', '', 5),
(17, '', '123', '', '', '', '', 5),
(18, 'HP', NULL, NULL, NULL, NULL, NULL, 3),
(19, 'Harry Porter 1', NULL, NULL, NULL, NULL, '12345', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `booklending`
--

CREATE TABLE `booklending` (
  `creationDate` date NOT NULL,
  `dueDate` date NOT NULL,
  `returnDate` date NOT NULL,
  `bookBarcode` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `catelog`
--

CREATE TABLE `catelog` (
  `title` varchar(30) NOT NULL,
  `author` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `catelog`
--

INSERT INTO `catelog` (`title`, `author`) VALUES
('Harry Porter 1', 'JK');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `username` varchar(30) NOT NULL,
  `family` varchar(30) NOT NULL,
  `age` int(3) NOT NULL,
  `userid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`username`, `family`, `age`, `userid`) VALUES
('Pete', 'sd', 16, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`bookId`);

--
-- Indexes for table `booklending`
--
ALTER TABLE `booklending`
  ADD PRIMARY KEY (`bookBarcode`);

--
-- Indexes for table `catelog`
--
ALTER TABLE `catelog`
  ADD PRIMARY KEY (`title`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`userid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `book`
--
ALTER TABLE `book`
  MODIFY `bookId` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `userid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
