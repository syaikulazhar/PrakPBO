-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 25, 2023 at 06:29 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tiket_pesawat`
--

-- --------------------------------------------------------

--
-- Table structure for table `jadwal_pesawat`
--

CREATE TABLE `jadwal_pesawat` (
  `id_jadwal` int(11) NOT NULL,
  `no_pesawat` varchar(50) NOT NULL,
  `maskapai` varchar(50) NOT NULL,
  `kelas` varchar(50) NOT NULL,
  `asal` varchar(50) NOT NULL,
  `tujuan` varchar(50) NOT NULL,
  `tanggal` date NOT NULL,
  `berangkat` time NOT NULL,
  `tiba` time NOT NULL,
  `harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `jadwal_pesawat`
--

INSERT INTO `jadwal_pesawat` (`id_jadwal`, `no_pesawat`, `maskapai`, `kelas`, `asal`, `tujuan`, `tanggal`, `berangkat`, `tiba`, `harga`) VALUES
(5, 'JT-664', 'Lion Air', 'Ekonomi', 'Yogyakarta (YIA)', 'Makassar (UPG)', '2023-05-13', '14:45:00', '21:30:00', 1262000),
(6, 'JT-3643', 'Citilink', 'Ekonomi', 'Makassar (UPG)', 'Medan (KNO)', '2023-05-13', '14:45:00', '20:10:00', 1290000),
(7, 'JT-567', 'Lion Air', 'Ekonomi', 'Bali (DPS)', 'Yogyakarta (YIA)', '2023-05-08', '05:00:00', '20:10:00', 908000),
(8, 'JT-592', 'Lion Air', 'Ekonomi', 'Jakarta (JKTA)', 'Surabaya (SUB)', '2023-05-03', '17:30:00', '20:10:00', 562900),
(9, 'IU-873', 'Super Air Jet', 'Ekonomi', ' Palembang (PLM)', 'Jambi (DJB)', '2023-05-13', '05:00:00', '08:25:00', 1175000);

-- --------------------------------------------------------

--
-- Table structure for table `riwayat_perjalanan`
--

CREATE TABLE `riwayat_perjalanan` (
  `id_perjalanan` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  `nama_depan` varchar(50) NOT NULL,
  `nama_belakang` varchar(50) NOT NULL,
  `no_ktp` varchar(50) NOT NULL,
  `no_pesawat` varchar(50) NOT NULL,
  `maskapai` varchar(50) NOT NULL,
  `kelas` varchar(50) NOT NULL,
  `asal` varchar(50) NOT NULL,
  `tujuan` varchar(50) NOT NULL,
  `tanggal` date NOT NULL,
  `berangkat` time NOT NULL,
  `tiba` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `riwayat_perjalanan`
--

INSERT INTO `riwayat_perjalanan` (`id_perjalanan`, `id_user`, `nama_depan`, `nama_belakang`, `no_ktp`, `no_pesawat`, `maskapai`, `kelas`, `asal`, `tujuan`, `tanggal`, `berangkat`, `tiba`) VALUES
(17, 2, 'Richy', 'Johannes', '12072302020400011', 'JT-3643', 'Citilink', 'Ekonomi', 'Makassar (UPG)', 'Medan (KNO)', '2023-05-13', '14:45:00', '20:10:00'),
(18, 2, 'Johannes', 'Richy', '781643180376038874', 'JT-664', 'Lion Air', 'Ekonomi', 'Yogyakarta (YIA)', 'Makassar (UPG)', '2023-05-13', '14:45:00', '21:30:00'),
(19, 4, 'Rich', 'Joh', '97248207862400874', 'JT-567', 'Lion Air', 'Ekonomi', 'Bali (DPS)', 'Yogyakarta (YIA)', '2023-05-08', '05:00:00', '20:10:00'),
(20, 2, 'Chelsea', 'Steni', '89718360831', 'JT-567', 'Lion Air', 'Ekonomi', 'Bali (DPS)', 'Yogyakarta (YIA)', '2023-05-08', '05:00:00', '20:10:00'),
(21, 5, 'Elia', 'Fernando ', '29697364269', 'JT-592', 'Lion Air', 'Ekonomi', 'Jakarta (JKTA)', 'Surabaya (SUB)', '2023-05-03', '17:30:00', '20:10:00'),
(22, 2, 'Yoga', 'Psb', '220860428', 'JT-664', 'Lion Air', 'Ekonomi', 'Yogyakarta (YIA)', 'Makassar (UPG)', '2023-05-13', '14:45:00', '21:30:00'),
(23, 2, 'Denisha', 'A', '28692396962308', 'JT-664', 'Lion Air', 'Ekonomi', 'Yogyakarta (YIA)', 'Makassar (UPG)', '2023-05-13', '14:45:00', '21:30:00'),
(25, 8, 'Riqi', 'Johanes', '213123', 'JT-664', 'Lion Air', 'Ekonomi', 'Yogyakarta (YIA)', 'Makassar (UPG)', '2023-05-13', '14:45:00', '21:30:00');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id_user` int(11) NOT NULL,
  `nama_lengkap` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id_user`, `nama_lengkap`, `email`, `username`, `password`) VALUES
(2, 'Syaikul Azhar Muhammad', 'syaikul.azhar@gmail.com', 'aikul', 'aikul'),
(4, 'Richy Johannes', 'riickyjohaness@gamil.com', 'rici', '1234'),
(5, 'Elia Fernando Garing', 'elia626@gmail.com', 'elia72', 'eli123'),
(6, 'Johannes', 'Johannesrici@gmail.com', 'jojo', 'jojo'),
(8, 'Riqi', '123@gmail.com', 'aikul1', 'aikul1');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `jadwal_pesawat`
--
ALTER TABLE `jadwal_pesawat`
  ADD PRIMARY KEY (`id_jadwal`);

--
-- Indexes for table `riwayat_perjalanan`
--
ALTER TABLE `riwayat_perjalanan`
  ADD PRIMARY KEY (`id_perjalanan`),
  ADD KEY `idUser` (`id_user`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `jadwal_pesawat`
--
ALTER TABLE `jadwal_pesawat`
  MODIFY `id_jadwal` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `riwayat_perjalanan`
--
ALTER TABLE `riwayat_perjalanan`
  MODIFY `id_perjalanan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `riwayat_perjalanan`
--
ALTER TABLE `riwayat_perjalanan`
  ADD CONSTRAINT `idUser` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
