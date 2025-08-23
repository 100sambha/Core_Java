package java8;

class Student
{
    String name;
    double percentage;
      
    public Student(String name, double percentage) 
    {
        this.name = name;
        this.percentage = percentage;
    }
      
    public String getName() 
    {
        return name;
    }
 
    public double getPercentage() 
    {
        return percentage;
    }
      
    @Override
    public String toString() 
    {
        return name+"-"+"-"+percentage;
    }
}