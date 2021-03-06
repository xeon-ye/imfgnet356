package yj.core.outsrgsupstk.dto;

/**Auto Generated By Hap Code Generator**/

import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import com.hand.hap.system.dto.BaseDTO;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

@ExtensionAttribute(disable=true)
@Table(name = "wip_outsrgsupstk")
public class Outsrgsupstk extends BaseDTO {
     @Id
     @GeneratedValue
      private String werks; //工厂

     @NotEmpty
      private String ahr; //年度

     @NotEmpty
      private String matnr; //物料

     @NotEmpty
      private String lifnr; //供应商

     @NotEmpty
      private String ktsch; //标准文本码

      private Double mthOpen1; //1月期初数

      private Double mthIssue1; //1月发料数

      private Double mthZshnum1; //1月收货合格数量

      private Double mthZlfnum1; //1月收货料废数量

      private Double mthZgfnum1; //1月收货工废数量

      private Double mthZlost1; //1月收货遗失数量

      private Double mthZthnum1; //1月退回数量

      private Double mthOpen2; //2月期初数

      private Double mthIssue2; //2月发料数

      private Double mthZshnum2; //2月收货合格数量

      private Double mthZlfnum2; //2月收货料废数量

      private Double mthZgfnum2; //2月收货工废数量

      private Double mthZlost2; //2月收货遗失数量

      private Double mthZthnum2; //2月退回数量

      private Double mthOpen3; //3月期初数

      private Double mthIssue3; //3月发料数

      private Double mthZshnum3; //3月收货合格数量

      private Double mthZlfnum3; //3月收货料废数量

      private Double mthZgfnum3; //3月收货工废数量

      private Double mthZlost3; //3月收货遗失数量

      private Double mthZthnum3; //3月退回数量

      private Double mthOpen4; //4月期初数

      private Double mthIssue4; //4月发料数

      private Double mthZshnum4; //4月收货合格数量

      private Double mthZlfnum4; //4月收货料废数量

      private Double mthZgfnum4; //4月收货工废数量

      private Double mthZlost4; //4月收货遗失数量

      private Double mthZthnum4; //4月退回数量

      private Double mthOpen5; //5月期初数

      private Double mthIssue5; //5月发料数

      private Double mthZshnum5; //5月收货合格数量

      private Double mthZlfnum5; //5月收货料废数量

      private Double mthZgfnum5; //5月收货工废数量

      private Double mthZlost5; //5月收货遗失数量

      private Double mthZthnum5; //5月退回数量

      private Double mthOpen6; //6月期初数

      private Double mthIssue6; //6月发料数

      private Double mthZshnum6; //6月收货合格数量

      private Double mthZlfnum6; //6月收货料废数量

      private Double mthZgfnum6; //6月收货工废数量

      private Double mthZlost6; //6月收货遗失数量

      private Double mthZthnum6; //6月退回数量

      private Double mthOpen7; //7月期初数

      private Double mthIssue7; //7月发料数

      private Double mthZshnum7; //7月收货合格数量

      private Double mthZlfnum7; //7月收货料废数量

      private Double mthZgfnum7; //7月收货工废数量

      private Double mthZlost7; //7月收货遗失数量

      private Double mthZthnum7; //7月退回数量

      private Double mthOpen8; //8月期初数

      private Double mthIssue8; //8月发料数

      private Double mthZshnum8; //8月收货合格数量

      private Double mthZlfnum8; //8月收货料废数量

      private Double mthZgfnum8; //8月收货工废数量

      private Double mthZlost8; //8月收货遗失数量

      private Double mthZthnum8; //8月退回数量

      private Double mthOpen9; //9月期初数

      private Double mthIssue9; //9月发料数

      private Double mthZshnum9; //9月收货合格数量

      private Double mthZlfnum9; //9月收货料废数量

      private Double mthZgfnum9; //9月收货工废数量

      private Double mthZlost9; //9月收货遗失数量

      private Double mthZthnum9; //9月退回数量

      private Double mthOpen10; //10月期初数

      private Double mthIssue10; //10月发料数

      private Double mthZshnum10; //10月收货合格数量

      private Double mthZlfnum10; //10月收货料废数量

      private Double mthZgfnum10; //10月收货工废数量

      private Double mthZlost10; //10月收货遗失数量

      private Double mthZthnum10; //10月退回数量

      private Double mthOpen11; //11月期初数

      private Double mthIssue11; //11月发料数

      private Double mthZshnum11; //11月收货合格数量

      private Double mthZlfnum11; //11月收货料废数量

      private Double mthZgfnum11; //11月收货工废数量

