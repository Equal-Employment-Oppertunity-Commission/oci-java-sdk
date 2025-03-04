/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * Summary of SystemPrivileges.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SystemPrivilegeSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SystemPrivilegeSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("adminOption")
        private AdminOption adminOption;

        public Builder adminOption(AdminOption adminOption) {
            this.adminOption = adminOption;
            this.__explicitlySet__.add("adminOption");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("common")
        private Common common;

        public Builder common(Common common) {
            this.common = common;
            this.__explicitlySet__.add("common");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inherited")
        private Inherited inherited;

        public Builder inherited(Inherited inherited) {
            this.inherited = inherited;
            this.__explicitlySet__.add("inherited");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SystemPrivilegeSummary build() {
            SystemPrivilegeSummary __instance__ =
                    new SystemPrivilegeSummary(name, adminOption, common, inherited);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SystemPrivilegeSummary o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .adminOption(o.getAdminOption())
                            .common(o.getCommon())
                            .inherited(o.getInherited());

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
     * The name of a system privilege
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;
    /**
     * Indicates whether the grant was with the ADMIN option (YES) or not (NO)
     **/
    @lombok.extern.slf4j.Slf4j
    public enum AdminOption {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, AdminOption> map;

        static {
            map = new java.util.HashMap<>();
            for (AdminOption v : AdminOption.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AdminOption(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AdminOption create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AdminOption', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates whether the grant was with the ADMIN option (YES) or not (NO)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adminOption")
    AdminOption adminOption;
    /**
     * Indicates how the grant was made. Possible values:
     * YES if the role was granted commonly (CONTAINER=ALL was used)
     * NO if the role was granted locally (CONTAINER=ALL was not used)
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Common {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Common> map;

        static {
            map = new java.util.HashMap<>();
            for (Common v : Common.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Common(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Common create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Common', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates how the grant was made. Possible values:
     * YES if the role was granted commonly (CONTAINER=ALL was used)
     * NO if the role was granted locally (CONTAINER=ALL was not used)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("common")
    Common common;
    /**
     * Indicates whether the role grant was inherited from another container (YES) or not (NO)
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Inherited {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Inherited> map;

        static {
            map = new java.util.HashMap<>();
            for (Inherited v : Inherited.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Inherited(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Inherited create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Inherited', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates whether the role grant was inherited from another container (YES) or not (NO)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inherited")
    Inherited inherited;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
