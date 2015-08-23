package gui;
import helper.Imagehelper;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import cluedo.Board;
import cluedo.GameController;
@SuppressWarnings("serial")
public class BoardCanvas extends JPanel{
//	private GameController control;
//	private final int WIDTH;
//	private final int HEIGHT;
	private Imagehelper helper = new Imagehelper();
	private int size = 500;
	private Board board;


	public BoardCanvas(Board board){
		//GameController game
		this.board = board;
	}
	@Override
	public Dimension getPreferredSize() {
		Dimension d = new Dimension(500,500);
		return d;
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponents(g);
		ImageIcon board = helper.getBoard();
		g.drawImage(board.getImage(),0,0,size,size,this);
		this.board.drawPlayers(g);
		System.out.println("printing from inside the board canvas.");


	}
}