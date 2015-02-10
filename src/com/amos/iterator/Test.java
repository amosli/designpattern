package com.amos.iterator;

public class Test {

	public static void main(String[] args) {
		// test1  实现ArrayList
		// ArrayList list = new ArrayList();
		// for(int i=0;i<30;i++){
		// list.add(i);
		// }
		// System.out.println(list.size());
		//

		// test2  实现链表
		// LinkedList list = new LinkedList();
		// for (int i = 0; i < 30; i++) {
		// list.add(i);
		// }
		// System.out.println(list.size());

		// test3 抽象出来一个通行的容器接口
		// Collection list = new LinkedList();
		// for (int i = 0; i < 30; i++) {
		// list.add(i);
		// }
		// System.out.println(list.size());

		// test4 对元素进行遍历
		Collection list = new LinkedList();
		for (int i = 0; i < 30; i++) {
			list.add(i);
		}
		
		for (int i = 0; i < 30; i++) {
			System.out.println(list.get(i));
		}
		
	}
}
