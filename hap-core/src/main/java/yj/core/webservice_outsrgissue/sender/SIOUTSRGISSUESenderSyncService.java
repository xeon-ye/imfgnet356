package yj.core.webservice_outsrgissue.sender;


import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import java.net.URL;
import java.util.logging.Logger;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * <p>
 * An example of how this class may be used:
 *
 * <pre>
 * SI_OUTSRGISSUE_Sender_SyncService service = new SI_OUTSRGISSUE_Sender_SyncService();
 * SIOUTSRGISSUESenderSync portType = service.getHTTPPort();
 * portType.siOUTSRGISSUESenderSync(...);
 * </pre>
 *
 * </p>
 *
 */
@WebServiceClient(name = "SI_OUTSRGISSUE_Sender_SyncService", targetNamespace = "http://www.cq-yj.com/HAP/OUTSRGISSUE/Sender", wsdlLocation = "resources/outsrgissue.xml")
public class SIOUTSRGISSUESenderSyncService extends Service {

    public final static URL WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(SIOUTSRGISSUESenderSyncService.class.getName());

    static {
        URL url = null;
        url = SIOUTSRGISSUESenderSyncService.class.getClassLoader().getResource("outsrgissue.xml");
        System.out.println(url);
        WSDL_LOCATION = url;
    }

    public SIOUTSRGISSUESenderSyncService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SIOUTSRGISSUESenderSyncService() {
        super(WSDL_LOCATION, new QName(
                "http://www.cq-yj.com/HAP/OUTSRGISSUE/Sender",
                "SI_OUTSRGISSUE_Sender_SyncService"));
    }

    /**
     *
     * @return returns SIOUTSRGISSUESenderSync
     */
    @WebEndpoint(name = "HTTP_Port")
    public SIOUTSRGISSUESenderSync getHTTPPort() {
        return super.getPort(new QName(
                        "http://www.cq-yj.com/HAP/OUTSRGISSUE/Sender", "HTTP_Port"),
                SIOUTSRGISSUESenderSync.class);
    }

    /**
     *
     * @return returns SIOUTSRGISSUESenderSync
     */
    @WebEndpoint(name = "HTTPS_Port")
    public SIOUTSRGISSUESenderSync getHTTPSPort() {
        return super.getPort(new QName(
                        "http://www.cq-yj.com/HAP/OUTSRGISSUE/Sender", "HTTPS_Port"),
                SIOUTSRGISSUESenderSync.class);
    }

}

