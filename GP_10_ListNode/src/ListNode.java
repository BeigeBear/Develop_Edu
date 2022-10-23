
public class ListNode {
   private String data; // 필드 데이터
   public ListNode link; // 리스트 노드
   
   public ListNode() {
      this.data = null;
      this.link = null;
   }
   
   public ListNode(String data) {
      this.data = data;
      this.link = null;
   }
   
   public ListNode(String data, ListNode link) {
      this.data = data;
   }
   
   public String getData() {
      return this.data;
   }
}
