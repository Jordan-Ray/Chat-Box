package chat.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * Explanation of the class: Chatbot model to test String manipulation and use.
 * @author Jordan Ray
 * @version 1.5
 * 
 */
public class Chatbot
{
	private ArrayList<String> myMemes;
	private ArrayList<String> myManuel;
	private ArrayList<String> myHair;
	private ArrayList<String> randomList;
	private ArrayList<String> topicConversation;
	

	/**
	 * Sets up the values of myMemes, myManuel, myConverstation, and myIndividual. It also calls the lists that are made.
	 */
	public Chatbot()
	{
		myMemes = new ArrayList<String>();
		myManuel = new ArrayList<String>();
		myHair = new ArrayList<String>();
		randomList = new ArrayList<String>();
		topicConversation = new ArrayList<String>();
	

		fillTheList();
		fillManuel();
		fillHair();
		fillTheRandomList();
		
	}
	
	/**
	 * Fills the randomList with various Strings for the chatbot.
	 */
	private void fillTheRandomList()
	{
		randomList.add("I like cheese");
		randomList.add("I hate essays");
		randomList.add("I like cereal");
		randomList.add("This is random");
		randomList.add("I like typing");
	}
	
	/**
	 * This method chooses a random item from the randomList.
	 * @return A random element from the randomList.
	 */
	public String getRandomTopic()
	{
		String randomTopic = "" ;
		
		double myRandom = Math.random();
		int MyRandomListPosition = (int) (myRandom * randomList.size());
		
		randomTopic = randomList.get(MyRandomListPosition);
		
		return randomTopic;
	}

	/**
	 * Checks for key words to see if the user has fabulous hair.
	 */
	private void fillHair()
	{
		myHair.add("Fabulous");
		myHair.add("Fabulous Hair");
		myHair.add("Hair");
		myHair.add("Afro");
		myHair.add("Mullet");
		myHair.add("fabulous");
		myHair.add("fabulous hair");
		myHair.add("hair");
		myHair.add("afro");
		myHair.add("mullet");

	}

	/**
	 * One to two sentences explaning  the method. Full sentences with punctuation. Checks the currentInput from the user to see if it is a member of the memelist.
	 * punctuation currentInput Explanation of the variable. the current phrase
	 * typed by the user What is returned by the method in this case the methods.
	 * returns whether or not the input is a meme
	 */
	private void fillTheList()
	{
		myMemes.add("nicholas cage");
		myMemes.add("arrow to the knee");
		myMemes.add("one does not simply");
		myMemes.add("y u no");

	}

	/**
	 * This method is searching to see if the user is Manuel, by using key words such as Magikarp, Rainbows, and other things.
	 */
	private void fillManuel()
	{
		myManuel.add("Magikarp");
		myManuel.add("Rainbows");
		myManuel.add("Ponys");
		myManuel.add("Meat Bell");
		myManuel.add("Magicarp");
		myManuel.add("Rainbow");
		myManuel.add("Ponies");
		myManuel.add("Meat Bells");
		myManuel.add("Ham Bell");
		myManuel.add("Ham Bells");
		myManuel.add("Pony");
	}

	public String alphabetizeYourName(String first, String middle, String last)
	{
		String nameInOrder = "";
		
		if(first.compareTo(middle) < 0 )
		{
			if(first.compareTo(last) < 0 )
			{
				if(middle.compareTo(last) < 0)
				{
					nameInOrder = first + ", " + middle + ", " + last;
				}
				else
				{
					nameInOrder = first + ", " + last + ", " + middle;
				}
			}
			else
			{
				nameInOrder = last + ", " + first + ", " + middle;
			}
		}
		else
		{
			if(middle.compareTo(last) < 0 )
			{
				if(first.compareTo(last) < 0 )
				{
					nameInOrder = middle + ", " + first + ", " + last;
				}
				else
				{
					nameInOrder = middle + ", " + last + ", " + first;
				}
			}
			else
			{
				nameInOrder = last + ", " + middle + ", " + first;
			}
		}
		
		return nameInOrder;
	}
	
	public ArrayList<String> topicConversation()
	{
		ArrayList<String> conversation = new ArrayList<String>();
		
		conversation.add("Hey whats up?");
		conversation.add("I did not just change the subject.");
		conversation.add("I don't know what you are talking about");
		return conversation;
	}
	
	
	/**
	 * 
	 * This checks to see if the user is Manuel. It will set it as true or false, so you either are or aren't.
	 * @param currentInput
	 * @return
	 */
	public boolean manuelChecker(String currentInput)
	{
		boolean hasManuel = false;

		for (String currentPhrase : myManuel)
		{
			if (currentInput.equalsIgnoreCase(currentPhrase))
			{
				hasManuel = true;
			}
		}
		return hasManuel;
	}

	/**
	 * 
	 * This sets the memeChecker so that only true and false work on the answer. So it is a meme or not one, no inbetween. 
	 * @param currentInput
	 * @return
	 */
	public boolean memeChecker(String currentInput)
	{
		boolean hasMeme = false;
		// loop over all the items in the list if the input matches a meme,
		// change has Meme to true.

		for (String currentPhrase : myMemes)
		{
			if (currentPhrase.equalsIgnoreCase(currentInput))
			{
				hasMeme = true;
			}
		}

		return hasMeme;
	}
	
	/**
	 * This sets the has Hair variable to true or false. 
	 * @param currentInput
	 * @return
	 */
	public boolean hairChecker(String currentInput)
	{
		boolean hashair = false;
		

		for (String currentPhrase : myHair)
		{
			if (currentPhrase.equalsIgnoreCase(currentInput))
			{
				hashair = true;
			}
		}

		return hashair;
	}


}


