package test;

import org.junit.Test;

import queue1.Queue1;

public class Queue1Test {

	
	@Test
	public void test1(){
		Queue1 qu = new Queue1(5);
			if (){
				throw new RuntimeException("Failed");	
			}
	}
	
	@Test
	public void test2(){
		Queue1 qu = new Queue1(5);
		Object ob = Queue1.add(qu);
			if( ob)
				
				throw new RuntimeException("Failed");
	}
	@Test
	public void test3(){
		Queue1 qu = new Queue1(5);
		
	}
	@Test
	public void test4(){
		Queue1 qu = new Queue1(5);
			boolean y = qu.isFull();
				if(y == false){
					throw new RuntimeException("Failed");
				}
			}
		

	@Test
	public void test5(){
		Queue1 qu = new Queue1(5);
			boolean x = qu.isEmpty();
				if(x == false){
					throw new RuntimeException("Failed");
				}
	}
		
}

