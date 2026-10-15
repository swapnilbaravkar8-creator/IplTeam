package Oct_14;

public class Player {
	
	private int id;
	private String name;
	private String category;
	private int runs;
	private int wickets;
	private int catches;
	
	public Player(){
		
	}
	
	 Player(int id, String name, String category, int runs, int wickets, int catches) {
	
		this.id = id;
		this.name = name;
		this.category = category;
		this.runs = runs;
		this.wickets = wickets;
		this.catches = catches;
	}

	 public int getId() {
		 return id;
	 }

	 public void setId(int id) {
		 this.id = id;
	 }

	 public String getName() {
		 return name;
	 }

	 public void setName(String name) {
		 this.name = name;
	 }

	 public String getCategory() {
		 return category;
	 }

	 public void setCategory(String category) {
		 this.category = category;
	 }

	 public int getRuns() {
		 return runs;
	 }

	 public void setRuns(int runs) {
		 this.runs = runs;
	 }

	 public int getWickets() {
		 return wickets;
	 }

	 public void setWickets(int wickets) {
		 this.wickets = wickets;
	 }

	 public int getCatches() {
		 return catches;
	 }

	 public void setCatches(int catches) {
		 this.catches = catches;
	 }

	 @Override
	 public String toString() {
		return "Player [id=" + id + ", name=" + name + ", category=" + category + ", runs=" + runs + ", wickets="
				+ wickets + ", catches=" + catches + "]";
	 }
	
	 	

}
package Oct_14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainIpl {

	public static void main(String[] args) {

		List<Player> miPlayerList = new ArrayList<>();

		miPlayerList.add(new Player(1, "Rohit Sharma", "Batsman", 6000, 0, 30));
		miPlayerList.add(new Player(2, "Jasprit Bumrah", "Bowler", 100, 150, 20));
		miPlayerList.add(new Player(3, "Hardik Pandya", "All-rounder", 2500, 60, 40));
		miPlayerList.add(new Player(4, "Suryakumar Yadav", "Batsman", 3500, 0, 25));
		miPlayerList.add(new Player(5, "Tilak Varma", "Batsman", 1500, 0, 15));
		miPlayerList.add(new Player(6, "Ishan Kishan", "Wicketkeeper", 2500, 0, 20));
		miPlayerList.add(new Player(7, "Trent Boult", "Bowler", 50, 100, 10));
		miPlayerList.add(new Player(8, "Deepak Chahar", "Bowler", 100, 70, 12));
		miPlayerList.add(new Player(9, "Mitchell Santner", "All-rounder", 500, 40, 15));
		miPlayerList.add(new Player(10, "Naman Dhir", "All-rounder", 300, 5, 8));
		miPlayerList.add(new Player(11, "Piyush Chawla", "Bowler", 200, 180, 18));
		List<Player> rcbPlayerList = new ArrayList<>();
		rcbPlayerList.add(new Player(3, "Virat", "Batsman", 8000, 0, 50));
		rcbPlayerList.add(new Player(4, "Rajat", "Batsman", 1500, 0, 10));

		List<Player> cskPlayerList = new ArrayList<>();

		cskPlayerList.add(new Player(1, "MS Dhoni", "Wicketkeeper", 5000, 0, 150));
		cskPlayerList.add(new Player(2, "Ruturaj Gaikwad", "Batsman", 2500, 0, 20));
		cskPlayerList.add(new Player(3, "Ravindra Jadeja", "All-rounder", 2800, 150, 70));
		cskPlayerList.add(new Player(4, "Shivam Dube", "All-rounder", 1800, 5, 15));
		cskPlayerList.add(new Player(5, "Dewald Brevis", "Batsman", 500, 0, 8));
		cskPlayerList.add(new Player(6, "Devon Conway", "Wicketkeeper", 1500, 0, 12));
		cskPlayerList.add(new Player(7, "Matheesha Pathirana", "Bowler", 20, 30, 5));
		cskPlayerList.add(new Player(8, "Khaleel Ahmed", "Bowler", 50, 40, 10));
		cskPlayerList.add(new Player(9, "Ravichandran Ashwin", "Bowler", 300, 70, 25));
		cskPlayerList.add(new Player(10, "Rahul Tripathi", "Batsman", 1200, 0, 10));
		cskPlayerList.add(new Player(11, "Vijay Shankar", "All-rounder", 800, 5, 12));

		List<Player> rcbPlayerList1 = new ArrayList<>();

		rcbPlayerList1.add(new Player(1, "Virat Kohli", "Batsman", 8000, 0, 50));
		rcbPlayerList1.add(new Player(2, "Rajat Patidar", "Batsman", 1500, 0, 15));
		rcbPlayerList1.add(new Player(3, "Phil Salt", "Wicketkeeper", 1000, 0, 10));
		rcbPlayerList1.add(new Player(4, "Liam Livingstone", "All-rounder", 1000, 10, 20));
		rcbPlayerList1.add(new Player(5, "Jitesh Sharma", "Wicketkeeper", 800, 0, 15));
		rcbPlayerList1.add(new Player(6, "Tim David", "Batsman", 700, 0, 10));
		rcbPlayerList1.add(new Player(7, "Krunal Pandya", "All-rounder", 1000, 50, 25));
		rcbPlayerList1.add(new Player(8, "Bhuvneshwar Kumar", "Bowler", 300, 180, 20));
		rcbPlayerList1.add(new Player(9, "Josh Hazlewood", "Bowler", 50, 50, 10));
		rcbPlayerList1.add(new Player(10, "Yash Dayal", "Bowler", 20, 30, 5));
		rcbPlayerList1.add(new Player(11, "Suyash Sharma", "Bowler", 10, 15, 3));

		Map<String, List<Player>> allIplTeamsMap = new HashMap<>();

		allIplTeamsMap.put("MI", miPlayerList);
		allIplTeamsMap.put("RCB", rcbPlayerList1);
		allIplTeamsMap.put("CSK", cskPlayerList);

		Set<String> teamNamesKey = allIplTeamsMap.keySet();

		for (String tn : teamNamesKey) {
			System.out.println("\n" + tn + "-->>");
			List<Player> listPlayers = allIplTeamsMap.get(tn);

			for (Player p : listPlayers) {
				System.out.println("  " + p);
			}
		}

		System.out.println("\n* 1All Batters:-");
		for (List<Player> players : allIplTeamsMap.values()) {
			for (Player p : players) {
				if (p.getCategory().equalsIgnoreCase("Batsman")) {
					System.out.println(p);
				}
			}
		}
		System.out.println("\n* 2Bowler :-");
		for (List<Player> players : allIplTeamsMap.values()) {
			for (Player p : players) {
				if (p.getCategory().equalsIgnoreCase("Bowler")) {
					System.out.println(p);
				}
			}
		}

		System.out.println("\n* 3Bowler :-");
		for (List<Player> players : allIplTeamsMap.values()) {
			for (Player p : players) {
				if (p.getCategory().equalsIgnoreCase("All-rounder")) {
					System.out.println(p);
				}
			}
		}

		System.out.println("\n* 4MI Allrounder :-");

		for (Player p : miPlayerList) {
			if (p.getCategory().equalsIgnoreCase("All-rounder")) {
				System.out.println(p);
			}
		}
		System.out.println("\n* 5MI Bowler :-");

		for (Player p : miPlayerList) {
			if (p.getCategory().equalsIgnoreCase("Bowler")) {
				System.out.println(p);
			}
		}

		System.out.println("\n* 6RCB Batsman :-");

		for (Player p : rcbPlayerList1) {
			if (p.getCategory().equalsIgnoreCase("Batsman")) {
				System.out.println(p);
			}
		}
		
		System.out.println("\n*7highest runs player details");
		Player maxPlayer = null;
		for (List<Player> ap : allIplTeamsMap.values()) {
			for (Player p : ap) {
				if (maxPlayer == null || p.getRuns() > maxPlayer.getRuns()) {
					maxPlayer = p;
				}
			}
		}
		if (maxPlayer != null) {
			System.out.println(maxPlayer);
		}

		System.out.println("\n*8highest wicket player details");

		Player maxPlayer1 = null;
		for (List<Player> ap : allIplTeamsMap.values()) {
			for (Player p : ap) {
				if (maxPlayer1 == null || p.getWickets() > maxPlayer1.getRuns()) {
					maxPlayer1 = p;
				}
			}
		}
		if (maxPlayer1 != null) {
			System.out.println(maxPlayer1);
		}

		System.out.println("\n*9highest catches player details");

		Player maxPlayer2 = null;
		for (List<Player> ap : allIplTeamsMap.values()) {
			for (Player p : ap) {
				if (maxPlayer2 == null || p.getCatches() > maxPlayer2.getRuns()) {
					maxPlayer2 = p;
				}
			}
		}
		if (maxPlayer2 != null) {
			System.out.println(maxPlayer2);
		}

		System.out.println("\n*10 lowest runs player details");
		Player minPlayer = null;
		for (List<Player> ap : allIplTeamsMap.values()) {
			for (Player p : ap) {
				if (minPlayer == null || p.getRuns() < minPlayer.getRuns()) {
					minPlayer = p;
				}
			}
		}
		if (minPlayer != null) {
			System.out.println(minPlayer);
		}

		System.out.println("\n*11 lowest wicket player details");
		Player minPlayer1 = null;
		for (List<Player> ap : allIplTeamsMap.values()) {
			for (Player p : ap) {
				if (minPlayer1 == null || p.getWickets() < minPlayer1.getRuns()) {
					minPlayer1 = p;
				}
			}
		}
		if (minPlayer != null) {
			System.out.println(minPlayer1);
		}

		System.out.println("\n*12h lowesty catches player details");

		Player minPlayer2 = null;
		for (List<Player> ap : allIplTeamsMap.values()) {
			for (Player p : ap) {
				if (minPlayer2 == null || p.getCatches() < minPlayer2.getRuns()) {
					minPlayer2 = p;
				}
			}
		}
		if (minPlayer2 != null) {
			System.out.println(maxPlayer2);
		}

		System.out.println("\n*13 Total IPL Players");

		int totalPlayers = 0;

		for (List<Player> list : allIplTeamsMap.values()) {
			totalPlayers = totalPlayers + list.size();
		}

		System.out.println("Total Players: " + totalPlayers);
		System.out.println("\n*14 Total IPL Runs");

		int totalRuns = 0;

		for (List<Player> list : allIplTeamsMap.values()) {
			for (Player p : list) {
				totalRuns += p.getRuns();
			}
		}

		System.out.println("Total Runs: " + totalRuns);
		System.out.println("\n*15 Total IPL Wickets");

		int totalWickets = 0;

		for (List<Player> list : allIplTeamsMap.values()) {
			for (Player p : list) {
				totalWickets += p.getWickets();
			}
		}

		System.out.println("Total Wickets: " + totalWickets);
		System.out.println("\n*16 Total IPL Catches");

		int totalCatches = 0;

		for (List<Player> list : allIplTeamsMap.values()) {
			for (Player p : list) {
				totalCatches += p.getCatches();
			}
		}

		System.out.println("Total Catches: " + totalCatches);
		System.out.println("\n*17 Count Batsmen");

		int count = 0;

		for (List<Player> list : allIplTeamsMap.values()) {
			for (Player p : list) {
				if (p.getCategory().equalsIgnoreCase("Batsman")) {
					count++;
				}
			}
		}

		System.out.println("Total Batsmen: " + count);
		System.out.println("\n*18 Count Bowlers");

		int count1 = 0;

		for (List<Player> list : allIplTeamsMap.values()) {
			for (Player p : list) {
				if (p.getCategory().equalsIgnoreCase("Bowler")) {
					count1++;
				}
			}
		}

		System.out.println("Total Bowlers: " + count1);
		System.out.println("\n*19 Count All-Rounders");

		int count2 = 0;

		for (List<Player> list : allIplTeamsMap.values()) {
			for (Player p : list) {
				if (p.getCategory().equalsIgnoreCase("All-Rounder")) {
					count2++;
				}
			}
		}
		System.out.println("Total All-Rounders: " + count2);
		System.out.println("\n*20 MI Highest Runs Player");

		Player maxRuns = null;

		for (Player p : miPlayerList) {
			if (maxRuns == null || p.getRuns() > maxRuns.getRuns()) {
				maxRuns = p;
			}
		}

		System.out.println(maxRuns);
		System.out.println("\n*21 RCB Highest Wickets Player");

		Player maxWickets = null;

		for (Player p : rcbPlayerList) {
			if (maxWickets == null || p.getWickets() > maxWickets.getWickets()) {
				maxWickets = p;
			}
		}

		System.out.println(maxWickets);
		System.out.println("\n*22 CSK Highest Catches Player");

		Player maxCatches = null;

		for (Player p : cskPlayerList) {
			if (maxCatches == null || p.getCatches() > maxCatches.getCatches()) {
				maxCatches = p;
			}
		}

		System.out.println(maxCatches);
		System.out.println("\n*23 Players Above 3000 Runs");

		for (List<Player> list : allIplTeamsMap.values()) {
			for (Player p : list) {
				if (p.getRuns() > 3000) {
					System.out.println(p);
				}
			}
		}
		System.out.println("\n*24 Players Above 100 Wickets");

		for (List<Player> list : allIplTeamsMap.values()) {
			for (Player p : list) {
				if (p.getWickets() > 100) {
					System.out.println(p);
				}
			}
		}
		System.out.println("\n*25 Players Above 20 Catches");

		for (List<Player> list : allIplTeamsMap.values()) {
			for (Player p : list) {
				if (p.getCatches() > 20) {
					System.out.println(p);
				}
			}
		}
		System.out.println("\n*26 Team-Wise Total Runs");

		for (String team : allIplTeamsMap.keySet()) {
			int runs = 0;

			for (Player p : allIplTeamsMap.get(team)) {
				runs += p.getRuns();
			}

			System.out.println(team + " Total Runs: " + runs);
		}
	}

}
