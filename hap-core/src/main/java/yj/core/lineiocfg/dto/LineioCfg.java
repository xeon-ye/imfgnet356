package yj.core.lineiocfg.dto;

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
@Table(name = "wip_lineio_cfg")
public class LineioCfg extends BaseDTO {
     @Id
     @GeneratedValue
      private String werks; //工厂

     @NotEmpty
      private String lineId; //产线ID

     @NotEmpty
      private String item; //取还件口行号

     @NotEmpty
      private String pointNum; //取还件口工序

      private String intvlqty; //距打码工序数量

      private String startopoint;//上料到取件工序在制队列数量

      private Date creationDate; //创建时间

      private String vornr;

     @NotNull
      private Long createdBy; //创建人

      private Date lastUpdatedDate; //更新时间

      private Long lastUpdatedBy; //更新人


     public void setWerks(String werks){
         this.werks = werks;
     }

     public String getWerks(){
         return werks;
     }

     public void setLineId(String lineId){
         this.lineId = lineId;
     }

     public String getLineId(){
         return lineId;
     }

     public void setItem(String item){
         this.item = item;
     }

     public String getItem(){
         return item;
     }

     public void setPointNum(String pointNum){
         this.pointNum = pointNum;
     }

     public String getPointNum(){
         return pointNum;
     }

     public void setIntvlqty(String intvlqty){
         this.intvlqty = intvlqty;
     }

     public String getIntvlqty(){
         return intvlqty;
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

     public void setLastUpdatedDate(Date lastUpdatedDate){
         this.lastUpdatedDate = lastUpdatedDate;
     }

     public Date getLastUpdatedDate(){
         return lastUpdatedDate;
     }

     public void setLastUpdatedBy(Long lastUpdatedBy){
         this.lastUpdatedBy = lastUpdatedBy;
     }

     public Long getLastUpdatedBy(){
         return lastUpdatedBy;
     }

    public String getStartopoint() {
        return startopoint;
    }

    public void setStartopoint(String startopoint) {
        this.startopoint = startopoint;
    }

    public String getVornr() {
        return vornr;
    }

    public void setVornr(String vornr) {
        this.vornr = vornr;
    }
}
