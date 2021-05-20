// ------------------------------------------------------------------------------
//  Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
// <auto-generated/>

// Template Source: ComplexType.cs.tt

namespace Microsoft.Graph2.CallRecords
{
    using System;
    using System.Collections.Generic;
    using System.IO;
    using System.Text.Json.Serialization;

    /// <summary>
    /// The type FailureInfo.
    /// </summary>
    [JsonConverter(typeof(Microsoft.Graph.DerivedTypeConverter<FailureInfo>))]
    public partial class FailureInfo
    {

        /// <summary>
        /// Gets or sets stage.
        /// </summary>
        [JsonPropertyName("stage")]
        public FailureStage? Stage { get; set; }
    
        /// <summary>
        /// Gets or sets reason.
        /// </summary>
        [JsonPropertyName("reason")]
        public string Reason { get; set; }
    
        /// <summary>
        /// Gets or sets additional data.
        /// </summary>
        [JsonExtensionData]
        public IDictionary<string, object> AdditionalData { get; set; }

        /// <summary>
        /// Gets or sets @odata.type.
        /// </summary>
        [JsonPropertyName("@odata.type")]
        public string ODataType { get; set; }
    
    }
}
