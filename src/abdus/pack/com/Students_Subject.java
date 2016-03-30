/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package abdus.pack.com;
/**
 *
 * @author Administrator
 */
public class Students_Subject 
{
    Students student;
    String sub1, sub2, sub3;
    int mark1, mark2, mark3;
    public Students_Subject(Students student , String s1,String s2,String s3, int m1, int m2, int m3)
    {
        this.student=student;  //object type class
        this.sub1=s1;
        this.sub2=s2;
        this.sub3=s3;
        this.mark1=m1;
        this.mark2=m2;
        this.mark3=m3;   
    }
    void display()
    {
        System.out.println("Students name ,age and gender :"+student.name+","+student.age+" and "+student.gender);
        
        //for Students marks 
          System.out.println("Students whos  name is " +student.name +" and he gets the marks on diffrent subject:");
          System.out.println("Maths marks obtains:"+this.mark1);
          System.out.println("Phisics marks obtains:"+this.mark2);
          System.out.println("Chemistry marks obtains:"+this.mark3);
    }
    public static void main(String[] args) 
    {
         Students ss1 =  new Students ("Raina",32,"Male");
         Students_Subject ss=new Students_Subject (ss1,"Maths","psics","Chmst",85,86,90);
         ss1.display();
         ss.display();
    }
    
}
