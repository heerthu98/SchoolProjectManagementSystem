-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 21, 2022 at 06:25 PM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 8.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kmvprojectmanagement`
--

-- --------------------------------------------------------

--
-- Table structure for table `itlab`
--

CREATE TABLE `itlab` (
  `pcid` int(11) NOT NULL,
  `pcname` varchar(255) NOT NULL,
  `ipaddress` varchar(32) NOT NULL,
  `studentsid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `itlab`
--

INSERT INTO `itlab` (`pcid`, `pcname`, `ipaddress`, `studentsid`) VALUES
(5, 'KMV/PC/01', '192.168.0.6', 5),
(6, 'KMV/PC/02', '192.168.252.47', 6),
(7, 'KMV/PC/03', '192.168.252.6', 7),
(8, 'KMV/PC/04', '172.31.255.255', 11),
(9, 'KMV/PC/05', '172.168.252.6', 12),
(10, 'KMV/PC/06', '10.255.255.255', 9),
(11, 'KMV/PC/07', '192.168.255.54', 8),
(12, 'KMV/PC/08', '192.168.0.45', 13);

-- --------------------------------------------------------

--
-- Table structure for table `project`
--

CREATE TABLE `project` (
  `projectid` int(11) NOT NULL,
  `projecttitle` varchar(255) NOT NULL,
  `supervisorname` varchar(255) NOT NULL,
  `supervisorphno` int(255) NOT NULL,
  `studentsname` varchar(255) NOT NULL,
  `studentsgrade` varchar(255) NOT NULL,
  `pcname` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `project`
--

INSERT INTO `project` (`projectid`, `projecttitle`, `supervisorname`, `supervisorphno`, `studentsname`, `studentsgrade`, `pcname`) VALUES
(4, 'Bus Booking System', 'Mr. Sathees', 776445234, 'K. Dushan', '11B', 'KMV/PC/01'),
(5, 'Library Management System', 'Mr. Vanesh', 778967453, 'M. Justin', '11A', 'KMV/PC/02'),
(6, 'Bus Booking System', 'Mr. Sathees', 776445234, 'A. Kumaran', '11A', 'KMV/PC/03'),
(7, 'Library Management System', 'Mr. Vanesh', 778967453, 'A. Keerthika', '11C', 'KMV/PC/06'),
(8, 'Bus Booking System', 'Mr. Sathees', 776445234, 'V. Mathani', '11C', 'KMV/PC/07'),
(9, 'Library Management System', 'Mr. Vanesh', 778967453, 'A.Kanakaran', '11B', 'KMV/PC/04'),
(10, 'Library Management System', 'Mr. Sathees', 776445234, 'T. Heerthana', '11A', 'KMV/PC/08');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `id` int(11) NOT NULL,
  `course` varchar(255) DEFAULT NULL,
  `fee` int(32) NOT NULL,
  `studentname` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`id`, `course`, `fee`, `studentname`) VALUES
(11, 'cst', 4, 'kaya'),
(12, 'cst', 4, 'heer');

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `studentsid` int(11) NOT NULL,
  `studentsname` varchar(255) NOT NULL,
  `studentsnic` varchar(32) NOT NULL,
  `studentsemail` varchar(255) NOT NULL,
  `studentsaddress` varchar(255) NOT NULL,
  `studentsgrade` varchar(255) NOT NULL,
  `projectid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`studentsid`, `studentsname`, `studentsnic`, `studentsemail`, `studentsaddress`, `studentsgrade`, `projectid`) VALUES
(5, 'K. Dushan', '200536010141', 'dushan56@gmail.com', 'Kili Town', '11A', 1),
(6, 'M. Justin', '200536012321', 'justin4@gmail.com', 'Kanakapuram', '11B', 2),
(7, 'A. Kumaran', '200536015123', 'kumaran@gmail.com', 'Paranthan', '11A', 1),
(8, 'V. Mathani', '200536011723', 'mathani@gmail.com', 'Kili Town', '11C', 1),
(9, 'A. Keerthika', '200536034122', 'heerthi@gmail.com', 'Paranthan', '11C', 2),
(11, 'A.Kanakaran', '200536022141', 'kanaka@gmail.com', 'Kili Town', '11B', 2),
(12, 'T. Heerthana', '200536013421', 'heerthana@gmail.com', 'Kili Town', '11A', 1);

-- --------------------------------------------------------

--
-- Table structure for table `summary`
--

CREATE TABLE `summary` (
  `summaryid` int(11) NOT NULL,
  `projecttitle` varchar(255) NOT NULL,
  `supervisorname` varchar(255) NOT NULL,
  `supervisorphno` int(255) NOT NULL,
  `studentsname` varchar(255) NOT NULL,
  `studentsgrade` varchar(255) NOT NULL,
  `pcname` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `supervisor`
--

CREATE TABLE `supervisor` (
  `supervisorid` int(11) NOT NULL,
  `supervisorname` varchar(255) NOT NULL,
  `supervisorphno` int(32) NOT NULL,
  `supervisoremail` varchar(255) NOT NULL,
  `supervisornic` varchar(255) NOT NULL,
  `supervisoraddress` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `supervisor`
--

INSERT INTO `supervisor` (`supervisorid`, `supervisorname`, `supervisorphno`, `supervisoremail`, `supervisornic`, `supervisoraddress`) VALUES
(5, 'Mr. Sathees', 776445234, 'sathees@gmail.com', '777582543V', 'Vavuniya'),
(6, 'Mr. Danush', 773346354, 'danush3@gmail.com', '777589873V', 'Jaffna'),
(9, 'Mr. Vanesh', 778967453, 'vanesh@gmail.com', '787582553V', 'Kilinochchi'),
(10, 'Mrs. Sewwandi', 773456231, 'sewwandi8@gmail.com', '808053586V', 'Jaffna');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `itlab`
--
ALTER TABLE `itlab`
  ADD PRIMARY KEY (`pcid`);

--
-- Indexes for table `project`
--
ALTER TABLE `project`
  ADD PRIMARY KEY (`projectid`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`studentsid`);

--
-- Indexes for table `summary`
--
ALTER TABLE `summary`
  ADD PRIMARY KEY (`summaryid`);

--
-- Indexes for table `supervisor`
--
ALTER TABLE `supervisor`
  ADD PRIMARY KEY (`supervisorid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `itlab`
--
ALTER TABLE `itlab`
  MODIFY `pcid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `project`
--
ALTER TABLE `project`
  MODIFY `projectid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `students`
--
ALTER TABLE `students`
  MODIFY `studentsid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `summary`
--
ALTER TABLE `summary`
  MODIFY `summaryid` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `supervisor`
--
ALTER TABLE `supervisor`
  MODIFY `supervisorid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
