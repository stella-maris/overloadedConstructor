/**
 * Class to model a Person
 * 
 * @author Gary Tong
 * @version 1.0
 */
public class Person
{
    private String firstName;
    private String lastName;
    private int age;
    private double height;
    
    public static int counter = 0;
    /**
     * Default constructor for creating a Person instance.
     */
    
    public Person() 
    {
        ++counter;
        counter = counter++;
        firstName = "Jane";
        lastName = "Smith";
        age = 18;
        height = 160;
    }
    
    /**
     * Overloaded constructor for creating a Person instance.
     * @param _firstName    The first name of our Person.
     * @param _lastName     The last name of our Person. 
     */
    public Person(String _firstName, String _lastName)
    {
        ++counter;
        firstName = _firstName;
        lastName = _lastName;
    }
    
    /**
     * Constructor for creating a Person instance.
     * 
     * @param _firstName    The first name of our Person
     * @param _lastName     The first last of our Person
     * @param _age          The age of our Person
     * @param _height       The height of our Person
     */  
    public Person(String _firstName, String _lastName, int _age, double _height)
    {
        ++counter;
        firstName = _firstName;
        lastName = _lastName;
        
        if(_age <= 0)
        {
            age = 1;
        }
        else
        {
            age = _age;
        }

        if(_height <= 0)
        {
            height = 1;            
        }
        else
        {
            height = _height;
        }
    }
    
    /**
     * A method to determine if this Person is old.
     * 
     * @return Returns true if they're over 60.
     */
    public boolean isOld()
    {
        if(age > 60)
        {
            return true;
        }
        
        return false;
    }
    
    /**
     * A method to determine if this Person is tall.
     * 
     * @return Returns true if they're over 180.
     */
    public boolean isTall()
    {
        if(height > 180)
        {
            return true;
        }
        
        return false;    
    } 
    
    /**
     * A method to validate the age of this Person is between 0 - 100
     * 
     */
    public void setAge (int _age) 
    {
        if ( _age > 0 && _age < 100)
        {
            age = _age;
        }
    }
    
    /**
     * a mutator method to validate the height of this Person
     * fits in the range of 0 - 250 in centimeters
     */
    public void setHeight (double _height)
    {
        if (_height > 0 && _height < 250)
        {
            height = _height;
        }
    }
    
    /**
     * An accessor method that displays the details of this Person.
     * 
     * @return Returns a string of this Person's first name, last name
     * and age.
     */
    public String getDetails() 
    {
        return "Hello my name is " + firstName + " " + lastName + " and my age is " + age + ".";
    }
    
    /**
     * An accessor method that displays the number of persons created.
     * @return Returns a string of the number of times created.
     */
    public String getNumberOfTimesCreated()
    {
        String counted = "none";
        switch (counter)
        {
            
            case 0:
                counted = counted;
                break;
            case 1:
                counted = "once";
                break;
            case 2:
                counted = "twice";
                break;
            default:
                counted = "too many times!";
                break;
        }
        return counted;
    }
}
 
