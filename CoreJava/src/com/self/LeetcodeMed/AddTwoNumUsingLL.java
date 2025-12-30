package com.self.LeetcodeMed;

public class AddTwoNumUsingLL {
	
//	Input: l1 = [2,4,3], l2 = [5,6,4]
//	Output: [7,0,8]
//	Explanation: 342 + 465 = 807.

	public static void main(String[] args) {
		
		ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
		ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
		
		addTwoNum(l1,l2);
		
	}
	
	public static void addTwoNum(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode();
		ListNode res = dummy;
		while(l1!=null && l2!=null) {
			
			
			System.out.println(res.val);
			res.next = new ListNode(l1.val+l2.val);
			res = res.next;
			l1=l1.next;
			l2=l2.next;
		}
//		System.out.println(dummy.val);
		
	}
	
}

class ListNode {
	
	int val;
	ListNode next;
	
	ListNode(){}
	ListNode(int val){this.val = val;}
	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}