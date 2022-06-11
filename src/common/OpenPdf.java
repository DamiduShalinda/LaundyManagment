/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author SHEN
 */
public class OpenPdf {
    
    public static void openById(String id){
        try {
            if((new File("D:\\Bills\\"+id+ ".pdf")).exists()){
                Process p = Runtime
                        .getRuntime()
                        .exec("rund1132 url.dll,FileProtocolHandler D:\\Bills\\" +id+".pdf");
            }
            else{
            
                JOptionPane.showMessageDialog(null, "File is not Exists");
            }
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
    }
    
}
