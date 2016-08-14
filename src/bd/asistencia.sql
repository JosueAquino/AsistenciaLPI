-- phpMyAdmin SQL Dump
-- version 2.10.3
-- http://www.phpmyadmin.net
-- 
-- Servidor: localhost
-- Tiempo de generación: 14-08-2016 a las 14:47:05
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
  `id` int(11) NOT NULL auto_increment,
  `nombre` varchar(10) NOT NULL,
  `apellido` varchar(20) NOT NULL,
  `curso` varchar(40) NOT NULL,
  `codigo` int(9) NOT NULL,
  `profesor` varchar(40) NOT NULL,
  UNIQUE KEY `id` (`id`,`codigo`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- Volcar la base de datos para la tabla `alumno`
-- 


-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `registro`
-- 

CREATE TABLE `registro` (
  `nombres` varchar(45) NOT NULL,
  `apellidos` varchar(45) NOT NULL,
  `cursos` varchar(45) NOT NULL,
  `codigos` int(9) NOT NULL,
  `profesores` varchar(45) NOT NULL,
  `estado` varchar(45) NOT NULL,
  UNIQUE KEY `codigos` (`codigos`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- 
-- Volcar la base de datos para la tabla `registro`
-- 

