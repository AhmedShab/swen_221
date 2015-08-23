package squares;

import java.awt.Point;

import cluedo.*;

/**
 * Represents the wall of a certain room, which players cannot
 * walk through.
 *
 */
public class RoomWallSquare extends Square {

	private String room;
	/**
	 * Constructor for class RoomWallSquare.
	 * @param room The room this square is walling
	 */
	public RoomWallSquare(String room, Point p){
		super(false, p);
		this.room = room;
	}

	@Override
	public char boardChar() {
		switch(this.room){
		case CluedoSetUp.ROSEWATERPARK : return 'K';
		case CluedoSetUp.BALL_ROOM : return 'B';
		case CluedoSetUp.CONSERVATORY : return 'C';
		case CluedoSetUp.BILLIARD_ROOM : return 'P';
		case CluedoSetUp.LIBRARY : return 'L';
		case CluedoSetUp.STUDY : return 'S';
		case CluedoSetUp.HALL : return 'H';
		case CluedoSetUp.LOUNGE : return 'G';
		case CluedoSetUp.DINING_ROOM : return 'D';
		default : return ' ';
		}
	}


}
