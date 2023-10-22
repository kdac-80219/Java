package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

public class CandidateDao implements AutoCloseable{

	private Connection con;
	
	public CandidateDao () throws SQLException
	{
		con = DbUtil.getConnection();
	}
	@Override
	public void close() throws Exception {
		
		try
		{
			if(con!=null)
			{
				con.close();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// add new candidate
	
		public int saveCandidate(Candidate c)throws SQLException
		{
			String sql = "INSERT INTO candidates values(default,?,?,?)";
			try(PreparedStatement stmt = con.prepareStatement(sql))
			{
				stmt.setString(1, c.getName());
				stmt.setString(2, c.getParty());
				stmt.setInt(3,c.getVotes());
				
				int cnt = stmt.executeUpdate();
				return cnt;
			}
			
		}
	
		public int updateCandidate(Candidate c)throws SQLException
		{
			String sql = "UPDATE candidates SET name=?,party=? WHERE id=?";
			try(PreparedStatement stmt = con.prepareStatement(sql))
			{
				stmt.setString(1,c.getName());
				stmt.setString(2,c.getParty());
				stmt.setInt(3, c.getId());
				int cnt = stmt.executeUpdate();
				return cnt ;
			}
			
		}
		
		public List<PartyVotes> getPartyWisevotes() throws SQLException
		{
			List<PartyVotes> list = new ArrayList<>();
			String sql = "select party,sum(votes) from candidates group by party";
			try(PreparedStatement stmt = con.prepareStatement(sql))
			{
				try(ResultSet rs = stmt.executeQuery())
				{
					while(rs.next())
					{
						String party = rs.getString("party");
						int votes = rs.getInt("sum(votes)");
						PartyVotes c = new PartyVotes(party,votes);
						list.add(c);
						
					}
				}
			}
			return list;
		}
			
		
}
