/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.employee;

/**
 *
 * @author Damidu
 */
public class employeeDao {
    
    public static void save (employee employee){
        String query = "insert into employee (email,empName,empAddress,empTelNo,nicNo,jobTitle) values ('" + employee.getEmail() + "','" + employee.getEmpName() + "','" + employee.getAddress()+ "','"+employee.getEmpTeleNumber()+"','"+employee.getNicNo()+"','"+employee.getJobTitle()+"')";
        DbOperation.setDataOrDelete(query, "Registered Successfully!");
    }
    
    public static ArrayList<employee> getAllRecords(){
        ArrayList<employee> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperation.getData("select * from laundry.employee");
            while(rs.next()){
                employee employee = new employee();
                employee.setEmpID(rs.getString("id"));
                employee.setEmpName(rs.getString("empName"));
                employee.setEmpTeleNumber(rs.getString("empTelNo"));
                employee.setNicNo(rs.getString("nicNo"));
                employee.setJobTitle(rs.getString("jobTitle"));
                employee.setEmail(rs.getString("email"));
                employee.setAddress(rs.getString("empAddress"));
                arrayList.add(employee);
            }  
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList; }
    
    
    
}
