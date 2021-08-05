/*    */ package clientname.mods.impl;
/*    */ 
/*    */ import clientname.gui.hud.ScreenPosition;
/*    */ import clientname.mods.ModDraggable;
/*    */ import org.lwjgl.LWJGLException;
/*    */ import org.lwjgl.opengl.Display;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ModFullscreen
/*    */   extends ModDraggable
/*    */ {
/*    */   public int getWidth() {
/* 14 */     return 0;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int getHeight() {
/* 20 */     return 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public void render(ScreenPosition pos) {
/* 25 */     System.setProperty("org.lwjgl.opengl.Window.undecorated", "true");
/*    */     
/* 27 */     Display.setLocation(0, 0);
/*    */     try {
/* 29 */       Display.setFullscreen(false);
/* 30 */     } catch (LWJGLException e) {
/*    */       
/* 32 */       e.printStackTrace();
/*    */     } 
/* 34 */     Display.setResizable(false);
/*    */   }
/*    */ }


/* Location:              C:\Users\1024Bytes\Desktop\Ivy Client.jar!\clientname\mods\impl\ModFullscreen.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */