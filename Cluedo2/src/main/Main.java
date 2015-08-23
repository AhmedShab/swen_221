package main;
import java.awt.EventQueue;

import cluedo.GameController;
import gui.CluedoGui;

public class Main {
	public static void main(String[] args) {
		System.out.println("printing from cluedo2");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CluedoGui gui = new CluedoGui();
					gui.frame.setVisible(true);
					GameController game = new GameController(gui);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}