
package com.mindtree.eai.programs.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.0.16
 * Sun Dec 17 19:57:39 IST 2017
 * Generated source version: 3.0.16
 */

@XmlRootElement(name = "getProductsResponse", namespace = "http://programs.eai.mindtree.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProductsResponse", namespace = "http://programs.eai.mindtree.com/")

public class GetProductsResponse {

    @XmlElement(name = "return")
    private java.util.List<java.lang.String> _return;

    public java.util.List<java.lang.String> getReturn() {
        return this._return;
    }

    public void setReturn(java.util.List<java.lang.String> new_return)  {
        this._return = new_return;
    }

}

