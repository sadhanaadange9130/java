package com.question2;

public class StateMain {

	public static void main(String args[]){  
		State a=new State();
		a.addState("Assam");			//adding sate name
		a.addState("Karnataka");
		a.addState("pune");
		a.addState("surat");
		
		System.out.println("Retrive the details of state:"+a.retriveState("pune"));
}
	 
}