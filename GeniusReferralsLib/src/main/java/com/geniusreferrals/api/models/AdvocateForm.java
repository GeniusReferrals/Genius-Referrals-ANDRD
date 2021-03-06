/*
 * GeniusReferralsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.geniusreferrals.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class AdvocateForm 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5160049466907955043L;
    private Advocate advocate;
    /** GETTER
     * The advocate's wrapper
     */
    @JsonGetter("advocate")
    public Advocate getAdvocate ( ) { 
        return this.advocate;
    }
    
    /** SETTER
     * The advocate's wrapper
     */
    @JsonSetter("advocate")
    public void setAdvocate (Advocate value) { 
        this.advocate = value;
        notifyObservers(this.advocate);
    }
 
}
 