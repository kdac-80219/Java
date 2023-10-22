package com.sunbeam;
import java.util.*;
public class PartyVotes {

	private String party;
	private int votes;
	public PartyVotes() {
		super();
	}
	public PartyVotes(String party, int votes) {
		super();
		this.party = party;
		this.votes = votes;
	}
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	public int getVotes() {
		return votes;
	}
	public void setVotes(int votes) {
		this.votes = votes;
	}
	@Override
	public String toString() {
		return "PartyVotes [party=" + party + ", votes=" + votes + "]";
	}
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter party name = ");
		this.party = sc.next();
		System.out.println("Enter votes = ");
		this.votes = sc.nextInt();
	}
}
