//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-146 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.23 at 10:20:04 AM IRDT 
//


package org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{http://rebecalang.org/compiler/modelcompiler/corerebeca}MainRebecDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="lineNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="character" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="endLineNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="endCharacter" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mainRebecDefinition"
})
@XmlRootElement(name = "MainDeclaration")
public class MainDeclaration {

    @XmlElement(name = "MainRebecDefinition")
    protected List<MainRebecDefinition> mainRebecDefinition;
    @XmlAttribute(name = "lineNumber")
    protected Integer lineNumber;
    @XmlAttribute(name = "character")
    protected Integer character;
    @XmlAttribute(name = "endLineNumber")
    protected Integer endLineNumber;
    @XmlAttribute(name = "endCharacter")
    protected Integer endCharacter;

    /**
     * Gets the value of the mainRebecDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mainRebecDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMainRebecDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MainRebecDefinition }
     * 
     * 
     */
    public List<MainRebecDefinition> getMainRebecDefinition() {
        if (mainRebecDefinition == null) {
            mainRebecDefinition = new ArrayList<MainRebecDefinition>();
        }
        return this.mainRebecDefinition;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLineNumber(Integer value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the character property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCharacter() {
        return character;
    }

    /**
     * Sets the value of the character property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCharacter(Integer value) {
        this.character = value;
    }

    /**
     * Gets the value of the endLineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEndLineNumber() {
        return endLineNumber;
    }

    /**
     * Sets the value of the endLineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEndLineNumber(Integer value) {
        this.endLineNumber = value;
    }

    /**
     * Gets the value of the endCharacter property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEndCharacter() {
        return endCharacter;
    }

    /**
     * Sets the value of the endCharacter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEndCharacter(Integer value) {
        this.endCharacter = value;
    }

}
