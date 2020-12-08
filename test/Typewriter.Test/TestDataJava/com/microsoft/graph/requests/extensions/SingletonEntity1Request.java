// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SingletonEntity1;
import com.microsoft.graph.requests.extensions.ITestTypeRequestBuilder;
import com.microsoft.graph.requests.extensions.TestTypeRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Singleton Entity1Request.
 */
public class SingletonEntity1Request extends BaseRequest implements ISingletonEntity1Request {
	
    /**
     * The request for the SingletonEntity1
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SingletonEntity1Request(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SingletonEntity1.class);
    }

    /**
     * Gets the SingletonEntity1 from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super SingletonEntity1> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the SingletonEntity1 from the service
     *
     * @return the SingletonEntity1 from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SingletonEntity1 get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super SingletonEntity1> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this SingletonEntity1 with a source
     *
     * @param sourceSingletonEntity1 the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final SingletonEntity1 sourceSingletonEntity1, final ICallback<? super SingletonEntity1> callback) {
        send(HttpMethod.PATCH, callback, sourceSingletonEntity1);
    }

    /**
     * Patches this SingletonEntity1 with a source
     *
     * @param sourceSingletonEntity1 the source object with updates
     * @return the updated SingletonEntity1
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SingletonEntity1 patch(final SingletonEntity1 sourceSingletonEntity1) throws ClientException {
        return send(HttpMethod.PATCH, sourceSingletonEntity1);
    }

    /**
     * Creates a SingletonEntity1 with a new object
     *
     * @param newSingletonEntity1 the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final SingletonEntity1 newSingletonEntity1, final ICallback<? super SingletonEntity1> callback) {
        send(HttpMethod.POST, callback, newSingletonEntity1);
    }

    /**
     * Creates a SingletonEntity1 with a new object
     *
     * @param newSingletonEntity1 the new object to create
     * @return the created SingletonEntity1
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SingletonEntity1 post(final SingletonEntity1 newSingletonEntity1) throws ClientException {
        return send(HttpMethod.POST, newSingletonEntity1);
    }

    /**
     * Creates a SingletonEntity1 with a new object
     *
     * @param newSingletonEntity1 the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final SingletonEntity1 newSingletonEntity1, final ICallback<? super SingletonEntity1> callback) {
        send(HttpMethod.PUT, callback, newSingletonEntity1);
    }

    /**
     * Creates a SingletonEntity1 with a new object
     *
     * @param newSingletonEntity1 the object to create/update
     * @return the created SingletonEntity1
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SingletonEntity1 put(final SingletonEntity1 newSingletonEntity1) throws ClientException {
        return send(HttpMethod.PUT, newSingletonEntity1);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ISingletonEntity1Request select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (SingletonEntity1Request)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ISingletonEntity1Request expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (SingletonEntity1Request)this;
     }

}

