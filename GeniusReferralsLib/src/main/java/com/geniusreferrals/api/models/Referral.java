/*
 * GeniusReferralsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.geniusreferrals.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Referral 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5625599097006122926L;
    private String referredAdvocateToken;
    private String referralOriginSlug;
    private String campaignSlug;
    private String httpReferer;
    /** GETTER
     * The referrals token
     */
    @JsonGetter("referred_advocate_token")
    public String getReferredAdvocateToken ( ) { 
        return this.referredAdvocateToken;
    }
    
    /** SETTER
     * The referrals token
     */
    @JsonSetter("referred_advocate_token")
    public void setReferredAdvocateToken (String value) { 
        this.referredAdvocateToken = value;
        notifyObservers(this.referredAdvocateToken);
    }
 
    /** GETTER
     * The referral origin identifier
     */
    @JsonGetter("referral_origin_slug")
    public String getReferralOriginSlug ( ) { 
        return this.referralOriginSlug;
    }
    
    /** SETTER
     * The referral origin identifier
     */
    @JsonSetter("referral_origin_slug")
    public void setReferralOriginSlug (String value) { 
        this.referralOriginSlug = value;
        notifyObservers(this.referralOriginSlug);
    }
 
    /** GETTER
     * The campaign identifier
     */
    @JsonGetter("campaign_slug")
    public String getCampaignSlug ( ) { 
        return this.campaignSlug;
    }
    
    /** SETTER
     * The campaign identifier
     */
    @JsonSetter("campaign_slug")
    public void setCampaignSlug (String value) { 
        this.campaignSlug = value;
        notifyObservers(this.campaignSlug);
    }
 
    /** GETTER
     * The http_referrer URL
     */
    @JsonGetter("http_referer")
    public String getHttpReferer ( ) { 
        return this.httpReferer;
    }
    
    /** SETTER
     * The http_referrer URL
     */
    @JsonSetter("http_referer")
    public void setHttpReferer (String value) { 
        this.httpReferer = value;
        notifyObservers(this.httpReferer);
    }
 
}
 