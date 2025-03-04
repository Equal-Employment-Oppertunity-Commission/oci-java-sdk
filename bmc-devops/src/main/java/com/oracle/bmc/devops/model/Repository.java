/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Repositories containing the source code to build and deploy.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Repository.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Repository {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("projectId")
        private String projectId;

        public Builder projectId(String projectId) {
            this.projectId = projectId;
            this.__explicitlySet__.add("projectId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("projectName")
        private String projectName;

        public Builder projectName(String projectName) {
            this.projectName = projectName;
            this.__explicitlySet__.add("projectName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sshUrl")
        private String sshUrl;

        public Builder sshUrl(String sshUrl) {
            this.sshUrl = sshUrl;
            this.__explicitlySet__.add("sshUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("httpUrl")
        private String httpUrl;

        public Builder httpUrl(String httpUrl) {
            this.httpUrl = httpUrl;
            this.__explicitlySet__.add("httpUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultBranch")
        private String defaultBranch;

        public Builder defaultBranch(String defaultBranch) {
            this.defaultBranch = defaultBranch;
            this.__explicitlySet__.add("defaultBranch");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("repositoryType")
        private RepositoryType repositoryType;

        public Builder repositoryType(RepositoryType repositoryType) {
            this.repositoryType = repositoryType;
            this.__explicitlySet__.add("repositoryType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mirrorRepositoryConfig")
        private MirrorRepositoryConfig mirrorRepositoryConfig;

        public Builder mirrorRepositoryConfig(MirrorRepositoryConfig mirrorRepositoryConfig) {
            this.mirrorRepositoryConfig = mirrorRepositoryConfig;
            this.__explicitlySet__.add("mirrorRepositoryConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecyleDetails")
        private String lifecyleDetails;

        public Builder lifecyleDetails(String lifecyleDetails) {
            this.lifecyleDetails = lifecyleDetails;
            this.__explicitlySet__.add("lifecyleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("branchCount")
        private Integer branchCount;

        public Builder branchCount(Integer branchCount) {
            this.branchCount = branchCount;
            this.__explicitlySet__.add("branchCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("commitCount")
        private Integer commitCount;

        public Builder commitCount(Integer commitCount) {
            this.commitCount = commitCount;
            this.__explicitlySet__.add("commitCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
        private Long sizeInBytes;

        public Builder sizeInBytes(Long sizeInBytes) {
            this.sizeInBytes = sizeInBytes;
            this.__explicitlySet__.add("sizeInBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("triggerBuildEvents")
        private java.util.List<TriggerBuildEvents> triggerBuildEvents;

        public Builder triggerBuildEvents(java.util.List<TriggerBuildEvents> triggerBuildEvents) {
            this.triggerBuildEvents = triggerBuildEvents;
            this.__explicitlySet__.add("triggerBuildEvents");
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

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Repository build() {
            Repository __instance__ =
                    new Repository(
                            id,
                            name,
                            compartmentId,
                            namespace,
                            projectId,
                            projectName,
                            sshUrl,
                            httpUrl,
                            description,
                            defaultBranch,
                            repositoryType,
                            mirrorRepositoryConfig,
                            timeCreated,
                            timeUpdated,
                            lifecycleState,
                            lifecyleDetails,
                            branchCount,
                            commitCount,
                            sizeInBytes,
                            triggerBuildEvents,
                            freeformTags,
                            definedTags,
                            systemTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Repository o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .name(o.getName())
                            .compartmentId(o.getCompartmentId())
                            .namespace(o.getNamespace())
                            .projectId(o.getProjectId())
                            .projectName(o.getProjectName())
                            .sshUrl(o.getSshUrl())
                            .httpUrl(o.getHttpUrl())
                            .description(o.getDescription())
                            .defaultBranch(o.getDefaultBranch())
                            .repositoryType(o.getRepositoryType())
                            .mirrorRepositoryConfig(o.getMirrorRepositoryConfig())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .lifecycleState(o.getLifecycleState())
                            .lifecyleDetails(o.getLifecyleDetails())
                            .branchCount(o.getBranchCount())
                            .commitCount(o.getCommitCount())
                            .sizeInBytes(o.getSizeInBytes())
                            .triggerBuildEvents(o.getTriggerBuildEvents())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .systemTags(o.getSystemTags());

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
     * The OCID of the repository. This value is unique and immutable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * Unique name of a repository. This value is mutable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The OCID of the repository's compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Tenancy unique namespace.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    String namespace;

    /**
     * The OCID of the DevOps project containing the repository.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("projectId")
    String projectId;

    /**
     * Unique project name in a namespace.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("projectName")
    String projectName;

    /**
     * SSH URL that you use to git clone, pull and push.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sshUrl")
    String sshUrl;

    /**
     * HTTP URL that you use to git clone, pull and push.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("httpUrl")
    String httpUrl;

    /**
     * Details of the repository. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The default branch of the repository.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultBranch")
    String defaultBranch;
    /**
     * Type of repository:
     * Mirrored - Repository created by mirroring an existing repository.
     * Hosted - Repository created and hosted using OCI DevOps code repository.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum RepositoryType {
        Mirrored("MIRRORED"),
        Hosted("HOSTED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, RepositoryType> map;

        static {
            map = new java.util.HashMap<>();
            for (RepositoryType v : RepositoryType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RepositoryType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RepositoryType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RepositoryType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Type of repository:
     * Mirrored - Repository created by mirroring an existing repository.
     * Hosted - Repository created and hosted using OCI DevOps code repository.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("repositoryType")
    RepositoryType repositoryType;

    @com.fasterxml.jackson.annotation.JsonProperty("mirrorRepositoryConfig")
    MirrorRepositoryConfig mirrorRepositoryConfig;

    /**
     * The time the repository was created. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The time the repository was updated. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;
    /**
     * The current state of the repository.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Active("ACTIVE"),
        Creating("CREATING"),
        Deleted("DELETED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current state of the repository.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecyleDetails")
    String lifecyleDetails;

    /**
     * The count of the branches present in the repository.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("branchCount")
    Integer branchCount;

    /**
     * The count of the commits present in the repository.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commitCount")
    Integer commitCount;

    /**
     * The size of the repository in bytes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
    Long sizeInBytes;
    /**
     **/
    @lombok.extern.slf4j.Slf4j
    public enum TriggerBuildEvents {
        Push("PUSH"),
        CommitUpdates("COMMIT_UPDATES"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, TriggerBuildEvents> map;

        static {
            map = new java.util.HashMap<>();
            for (TriggerBuildEvents v : TriggerBuildEvents.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TriggerBuildEvents(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TriggerBuildEvents create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TriggerBuildEvents', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Trigger build events supported for this repository:
     * Push - Build is triggered when a push event occurs.
     * Commit updates - Build is triggered when new commits are mirrored into a repository.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("triggerBuildEvents")
    java.util.List<TriggerBuildEvents> triggerBuildEvents;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.  See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example: {@code {"bar-key": "value"}}
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    java.util.Map<String, java.util.Map<String, Object>> systemTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
