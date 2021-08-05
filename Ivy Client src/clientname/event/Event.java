/*    */ package clientname.event;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ 
/*    */ public class Event
/*    */ {
/*    */   public Event call() {
/*  9 */     ArrayList<EventData> dataList = EventManager.get((Class)getClass());
/*    */     
/* 11 */     if (dataList != null) {
/* 12 */       for (EventData data : dataList) {
/*    */         try {
/* 14 */           data.target.invoke(data.source, new Object[] { this });
/*    */         }
/* 16 */         catch (Exception e) {
/* 17 */           e.printStackTrace();
/*    */         } 
/*    */       } 
/*    */     }
/*    */     
/* 22 */     return this;
/*    */   }
/*    */ }


/* Location:              C:\Users\1024Bytes\Desktop\Ivy Client.jar!\clientname\event\Event.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */