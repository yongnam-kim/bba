package com.bba.dto;

import java.util.Date;

public class StatDto {
	private int matchNo;
	private int teamNo;
	private float backNo;
	private Date courtIn;
	private Date courtOut;
	private short score1;
	private short score2;
	private short score3;
	private short oReb;
	private short dReb;
	private short asst;
	private short stl;
	private short blck;
	private short trnovr;
	private short foul;
	public int getMatchNo() {
		return matchNo;
	}
	public void setMatchNo(int matchNo) {
		this.matchNo = matchNo;
	}
	public int getTeamNo() {
		return teamNo;
	}
	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}
	public float getBackNo() {
		return backNo;
	}
	public void setBackNo(float backNo) {
		this.backNo = backNo;
	}
	public Date getCourtIn() {
		return courtIn;
	}
	public void setCourtIn(Date courtIn) {
		this.courtIn = courtIn;
	}
	public Date getCourtOut() {
		return courtOut;
	}
	public void setCourtOut(Date courtOut) {
		this.courtOut = courtOut;
	}
	public short getScore1() {
		return score1;
	}
	public void setScore1(short score1) {
		this.score1 = score1;
	}
	public short getScore2() {
		return score2;
	}
	public void setScore2(short score2) {
		this.score2 = score2;
	}
	public short getScore3() {
		return score3;
	}
	public void setScore3(short score3) {
		this.score3 = score3;
	}
	public short getoReb() {
		return oReb;
	}
	public void setoReb(short oReb) {
		this.oReb = oReb;
	}
	public short getdReb() {
		return dReb;
	}
	public void setdReb(short dReb) {
		this.dReb = dReb;
	}
	public short getAsst() {
		return asst;
	}
	public void setAsst(short asst) {
		this.asst = asst;
	}
	public short getStl() {
		return stl;
	}
	public void setStl(short stl) {
		this.stl = stl;
	}
	public short getBlck() {
		return blck;
	}
	public void setBlck(short blck) {
		this.blck = blck;
	}
	public short getTrnovr() {
		return trnovr;
	}
	public void setTrnovr(short trnovr) {
		this.trnovr = trnovr;
	}
	public short getFoul() {
		return foul;
	}
	public void setFoul(short foul) {
		this.foul = foul;
	}
	
	
	
}
