package yj.core.wmsxhcard.dto;

/**Auto Generated By Hap Code Generator**/

import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import com.hand.hap.system.dto.BaseDTO;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@ExtensionAttribute(disable=true)
@Table(name = "wip_wmsxhcard")
public class Wmsxhcard extends BaseDTO {
     @NotEmpty
      private String werks; //工厂

     @Id
     @GeneratedValue
      private String zxhbar; //箱号条码

      private String matnr; //物料编号

      private String lifnr; //供应商

      private String sortl; //供应商简称

      private Date lifnrDate; //供应商生产日期

      private String lifnrLotn; //供应商批号

      private String zxhzt; //箱号条码状态

      private String lgort; //库存地点

      private Double menge; //数量

      private String meins; //基本计量单位

      private String zxhwz; //箱号位置

      private String ztxt; //备注

      private String zbqbd; //标志

      private String chargkc; //库存批次

      private String zsxwc; //上线执行状态标志 X：完成 H：冻结

      private String lineId; //机加上线生产线ID

      private String maktx;

    public String getMaktx() {
        return maktx;
    }

    public void setMaktx(String maktx) {
        this.maktx = maktx;
    }

    public void setWerks(String werks){
         this.werks = werks;
     }

     public String getWerks(){
         return werks;
     }

     public void setZxhbar(String zxhbar){
         this.zxhbar = zxhbar;
     }

     public String getZxhbar(){
         return zxhbar;
     }

     public void setMatnr(String matnr){
         this.matnr = matnr;
     }

     public String getMatnr(){
         return matnr;
     }

     public void setLifnr(String lifnr){
         this.lifnr = lifnr;
     }

     public String getLifnr(){
         return lifnr;
     }

     public void setSortl(String sortl){
         this.sortl = sortl;
     }

     public String getSortl(){
         return sortl;
     }

     public void setLifnrDate(Date lifnrDate){
         this.lifnrDate = lifnrDate;
     }

     public Date getLifnrDate(){
         return lifnrDate;
     }

     public void setLifnrLotn(String lifnrLotn){
         this.lifnrLotn = lifnrLotn;
     }

     public String getLifnrLotn(){
         return lifnrLotn;
     }

     public void setZxhzt(String zxhzt){
         this.zxhzt = zxhzt;
     }

     public String getZxhzt(){
         return zxhzt;
     }

     public void setLgort(String lgort){
         this.lgort = lgort;
     }

     public String getLgort(){
         return lgort;
     }

     public void setMenge(Double menge){
         this.menge = menge;
     }

     public Double getMenge(){
         return menge;
     }

     public void setMeins(String meins){
         this.meins = meins;
     }

     public String getMeins(){
         return meins;
     }

     public void setZxhwz(String zxhwz){
         this.zxhwz = zxhwz;
     }

     public String getZxhwz(){
         return zxhwz;
     }

     public void setZtxt(String ztxt){
         this.ztxt = ztxt;
     }

     public String getZtxt(){
         return ztxt;
     }

     public void setZbqbd(String zbqbd){
         this.zbqbd = zbqbd;
     }

     public String getZbqbd(){
         return zbqbd;
     }

     public void setChargkc(String chargkc){
         this.chargkc = chargkc;
     }

     public String getChargkc(){
         return chargkc;
     }

     public void setZsxwc(String zsxwc){
         this.zsxwc = zsxwc;
     }

     public String getZsxwc(){
         return zsxwc;
     }

     public void setLineId(String lineId){
         this.lineId = lineId;
     }

     public String getLineId(){
         return lineId;
     }

     }
