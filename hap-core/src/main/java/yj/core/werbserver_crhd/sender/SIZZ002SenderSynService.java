package yj.core.werbserver_crhd.sender;

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
 * SI_ZZ002_Sender_SynService service = new SI_ZZ002_Sender_SynService();
 * SIZZ002SenderSyn portType = service.getHTTPPort();
 * portType.siZZ002SenderSyn(...);
 * </pre>
 * 
 * </p>
 * 
 */
@WebServiceClient(name = "SI_ZZ002_Sender_SynService", targetNamespace = "http://www.cq-yj.com/HAP/PP001/SAP_CRHD/Sender", wsdlLocation = "resources/synccrhd.xml")
public class SIZZ002SenderSynService extends Service {

	public final static URL WSDL_LOCATION;
	private final static Logger logger = Logger.getLogger(SIZZ002SenderSynService.class.getName());

	static {
		URL url = null;
		url = SIZZ002SenderSynService.class.getClassLoader().getResource("synccrhd.xml");
		System.out.println(url);
		WSDL_LOCATION = url;
	}

	public SIZZ002SenderSynService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public SIZZ002SenderSynService() {
		super(WSDL_LOCATION, new QName(
				"http://www.cq-yj.com/HAP/PP001/SAP_CRHD/Sender",
				"SI_ZZ002_Sender_SynService"));
	}

	/**
	 * 
	 * @return returns SIZZ002SenderSyn
	 */
	@WebEndpoint(name = "HTTP_Port")
	public SIZZ002SenderSyn getHTTPPort() {
		return super.getPort(new QName(
				"http://www.cq-yj.com/HAP/PP001/SAP_CRHD/Sender", "HTTP_Port"),
				SIZZ002SenderSyn.class);
	}

	/**
	 * 
	 * @return returns SIZZ002SenderSyn
	 */
	@WebEndpoint(name = "HTTPS_Port")
	public SIZZ002SenderSyn getHTTPSPort() {
		return super.getPort(
				new QName("http://www.cq-yj.com/HAP/PP001/SAP_CRHD/Sender",
						"HTTPS_Port"), SIZZ002SenderSyn.class);
	}

}
