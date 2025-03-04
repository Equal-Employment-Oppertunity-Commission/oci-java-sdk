/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * To use any of the API operations, you must be authorized in an IAM policy. If you are not authorized,
 * talk to an administrator. If you are an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateBucketDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateBucketDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.Map<String, String> metadata;

        public Builder metadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("publicAccessType")
        private PublicAccessType publicAccessType;

        public Builder publicAccessType(PublicAccessType publicAccessType) {
            this.publicAccessType = publicAccessType;
            this.__explicitlySet__.add("publicAccessType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectEventsEnabled")
        private Boolean objectEventsEnabled;

        public Builder objectEventsEnabled(Boolean objectEventsEnabled) {
            this.objectEventsEnabled = objectEventsEnabled;
            this.__explicitlySet__.add("objectEventsEnabled");
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

        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("versioning")
        private Versioning versioning;

        public Builder versioning(Versioning versioning) {
            this.versioning = versioning;
            this.__explicitlySet__.add("versioning");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("autoTiering")
        private Bucket.AutoTiering autoTiering;

        public Builder autoTiering(Bucket.AutoTiering autoTiering) {
            this.autoTiering = autoTiering;
            this.__explicitlySet__.add("autoTiering");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateBucketDetails build() {
            UpdateBucketDetails __instance__ =
                    new UpdateBucketDetails(
                            namespace,
                            compartmentId,
                            name,
                            metadata,
                            publicAccessType,
                            objectEventsEnabled,
                            freeformTags,
                            definedTags,
                            kmsKeyId,
                            versioning,
                            autoTiering);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateBucketDetails o) {
            Builder copiedBuilder =
                    namespace(o.getNamespace())
                            .compartmentId(o.getCompartmentId())
                            .name(o.getName())
                            .metadata(o.getMetadata())
                            .publicAccessType(o.getPublicAccessType())
                            .objectEventsEnabled(o.getObjectEventsEnabled())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .kmsKeyId(o.getKmsKeyId())
                            .versioning(o.getVersioning())
                            .autoTiering(o.getAutoTiering());

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
     * The Object Storage namespace in which the bucket lives.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    String namespace;

    /**
     * The compartmentId for the compartment to move the bucket to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The name of the bucket. Valid characters are uppercase or lowercase letters, numbers, hyphens, underscores, and periods.
     * Bucket names must be unique within an Object Storage namespace. Avoid entering confidential information.
     * Example: my-new-bucket1
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * Arbitrary string, up to 4KB, of keys and values for user-defined metadata.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    java.util.Map<String, String> metadata;
    /**
     * The type of public access enabled on this bucket. A bucket is set to {@code NoPublicAccess} by default, which only allows an
     * authenticated caller to access the bucket and its contents. When {@code ObjectRead} is enabled on the bucket, public access
     * is allowed for the {@code GetObject}, {@code HeadObject}, and {@code ListObjects} operations. When {@code ObjectReadWithoutList} is enabled
     * on the bucket, public access is allowed for the {@code GetObject} and {@code HeadObject} operations.
     *
     **/
    public enum PublicAccessType {
        NoPublicAccess("NoPublicAccess"),
        ObjectRead("ObjectRead"),
        ObjectReadWithoutList("ObjectReadWithoutList"),
        ;

        private final String value;
        private static java.util.Map<String, PublicAccessType> map;

        static {
            map = new java.util.HashMap<>();
            for (PublicAccessType v : PublicAccessType.values()) {
                map.put(v.getValue(), v);
            }
        }

        PublicAccessType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PublicAccessType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid PublicAccessType: " + key);
        }
    };
    /**
     * The type of public access enabled on this bucket. A bucket is set to {@code NoPublicAccess} by default, which only allows an
     * authenticated caller to access the bucket and its contents. When {@code ObjectRead} is enabled on the bucket, public access
     * is allowed for the {@code GetObject}, {@code HeadObject}, and {@code ListObjects} operations. When {@code ObjectReadWithoutList} is enabled
     * on the bucket, public access is allowed for the {@code GetObject} and {@code HeadObject} operations.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publicAccessType")
    PublicAccessType publicAccessType;

    /**
     * Whether or not events are emitted for object state changes in this bucket. By default, {@code objectEventsEnabled} is
     * set to {@code false}. Set {@code objectEventsEnabled} to {@code true} to emit events for object state changes. For more information
     * about events, see [Overview of Events](https://docs.cloud.oracle.com/Content/Events/Concepts/eventsoverview.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectEventsEnabled")
    Boolean objectEventsEnabled;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {"Operations": {"CostCenter": "42"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Key Management master encryption key to associate
     * with the specified bucket. If this value is empty, the Update operation will remove the associated key, if
     * there is one, from the bucket. (The bucket will continue to be encrypted, but with an encryption key managed
     * by Oracle.)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    String kmsKeyId;
    /**
     * The versioning status on the bucket. If in state {@code Enabled}, multiple versions of the same object can be kept in the bucket.
     * When the object is overwritten or deleted, previous versions will still be available. When versioning is {@code Suspended}, the previous versions will still remain but new versions will no longer be created when overwitten or deleted.
     * Versioning cannot be disabled on a bucket once enabled.
     *
     **/
    public enum Versioning {
        Enabled("Enabled"),
        Suspended("Suspended"),
        ;

        private final String value;
        private static java.util.Map<String, Versioning> map;

        static {
            map = new java.util.HashMap<>();
            for (Versioning v : Versioning.values()) {
                map.put(v.getValue(), v);
            }
        }

        Versioning(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Versioning create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Versioning: " + key);
        }
    };
    /**
     * The versioning status on the bucket. If in state {@code Enabled}, multiple versions of the same object can be kept in the bucket.
     * When the object is overwritten or deleted, previous versions will still be available. When versioning is {@code Suspended}, the previous versions will still remain but new versions will no longer be created when overwitten or deleted.
     * Versioning cannot be disabled on a bucket once enabled.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("versioning")
    Versioning versioning;

    /**
     * The auto tiering status on the bucket. If in state {@code InfrequentAccess}, objects are transitioned
     * automatically between the 'Standard' and 'InfrequentAccess' tiers based on the access pattern of the objects.
     * When auto tiering is {@code Disabled}, there will be no automatic transitions between storage tiers.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autoTiering")
    Bucket.AutoTiering autoTiering;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
