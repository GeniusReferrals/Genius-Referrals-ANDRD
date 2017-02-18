/*
 * GeniusReferralsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.geniusreferrals.api.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

import com.geniusreferrals.api.*;
import com.geniusreferrals.api.models.*;
import com.geniusreferrals.api.exceptions.*;
import com.geniusreferrals.api.http.client.HttpClient;
import com.geniusreferrals.api.http.client.HttpContext;
import com.geniusreferrals.api.http.request.HttpRequest;
import com.geniusreferrals.api.http.response.HttpResponse;
import com.geniusreferrals.api.http.response.HttpStringResponse;
import com.geniusreferrals.api.http.client.APICallBack;

public class RootsController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static RootsController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the RootsController class 
     */
    public static RootsController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new RootsController();
            }
        }
        return instance;
    }

    /**
     * The root of the API
     * @return    Returns the void response from the API call 
     */
    public void getRootAsync(
                final APICallBack<DynamicResponse> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5631938156458721429L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
                    put( "X-Auth-Token", Configuration.xAuthToken );
                    put( "Content-Type", Configuration.contentType );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            DynamicResponse _result = new DynamicResponse(_response);

                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

}