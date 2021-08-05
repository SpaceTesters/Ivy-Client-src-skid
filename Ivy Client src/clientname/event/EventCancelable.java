/*    */ package clientname.event;
/*    */ 
/*    */ public class EventCancelable
/*    */   extends Event {
/*    */   private boolean cancelled = false;
/*    */   
/*    */   public boolean isCancelled() {
/*  8 */     return this.cancelled;
/*    */   }
/*    */   
/*    */   public void setCancelled(boolean cancelled) {
/* 12 */     this.cancelled = cancelled;
/*    */   }
/*    */ }


/* Location:              C:\Users\1024Bytes\Desktop\Ivy Client.jar!\clientname\event\EventCancelable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */