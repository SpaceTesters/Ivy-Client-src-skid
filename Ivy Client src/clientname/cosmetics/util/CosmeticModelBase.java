/*    */ package clientname.cosmetics.util;
/*    */ 
/*    */ import net.minecraft.client.model.ModelBase;
/*    */ import net.minecraft.client.model.ModelBiped;
/*    */ import net.minecraft.client.renderer.entity.RenderPlayer;
/*    */ 
/*    */ public class CosmeticModelBase extends ModelBase {
/*    */   protected ModelBiped playerModel;
/*    */   
/*    */   public CosmeticModelBase(RenderPlayer player) {
/* 11 */     this.playerModel = (ModelBiped)player.getMainModel();
/*    */   }
/*    */ }


/* Location:              C:\Users\1024Bytes\Desktop\Ivy Client.jar!\clientname\cosmetic\\util\CosmeticModelBase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */