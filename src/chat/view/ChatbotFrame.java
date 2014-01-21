package chat.view;

import javax.swing.JFrame;

import chat.controller.ChatbotController;

public class ChatbotFrame extends JFrame
{
	
	private ChatbotController baseController;
	private ChatbotPanel basePanel;
	
	/**
	 * Sets up the new Frame.
	 * @param baseController
	 */
	public ChatbotFrame(ChatbotController baseController)
	{
		this.baseController = baseController;
		basePanel = new ChatbotPanel(baseController);
		
		setupFrame();
	}
	
	/**
	 * Setups the size of the GUI Frame.
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(500,500);
		this.setVisible(true);
	}
}
