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
    /// The type NetworkInfo.
    /// </summary>
    [JsonConverter(typeof(Microsoft.Graph.DerivedTypeConverter<NetworkInfo>))]
    public partial class NetworkInfo
    {

        /// <summary>
        /// Gets or sets connectionType.
        /// </summary>
        [JsonPropertyName("connectionType")]
        public NetworkConnectionType? ConnectionType { get; set; }
    
        /// <summary>
        /// Gets or sets wifiBand.
        /// </summary>
        [JsonPropertyName("wifiBand")]
        public WifiBand? WifiBand { get; set; }
    
        /// <summary>
        /// Gets or sets basicServiceSetIdentifier.
        /// </summary>
        [JsonPropertyName("basicServiceSetIdentifier")]
        public string BasicServiceSetIdentifier { get; set; }
    
        /// <summary>
        /// Gets or sets wifiRadioType.
        /// </summary>
        [JsonPropertyName("wifiRadioType")]
        public WifiRadioType? WifiRadioType { get; set; }
    
        /// <summary>
        /// Gets or sets wifiSignalStrength.
        /// </summary>
        [JsonPropertyName("wifiSignalStrength")]
        public Int32? WifiSignalStrength { get; set; }
    
        /// <summary>
        /// Gets or sets bandwidthLowEventRatio.
        /// </summary>
        [JsonPropertyName("bandwidthLowEventRatio")]
        public Single? BandwidthLowEventRatio { get; set; }
    
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
