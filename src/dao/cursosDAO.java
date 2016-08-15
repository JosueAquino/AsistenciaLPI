/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.cursosDTO;
import interfaces.Operaciones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;
import util.Conexion;

/**
 *
 * @author JOSS
 */
public class cursosDAO implements Operaciones<cursosDTO>{
    
    private Connection cx;
    private ResultSet rs;
    private PreparedStatement ps;
    
    private final String SQL_CREATE = "INSERT INTO cursos(curso) VALUES(?)";
    private final String SQL_DELETE = "DELETE FROM cursos WHERE curso=?";
    

    @Override
    public int create(cursosDTO e) {
       int ch = 0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_CREATE);
            ps.setString(1, e.getCurso());
            
            ch = ps.executeUpdate();
        } catch (Exception j) {
            JOptionPane.showMessageDialog(null, "cursos:  " + j);
        } finally {
            Conexion.cerrar();
        }
        return ch;
    }

    @Override
    public int update(cursosDTO e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(Object key) {
    int ch = 0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_DELETE);
            ps.setObject(1, key);
            ch = ps.executeUpdate();
        } catch (Exception j) {
            JOptionPane.showMessageDialog(null, " alumno: " + j);
        } finally {
            Conexion.cerrar();
        }
        return ch;  
    }

    @Override
    public List<cursosDTO> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public cursosDTO read(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean search(String e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
