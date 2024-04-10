package Baitap_thread;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class GUI extends JFrame{
	private ShareQueue shareQueue;
	private JTextArea textArea;
   GUI(){
	   setLocationRelativeTo(null);
	   setTitle("Producer_Consumer");
	   setSize(400,300);
	   setDefaultCloseOperation(EXIT_ON_CLOSE);
	   setVisible(true);
	   shareQueue= new ShareQueue(2);
	   JPanel panel=new JPanel();
	   panel.setLayout(new BorderLayout());
	   JButton start= new JButton("Start Program");
	   start.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Producer producer= new Producer(shareQueue, textArea);
			Consumer consumer= new Consumer(shareQueue, textArea);
			producer.start();
			consumer.start();
			
		}
	});
	   panel.add(start, BorderLayout.NORTH);
	   textArea= new JTextArea();
	   panel.add(new JScrollPane(textArea),BorderLayout.CENTER);
	   add(panel);
   }
}
