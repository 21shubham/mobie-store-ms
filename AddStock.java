/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication1;

import static java.nio.file.StandardOpenOption.CREATE;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Shweta
 */
public class AddStock {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    
    //  load the driver..
        Class.forName("com.mysql.jdbc.Driver");
        //connection create
    Connection con =     DriverManager.getConnection("jdbc:mysql://localhost:3306/addstock","root","root");
     
    // execute the query
  Statement st =   con.createStatement();
  
  String tablequery = "create table addstockSAMSUNG(Model_no varchar(40),Model_name varchar(50),Brand_name varchar(50),IMEI_no numeric(50),Color varchar(50),Price numeric(50))";
  st.execute(tablequery);
        System.out.println("table created...");
    
   String t2= "create table addstockHTC(Model_no varchar(40),Model_name varchar(50),Brand_name varchar(50),IMEI_no numeric(50),Color varchar(50),Price numeric(50))"; 
            
    st.execute(t2);
    String t3="create table addstockAPPLE(Model_no varchar(40),Model_name varchar(50),Brand_name varchar(50),IMEI_no numeric(50),Color varchar(50),Price numeric(50))"; 
 st.execute(t3); 
    String t4= "create table addstockASUS(Model_no varchar(40),Model_name varchar(50),Brand_name varchar(50),IMEI_no numeric(50),Color varchar(50),Price numeric(50))"; 
            
    st.execute(t4);  
    String t5= "create table addstockLENOVO(Model_no varchar(40),Model_name varchar(50),Brand_name varchar(50),IMEI_no numeric(50),Color varchar(50),Price numeric(50))"; 
            
    st.execute(t5);
    
    String t6= "create table addstockMOTOROLA(Model_no varchar(40),Model_name varchar(50),Brand_name varchar(50),IMEI_no numeric(50),Color varchar(50),Price numeric(50))"; 
            
    st.execute(t6);
    String t7= "create table addstockNOKIA(Model_no varchar(40),Model_name varchar(50),Brand_name varchar(50),IMEI_no numeric(50),Color varchar(50),Price numeric(50))"; 
            
    st.execute(t7);
    
    String t8= "create table addstockHONOR(Model_no varchar(40),Model_name varchar(50),Brand_name varchar(50),IMEI_no numeric(50),Color varchar(50),Price numeric(50))"; 
            
    st.execute(t8);
            String t9= "create table addstockLEECO(Model_no varchar(40),Model_name varchar(50),Brand_name varchar(50),IMEI_no numeric(50),Color varchar(50),Price numeric(50))"; 
            
    st.execute(t9);
    System.out.println("hi1");
            String t10= "create table addstockMI(Model_no varchar(40),Model_name varchar(50),Brand_name varchar(50),IMEI_no numeric(50),Color varchar(50),Price numeric(50))"; 
            
    st.execute(t10);
            String t11= "create table addstockONEPLUS(Model_no varchar(40),Model_name varchar(50),Brand_name varchar(50),IMEI_no numeric(50),Color varchar(50),Price numeric(50))"; 
            
    st.execute(t11);
            
            String t12= "create table addstockSONY(Model_no varchar(40),Model_name varchar(50),Brand_name varchar(50),IMEI_no numeric(50),Color varchar(50),Price numeric(50))"; 
            
    st.execute(t12);
            
            String t13= "create table addstockOTHERS(Model_no varchar(40),Model_name varchar(50),Brand_name varchar(50),IMEI_no numeric(50),Color varchar(50),Price numeric(50))"; 
            
    st.execute(t13);
        System.out.println("hi2");
}}
    
    

