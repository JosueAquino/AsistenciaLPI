-- phpMyAdmin SQL Dump
-- version 2.10.3
-- http://www.phpmyadmin.net
-- 
-- Servidor: localhost
-- Tiempo de generación: 14-08-2016 a las 20:25:46
-- Versión del servidor: 5.0.51
-- Versión de PHP: 5.2.6

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

-- 
-- Base de datos: `asistencialp1`
-- 
CREATE DATABASE `asistencialp1` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `asistencialp1`;

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `alumno`
-- 

CREATE TABLE `alumno` (
  `codigo` int(9) NOT NULL,
  `nombre` varchar(15) NOT NULL,
  `apellido` varchar(25) NOT NULL,
  `curso` varchar(40) NOT NULL,
  `profesor` varchar(40) NOT NULL,
  UNIQUE KEY `id` (`curso`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- 
-- Volcar la base de datos para la tabla `alumno`
-- 


-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `cursos`
-- 

CREATE TABLE `cursos` (
  `curso` varchar(45) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- 
-- Volcar la base de datos para la tabla `cursos`
-- 

INSERT INTO `cursos` VALUES ('Lenguaje Progracion I');

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `profesor`
-- 

CREATE TABLE `profesor` (
  `profesores` varchar(45) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- 
-- Volcar la base de datos para la tabla `profesor`
-- 


-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `registro`
-- 

CREATE TABLE `registro` (
  `codigo` int(9) NOT NULL,
  `cursos` varchar(45) NOT NULL,
  `profesores` varchar(45) NOT NULL,
  `estado` varchar(45) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- 
-- Volcar la base de datos para la tabla `registro`
-- 

