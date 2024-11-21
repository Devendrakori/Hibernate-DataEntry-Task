package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VoterCard {

	@Id
	private String voterid;
	private String constituency;
	public VoterCard() {
		super();
	}
	public VoterCard(String voterid, String constituency) {
		super();
		this.voterid = voterid;
		this.constituency = constituency;
	}
	public String getVoterid() {
		return voterid;
	}
	public void setVoterid(String voterid) {
		this.voterid = voterid;
	}
	public String getConstituency() {
		return constituency;
	}
	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}
	@Override
	public String toString() {
		return "VoterCard [voterid=" + voterid + ", constituency=" + constituency + "]";
	}
	
}
