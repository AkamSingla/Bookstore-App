/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner ;
/**
 *
 * @author ECBME
 */
public class Record {
    private String filename;
    
    public Record(String n){
        filename = n;
    }
    
    public String getName(){
        return filename;
    }
    public void read(){
      try{
        
          File myFile  = new File(filename);
          Scanner myRead = new Scanner(myFile);
          
          while(myRead.hasNextLine()){
              String data = myRead.nextLine();
              System.out.println(data);
          }
          
          myRead.close();
       } catch (IOException e){
              System.out.println("An error occured.");
              e.printStackTrace();
      }
    }
    
    public void write(String msg){
        try{
           FileWriter myFile = new FileWriter(filename,true);
           myFile.write(msg);
           myFile.close();
          
        } catch (IOException e){
                System.out.println("An error occured.");
                e.printStackTrace();
    }
    }

    public static void main(String[] args){
        
        //here in this code i am using the name of the file 
        //to be fileIS instead of r,
        //as it is used in the lab manual.
        //To have the same we just use r instead of fileIs.
        
        //setting up the file location and name using the constructor
        Record fileIs = new Record("C:\\Users\\ECBME\\Desktop\\Ryerson Books\\Term 4\\COE 528\\Labs\\Lab4\\record.txt");
        
        //create the file and writing to the file 
        fileIs.write("Hello-1\n");
        fileIs.write("Hello-2\n");
        
        System.out.println("Currently the file record.txt contains the following lines: ");
        //reading from the file
        fileIs.read();
        
        
    }
}

