// Template Source: IBaseClient.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.requests.extensions.IEntityType3CollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEntityType3RequestBuilder;
import com.microsoft.graph.requests.extensions.ISingletonEntity1RequestBuilder;
import com.microsoft.graph.requests.extensions.ISingletonEntity2RequestBuilder;
import com.microsoft.graph2.callrecords.requests.extensions.ISingletonEntity1RequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Graph Service Client.
 */
public interface IBaseGraphServiceClient extends IBaseClient {

    /**
     * Gets the collection of TestTypes objects
     *
     * @return the request builder for the collection of TestTypes objects
     */
    IEntityType3CollectionRequestBuilder testTypes();

    /**
     * Gets a single TestTypes
     *
     * @param id the id of the TestTypes to retrieve
     * @return the request builder for the TestTypes object
     */
    IEntityType3RequestBuilder testTypes(final String id);

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the SingletonEntity1
     */
    ISingletonEntity1RequestBuilder singletonProperty1();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the SingletonEntity2
     */
    ISingletonEntity2RequestBuilder singletonProperty2();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the SingletonEntity1
     */
    ISingletonEntity1RequestBuilder singletonProperty3();

}
