//Author : Omkar Rajendra Nanaware;
//Date and time : jun 13 01:10
//Topic : Tight Coupling (Pre requisit of design Pattern)
//Language : JAVA





import java.util.Scanner;


class A
{
    private int iNo1;
    private String strName;
    private B refB;                     //refB is referance of class B which is used as characteristic 

    public A(int iValue, String strName)        //Dependency Injection
    {
        this.iNo1 = iValue;
        this.strName = strName;
                    
    }

    public void PrintData()         //function of class A is able to use class B characteristic 
    {   
        this.refB = new B();
        refB.setMarks();            //Dependency Injection Tight Coupling
    
        System.out.println("Printing marks of "+this.strName+" Roll no: "+this.iNo1);

        for(int i = 0; i< this.refB.iarrMarks.length;i++)
        {
            System.out.println(refB.iarrMarks[i]);
        }


    }





}


class B
{

    public int iarrMarks[];

    public B()
    {
         this.iarrMarks = new int[5];
    }

    public void setMarks()
    {
        Scanner scn = new Scanner(System.in);

        for(int i = 0; i < iarrMarks.length;i++)
        {   
            int j = i+1;
            System.out.println("Enter marks for "+(j)+"st Subject");
            iarrMarks[i] = scn.nextInt();
        }

    }




}


public class Tight_Coupling {
    public static void main(String[] args) 
    {   
        System.out.println("Tight Coupling");
        System.out.println("creating a student with class A and creating object of class B in class A ");

        System.out.println("Enter marks for 5 subject");
        
        A oOm = new A(1,"Om");        
        oOm.PrintData();


    }
}
