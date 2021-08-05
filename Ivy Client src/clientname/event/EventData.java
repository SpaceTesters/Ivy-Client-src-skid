/*    */ package clientname.event;
/*    */ 
/*    */ import java.lang.reflect.Method;
/*    */ 
/*    */ 
/*    */ public class EventData
/*    */ {
/*    */   public final Object source;
/*    */   public final Method target;
/*    */   public final byte priority;
/*    */   
/*    */   public EventData(Object source, Method target, byte priority) {
/* 13 */     this.source = source;
/* 14 */     this.target = target;
/* 15 */     this.priority = priority;
/*    */   }
/*    */ }


/* Location:              C:\Users\1024Bytes\Desktop\Ivy Client.jar!\clientname\event\EventData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */