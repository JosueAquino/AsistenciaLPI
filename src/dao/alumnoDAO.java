/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.alumnoDTO;
import interfaces.Operaciones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import util.Conexion;

/**
 *
 * @author JOSS
 */
public class alumnoDAO implements Operaciones<alumnoDTO>{
    private Connection cx;
    private ResultSet rs;
    private PreparedStatement ps;

    
    private final String SQL_CREATE = "INSERT INTO alumno(codigo, nombre,apellido,curso, profesor) VALUES(?, ?, ?, ?,?)";
    private final String SQL_UPDATE = "UPDATE alumno SET  nombre=?, apellido=?, curso=?, profesor=? WHERE  codigo=?";
    private final String SQL_DELETE = "DELETE FROM alumno WHERE codigo=?";
    private final String SQL_READ = "SELECT *FROM alumno WHERE codigo=?";
    private final String SQL_READALL = "SELECT *FROM alumno";
    
    
    

    @Override
    public int create(alumnoDTO e) {
        int ch = 0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_CREATE);
            ps.setInt(1, e.getCodigo());
            ps.setString(2, e.getNombre());
            ps.setString(3, e.getApellido());
            ps.setString(4, e.getCurso());
            ps.setString(5, e.getProfesor());
            ch = ps.executeUpdate();
        } catch (Exception j) {
            JOptionPane.showMessageDialog(null, "alumno:  " + j);
        } finally {
            Conexion.cerrar();
        }
        return ch;
    }

    @Override
    public int update(alumnoDTO e) {
        int op = 0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_UPDATE);
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getApellido());
            ps.setString(3, e.getCurso());
            ps.setString(4, e.getProfesor());
            
            op = ps.executeUpdate();
        } catch (Exception x) {

        } finally {
            Conexion.cerrar();
        }
        return op;}

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
    public List<alumnoDTO> readAll() {
        List<alumnoDTO> lista = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_READALL);
            rs = ps.executeQuery();
            while (rs.next()) {
                alumnoDTO cdto = new alumnoDTO();
                cdto.setCodigo(rs.getInt("codigo"));
                cdto.setNombre(rs.getString("nombre"));
                cdto.setApellido(rs.getString("apellido"));
                cdto.setCurso(rs.getString("curso"));
                cdto.setProfesor(rs.getString("profesor"));
                lista.add(cdto);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " alumno: " + e);
        } finally {
            Conexion.cerrar();
        }
        return lista;
    }

    @Override
    public alumnoDTO read(Object key) {
       alumnoDTO cdto = new alumnoDTO();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_READ);
            ps.setObject(1, key);
            rs = ps.executeQuery();
            while (rs.next()) {
                cdto.setCodigo(rs.getInt("codigo"));
                cdto.setNombre(rs.getString("nombre"));
                cdto.setApellido(rs.getString("apellido"));
                cdto.setCurso(rs.getString("curso"));
                cdto.setProfesor(rs.getString("profesor"));
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "read: " + e);
        } finally {
            Conexion.cerrar();
        }
        return cdto;  
    }

    @Override
    public boolean search(String e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
