-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: 24-Jun-2019 às 04:39
-- Versão do servidor: 5.7.24
-- versão do PHP: 7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `conexaomedhelper`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cadadm`
--

DROP TABLE IF EXISTS `cadadm`;
CREATE TABLE IF NOT EXISTS `cadadm` (
  `ID_Adm` int(11) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(30) NOT NULL,
  `senha` varchar(16) NOT NULL,
  PRIMARY KEY (`ID_Adm`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cadadm`
--

INSERT INTO `cadadm` (`ID_Adm`, `usuario`, `senha`) VALUES
(1, 'Administrador', '222');

-- --------------------------------------------------------

--
-- Estrutura da tabela `cadmedico`
--

DROP TABLE IF EXISTS `cadmedico`;
CREATE TABLE IF NOT EXISTS `cadmedico` (
  `ID_Medico` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `datanasc` date NOT NULL,
  `especialidade` varchar(50) NOT NULL,
  `senha` varchar(16) NOT NULL,
  PRIMARY KEY (`ID_Medico`)
) ENGINE=MyISAM AUTO_INCREMENT=30 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cadpaciente`
--

DROP TABLE IF EXISTS `cadpaciente`;
CREATE TABLE IF NOT EXISTS `cadpaciente` (
  `ID_Paciente` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `datanasc` date NOT NULL,
  `rg` varchar(20) NOT NULL,
  `cpf` varchar(15) NOT NULL,
  `senha` varchar(15) NOT NULL,
  PRIMARY KEY (`ID_Paciente`),
  UNIQUE KEY `rg` (`rg`),
  UNIQUE KEY `cpf` (`cpf`)
) ENGINE=MyISAM AUTO_INCREMENT=32 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `consulta`
--

DROP TABLE IF EXISTS `consulta`;
CREATE TABLE IF NOT EXISTS `consulta` (
  `ID_Consulta` int(11) NOT NULL AUTO_INCREMENT,
  `ID_Medico` int(11) NOT NULL,
  `ID_Paciente` int(11) NOT NULL,
  `dataconsulta` date NOT NULL,
  PRIMARY KEY (`ID_Consulta`,`ID_Medico`,`ID_Paciente`),
  KEY `ID_Medico` (`ID_Medico`),
  KEY `ID_Paciente` (`ID_Paciente`)
) ENGINE=MyISAM AUTO_INCREMENT=14042051 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `consulta`
--

INSERT INTO `consulta` (`ID_Consulta`, `ID_Medico`, `ID_Paciente`, `dataconsulta`) VALUES
(14042037, 12, 22, '2023-09-04'),
(14042038, 14, 22, '2024-10-16'),
(14042040, 16, 24, '2019-01-01'),
(14042041, 18, 26, '2019-10-27'),
(14042043, 19, 28, '2019-06-23'),
(14042044, 20, 29, '2019-06-24'),
(14042045, 21, 30, '2019-09-20'),
(14042046, 26, 0, '2019-08-27'),
(14042047, 26, 30, '2019-09-18'),
(14042048, 24, 30, '2019-09-18'),
(14042049, 23, 30, '2019-09-18');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
