//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-146 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.28 at 01:56:08 PM IRST 
//


package org.rebecalang.afra.ideplugin.view.modelcheckreport.resultobjectmodel.counterexample.state;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{}rebec" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="atomicpropositions" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rebec"
})
@XmlRootElement(name = "state")
public class State {

    protected List<Rebec> rebec;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "atomicpropositions")
    protected String atomicpropositions;

    /**
     * Gets the value of the rebec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rebec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRebec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rebec }
     * 
     * 
     */
    public List<Rebec> getRebec() {
        if (rebec == null) {
            rebec = new ArrayList<Rebec>();
        }
        return this.rebec;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the atomicpropositions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtomicpropositions() {
        return atomicpropositions;
    }

    /**
     * Sets the value of the atomicpropositions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtomicpropositions(String value) {
        this.atomicpropositions = value;
    }

}