package chat.controller;

import java.awt.Component;
import java.util.ArrayList;

import chat.model.Chatbot;
import chat.view.ChatbotFrame;
import chat.view.ChatbotView;

/**
 * controller class for the chatbot project
 * @author jray1621
 * 1.3 10/31/13 removed old popup GUI, reference to chatbot
 */
public class ChatbotController
{
	private Chatbot myChatbot;
	private ChatbotFrame appFrame;
	
	/**
	 * Sets up the Chatbot to a new Chatbot.
	 */
	public ChatbotController()
	{
		
		myChatbot = new Chatbot();
		
	}
	
	/**
	 * Returns your chatbot.
	 * @return
	 */
	public Chatbot getMyChatbot()
	{
		return myChatbot;
	}
	
	
	/**
	 * This sets it up so that the runner can call on start and start will call on what needs to be run.
	 */
	public void start()
	{
		
		appFrame = new ChatbotFrame(this);
		
	}
	
	
	private String conversationHelper(ArrayList<String> conversationList)
	{
		String currentConversationPiece = "";
		
		if(conversationList.size() > 0)
		{
			currentConversationPiece = conversationList.remove(0);
		}
		
		return currentConversationPiece;
	}
	public String processConversation()
	{
		String currentConversation = "";
		
		currentConversation = conversationHelper(myChatbot.topicConversation());
		
		return currentConversation;
	}
	
	public String processMeme(String currentInput)
	{
		String memeResponse = "";
		
		if(myChatbot.memeChecker(currentInput))
		{
			memeResponse =currentInput + "is a cool meme";
		}
		
		return memeResponse;
	}
	
	public String processHair(String currentInput)
	{
		String hairResponse = "";
		
		if(myChatbot.hairChecker(currentInput))
		{
			hairResponse =currentInput + "is a cool meme";
		}
		
		return hairResponse;
	}
	
	
	
	
}
