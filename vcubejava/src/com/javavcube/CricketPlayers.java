package com.javavcube;

public class CricketPlayers {
	static String teamname="india";
	String playerName;
	int runs;
	

	public static void main(String[] args) {
		System.out.println("***************player1 details***************");
		CricketPlayers player1=new CricketPlayers();
		 player1.playerName="virat kohli";
		 player1.runs=40;
		 
		 
		System.out.println("team name :"+ teamname);
		System.out.println("playername:"+player1.playerName );
		System.out.println("runs :"+ player1.runs );
		System.out.println("****************player2 details*********");
		CricketPlayers player2=new CricketPlayers();
		 player2.playerName="ms dhoni";
		 player2.runs=50;
		 
		 
		System.out.println("team name :"+ teamname);
		System.out.println("playername:"+player2.playerName );
		System.out.println("runs :"+ player2.runs );
		System.out.println("****************player3 details*********");
		CricketPlayers player3=new CricketPlayers();
		 player3.playerName="rohith sharma";
		 player3.runs=38;
		 
		 
		System.out.println("team name :"+ teamname);
		System.out.println("playername:"+player3.playerName );
		System.out.println("runs :"+ player3.runs );
		
		

	}

}

