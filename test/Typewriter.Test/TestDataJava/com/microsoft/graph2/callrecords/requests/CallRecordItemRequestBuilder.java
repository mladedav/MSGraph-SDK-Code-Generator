// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph2.callrecords.requests;
import com.microsoft.graph2.callrecords.requests.CallRecordItemRequest;
import com.microsoft.graph2.callrecords.models.CallRecord;
import com.microsoft.graph.http.BaseFunctionRequestBuilder;
import com.microsoft.graph2.callrecords.models.CallRecordItemParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Record Item Request Builder.
 */
public class CallRecordItemRequestBuilder extends BaseFunctionRequestBuilder<CallRecord> {

    /**
     * The request builder for this CallRecordItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CallRecordItemRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    /**
     * The request builder for this CallRecordItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public CallRecordItemRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final CallRecordItemParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }

    /**
     * Creates the CallRecordItemRequest
     *
     * @param requestOptions the options for the request
     * @return the CallRecordItemRequest instance
     */
    @Nonnull
    public CallRecordItemRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the CallRecordItemRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the CallRecordItemRequest instance
     */
    @Nonnull
    public CallRecordItemRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final CallRecordItemRequest request = new CallRecordItemRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
        }
        return request;
    }
    /**
     *  Gets a request builder for the Session collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public SessionCollectionRequestBuilder sessions() {
        return new SessionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("sessions"), getClient(), null);
    }

    /**
     * Gets a request builder for the Session item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public SessionRequestBuilder sessions(@Nonnull final String id) {
        return new SessionRequestBuilder(getRequestUrlWithAdditionalSegment("sessions") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the EntityType2 collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public EntityType2CollectionRequestBuilder recipients() {
        return new EntityType2CollectionRequestBuilder(getRequestUrlWithAdditionalSegment("recipients"), getClient(), null);
    }

    /**
     * Gets a request builder for the EntityType2 item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public EntityType2RequestBuilder recipients(@Nonnull final String id) {
        return new EntityType2RequestBuilder(getRequestUrlWithAdditionalSegment("recipients") + "/" + id, getClient(), null);
    }
}
