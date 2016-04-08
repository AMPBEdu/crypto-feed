package bueide.cryptofeed.ui.gui.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ChatWindowController implements Initializable{
	
	@FXML private Button sendMessage;
	@FXML private TextField message;
	@FXML private TextArea chatHistory;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
	public void sendMessage(){
		String m = message.getText() + "\n";
		message.setText("");
		chatHistory.appendText(m);
	}
	
}
