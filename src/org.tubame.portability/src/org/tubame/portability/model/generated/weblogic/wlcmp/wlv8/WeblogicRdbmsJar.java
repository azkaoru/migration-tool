//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.17 at 10:51:28 AM JST 
//

package org.tubame.portability.model.generated.weblogic.wlcmp.wlv8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "weblogicRdbmsBean", "weblogicRdbmsRelation",
        "orderDatabaseOperations", "enableBatchOperations",
        "createDefaultDbmsTables", "validateDbSchemaWith", "databaseType",
        "defaultDbmsTablesDdl", "compatibility" })
@XmlRootElement(name = "weblogic-rdbms-jar")
public class WeblogicRdbmsJar {

    @XmlElement(name = "weblogic-rdbms-bean", required = true)
    protected List<WeblogicRdbmsBean> weblogicRdbmsBean;
    @XmlElement(name = "weblogic-rdbms-relation")
    protected List<WeblogicRdbmsRelation> weblogicRdbmsRelation;
    @XmlElement(name = "order-database-operations")
    protected String orderDatabaseOperations;
    @XmlElement(name = "enable-batch-operations")
    protected String enableBatchOperations;
    @XmlElement(name = "create-default-dbms-tables")
    protected String createDefaultDbmsTables;
    @XmlElement(name = "validate-db-schema-with")
    protected String validateDbSchemaWith;
    @XmlElement(name = "database-type")
    protected String databaseType;
    @XmlElement(name = "default-dbms-tables-ddl")
    protected String defaultDbmsTablesDdl;
    protected Compatibility compatibility;

    /**
     * Gets the value of the weblogicRdbmsBean property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the weblogicRdbmsBean property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getWeblogicRdbmsBean().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeblogicRdbmsBean }
     * 
     * 
     */
    public List<WeblogicRdbmsBean> getWeblogicRdbmsBean() {
        if (weblogicRdbmsBean == null) {
            weblogicRdbmsBean = new ArrayList<WeblogicRdbmsBean>();
        }
        return this.weblogicRdbmsBean;
    }

    /**
     * Gets the value of the weblogicRdbmsRelation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the weblogicRdbmsRelation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getWeblogicRdbmsRelation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeblogicRdbmsRelation }
     * 
     * 
     */
    public List<WeblogicRdbmsRelation> getWeblogicRdbmsRelation() {
        if (weblogicRdbmsRelation == null) {
            weblogicRdbmsRelation = new ArrayList<WeblogicRdbmsRelation>();
        }
        return this.weblogicRdbmsRelation;
    }

    /**
     * Gets the value of the orderDatabaseOperations property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getOrderDatabaseOperations() {
        return orderDatabaseOperations;
    }

    /**
     * Sets the value of the orderDatabaseOperations property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setOrderDatabaseOperations(String value) {
        this.orderDatabaseOperations = value;
    }

    /**
     * Gets the value of the enableBatchOperations property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getEnableBatchOperations() {
        return enableBatchOperations;
    }

    /**
     * Sets the value of the enableBatchOperations property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setEnableBatchOperations(String value) {
        this.enableBatchOperations = value;
    }

    /**
     * Gets the value of the createDefaultDbmsTables property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCreateDefaultDbmsTables() {
        return createDefaultDbmsTables;
    }

    /**
     * Sets the value of the createDefaultDbmsTables property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setCreateDefaultDbmsTables(String value) {
        this.createDefaultDbmsTables = value;
    }

    /**
     * Gets the value of the validateDbSchemaWith property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getValidateDbSchemaWith() {
        return validateDbSchemaWith;
    }

    /**
     * Sets the value of the validateDbSchemaWith property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setValidateDbSchemaWith(String value) {
        this.validateDbSchemaWith = value;
    }

    /**
     * Gets the value of the databaseType property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDatabaseType() {
        return databaseType;
    }

    /**
     * Sets the value of the databaseType property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setDatabaseType(String value) {
        this.databaseType = value;
    }

    /**
     * Gets the value of the defaultDbmsTablesDdl property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDefaultDbmsTablesDdl() {
        return defaultDbmsTablesDdl;
    }

    /**
     * Sets the value of the defaultDbmsTablesDdl property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setDefaultDbmsTablesDdl(String value) {
        this.defaultDbmsTablesDdl = value;
    }

    /**
     * Gets the value of the compatibility property.
     * 
     * @return possible object is {@link Compatibility }
     * 
     */
    public Compatibility getCompatibility() {
        return compatibility;
    }

    /**
     * Sets the value of the compatibility property.
     * 
     * @param value
     *            allowed object is {@link Compatibility }
     * 
     */
    public void setCompatibility(Compatibility value) {
        this.compatibility = value;
    }

}