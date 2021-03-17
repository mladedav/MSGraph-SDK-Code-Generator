// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.RoleEligibilityRequestFilterByCurrentUserOptions;
import com.microsoft.graph.models.UnifiedRoleEligibilityRequest;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.UnifiedRoleEligibilityRequestFilterByCurrentUserCollectionRequestBuilder;
import com.microsoft.graph.requests.UnifiedRoleEligibilityRequestFilterByCurrentUserCollectionRequest;
import com.microsoft.graph.requests.UnifiedRoleEligibilityRequestFilterByCurrentUserCollectionResponse;
import com.microsoft.graph.models.UnifiedRoleEligibilityRequestFilterByCurrentUserParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Eligibility Request Filter By Current User Collection Request Builder.
 */
public class UnifiedRoleEligibilityRequestFilterByCurrentUserCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<UnifiedRoleEligibilityRequest, UnifiedRoleEligibilityRequestFilterByCurrentUserCollectionRequestBuilder, UnifiedRoleEligibilityRequestFilterByCurrentUserCollectionResponse, UnifiedRoleEligibilityRequestFilterByCurrentUserCollectionPage, UnifiedRoleEligibilityRequestFilterByCurrentUserCollectionRequest> {

    /**
     * The request builder for this collection of UnifiedRoleEligibilityRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRoleEligibilityRequestFilterByCurrentUserCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UnifiedRoleEligibilityRequestFilterByCurrentUserCollectionRequestBuilder.class, UnifiedRoleEligibilityRequestFilterByCurrentUserCollectionRequest.class);
    }
    /**
     * The request builder for this collection of UnifiedRoleEligibilityRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public UnifiedRoleEligibilityRequestFilterByCurrentUserCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final UnifiedRoleEligibilityRequestFilterByCurrentUserParameterSet parameters) {
        super(requestUrl, client, requestOptions, UnifiedRoleEligibilityRequestFilterByCurrentUserCollectionRequestBuilder.class, UnifiedRoleEligibilityRequestFilterByCurrentUserCollectionRequest.class);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the UnifiedRoleEligibilityRequestFilterByCurrentUserCollectionRequest instance
     */
    @Override
    @Nonnull
    public UnifiedRoleEligibilityRequestFilterByCurrentUserCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final UnifiedRoleEligibilityRequestFilterByCurrentUserCollectionRequest request = super.buildRequest(requestOptions);
          for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }
        return request;
    }
}
