-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 29, 2019 at 11:05 AM
-- Server version: 10.3.16-MariaDB
-- PHP Version: 7.3.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `empp`
--

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `empid` int(10) NOT NULL,
  `firstname` varchar(250) NOT NULL,
  `lastname` varchar(250) NOT NULL,
  `salary` int(250) NOT NULL,
  `joiningdate` date NOT NULL,
  `department` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`empid`, `firstname`, `lastname`, `salary`, `joiningdate`, `department`) VALUES
(1, 'Venkadesh', 's', 100000, '2015-08-28', 'Banking'),
(2, 'Ragavi', 'P', 75000, '2019-11-06', 'Business'),
(3, 'Gopinath', 'C', 50000, '2016-03-02', 'Pharmacy'),
(4, 'Dinesh', 'G', 50000, '2016-03-02', 'Insurance'),
(5, 'Saibabu', 'E', 40000, '2017-08-07', 'Software'),
(6, 'Hasan', 'S', 29000, '2017-08-07', 'Manufacturing'),
(7, 'Divya', 'P', 33000, '2017-08-07', 'Healthcare'),
(8, 'Aravindan', 'R', 40000, '2017-08-07', 'Healthcare'),
(9, 'Sathish', 'M.D', 45000, '2016-03-02', 'Automobile'),
(10, 'Prasanth', 'PKP', 34000, '2016-03-02', 'Insurance'),
(11, 'Vijay', 'R', 25684, '2016-03-02', 'Business'),
(12, 'Sivakumar', 'K', 54789, '2016-03-02', 'Software');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`empid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `empid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
