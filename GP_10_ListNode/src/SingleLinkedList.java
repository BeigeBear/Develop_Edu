
public class SingleLinkedList {
   public static void main(String[] args) {
	   
	   // 링크드 리스트 선언
	   LinkedList L = new LinkedList();
      
      System.out.println("(1) 공백 리스트에 노드 3개 삽입하기");
      L.insertLastNode("1"); // 1을 마지막 노드로 삽입
      L.insertLastNode("3"); // 3을 마지막 노드로 삽입
      L.insertLastNode("7"); // 7을 마지막 노드로 삽입
      L.insertLastNode("9"); // 9을 마지막 노드로 삽입
      L.printList(); // 전체 노드를 출력
      
      
      System.out.println("(2) 3 노드 뒤에 5 노드 삽입하기");
      ListNode preNode = L.searchNode("3");
      if(preNode == null) {
         System.out.println("검색 실패 >> 찾는 데이터가 없습니다");
      } else {
         L.insertMiddleNode(preNode, "5");
         L.printList();
      }

      System.out.println("(3) 리스트의 노드를 역순으로 바꾸기");
      L.reverseList();
      L.printList();

     
      System.out.println("(4) 리스트의 마지막 노드 삭제하기");
      L.deleteLastNode();
      L.printList();
   }
   
   

}