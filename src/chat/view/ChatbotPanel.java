package chat.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import chat.controller.ChatbotController;
import chat.model.Chatbot;

public class ChatbotPanel 
extends JPanel
{
	
	private ChatbotController baseController;
	private JButton submitButton;
	private JTextField userInputField;
	private JTextArea chatArea;
	private SpringLayout baseLayout;
	private Chatbot appbot;
	private JScrollPane textPane; 
	private int clickCount;
	
	/**
	 * This is the method that calls all of the Panel,Layout,and Listeners that are already private.
	 * @param baseController
	 */
	public ChatbotPanel(ChatbotController baseController)
	{
		this.baseController = baseController;
		this.appbot = baseController.getMyChatbot();
		
		// DOSNT MATTER THAT IT ISN'T IN THE LAYOUT IF I MOVE IT IT WILL KILL ME!!!!
		chatArea = new JTextArea(10,30);
		submitButton = new JButton("Submit this to Chatbot!");
		userInputField = new JTextField(30);
		baseLayout = new SpringLayout();
		
		textPane = new JScrollPane(chatArea);
		
		
		setupPanel();
		setupLayout();
		setupListeners();
		
		startChat();
	}
	
	/**
	 * This call the Chat bot and will get it running.
	 */
	private void startChat()
	{
		chatArea.setText(appbot.getRandomTopic());
	}
	
	/**
	 * This holds the destination of the Button, and anything else that you put into the frame into the layout. 
	 */
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, userInputField, 17, SpringLayout.SOUTH, textPane);
		baseLayout.putConstraint(SpringLayout.NORTH, textPane, 17, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, textPane, 102, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, submitButton, 17, SpringLayout.SOUTH, userInputField);
		baseLayout.putConstraint(SpringLayout.WEST, userInputField, 102, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, submitButton, 153, SpringLayout.WEST, this);
		
	}
	
	/**
	 * This set up the button and mainly the frame to color area, and other things.
	 */
	private void setupPanel()
	{
		this.setBackground(Color.blue);
		this.setLayout(baseLayout);
		this.add(submitButton);
		this.add(userInputField);
		this.add(textPane);
		
	
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
	}
	
	/**
	 * This makes it so chatbot can search to see what has been done.
	 */
	private void setupListeners()
	{
		submitButton.addActionListener(new ActionListener()
		{
			
			/**
			 * this is what happens when I click the button
			 * @param click
			 */
			public void actionPerformed(ActionEvent click)
			{
				
				clickCount++;
				
				String currentInput = userInputField.getText();
				chatArea.append(baseController.processMeme(currentInput));
				
				if(clickCount % 7 == 0)
				{
					String currentConversation = baseController.processConversation();
					if(currentConversation.length() != 0)
					{
						chatArea.append(currentConversation);
						clickCount--;
					}
				}
				else if(clickCount % 11 == 0)
				{
					
				}
				else
				
				{
					
					chatArea.append("\n" + currentInput);
					chatArea.append("\n" + appbot.getRandomTopic());
				}
				
				
			}
		});
	}
}
	
	
	
	
	

