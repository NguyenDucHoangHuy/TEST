package Baitap_thread;

import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class Consumer extends Thread {
private 	ShareQueue shareQueue;
private   JTextArea textArea;
public Consumer(ShareQueue shareQueue, JTextArea textArea) {
	this.shareQueue = shareQueue;
	this.textArea = textArea;
}
public void run() {
	for(int i=0; i<5;i++) {
		try {
			int consumedItem=shareQueue.consume();
			updateTextArea("Consumed: "+consumedItem);
			Thread.sleep(500);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
private void updateTextArea(String message) {
    SwingUtilities.invokeLater(() -> {
        textArea.append(message + "\n");
    });
}
	
}


