package client;

import client.panel.Screen;
import javax.swing.*;

public class Client extends JFrame implements Runnable{
	public static final int WIDTH=800,HEIGHT=600;
	public boolean running;
	protected Screen currScreen;
	
	public Client(String title, Screen s){
		super(title);
		running = true;
		currScreen = s;
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		add(currScreen);
		new Thread(this).run();
	}

	@Override
	public void run() {
		while(running){
			currScreen.repaint();
			try {
				Thread.sleep(16);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
