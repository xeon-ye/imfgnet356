package yj.core.crhd.dto;

/**Auto Generated By Hap Code Generator**/

import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import com.hand.hap.system.dto.BaseDTO;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

@ExtensionAttribute(disable=true)
@Table(name = "sap_crhd")
public class Crhd extends BaseDTO {
     @NotEmpty
      private String objid; //对象标识

     @Id
     @GeneratedValue
      private String werks;

      private String arbpl; //工作中心

      private String verwe; //工作中心类别

      private String lvorm; //删除标记

      private String aedat;

      private String veran;

      private String ketxt;

      private Integer attr1;

      private String attr2;

      private String attr3;

      private String attr4;

      private String attr5;

      private String attr6;

      private String attr7;

      @Transient
      private Date creationDate; //创建时间
      private Long createdBy; //创建人
      private Date lastUpdatedDate; //更新时间
      private Long lastUpdatedBy; //更新人
    @Transient
    private String txt;//车间描述
    @Transient
    private String shiftSeq;//班次轮换类型

    public String getShiftSeq() {
        return shiftSeq;
    }

    public void setShiftSeq(String shiftSeq) {
        this.shiftSeq = shiftSeq;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public void setObjid(String objid){
         this.objid = objid;
     }

     public String getObjid(){
         return objid;
     }

     public void setWerks(String werks){
         this.werks = werks;
     }

     public String getWerks(){
         return werks;
     }

     public void setArbpl(String arbpl){
         this.arbpl = arbpl;
     }

     public String getArbpl(){
         return arbpl;
     }

     public void setVerwe(String verwe){
         this.verwe = verwe;
     }

     public String getVerwe(){
         return verwe;
     }

     public void setLvorm(String lvorm){
         this.lvorm = lvorm;
     }

     public String getLvorm(){
         return lvorm;
     }

    public String getAedat() {
        return aedat;
    }

    public void setAedat(String aedat) {
        this.aedat = aedat;
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

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    @Override
    public Long getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    @Override
    public void setLastUpdatedBy(Long lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public void setVeran(String veran){
         this.veran = veran;
     }

     public String getVeran(){
         return veran;
     }

     public void setKetxt(String ketxt){
         this.ketxt = ketxt;
     }

     public String getKetxt(){
         return ketxt;
     }

    public Integer getAttr1() {
        return attr1;
    }

    public void setAttr1(Integer attr1) {
        this.attr1 = attr1;
    }

    public void setAttr2(String attr2){
         this.attr2 = attr2;
     }

     public String getAttr2(){
         return attr2;
     }

     public void setAttr3(String attr3){
         this.attr3 = attr3;
     }

     public String getAttr3(){
         return attr3;
     }

     public void setAttr4(String attr4){
         this.attr4 = attr4;
     }

     public String getAttr4(){
         return attr4;
     }

     public void setAttr5(String attr5){
         this.attr5 = attr5;
     }

     public String getAttr5(){
         return attr5;
     }

     public void setAttr6(String attr6){
         this.attr6 = attr6;
     }

     public String getAttr6(){
         return attr6;
     }

     public void setAttr7(String attr7){
         this.attr7 = attr7;
     }

     public String getAttr7(){
         return attr7;
     }

     }
