//Author : Omkar Rajendra Nanaware;
//Date and time : jun 13 00:38
//Topic : Loose Coupling (Pre requisit of design Pattern)
//Language : JAVA





import java.util.Scanner;


class A
{
    private int iNo1;
    private String strName;
    private B refB;                     //refB is referance of class B which is used as characteristic 

    public A(int iValue, String strName, B refB)        //Dependency Injection
    {
        this.iNo1 = iValue;
        this.strName = strName;
        this.refB = refB;               
    }

    public void PrintData()         //function of class A is able to use class B characteristic 
    {   
        
    
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

public class Loose_Coupling
{
    public static void main(String[] args) 
    {   

        B marks = new B();
        marks.setMarks();
        
        A oOm = new A(1,"Om",marks);        //Dependency Injection
        oOm.PrintData();


    }



}