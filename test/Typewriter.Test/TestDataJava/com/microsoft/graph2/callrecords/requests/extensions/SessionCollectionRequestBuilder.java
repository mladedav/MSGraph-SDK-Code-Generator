// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph2.callrecords.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph2.callrecords.models.extensions.CallRecord;
import com.microsoft.graph2.callrecords.models.extensions.Session;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph2.callrecords.requests.extensions.ISessionCollectionRequestBuilder;
import com.microsoft.graph2.callrecords.requests.extensions.ISessionRequestBuilder;
import com.microsoft.graph2.callrecords.requests.extensions.ISessionCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Session Collection Request Builder.
 */
public class SessionCollectionRequestBuilder extends BaseRequestBuilder implements ISessionCollectionRequestBuilder {

    /**
     * The request builder for this collection of CallRecord
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SessionCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public ISessionCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public ISessionCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new SessionCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public ISessionRequestBuilder byId(final String id) {
        return new SessionRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
