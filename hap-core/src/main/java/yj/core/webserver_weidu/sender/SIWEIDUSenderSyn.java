package yj.core.webserver_weidu.sender;

/**
 * Created by 917110140 on 2018/9/29.
 */

import yj.core.webserver_weidu.receiver.DTWEIDURes;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 *
 */
@WebService(name = "SI_WEIDU_Sender_Syn", targetNamespace = "http://www.cq-yj.com/HAP/WEIDU/Sender")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface SIWEIDUSenderSyn {

    /**
     *
     * @param mtWEIDUReq
     * @return returns com.cq_yj.hap.weidu.sender.DTWEIDURes
     */
    @WebMethod(operationName = "SI_WEIDU_Sender_Syn", action = "http://sap.com/xi/WebService/soap1.1")
    @WebResult(name = "MT_WEIDU_Res", targetNamespace = "http://www.cq-yj.com/HAP/WEIDU/Sender", partName = "MT_WEIDU_Res")
    public DTWEIDURes siWEIDUSenderSyn(
            @WebParam(name = "MT_WEIDU_Req", targetNamespace = "http://www.cq-yj.com/HAP/WEIDU/Sender", partName = "MT_WEIDU_Req") DTWEIDUReq mtWEIDUReq);

}

