//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-146 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.22 at 09:15:31 AM IRST 
//


package org.rebecalang.compiler.propertycompiler.generalrebeca.objectmodel;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.rebecalang.compiler.propertycompiler.generalrebeca.objectmodel package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.rebecalang.compiler.propertycompiler.generalrebeca.objectmodel
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Label }
     * 
     */
    public Label createLabel() {
        return new Label();
    }

    /**
     * Create an instance of {@link Definition }
     * 
     */
    public Definition createDefinition() {
        return new Definition();
    }

    /**
     * Create an instance of {@link Annotation }
     * 
     */
    public Annotation createAnnotation() {
        return new Annotation();
    }

    /**
     * Create an instance of {@link AssertionDefinition }
     * 
     */
    public AssertionDefinition createAssertionDefinition() {
        return new AssertionDefinition();
    }

    /**
     * Create an instance of {@link PropertyModel }
     * 
     */
    public PropertyModel createPropertyModel() {
        return new PropertyModel();
    }

}
