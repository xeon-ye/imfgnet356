package yj.core.wipqcparamlines.dto;

/**Auto Generated By Hap Code Generator**/

import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import com.hand.hap.system.dto.BaseDTO;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import java.util.Date;

@ExtensionAttribute(disable=true)
@Table(name = "wip_qcparam_lines")
public class QcparamLines extends BaseDTO {
     @Id
     @GeneratedValue
      private String werks; //工厂

     @NotNull
      private Long lineId;

      private Long firstclassQty; //第一类不合格件数

      private Long secondclassQty; //第二类不合格件数

      private Long thirdclassQty; //第三类不合格件数

      private Long fourthclassQty; //第四类不合格件数

     @NotEmpty
      private String dftrateAlarm; //不合格率超限报警

      private Float upperLimits; //一次交检，同一机加批次，不合格率报警上限

      private String lineqcResponsible; //报警通知产线质检组长

      private String shopqcResponsible; //报警通知车间质量主任

      private String deptqcResponsible; //报警通知部门质量部长

      private String engrqcResponsible; //报警通知质量工程师

      private String auditor1; //不合格品审理单1评审人员

      private String defaultLinedept; //缺省责任机加部门

      private String defaultCastdept; //缺省责任压铸部门

      private Date creationDate; //创建时间

      private Long createdBy; //创建人

      private Date lastUpdateDate; //更新时间

      private Long lastUpdatedBy; //更新人

    private Double wipSqty;//在制队列定额数量

    private Double upscale1;//在制上线比例1

    private Double upscale2;//在制上线比例2

    private Double downscale1;//在制下线比例1

    private Double downscale2;//在制下线比例2

    @Transient
    private String deptId;//生产车间

    @Transient
      private  String name;

    @Transient
    private String descriptions;//生产线描述

    @Transient
    private String matnr2;//物料编码

    @Transient
    private String maktx;//物料描述

    @Transient
    private Integer zsxnum;//在制数量

    @Transient
    private String gmein;//单位

    private String scale;//超出比例（%）

    public Double getWipSqty() {
        return wipSqty;
    }

    public void setWipSqty(Double wipSqty) {
        this.wipSqty = wipSqty;
    }

    public Double getUpscale1() {
        return upscale1;
    }

    public void setUpscale1(Double upscale1) {
        this.upscale1 = upscale1;
    }

    public Double getUpscale2() {
        return upscale2;
    }

    public void setUpscale2(Double upscale2) {
        this.upscale2 = upscale2;
    }

    public Double getDownscale1() {
        return downscale1;
    }

    public void setDownscale1(Double downscale1) {
        this.downscale1 = downscale1;
    }

    public Double getDownscale2() {
        return downscale2;
    }

    public void setDownscale2(Double downscale2) {
        this.downscale2 = downscale2;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public String getMatnr2() {
        return matnr2;
    }

    public void setMatnr2(String matnr2) {
        this.matnr2 = matnr2;
    }

    public String getMaktx() {
        return maktx;
    }

    public void setMaktx(String maktx) {
        this.maktx = maktx;
    }

    public Integer getZsxnum() {
        return zsxnum;
    }

    public void setZsxnum(Integer zsxnum) {
        this.zsxnum = zsxnum;
    }

    public String getGmein() {
        return gmein;
    }

    public void setGmein(String gmein) {
        this.gmein = gmein;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWerks(String werks){
         this.werks = werks;
     }

     public String getWerks(){
         return werks;
     }

     public void setLineId(Long lineId){
         this.lineId = lineId;
     }

     public Long getLineId(){
         return lineId;
     }

     public void setFirstclassQty(Long firstclassQty){
         this.firstclassQty = firstclassQty;
     }

     public Long getFirstclassQty(){
         return firstclassQty;
     }

     public void setSecondclassQty(Long secondclassQty){
         this.secondclassQty = secondclassQty;
     }

     public Long getSecondclassQty(){
         return secondclassQty;
     }

     public void setThirdclassQty(Long thirdclassQty){
         this.thirdclassQty = thirdclassQty;
     }

     public Long getThirdclassQty(){
         return thirdclassQty;
     }

     public void setFourthclassQty(Long fourthclassQty){
         this.fourthclassQty = fourthclassQty;
     }

     public Long getFourthclassQty(){
         return fourthclassQty;
     }

     public void setDftrateAlarm(String dftrateAlarm){
         this.dftrateAlarm = dftrateAlarm;
     }

     public String getDftrateAlarm(){
         return dftrateAlarm;
     }

     public void setUpperLimits(Float upperLimits){
         this.upperLimits = upperLimits;
     }

     public Float getUpperLimits(){
         return upperLimits;
     }

     public void setLineqcResponsible(String lineqcResponsible){
         this.lineqcResponsible = lineqcResponsible;
     }

     public String getLineqcResponsible(){
         return lineqcResponsible;
     }

     public void setShopqcResponsible(String shopqcResponsible){
         this.shopqcResponsible = shopqcResponsible;
     }

     public String getShopqcResponsible(){
         return shopqcResponsible;
     }

     public void setDeptqcResponsible(String deptqcResponsible){
         this.deptqcResponsible = deptqcResponsible;
     }

     public String getDeptqcResponsible(){
         return deptqcResponsible;
     }

     public void setEngrqcResponsible(String engrqcResponsible){
         this.engrqcResponsible = engrqcResponsible;
     }

     public String getEngrqcResponsible(){
         return engrqcResponsible;
     }

     public void setAuditor1(String auditor1){
         this.auditor1 = auditor1;
     }

     public String getAuditor1(){
         return auditor1;
     }

     public void setDefaultLinedept(String defaultLinedept){
         this.defaultLinedept = defaultLinedept;
     }

     public String getDefaultLinedept(){
         return defaultLinedept;
     }

     public void setDefaultCastdept(String defaultCastdept){
         this.defaultCastdept = defaultCastdept;
     }

     public String getDefaultCastdept(){
         return defaultCastdept;
     }

     public void setCreationDate(Date creationDate){
         this.creationDate = creationDate;
     }

     public Date getCreationDate(){
         return creationDate;
     }

     public void setCreatedBy(Long createdBy){
         this.createdBy = createdBy;
     }

     public Long getCreatedBy(){
         return createdBy;
     }

    @Override
    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    @Override
    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public void setLastUpdatedBy(Long lastUpdatedBy){
         this.lastUpdatedBy = lastUpdatedBy;
     }

     public Long getLastUpdatedBy(){
         return lastUpdatedBy;
     }

     }
