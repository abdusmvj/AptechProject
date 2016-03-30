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
public class Students 
{
    String name;
    int age;
    String gender;
    public Students(String nm, int ag, String gd)
    {
        this.name=nm;
        this.age=ag;
        this.gender=gd;
    }
    public void display()
    {
        System.out.println("Students name is:"+this.name);
         System.out.println("Students age is:"+this.age);
          System.out.println("Students gender is:"+this.gender);
    }
    public static void main(String[] args) 
    {
        Students s1=new Students("Abdus",23,"Male");
        s1.display();    
    }
}
