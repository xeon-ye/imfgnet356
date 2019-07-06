package yj.core.assembonline.dto;

/**Auto Generated By Hap Code Generator**/

import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import com.hand.hap.system.dto.BaseDTO;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@ExtensionAttribute(disable=true)
@Table(name = "wip_assemblies_online")
public class AssembliesOnline extends BaseDTO {
     @Id
     @GeneratedValue
      private String assyId; //装配件上线记录号

      private String operationCode; //工序代码

      private String vornr; //工序

      private String matnr; //BOM组件物料号

      private String lineId; //生产线ID

      private String matnr2; //成品物料

      private String charg; //批次

      private String lgort; //库存地点

      private String lifnr; //供应商

      private String sortl; //供应商简称

      private Date lifnrDate; //供应商生产日期

      private String lifnrLotn; //供应商批次

      private String cartonTyp; //箱号类型

      private String zxhbar; //箱号条码

      private Double zsxnum; //上线数量

      private String gmein; //单位

      private Double zzxqty; //装箱分配数量

      private Double zqjqty; //取件分配数量

      private Double zdftqty; //装配件审理单1报废数量

      private Double unitqty; //BOM标准用量

        private Date creationDate; //创建时间


        private Long createdBy; //创建人

        private Date lastUpdateDate;

        private Long lastUpdatedBy; //更新人


     public void setAssyId(String assyId){
         this.assyId = assyId;
     }

     public String getAssyId(){
         return assyId;
     }

     public void setOperationCode(String operationCode){
         this.operationCode = operationCode;
     }

     public String getOperationCode(){
         return operationCode;
     }

     public void setVornr(String vornr){
         this.vornr = vornr;
     }

     public String getVornr(){
         return vornr;
     }

     public void setMatnr(String matnr){
         this.matnr = matnr;
     }

     public String getMatnr(){
         return matnr;
     }

     public void setLineId(String lineId){
         this.lineId = lineId;
     }

     public String getLineId(){
         return lineId;
     }

     public void setMatnr2(String matnr2){
         this.matnr2 = matnr2;
     }

     public String getMatnr2(){
         return matnr2;
     }

     public void setCharg(String charg){
         this.charg = charg;
     }

     public String getCharg(){
         return charg;
     }

     public void setLgort(String lgort){
         this.lgort = lgort;
     }

     public String getLgort(){
         return lgort;
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

     public void setCartonTyp(String cartonTyp){
         this.cartonTyp = cartonTyp;
     }

     public String getCartonTyp(){
         return cartonTyp;
     }

     public void setZxhbar(String zxhbar){
         this.zxhbar = zxhbar;
     }

     public String getZxhbar(){
         return zxhbar;
     }

     public void setZsxnum(Double zsxnum){
         this.zsxnum = zsxnum;
     }

     public Double getZsxnum(){
         return zsxnum;
     }

     public void setGmein(String gmein){
         this.gmein = gmein;
     }

     public String getGmein(){
         return gmein;
     }

     public void setZzxqty(Double zzxqty){
         this.zzxqty = zzxqty;
     }

     public Double getZzxqty(){
         return zzxqty;
     }

     public void setZqjqty(Double zqjqty){
         this.zqjqty = zqjqty;
     }

     public Double getZqjqty(){
         return zqjqty;
     }

     public void setZdftqty(Double zdftqty){
         this.zdftqty = zdftqty;
     }

     public Double getZdftqty(){
         return zdftqty;
     }

     public void setUnitqty(Double unitqty){
         this.unitqty = unitqty;
     }

     public Double getUnitqty(){
         return unitqty;
     }

    @Override
    public Date getCreationDate() {
        return creationDate;
    }

    @Override
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public Long getCreatedBy() {
        return createdBy;
    }

    @Override
    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public Long getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    @Override
    public void setLastUpdatedBy(Long lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    @Override
    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    @Override
    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }
}