      private Double mthZlost11; //11月收货遗失数量

      private Double mthZthnum11; //11月退回数量

      private Double mthOpen12; //12月期初数

      private Double mthIssue12; //12月发料数

      private Double mthZshnum12; //12月收货合格数量

      private Double mthZlfnum12; //12月收货料废数量

      private Double mthZgfnum12; //12月收货工废数量

      private Double mthZlost12; //12月收货遗失数量

      private Double mthZthnum12; //12月退回数量

      private Long requestId; //请求id

      private Long programId; //程序id

     @NotNull
      private Long createdBy; //创建者

      private Date creationDate; //创建日期

      private Long lastUpdatedBy; //最近更新人

      private Date lastUpdateDate; //最近更新日期

      private Long lastUpdateLogin;


     public void setWerks(String werks){
         this.werks = werks;
     }

     public String getWerks(){
         return werks;
     }

     public void setAhr(String ahr){
         this.ahr = ahr;
     }

     public String getAhr(){
         return ahr;
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

     public void setKtsch(String ktsch){
         this.ktsch = ktsch;
     }

     public String getKtsch(){
         return ktsch;
     }

     public void setMthOpen1(Double mthOpen1){
         this.mthOpen1 = mthOpen1;
     }

     public Double getMthOpen1(){
         return mthOpen1;
     }

     public void setMthIssue1(Double mthIssue1){
         this.mthIssue1 = mthIssue1;
     }

     public Double getMthIssue1(){
         return mthIssue1;
     }

     public void setMthZshnum1(Double mthZshnum1){
         this.mthZshnum1 = mthZshnum1;
     }

     public Double getMthZshnum1(){
         return mthZshnum1;
     }

     public void setMthZlfnum1(Double mthZlfnum1){
         this.mthZlfnum1 = mthZlfnum1;
     }

     public Double getMthZlfnum1(){
         return mthZlfnum1;
     }

     public void setMthZgfnum1(Double mthZgfnum1){
         this.mthZgfnum1 = mthZgfnum1;
     }

     public Double getMthZgfnum1(){
         return mthZgfnum1;
     }

     public void setMthZlost1(Double mthZlost1){
         this.mthZlost1 = mthZlost1;
     }

     public Double getMthZlost1(){
         return mthZlost1;
     }

     public void setMthZthnum1(Double mthZthnum1){
         this.mthZthnum1 = mthZthnum1;
     }

     public Double getMthZthnum1(){
         return mthZthnum1;
     }

     public void setMthOpen2(Double mthOpen2){
         this.mthOpen2 = mthOpen2;
     }

     public Double getMthOpen2(){
         return mthOpen2;
     }

     public void setMthIssue2(Double mthIssue2){
         this.mthIssue2 = mthIssue2;
     }

     public Double getMthIssue2(){
         return mthIssue2;
     }

     public void setMthZshnum2(Double mthZshnum2){
         this.mthZshnum2 = mthZshnum2;
     }

     public Double getMthZshnum2(){
         return mthZshnum2;
     }

     public void setMthZlfnum2(Double mthZlfnum2){
         this.mthZlfnum2 = mthZlfnum2;
     }

     public Double getMthZlfnum2(){
         return mthZlfnum2;
     }

     public void setMthZgfnum2(Double mthZgfnum2){
         this.mthZgfnum2 = mthZgfnum2;
     }

     public Double getMthZgfnum2(){
         return mthZgfnum2;
     }

     public void setMthZlost2(Double mthZlost2){
         this.mthZlost2 = mthZlost2;
     }

     public Double getMthZlost2(){
         return mthZlost2;
     }

     public void setMthZthnum2(Double mthZthnum2){
         this.mthZthnum2 = mthZthnum2;
     }

     public Double getMthZthnum2(){
         return mthZthnum2;
     }

     public void setMthOpen3(Double mthOpen3){
         this.mthOpen3 = mthOpen3;
     }

     public Double getMthOpen3(){
         return mthOpen3;
     }

     public void setMthIssue3(Double mthIssue3){
         this.mthIssue3 = mthIssue3;
     }

     public Double getMthIssue3(){
         return mthIssue3;
     }

     public void setMthZshnum3(Double mthZshnum3){
         this.mthZshnum3 = mthZshnum3;
     }

     public Double getMthZshnum3(){
         return mthZshnum3;
     }

     public void setMthZlfnum3(Double mthZlfnum3){
         this.mthZlfnum3 = mthZlfnum3;
     }

     public Double getMthZlfnum3(){
         return mthZlfnum3;
     }

     public void setMthZgfnum3(Double mthZgfnum3){
         this.mthZgfnum3 = mthZgfnum3;
     }

     public Double getMthZgfnum3(){
         return mthZgfnum3;
     }

     public void setMthZlost3(Double mthZlost3){
         this.mthZlost3 = mthZlost3;
     }

     public Double getMthZlost3(){
         return mthZlost3;
     }

     public void setMthZthnum3(Double mthZthnum3){
         this.mthZthnum3 = mthZthnum3;
     }

     public Double getMthZthnum3(){
         return mthZthnum3;
     }

     public void setMthOpen4(Double mthOpen4){
         this.mthOpen4 = mthOpen4;
     }

     public Double getMthOpen4(){
         return mthOpen4;
     }

     public void setMthIssue4(Double mthIssue4){
         this.mthIssue4 = mthIssue4;
     }

     public Double getMthIssue4(){
         return mthIssue4;
     }

     public void setMthZshnum4(Double mthZshnum4){
         this.mthZshnum4 = mthZshnum4;
     }

     public Double getMthZshnum4(){
         return mthZshnum4;
     }

     public void setMthZlfnum4(Double mthZlfnum4){
         this.mthZlfnum4 = mthZlfnum4;
     }

     public Double getMthZlfnum4(){
         return mthZlfnum4;
     }

     public void setMthZgfnum4(Double mthZgfnum4){
         this.mthZgfnum4 = mthZgfnum4;
     }

     public Double getMthZgfnum4(){
         return mthZgfnum4;
     }

     public void setMthZlost4(Double mthZlost4){
         this.mthZlost4 = mthZlost4;
     }

     public Double getMthZlost4(){
         return mthZlost4;
     }

     public void setMthZthnum4(Double mthZthnum4){
         this.mthZthnum4 = mthZthnum4;
     }

     public Double getMthZthnum4(){
         return mthZthnum4;
     }

     public void setMthOpen5(Double mthOpen5){
         this.mthOpen5 = mthOpen5;
     }

     public Double getMthOpen5(){
         return mthOpen5;
     }

     public void setMthIssue5(Double mthIssue5){
         this.mthIssue5 = mthIssue5;
     }

     public Double getMthIssue5(){
         return mthIssue5;
     }

     public void setMthZshnum5(Double mthZshnum5){
         this.mthZshnum5 = mthZshnum5;
     }

     public Double getMthZshnum5(){
         return mthZshnum5;
     }

     public void setMthZlfnum5(Double mthZlfnum5){
         this.mthZlfnum5 = mthZlfnum5;
     }

     public Double getMthZlfnum5(){
         return mthZlfnum5;
     }

     public void setMthZgfnum5(Double mthZgfnum5){
         this.mthZgfnum5 = mthZgfnum5;
     }

     public Double getMthZgfnum5(){
         return mthZgfnum5;
     }

     public void setMthZlost5(Double mthZlost5){
         this.mthZlost5 = mthZlost5;
     }

     public Double getMthZlost5(){
         return mthZlost5;
     }

     public void setMthZthnum5(Double mthZthnum5){
         this.mthZthnum5 = mthZthnum5;
     }

     public Double getMthZthnum5(){
         return mthZthnum5;
     }

     public void setMthOpen6(Double mthOpen6){
         this.mthOpen6 = mthOpen6;
     }

     public Double getMthOpen6(){
         return mthOpen6;
     }

     public void setMthIssue6(Double mthIssue6){
         this.mthIssue6 = mthIssue6;
     }

     public Double getMthIssue6(){
         return mthIssue6;
     }

     public void setMthZshnum6(Double mthZshnum6){
         this.mthZshnum6 = mthZshnum6;
     }

     public Double getMthZshnum6(){
         return mthZshnum6;
     }

     public void setMthZlfnum6(Double mthZlfnum6){
         this.mthZlfnum6 = mthZlfnum6;
     }

     public Double getMthZlfnum6(){
         return mthZlfnum6;
     }

     public void setMthZgfnum6(Double mthZgfnum6){
         this.mthZgfnum6 = mthZgfnum6;
     }

     public Double getMthZgfnum6(){
         return mthZgfnum6;
     }

     public void setMthZlost6(Double mthZlost6){
         this.mthZlost6 = mthZlost6;
     }

     public Double getMthZlost6(){
         return mthZlost6;
     }

     public void setMthZthnum6(Double mthZthnum6){
         this.mthZthnum6 = mthZthnum6;
     }

     public Double getMthZthnum6(){
         return mthZthnum6;
     }

     public void setMthOpen7(Double mthOpen7){
         this.mthOpen7 = mthOpen7;
     }

     public Double getMthOpen7(){
         return mthOpen7;
     }

     public void setMthIssue7(Double mthIssue7){
         this.mthIssue7 = mthIssue7;
     }

     public Double getMthIssue7(){
         return mthIssue7;
     }

     public void setMthZshnum7(Double mthZshnum7){
         this.mthZshnum7 = mthZshnum7;
     }

     public Double getMthZshnum7(){
         return mthZshnum7;
     }

     public void setMthZlfnum7(Double mthZlfnum7){
         this.mthZlfnum7 = mthZlfnum7;
     }

     public Double getMthZlfnum7(){
         return mthZlfnum7;
     }

     public void setMthZgfnum7(Double mthZgfnum7){
         this.mthZgfnum7 = mthZgfnum7;
     }

     public Double getMthZgfnum7(){
         return mthZgfnum7;
     }

     public void setMthZlost7(Double mthZlost7){
         this.mthZlost7 = mthZlost7;
     }

     public Double getMthZlost7(){
         return mthZlost7;
     }

     public void setMthZthnum7(Double mthZthnum7){
         this.mthZthnum7 = mthZthnum7;
     }

     public Double getMthZthnum7(){
         return mthZthnum7;
     }

     public void setMthOpen8(Double mthOpen8){
         this.mthOpen8 = mthOpen8;
     }

     public Double getMthOpen8(){
         return mthOpen8;
     }

     public void setMthIssue8(Double mthIssue8){
         this.mthIssue8 = mthIssue8;
     }

     public Double getMthIssue8(){
         return mthIssue8;
     }

     public void setMthZshnum8(Double mthZshnum8){
         this.mthZshnum8 = mthZshnum8;
     }

     public Double getMthZshnum8(){
         return mthZshnum8;
     }

     public void setMthZlfnum8(Double mthZlfnum8){
         this.mthZlfnum8 = mthZlfnum8;
     }

     public Double getMthZlfnum8(){
         return mthZlfnum8;
     }

     public void setMthZgfnum8(Double mthZgfnum8){
         this.mthZgfnum8 = mthZgfnum8;
     }

     public Double getMthZgfnum8(){
         return mthZgfnum8;
     }

     public void setMthZlost8(Double mthZlost8){
         this.mthZlost8 = mthZlost8;
     }

     public Double getMthZlost8(){
         return mthZlost8;
     }

     public void setMthZthnum8(Double mthZthnum8){
         this.mthZthnum8 = mthZthnum8;
     }

     public Double getMthZthnum8(){
         return mthZthnum8;
     }

     public void setMthOpen9(Double mthOpen9){
         this.mthOpen9 = mthOpen9;
     }

     public Double getMthOpen9(){
         return mthOpen9;
     }

     public void setMthIssue9(Double mthIssue9){
         this.mthIssue9 = mthIssue9;
     }

     public Double getMthIssue9(){
         return mthIssue9;
     }

     public void setMthZshnum9(Double mthZshnum9){
         this.mthZshnum9 = mthZshnum9;
     }

     public Double getMthZshnum9(){
         return mthZshnum9;
     }

     public void setMthZlfnum9(Double mthZlfnum9){
         this.mthZlfnum9 = mthZlfnum9;
     }

     public Double getMthZlfnum9(){
         return mthZlfnum9;
     }

     public void setMthZgfnum9(Double mthZgfnum9){
         this.mthZgfnum9 = mthZgfnum9;
     }

     public Double getMthZgfnum9(){
         return mthZgfnum9;
     }

     public void setMthZlost9(Double mthZlost9){
         this.mthZlost9 = mthZlost9;
     }

     public Double getMthZlost9(){
         return mthZlost9;
     }

     public void setMthZthnum9(Double mthZthnum9){
         this.mthZthnum9 = mthZthnum9;
     }

     public Double getMthZthnum9(){
         return mthZthnum9;
     }

     public void setMthOpen10(Double mthOpen10){
         this.mthOpen10 = mthOpen10;
     }

     public Double getMthOpen10(){
         return mthOpen10;
     }

     public void setMthIssue10(Double mthIssue10){
         this.mthIssue10 = mthIssue10;
     }

     public Double getMthIssue10(){
         return mthIssue10;
     }

     public void setMthZshnum10(Double mthZshnum10){
         this.mthZshnum10 = mthZshnum10;
     }

     public Double getMthZshnum10(){
         return mthZshnum10;
     }

     public void setMthZlfnum10(Double mthZlfnum10){
         this.mthZlfnum10 = mthZlfnum10;
     }

     public Double getMthZlfnum10(){
         return mthZlfnum10;
     }

     public void setMthZgfnum10(Double mthZgfnum10){
         this.mthZgfnum10 = mthZgfnum10;
     }

     public Double getMthZgfnum10(){
         return mthZgfnum10;
     }

     public void setMthZlost10(Double mthZlost10){
         this.mthZlost10 = mthZlost10;
     }

     public Double getMthZlost10(){
         return mthZlost10;
     }

     public void setMthZthnum10(Double mthZthnum10){
         this.mthZthnum10 = mthZthnum10;
     }

     public Double getMthZthnum10(){
         return mthZthnum10;
     }

     public void setMthOpen11(Double mthOpen11){
         this.mthOpen11 = mthOpen11;
     }

     public Double getMthOpen11(){
         return mthOpen11;
     }

     public void setMthIssue11(Double mthIssue11){
         this.mthIssue11 = mthIssue11;
     }

     public Double getMthIssue11(){
         return mthIssue11;
     }

     public void setMthZshnum11(Double mthZshnum11){
         this.mthZshnum11 = mthZshnum11;
     }

     public Double getMthZshnum11(){
         return mthZshnum11;
     }

     public void setMthZlfnum11(Double mthZlfnum11){
         this.mthZlfnum11 = mthZlfnum11;
     }

     public Double getMthZlfnum11(){
         return mthZlfnum11;
     }

     public void setMthZgfnum11(Double mthZgfnum11){
         this.mthZgfnum11 = mthZgfnum11;
     }

     public Double getMthZgfnum11(){
         return mthZgfnum11;
     }

     public void setMthZlost11(Double mthZlost11){
         this.mthZlost11 = mthZlost11;
     }

     public Double getMthZlost11(){
         return mthZlost11;
     }

     public void setMthZthnum11(Double mthZthnum11){
         this.mthZthnum11 = mthZthnum11;
     }

     public Double getMthZthnum11(){
         return mthZthnum11;
     }

     public void setMthOpen12(Double mthOpen12){
         this.mthOpen12 = mthOpen12;
     }

     public Double getMthOpen12(){
         return mthOpen12;
     }

     public void setMthIssue12(Double mthIssue12){
         this.mthIssue12 = mthIssue12;
     }

     public Double getMthIssue12(){
         return mthIssue12;
     }

     public void setMthZshnum12(Double mthZshnum12){
         this.mthZshnum12 = mthZshnum12;
     }

     public Double getMthZshnum12(){
         return mthZshnum12;
     }

     public void setMthZlfnum12(Double mthZlfnum12){
         this.mthZlfnum12 = mthZlfnum12;
     }

     public Double getMthZlfnum12(){
         return mthZlfnum12;
     }

     public void setMthZgfnum12(Double mthZgfnum12){
         this.mthZgfnum12 = mthZgfnum12;
     }

     public Double getMthZgfnum12(){
         return mthZgfnum12;
     }

     public void setMthZlost12(Double mthZlost12){
         this.mthZlost12 = mthZlost12;
     }

     public Double getMthZlost12(){
         return mthZlost12;
     }

     public void setMthZthnum12(Double mthZthnum12){
         this.mthZthnum12 = mthZthnum12;
     }

     public Double getMthZthnum12(){
         return mthZthnum12;
     }

     public void setRequestId(Long requestId){
         this.requestId = requestId;
     }

     public Long getRequestId(){
         return requestId;
     }

     public void setProgramId(Long programId){
         this.programId = programId;
     }

     public Long getProgramId(){
         return programId;
     }

     public void setCreatedBy(Long createdBy){
         this.createdBy = createdBy;
     }

     public Long getCreatedBy(){
         return createdBy;
     }

     public void setCreationDate(Date creationDate){
         this.creationDate = creationDate;
     }

     public Date getCreationDate(){
         return creationDate;
     }

     public void setLastUpdatedBy(Long lastUpdatedBy){
         this.lastUpdatedBy = lastUpdatedBy;
     }

     public Long getLastUpdatedBy(){
         return lastUpdatedBy;
     }

     public void setLastUpdateDate(Date lastUpdateDate){
         this.lastUpdateDate = lastUpdateDate;
     }

     public Date getLastUpdateDate(){
         return lastUpdateDate;
     }

     public void setLastUpdateLogin(Long lastUpdateLogin){
         this.lastUpdateLogin = lastUpdateLogin;
     }

     public Long getLastUpdateLogin(){
         return lastUpdateLogin;
     }

     }
