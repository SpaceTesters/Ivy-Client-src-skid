/*    */ package clientname.mods.impl;
/*    */ 
/*    */ import clientname.ChromaText;
/*    */ import clientname.Client;
/*    */ import clientname.gui.hud.ScreenPosition;
/*    */ import clientname.mods.ModDraggable;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.client.renderer.GlStateManager;
/*    */ 
/*    */ 
/*    */ public class ModClientName
/*    */   extends ModDraggable
/*    */ {
/*    */   public int getWidth() {
/* 15 */     return font.getStringWidth(String.valueOf(String.valueOf(Client.ModFarbe)) + Client.ClientName);
/*    */   }
/*    */ 
/*    */   
/*    */   public int getHeight() {
/* 20 */     return font.FONT_HEIGHT;
/*    */   }
/*    */ 
/*    */   
/*    */   public void render(ScreenPosition pos) {
/* 25 */     if (!Client.ChromaText) {
/*    */       
/* 27 */       GlStateManager.pushMatrix();
/* 28 */       (Minecraft.getMinecraft()).fontRendererObj.drawStringWithShadow(String.valueOf(String.valueOf(Client.ModFarbe)) + Client.ClientName, pos.getAbsoluteX(), pos.getAbsoluteY(), -1);
/* 29 */       GlStateManager.popMatrix();
/*    */     } else {
/*    */       
/* 32 */       ChromaText.drawChromaString(Client.ClientName, pos.getAbsoluteX(), pos.getAbsoluteY(), true);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\1024Bytes\Desktop\Ivy Client.jar!\clientname\mods\impl\ModClientName.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */