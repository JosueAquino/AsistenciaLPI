/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.alumnoDAO;
import dto.alumnoDTO;
import java.sql.Connection;
import util.Conexion;

/**
 *
 * @author JOSS
 */
public class Test {
    private static alumnoDAO udao = new alumnoDAO();
    
 public static void main(String[] args) {
        // TODO code application logic here
       //conex();
     guardar();
    }
    public static void conex(){
        Connection cx = Conexion.getConexion();
        if(cx != null){
            System.out.println("si");
        }else{
            System.out.println("no");
        }
        
    }
    
    public static void guardar(){
        alumnoDTO dTO = new alumnoDTO();
        int op = udao.create(dTO);
        if(op>0){
            System.out.println("si");
        }else{
            System.out.println("no");
        }
    }
}
