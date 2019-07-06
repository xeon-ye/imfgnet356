package yj.core.dispatch.dto;


/**Auto Generated By Hap Code Generator**/

import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import com.hand.hap.system.dto.BaseDTO;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@ExtensionAttribute(disable=true)
@Table(name = "confirmation_result")
public class Result extends BaseDTO {
    @Id
    @GeneratedValue
    private Long id;

    private Long inputId; //录入日志ID

    private String confirmationNo; //确认号

    private String confirmationPos; //确认号计数

    private String plant; //工厂

    private String material; //物料

    private String workcenter; //工作中心

    private String isReversed;

    private String matDesc; //产品名称

    private String operationDesc; //工序描述

    private String fevor; //生产管理员

    private String fevorTxt; //生产管理员名称

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    private String created_by;




     public void setId(Long id){
         this.id = id;
     }

     public Long getId(){
         return id;
     }

     public void setInputId(Long inputId){
         this.inputId = inputId;
     }

     public Long getInputId(){
         return inputId;
     }

     public void setConfirmationNo(String confirmationNo){
         this.confirmationNo = confirmationNo;
     }

     public String getConfirmationNo(){
         return confirmationNo;
     }

     public void setConfirmationPos(String confirmationPos){
         this.confirmationPos = confirmationPos;
     }

     public String getConfirmationPos(){
         return confirmationPos;
     }

     public void setPlant(String plant){
         this.plant = plant;
     }

     public String getPlant(){
         return plant;
     }

     public void setMaterial(String material){
         this.material = material;
     }

     public String getMaterial(){
         return material;
     }

     public void setWorkcenter(String workcenter){
         this.workcenter = workcenter;
     }

     public String getWorkcenter(){
         return workcenter;
     }

     public void setIsReversed(String isReversed){
         this.isReversed = isReversed;
     }

     public String getIsReversed(){
         return isReversed;
     }

     public void setMatDesc(String matDesc){
         this.matDesc = matDesc;
     }

     public String getMatDesc(){
         return matDesc;
     }


    public String getOperationDesc() {
        return operationDesc;
    }

    public void setOperationDesc(String operationDesc) {
        this.operationDesc = operationDesc;
    }

    public String getFevor() {
        return fevor;
    }

    public void setFevor(String fevor) {
        this.fevor = fevor;
    }

    public String getFevorTxt() {
        return fevorTxt;
    }

    public void setFevorTxt(String fevorTxt) {
        this.fevorTxt = fevorTxt;
    }
}
