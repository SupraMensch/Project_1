// Christopher Burt

//Projecr_1

//  This program creates a String array and searchs the array and display all of the elements that begin with 'M'.

package project_1;

public class Project_1 
{
    public static void main(String[] args)
    {
        String[] names = { "Bill", "Mike", "Joe", "Dave", "Sam", "Mary", "George", "Lucy" };
        
       for(int i = 0; i < names.length; i++)
       {
            if(names[i].indexOf('M') != -1)
            {
                System.out.println(names[i]);
            }
        }
 }
}
