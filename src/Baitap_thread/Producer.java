package Baitap_thread;

import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class Producer extends Thread {
 private ShareQueue shareQueue;
 private JTextArea textArea;
public Producer(ShareQueue shareQueue, JTextArea textArea) {
	this.shareQueue = shareQueue;
	this.textArea = textArea;
}
public void run() {
	for(int i=0;i<5; i++) {
		try {
			shareQueue.produce(i);
			updatetextArea("Produced: "+i);
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
private void updatetextArea(String message) {
    SwingUtilities.invokeLater(() -> {
        textArea.append(message + "\n");
    });
}
}
