package chat.view;

import javax.swing.JOptionPane;
import chat.model.Chatbot;

public class ChatbotView
{
	private Chatbot myChatbot;
	
	/**
	 * Sets up a new Chatbot.
	 */
	public ChatbotView()
	{
		myChatbot = new Chatbot();
	
	}
	
	/**
	 * Sets up the answer so that it will loop untill you say something else.
	 */
	public void showApp()
	{
		String answer = "Keep going";
		conversationStarter();
		
		while(answer == null || !answer.equals("no"))
		{
			JOptionPane.showMessageDialog(null, myChatbot.getRandomTopic());
			answer = getInput();
			useInput(answer);
			
			
		}
		
	}
	
	/**
	 * This is the conversation starter that gets chatbot to talk to the user.
	 * @return
	 */
	private String getInput()
	{
		String userInput = "";
		
		userInput = JOptionPane.showInputDialog("Do you want to talk?");
		
		
		
		return userInput;
	}
	
	/**
	 * This sets it up so that if any of the checkers show up. It will give a fixed response.
	 * @param currentInput
	 */
	private void useInput(String currentInput)
	{
		JOptionPane.showMessageDialog(null, "seriously?");
		if (myChatbot.memeChecker(currentInput))
		{
			JOptionPane.showMessageDialog(null,"you like memes huh?");
		}
		
		if (myChatbot.manuelChecker(currentInput))
		{
			JOptionPane.showMessageDialog(null, "Hi Manuel");
		}
		
		if (myChatbot.hairChecker(currentInput))
		{
			JOptionPane.showMessageDialog(null, "You must have some FABULOUS HAIR!!!");
			
		}
			
	}
	
	/**
	 * This gets the conversation started with the user.
	 */
	public void conversationStarter()
	{
		JOptionPane.showInputDialog(null, "So how has your day been?");
		JOptionPane.showInputDialog(null, "Thats interesting");
		JOptionPane.showInputDialog(null, "Have a good life.");
	}
}	
	

