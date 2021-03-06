package yj.core.stpo.dto;

/**Auto Generated By Hap Code Generator**/

import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import com.hand.hap.system.dto.BaseDTO;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@ExtensionAttribute(disable=true)
@Table(name = "sap_stpo")
public class Stpo extends BaseDTO {
     @NotEmpty
      private String matnr; //物料编号

     @Id
     @GeneratedValue
      private String werks; //工厂

     @NotEmpty
      private String stlan; //BOM 用途 

     @NotEmpty
      private String stlnr; //物料单 

     @NotEmpty
      private String stlal; //可选的 BOM

     @NotEmpty
      private String stkoz; //内部计数器 

      private Date datuv; //有效起始日期

      private String lkenz; //项目删除标识

      private String loekz; //BOM删除标志

      private String bmein; //BOM 基本单位

      private Double bmeng; //基本数量

      private String stlst; //BOM 状态 

      private Date validTo; //有效截止日期

      private String stlty; //物料清单类别

      private String idnrk; //BOM 组件

      private String postp; //项目类别（物料单） 

      private String posnr; //BOM 项目号 

      private String meins; //组件计量单位

      private Double menge; //组件数量

      private String lgort; //生产订单的发货地点 

      private String ausch; //组件报废率


     public void setMatnr(String matnr){
         this.matnr = matnr;
     }

     public String getMatnr(){
         return matnr;
     }

     public void setWerks(String werks){
         this.werks = werks;
     }

     public String getWerks(){
         return werks;
     }

     public void setStlan(String stlan){
         this.stlan = stlan;
     }

     public String getStlan(){
         return stlan;
     }

     public void setStlnr(String stlnr){
         this.stlnr = stlnr;
     }

     public String getStlnr(){
         return stlnr;
     }

     public void setStlal(String stlal){
         this.stlal = stlal;
     }

     public String getStlal(){
         return stlal;
     }

     public void setStkoz(String stkoz){
         this.stkoz = stkoz;
     }

     public String getStkoz(){
         return stkoz;
     }

     public void setDatuv(Date datuv){
         this.datuv = datuv;
     }

     public Date getDatuv(){
         return datuv;
     }

     public void setLkenz(String lkenz){
         this.lkenz = lkenz;
     }

     public String getLkenz(){
         return lkenz;
     }

     public void setLoekz(String loekz){
         this.loekz = loekz;
     }

     public String getLoekz(){
         return loekz;
     }

     public void setBmein(String bmein){
         this.bmein = bmein;
     }

     public String getBmein(){
         return bmein;
     }

     public void setBmeng(Double bmeng){
         this.bmeng = bmeng;
     }

     public Double getBmeng(){
         return bmeng;
     }

     public void setStlst(String stlst){
         this.stlst = stlst;
     }

     public String getStlst(){
         return stlst;
     }

     public void setValidTo(Date validTo){
         this.validTo = validTo;
     }

     public Date getValidTo(){
         return validTo;
     }

     public void setStlty(String stlty){
         this.stlty = stlty;
     }

     public String getStlty(){
         return stlty;
     }

     public void setIdnrk(String idnrk){
         this.idnrk = idnrk;
     }

     public String getIdnrk(){
         return idnrk;
     }

     public void setPostp(String postp){
         this.postp = postp;
     }

     public String getPostp(){
         return postp;
     }

     public void setPosnr(String posnr){
         this.posnr = posnr;
     }

     public String getPosnr(){
         return posnr;
     }

     public void setMeins(String meins){
         this.meins = meins;
     }

     public String getMeins(){
         return meins;
     }

     public void setMenge(Double menge){
         this.menge = menge;
     }

     public Double getMenge(){
         return menge;
     }

     public void setLgort(String lgort){
         this.lgort = lgort;
     }

     public String getLgort(){
         return lgort;
     }

     public void setAusch(String ausch){
         this.ausch = ausch;
     }

     public String getAusch(){
         return ausch;
     }

     }
