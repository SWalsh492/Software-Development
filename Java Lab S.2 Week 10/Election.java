import java.util.Scanner;
import java.util.Arrays;

public class Election
{
	private String name;
	private String party;
	private int votes;
	private static int totalVotes;

	public Election()
	{
		Scanner kb = new Scanner(System.in);
		boolean additional = true;
		String[][] candidates = new String[3][3];
		for(int i = 0; i < 2; i++)
		{
			System.out.printf("Enter details for candidate %d:", i+1);
			System.out.println("\nEnter Name: ");
			this.name = kb.nextLine();
			candidates[i][0] = name;
			System.out.println("Enter Party: ");
			this.party = kb.nextLine();
			candidates[i][1] = party;
			System.out.println("Enter votes: ");
			this.votes = kb.nextInt();
			candidates[i][2] = Integer.toString(votes);
			totalVotes += votes;
		}

		while(additional = true)
		{
			System.out.println("Enter additional votes? Enter 1, 2 or 3 for candidates or 0 to end: ");
			int input = kb.nextInt();
			if(input > 0 && input < 3)
			{
				System.out.println("Enter votes for candidate "+ input + ": ");
				candidates[input-1][2] = Integer.parseInt(candidates[input-1][2]);
				candidates[input-1][2] += kb.nextInt();
				System.out.println("CANDIDATE DETAILS: \nName: " + candidates[input-1][0] + "\nParty: " + candidates[input-1][1] + "\nVotes: " + candidates[input-1][2]);
			}
			System.out.println("Enter additional votes? Enter 1, 2 or 3 for candidates or 0 to end: ");
			input = kb.nextInt();
			if(input == 0)
			{
				additional = false;
			}
		}

	}

}