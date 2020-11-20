// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph2.callrecords.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph2.callrecords.models.extensions.Session;
import com.microsoft.graph2.callrecords.requests.extensions.SegmentCollectionRequestBuilder;
import com.microsoft.graph2.callrecords.requests.extensions.SegmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseReferenceRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Session Reference Request.
 */
public class SessionReferenceRequest extends BaseReferenceRequest<Session> {

    /**
     * The request for the Session
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SessionReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Session.class);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public SessionReferenceRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public SessionReferenceRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }
    /**
     * Puts the Session
     *
     * @param srcSession the Session reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final Session srcSession, @Nonnull final ICallback<? super Session> callback) {
        send(HttpMethod.PUT, callback, srcSession);
    }

    /**
     * Puts the Session
     *
     * @param srcSession the Session reference to PUT
     * @return the Session
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public Session put(@Nonnull final Session srcSession) throws ClientException {
        return send(HttpMethod.PUT, srcSession);
    }
}
