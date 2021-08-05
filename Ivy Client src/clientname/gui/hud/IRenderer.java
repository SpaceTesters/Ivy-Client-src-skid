/*    */ package clientname.gui.hud;
/*    */ 
/*    */ public interface IRenderer
/*    */   extends IRenderConfig
/*    */ {
/*    */   int getWidth();
/*    */   
/*    */   int getHeight();
/*    */   
/*    */   void render(ScreenPosition paramScreenPosition);
/*    */   
/*    */   default void renderDummy(ScreenPosition pos) {
/* 13 */     render(pos);
/*    */   }
/*    */   
/*    */   default boolean isEnabled() {
/* 17 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\1024Bytes\Desktop\Ivy Client.jar!\clientname\gui\hud\IRenderer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */