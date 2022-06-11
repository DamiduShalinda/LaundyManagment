/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import javax.swing.JOptionPane;

/**
 *
 * @author MSI MODERN
 */
public class tables {

    public static void main(String[] args) {
        try {
            String userTable = "create table user(id int AUTO_INCREMENT primary key, name varchar(100), email varchar(100), mobileNumber varchar(15), address varchar(200), password varchar(100), securityQuestion varchar(200), answer varchar(150), status varchar(20), UNIQUE (email))";
            String adminDetails = "insert into user(name, email, mobileNumber, address, password, securityQuestion, answer, status) values('Admin', 'admin@gmail.com', '1234567890', 'colombo', 'admin', 'What is the our company name ?', 'easy laundry', 'true')";
            String categoryTable = "create table category (id int AUTO_INCREMENT primary key, name varchar(100))";
            String productTable = "create table product(id int AUTO_INCREMENT primary key, name varchar(100), category varchar(200), price varchar(100))";
            String billTable = "create table bill(id int primary key, name varchar(100), mobileNumber varchar(15), email varchar(100), date varchar(50), total varchar(100), createBy varchar(200))";
            String employeeTable = "create table employee (email varchar(30), id int NOT NULL AUTO_INCREMENT primary key, empName varchar(100), empAddress varchar(100), empTelNo varchar(20), nicNo varchar(15), jobTitle varchar(15))";
            String adminDetail = "insert into employee values ('admin@gmail.com', 10000, 'Admin', 'Colombo', '071-1234567', '896024666V', 'Manager')";
            
            
            DbOperation.setDataOrDelete(billTable, "Bill Table Created Successfully !");
            DbOperation.setDataOrDelete(userTable, "User Table Created Successfully !");
            DbOperation.setDataOrDelete(adminDetails, "Admin Details Added Successfully !");
            DbOperation.setDataOrDelete(categoryTable, "categoryTable Created Successfully !");
            DbOperation.setDataOrDelete(productTable, "Product Table Created Successfully !");
            DbOperation.setDataOrDelete(employeeTable,"Employee Table Created Successfully");
            DbOperation.setDataOrDelete(adminDetail, "Details added Successfully");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
