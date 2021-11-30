// ------------------------------------------------------------------------------
//  Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
// <auto-generated/>

// Template Source: IMethodRequestBuilder.cs.tt

namespace Microsoft.Graph2.CallRecords
{
    using System;
    using System.Collections.Generic;
    using System.IO;

    /// <summary>
    /// The interface ICallRecordItemRequestBuilder.
    /// </summary>
    public partial interface ICallRecordItemRequestBuilder : IBaseRequestBuilder
    {
        /// <summary>
        /// Builds the request.
        /// </summary>
        /// <param name="options">The query and header options for the request.</param>
        /// <returns>The built request.</returns>
        ICallRecordItemRequest Request(IEnumerable<Microsoft.Graph.Option> options = null);
        /// <summary>
        /// Gets the request builder for CallRecordItemRequestBuilder.
        /// </summary>
        /// <param name="name">A name parameter for the OData method call.</param>
        /// <returns>The <see cref="ICallRecordItemRequestBuilder"/>.</returns>
        ICallRecordItemRequestBuilder Item(
            string name);
        /// <summary>
        /// Gets the request builder for Recipients.
        /// 
        /// </summary>
        /// <returns>The <see cref="Microsoft.Graph.IEntityType2RequestBuilder"/>.</returns>
        Microsoft.Graph.IEntityType2RequestBuilder Recipients  { get; }
        /// <summary>
        /// Gets the request builder for Sessions.
        /// 
        /// </summary>
        /// <returns>The <see cref="ISessionRequestBuilder"/>.</returns>
        ISessionRequestBuilder Sessions  { get; }
    }
}
