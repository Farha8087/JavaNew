//This programm helps to randomly select a winner from list of participants
public class PrizeDraw 
{
 public static void main(String[] args)
 {
    //Creating an array to store participants names
    String [] participants =
    {
      "Ali",
      "Sara",
      "Farah",
      "Iza",
      "Ira"
    };
    //Creating random index to generate participant's name
    int randomParticipantIndex = (int) (Math.random() * participants.length);

    //This syntax helps to print the name of winner on the console/terminal.
    System.out.println(" Guess  our lucky winner today.? AND OUR LUCKY WINNER IS : " + participants[randomParticipantIndex]);


 }   
}
