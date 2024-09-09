class InheritncQuiz //base class
{
    protected String subject = "computer language"; //here code is accessible in same package or subclasses since its 'protected'
    public void onlineClass() //methode represents a way
    {
     System.out.println("Iam learning computer language online."); //output
    }
}
class Language extends InheritncQuiz //sub/child class trying inherit attributes and methods from base/super/parent class
{
  private String langName = "Java"; //attribute representing the class Language name
  public static void main(String[] args) //Application entry point
  {
    Language myLanguage = new Language(); //creation of an object for subclass named myLanguage
    myLanguage.onlineClass(); //calling methode from superclass
    System.out.println(myLanguage.subject + " " + myLanguage.langName);
    //Displaying the value of the subject attribute from parent class and value of the langName attribute from Language class
  }
}