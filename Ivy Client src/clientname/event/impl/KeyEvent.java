/*    */ package clientname.event.impl;
/*    */ 
/*    */ import clientname.event.EventCancelable;
/*    */ 
/*    */ public class KeyEvent
/*    */   extends EventCancelable {
/*    */   private final int key;
/*    */   
/*    */   public KeyEvent(int key) {
/* 10 */     this.key = key;
/*    */   }
/*    */   
/*    */   public int getKey() {
/* 14 */     return this.key;
/*    */   }
/*    */ }


/* Location:              C:\Users\1024Bytes\Desktop\Ivy Client.jar!\clientname\event\impl\KeyEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */