
public class LinkedList {
	// F 노드 헤드
	private ListNode head; 
	
	
	// C 생성자
	public LinkedList() {
		head = null;
	}
	
	// M 중간 노드 삽입
	public void insertMiddleNode(ListNode pre, String data){
		ListNode newNode = new ListNode(data);				// 새 노드 생성
		newNode.link = pre.link;							// 들어갈 자리 이전 노드의 링크(이후 노드의 주소)를 받는다.
		pre.link = newNode;									// 들어간 후 이전 노드에 링크 시킨다.					
	}
   
	
	// M 노드 삽입(끝으로 넣음)
	public void insertLastNode(String data){
		ListNode newNode = new ListNode(data);				// 새 노드 생성
		ListNode tempNode = head;

		if(tempNode == null) {					// 헤드 널 확인
			head = newNode;
		} else {
			while(tempNode.link != null) {		// 헤드 널 아닐 경우 링크노드 널 확인
				tempNode = tempNode.link;
			}
			tempNode.link = newNode;			// 널인 아니면 삽입.
		}
	}
	
	
	// M 마지막 노드 삭제
	public void deleteLastNode(){
		if(head != null) { 						// 헤드가 비어있으면 아무것도 안 함
			ListNode preNode = head;
			ListNode tempNode = preNode.link;   // 헤드가 비어있지 않으면
			
			while(tempNode.link != null) { 				// 헤드 다음이 비어있는 지 확인
				preNode = tempNode;
				tempNode = tempNode.link;
			}
			preNode.link = null;
			
		} else {
			return;
		}
	}

	
	// 노드 검색
	public ListNode searchNode(String data){
      ListNode tempNode = head;
      
      while(tempNode.getData().equals(data)) {
    	  tempNode = tempNode.link;
      }
      return tempNode.link;
	}

	
	// 노드 순서 반전
	public void reverseList() {
		ListNode nextNode = head;
		ListNode currentNode = null;
		ListNode preNode = null;
		
		// 헤드가 비어있지 않을 때
		while(nextNode != null) {
			// 현재 노드를 이전 노드로 넘김
			preNode = currentNode;
			
			// 불러온 다음 노드를 현재 노드로 불러옴
			currentNode = nextNode;
			
			// 현재 노드와 다음 
			preNode = currentNode.link;
			
			nextNode = nextNode.link;

			}

		head = currentNode;
		}

	
	// M 노드 리스트 출력
	public void printList() {
		ListNode temp = this.head;
		System.out.printf("L = (");
		while(temp != null) { // 헤드가 널이 아닐 때 돌려
			System.out.printf(temp.getData());
			temp = temp.link;
			if(temp != null) { // 헤드가 널이 아니면 , 붙여
				System.out.printf(", ");
			}
		}
		System.out.println(")");
	}
	
}
	

