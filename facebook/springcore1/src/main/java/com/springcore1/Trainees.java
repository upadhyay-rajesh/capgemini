package com.springcore1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Trainees {
	private TrainerInterface tt;
		
	//adapter
	public void setTt(TrainerInterface tt) {
		this.tt = tt;
	}

	public void access() {
		tt.teach();
	}

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("abc.xml");
		
		Trainees t1=(Trainees)ctx.getBean("k2");
		
		//---------------------spring creates object-----------
		
	//	TrainerInterface t2=new Trainer();
		//t1.setTt(t2);					//dependency injection
		
		//---------spring
		
		
		t1.access();

	}

}
