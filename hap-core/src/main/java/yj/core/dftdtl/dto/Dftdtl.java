package yj.core.dftdtl.dto;

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
@Table(name = "sap_dftdtl")
public class Dftdtl extends BaseDTO {
     @Id
     @GeneratedValue
      private String werks; //工厂

     @NotEmpty
      private String matnr; //物料编号

     @NotEmpty
      private String tlevelcode; //二级缺陷代码

      private String ztext; //二级缺陷短文本

      private String code; //缺陷代码

      private String  machingflag;

      private String castingflag;

    /* 添加字段 918100064*/
    private String machingFlag;//机加常用标识
    private String castingFlag;//压铸常用标识
    private String matnr2;//压铸物料
    private String dftalarm;//缺陷报警
    private String defaultDept;//责任部门
    private Date creationDate; //创建时间
    private Long createdBy; //创建人
    private Date lastUpdateDate; //更新时间
    private Long lastUpdatedBy; //更新人
    @Transient
    private String maktx;//物料描述
    private String maktx2;
    @Transient
    private String kurztext;//缺陷描述

    public String getMachingFlag() {
        return machingFlag;
    }

    public void setMachingFlag(String machingFlag) {
        this.machingFlag = machingFlag;
    }

    public String getCastingFlag() {
        return castingFlag;
    }

    public void setCastingFlag(String castingFlag) {
        this.castingFlag = castingFlag;
    }

    public String getMatnr2() {
        return matnr2;
    }

    public void setMatnr2(String matnr2) {
        this.matnr2 = matnr2;
    }

    public String getDftalarm() {
        return dftalarm;
    }

    public void setDftalarm(String dftalarm) {
        this.dftalarm = dftalarm;
    }

    public String getDefaultDept() {
        return defaultDept;
    }

    public void setDefaultDept(String defaultDept) {
        this.defaultDept = defaultDept;
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
    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    @Override
    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @Override
    public Long getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    @Override
    public void setLastUpdatedBy(Long lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public String getMaktx() {
        return maktx;
    }

    public void setMaktx(String maktx) {
        this.maktx = maktx;
    }

    public String getMaktx2() {
        return maktx2;
    }

    public void setMaktx2(String maktx2) {
        this.maktx2 = maktx2;
    }

    public String getKurztext() {
        return kurztext;
    }

    public void setKurztext(String kurztext) {
        this.kurztext = kurztext;
    }

    public String getMachingflag() {
        return machingflag;
    }

    public void setMachingflag(String machingflag) {
        this.machingflag = machingflag;
    }

    public String getCastingflag() {
        return castingflag;
    }

    public void setCastingflag(String castingflag) {
        this.castingflag = castingflag;
    }

    public void setWerks(String werks){
         this.werks = werks;
     }

     public String getWerks(){
         return werks;
     }

     public void setMatnr(String matnr){
         this.matnr = matnr;
     }

     public String getMatnr(){
         return matnr;
     }

     public void setTlevelcode(String tlevelcode){
         this.tlevelcode = tlevelcode;
     }

     public String getTlevelcode(){
         return tlevelcode;
     }

    public String getZtext() {
        return ztext;
    }

    public void setZtext(String ztext) {
        this.ztext = ztext;
    }

    public void setCode(String code){
         this.code = code;
     }

     public String getCode(){
         return code;
     }

     }
