package com.javavcube;
import java.util.Scanner;


	public class Cricketplayer {
		static Scanner sc=new Scanner(System.in);
		String player_Name;
		int Matches_played;
		int total_runs;
		
		Cricketplayer(String name,int matches,int total){
			  this.player_Name=name;
			  this.Matches_played=matches;
			  this.total_runs=total;
			
			
			
		}
		void calculate(String n,int m,int t) {
			
			float average=t/m;
			System.out.println("player name:"+n);
			System.out.println("matches played:"+m);
			System.out.println("total matches:"+t);
			System.out.println("average:"+average);
			
		}
		

		public static void main(String[] args) {
			System.out.println("enter player name:");
			 String Player_name=sc.nextLine();
			 System.out.println("enter matches palyed:");
			 int Matches_played=sc.nextInt();
			 System.out.println("enter total matches:");
			int total_runs=sc.nextInt();
			 Cricketplayer p1=new Cricketplayer(Player_name,Matches_played,total_runs);
			 p1.calculate(Player_name, Matches_played, total_runs);

		}

	
	

}
