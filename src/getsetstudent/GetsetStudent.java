/*
 * To change this ldicense header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getsetstudent;
import java.util.*;

/**
 *
 * @author Abdul Moiz Chishti
 */
public class GetsetStudent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

            Scanner obj =new Scanner(System.in);
            System.out.println("percentage");
            double d= obj.nextDouble();
            
            System.out.println("roll number");
            int r= obj.nextInt();
            
            System.out.println("Subject");
            int sa= obj.nextInt();
            
            
    StudentBioData obj1=new StudentBioData();
    obj1.getmeth(d,r,sa);
    obj1.setmeth();
    
    
    
    
    
    }
    
}
