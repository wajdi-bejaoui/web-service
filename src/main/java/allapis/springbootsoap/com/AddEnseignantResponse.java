//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.05.11 at 08:31:08 am CET 
//


package allapis.springbootsoap.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceStatus" type="{http://com.springbootsoap.allapis}serviceStatus"/>
 *         &lt;element name="enseignantInfo" type="{http://com.springbootsoap.allapis}enseignantInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serviceStatus",
    "enseignantInfo"
})
@XmlRootElement(name = "addEnseignantResponse")
public class AddEnseignantResponse {

    @XmlElement(required = true)
    protected ServiceStatus serviceStatus;
    @XmlElement(required = true)
    protected EnseignantInfo enseignantInfo;

    /**
     * Gets the value of the serviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceStatus }
     *     
     */
    public ServiceStatus getServiceStatus() {
        return serviceStatus;
    }

    /**
     * Sets the value of the serviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceStatus }
     *     
     */
    public void setServiceStatus(ServiceStatus value) {
        this.serviceStatus = value;
    }

    /**
     * Gets the value of the enseignantInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EnseignantInfo }
     *     
     */
    public EnseignantInfo getEnseignantInfo() {
        return enseignantInfo;
    }

    /**
     * Sets the value of the enseignantInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnseignantInfo }
     *     
     */
    public void setEnseignantInfo(EnseignantInfo value) {
        this.enseignantInfo = value;
    }

}
