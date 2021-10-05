/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getsetstudent;

/**
 *
 * @author Abdul Moiz Chishti
 */
public class StudentBioData {
    double per; int rollno; int subass;
    
public void getmeth(double per, int rollno, int subass){
    
    this.per=per;
    this.rollno=rollno;
    this.subass=subass;


}


public void setmeth(){
    System.out.println("previous percentage= "+per);
    System.out.println("roll number= "+rollno);
    System.out.println("subject assign= "+subass);

}




}
