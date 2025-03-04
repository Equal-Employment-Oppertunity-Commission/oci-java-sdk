/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.functions.model;

/**
 * Properties to update an application.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateApplicationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateApplicationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("config")
        private java.util.Map<String, String> config;

        public Builder config(java.util.Map<String, String> config) {
            this.config = config;
            this.__explicitlySet__.add("config");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkSecurityGroupIds")
        private java.util.List<String> networkSecurityGroupIds;

        public Builder networkSecurityGroupIds(java.util.List<String> networkSecurityGroupIds) {
            this.networkSecurityGroupIds = networkSecurityGroupIds;
            this.__explicitlySet__.add("networkSecurityGroupIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("syslogUrl")
        private String syslogUrl;

        public Builder syslogUrl(String syslogUrl) {
            this.syslogUrl = syslogUrl;
            this.__explicitlySet__.add("syslogUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("traceConfig")
        private ApplicationTraceConfig traceConfig;

        public Builder traceConfig(ApplicationTraceConfig traceConfig) {
            this.traceConfig = traceConfig;
            this.__explicitlySet__.add("traceConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("imagePolicyConfig")
        private ImagePolicyConfig imagePolicyConfig;

        public Builder imagePolicyConfig(ImagePolicyConfig imagePolicyConfig) {
            this.imagePolicyConfig = imagePolicyConfig;
            this.__explicitlySet__.add("imagePolicyConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateApplicationDetails build() {
            UpdateApplicationDetails __instance__ =
                    new UpdateApplicationDetails(
                            config,
                            networkSecurityGroupIds,
                            syslogUrl,
                            traceConfig,
                            freeformTags,
                            definedTags,
                            imagePolicyConfig);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateApplicationDetails o) {
            Builder copiedBuilder =
                    config(o.getConfig())
                            .networkSecurityGroupIds(o.getNetworkSecurityGroupIds())
                            .syslogUrl(o.getSyslogUrl())
                            .traceConfig(o.getTraceConfig())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .imagePolicyConfig(o.getImagePolicyConfig());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Application configuration. These values are passed on to the function as environment variables, functions may override application configuration.
     * Keys must be ASCII strings consisting solely of letters, digits, and the '_' (underscore) character, and must not begin with a digit. Values should be limited to printable unicode characters.
     * <p>
     * Example: {@code {"MY_FUNCTION_CONFIG": "ConfVal"}}
     * <p>
     * The maximum size for all configuration keys and values is limited to 4KB. This is measured as the sum of octets necessary to represent each key and value in UTF-8.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("config")
    java.util.Map<String, String> config;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)s of the Network Security Groups to add the application to.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkSecurityGroupIds")
    java.util.List<String> networkSecurityGroupIds;

    /**
     * A syslog URL to which to send all function logs. Supports tcp, udp, and tcp+tls.
     * The syslog URL must be reachable from all of the subnets configured for the application.
     * Note: If you enable the OCI Logging service for this application, the syslogUrl value is ignored. Function logs are sent to the OCI Logging service, and not to the syslog URL.
     * <p>
     * Example: {@code tcp://logserver.myserver:1234}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("syslogUrl")
    String syslogUrl;

    @com.fasterxml.jackson.annotation.JsonProperty("traceConfig")
    ApplicationTraceConfig traceConfig;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonProperty("imagePolicyConfig")
    ImagePolicyConfig imagePolicyConfig;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
