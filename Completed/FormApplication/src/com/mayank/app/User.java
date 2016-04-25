package com.mayank.app;

public class User {
	int isn;
	int srt_cde;
	int acc_num;
	int chq_ser;
	String payee_name;

	public User(){
	}

	public User(int isn,int srt_cde,int acc_num,int chq_ser,String payee_name){
		this.isn=isn;	
		this.srt_cde=srt_cde;	
		this.acc_num=acc_num;
		this.chq_ser=chq_ser;
		this.payee_name=payee_name;
	}

	public int getisn() {
		return isn;
	}
	public void setisn(int isn) {
		this.isn=isn;
	}

	public int getsrt_cde() {
		return srt_cde;
	}
	public void setsrt_cde(int srt_cde) {
		this.srt_cde=srt_cde;
	}

	public String getpayee_name() {
		return payee_name;
	}
	public void setpayee_name(String payee_name) {
		this.payee_name=payee_name;
	}


	public int getacc_num() {
		return acc_num;
	}
	public void setacc_num(int acc_num) {
		this.acc_num=acc_num;
	}

	public int getchq_ser() {
		return chq_ser;
	}
	public void setchq_ser(int chq_ser) {
		this.chq_ser=chq_ser;
	}
}