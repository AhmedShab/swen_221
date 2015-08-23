package cluedo;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import card.Card;
import game.Dice;

public class GameModel {

	private Player currentPlayer;
	private List<Player> players =  new ArrayList<Player>();
	private Dice dice;
	private Murder murder;
	private Board board; // handles where the players and tokens are on the board.
	private List<Card> characterCards;
	private List<Card> roomCards;
	private List<Card> weaponCards;
	private boolean moveMade = false;
	private boolean suggestionMade = false;
	private boolean accusationMade = false;

	private int moves;


	public GameModel(){
		dice = new Dice();
		setBoard(new Board());

	}

	public void movePlayer(Point clicked){
		//		currentPlayer;
		//		currentPlayer.getLocation();
		board.movePlayer(currentPlayer,clicked);


	}

	public void playerSuggestion(){

	}

	public int getDiceRoll(){
		return dice.nextRandom();
	}

	public void rollDice(){
		moves = dice.nextRandom();
	}



	public boolean checkAccusation(){
		return false;
	}

	public boolean checkSuggestion(){
		return accusationMade;

	}


	public void removePlayer(){




	}

	public void winGame(){




	}

	public void rotatePlayers(){
		//bounds checking here.
		//currentPlayer = players.get(next++);




	}

	public List<Player> getPlayers(){
		return players;
	}


	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	public void setCurrentPlayer(Player currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	public Murder getMurder() {
		return murder;
	}

	public void setMurder(Murder murder) {
		this.murder = murder;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public List<Card> getCharacterCards() {
		return characterCards;
	}

	public void setCharacterCards(List<Card> characterCards) {
		this.characterCards = characterCards;
	}

	public List<Card> getRoomCards() {
		return roomCards;
	}

	public void setRoomCards(List<Card> roomCards) {
		this.roomCards = roomCards;
	}

	public List<Card> getWeaponCards() {
		return weaponCards;
	}

	public void setWeaponCards(List<Card> weaponCards) {
		this.weaponCards = weaponCards;
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public int getMoves() {
		return moves;
	}

	public void setMoves(int moves) {
		this.moves = moves;
	}
	public boolean isMoveMade() {
		return moveMade;
	}

	public void setMoveMade(boolean moveMade) {
		this.moveMade = moveMade;
	}

}
