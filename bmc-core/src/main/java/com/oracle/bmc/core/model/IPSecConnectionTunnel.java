/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Information about a single tunnel in an IPSec connection. This object does not include the tunnel's
 * shared secret (pre-shared key). That is in the
 * {@link IPSecConnectionTunnelSharedSecret} object.
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
    builder = IPSecConnectionTunnel.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class IPSecConnectionTunnel {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vpnIp")
        private String vpnIp;

        public Builder vpnIp(String vpnIp) {
            this.vpnIp = vpnIp;
            this.__explicitlySet__.add("vpnIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpeIp")
        private String cpeIp;

        public Builder cpeIp(String cpeIp) {
            this.cpeIp = cpeIp;
            this.__explicitlySet__.add("cpeIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ikeVersion")
        private IkeVersion ikeVersion;

        public Builder ikeVersion(IkeVersion ikeVersion) {
            this.ikeVersion = ikeVersion;
            this.__explicitlySet__.add("ikeVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bgpSessionInfo")
        private BgpSessionInfo bgpSessionInfo;

        public Builder bgpSessionInfo(BgpSessionInfo bgpSessionInfo) {
            this.bgpSessionInfo = bgpSessionInfo;
            this.__explicitlySet__.add("bgpSessionInfo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("encryptionDomainConfig")
        private EncryptionDomainConfig encryptionDomainConfig;

        public Builder encryptionDomainConfig(EncryptionDomainConfig encryptionDomainConfig) {
            this.encryptionDomainConfig = encryptionDomainConfig;
            this.__explicitlySet__.add("encryptionDomainConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("routing")
        private Routing routing;

        public Builder routing(Routing routing) {
            this.routing = routing;
            this.__explicitlySet__.add("routing");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeStatusUpdated")
        private java.util.Date timeStatusUpdated;

        public Builder timeStatusUpdated(java.util.Date timeStatusUpdated) {
            this.timeStatusUpdated = timeStatusUpdated;
            this.__explicitlySet__.add("timeStatusUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("oracleCanInitiate")
        private OracleCanInitiate oracleCanInitiate;

        public Builder oracleCanInitiate(OracleCanInitiate oracleCanInitiate) {
            this.oracleCanInitiate = oracleCanInitiate;
            this.__explicitlySet__.add("oracleCanInitiate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("natTranslationEnabled")
        private NatTranslationEnabled natTranslationEnabled;

        public Builder natTranslationEnabled(NatTranslationEnabled natTranslationEnabled) {
            this.natTranslationEnabled = natTranslationEnabled;
            this.__explicitlySet__.add("natTranslationEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dpdMode")
        private DpdMode dpdMode;

        public Builder dpdMode(DpdMode dpdMode) {
            this.dpdMode = dpdMode;
            this.__explicitlySet__.add("dpdMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dpdTimeoutInSec")
        private Integer dpdTimeoutInSec;

        public Builder dpdTimeoutInSec(Integer dpdTimeoutInSec) {
            this.dpdTimeoutInSec = dpdTimeoutInSec;
            this.__explicitlySet__.add("dpdTimeoutInSec");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("phaseOneDetails")
        private TunnelPhaseOneDetails phaseOneDetails;

        public Builder phaseOneDetails(TunnelPhaseOneDetails phaseOneDetails) {
            this.phaseOneDetails = phaseOneDetails;
            this.__explicitlySet__.add("phaseOneDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("phaseTwoDetails")
        private TunnelPhaseTwoDetails phaseTwoDetails;

        public Builder phaseTwoDetails(TunnelPhaseTwoDetails phaseTwoDetails) {
            this.phaseTwoDetails = phaseTwoDetails;
            this.__explicitlySet__.add("phaseTwoDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IPSecConnectionTunnel build() {
            IPSecConnectionTunnel __instance__ =
                    new IPSecConnectionTunnel(
                            compartmentId,
                            id,
                            vpnIp,
                            cpeIp,
                            status,
                            ikeVersion,
                            lifecycleState,
                            displayName,
                            bgpSessionInfo,
                            encryptionDomainConfig,
                            routing,
                            timeCreated,
                            timeStatusUpdated,
                            oracleCanInitiate,
                            natTranslationEnabled,
                            dpdMode,
                            dpdTimeoutInSec,
                            phaseOneDetails,
                            phaseTwoDetails);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IPSecConnectionTunnel o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .id(o.getId())
                            .vpnIp(o.getVpnIp())
                            .cpeIp(o.getCpeIp())
                            .status(o.getStatus())
                            .ikeVersion(o.getIkeVersion())
                            .lifecycleState(o.getLifecycleState())
                            .displayName(o.getDisplayName())
                            .bgpSessionInfo(o.getBgpSessionInfo())
                            .encryptionDomainConfig(o.getEncryptionDomainConfig())
                            .routing(o.getRouting())
                            .timeCreated(o.getTimeCreated())
                            .timeStatusUpdated(o.getTimeStatusUpdated())
                            .oracleCanInitiate(o.getOracleCanInitiate())
                            .natTranslationEnabled(o.getNatTranslationEnabled())
                            .dpdMode(o.getDpdMode())
                            .dpdTimeoutInSec(o.getDpdTimeoutInSec())
                            .phaseOneDetails(o.getPhaseOneDetails())
                            .phaseTwoDetails(o.getPhaseTwoDetails());

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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the tunnel.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the tunnel.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The IP address of Oracle's VPN headend.
     * <p>
     * Example: {@code 203.0.113.21}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vpnIp")
    String vpnIp;

    /**
     * The IP address of the CPE's VPN headend.
     * <p>
     * Example: {@code 203.0.113.22}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpeIp")
    String cpeIp;
    /**
     * The status of the tunnel based on IPSec protocol characteristics.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Status {
        Up("UP"),
        Down("DOWN"),
        DownForMaintenance("DOWN_FOR_MAINTENANCE"),
        PartialUp("PARTIAL_UP"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The status of the tunnel based on IPSec protocol characteristics.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    Status status;
    /**
     * Internet Key Exchange protocol version.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum IkeVersion {
        V1("V1"),
        V2("V2"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, IkeVersion> map;

        static {
            map = new java.util.HashMap<>();
            for (IkeVersion v : IkeVersion.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        IkeVersion(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IkeVersion create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'IkeVersion', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Internet Key Exchange protocol version.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ikeVersion")
    IkeVersion ikeVersion;
    /**
     * The tunnel's lifecycle state.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),

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
     * The tunnel's lifecycle state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    @com.fasterxml.jackson.annotation.JsonProperty("bgpSessionInfo")
    BgpSessionInfo bgpSessionInfo;

    @com.fasterxml.jackson.annotation.JsonProperty("encryptionDomainConfig")
    EncryptionDomainConfig encryptionDomainConfig;
    /**
     * The type of routing used for this tunnel (either BGP dynamic routing or static routing).
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Routing {
        Bgp("BGP"),
        Static("STATIC"),
        Policy("POLICY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Routing> map;

        static {
            map = new java.util.HashMap<>();
            for (Routing v : Routing.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Routing(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Routing create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Routing', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of routing used for this tunnel (either BGP dynamic routing or static routing).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("routing")
    Routing routing;

    /**
     * The date and time the IPSec connection tunnel was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * When the status of the tunnel last changed, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStatusUpdated")
    java.util.Date timeStatusUpdated;
    /**
     * Indicates whether Oracle can either initiate the tunnel or respond, or respond only.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum OracleCanInitiate {
        InitiatorOrResponder("INITIATOR_OR_RESPONDER"),
        ResponderOnly("RESPONDER_ONLY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, OracleCanInitiate> map;

        static {
            map = new java.util.HashMap<>();
            for (OracleCanInitiate v : OracleCanInitiate.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        OracleCanInitiate(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OracleCanInitiate create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'OracleCanInitiate', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates whether Oracle can either initiate the tunnel or respond, or respond only.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oracleCanInitiate")
    OracleCanInitiate oracleCanInitiate;
    /**
     * Whether NAT-T Enabled on the tunnel
     **/
    @lombok.extern.slf4j.Slf4j
    public enum NatTranslationEnabled {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        Auto("AUTO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, NatTranslationEnabled> map;

        static {
            map = new java.util.HashMap<>();
            for (NatTranslationEnabled v : NatTranslationEnabled.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        NatTranslationEnabled(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static NatTranslationEnabled create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'NatTranslationEnabled', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Whether NAT-T Enabled on the tunnel
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("natTranslationEnabled")
    NatTranslationEnabled natTranslationEnabled;
    /**
     * dpd mode
     **/
    @lombok.extern.slf4j.Slf4j
    public enum DpdMode {
        InitiateAndRespond("INITIATE_AND_RESPOND"),
        RespondOnly("RESPOND_ONLY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, DpdMode> map;

        static {
            map = new java.util.HashMap<>();
            for (DpdMode v : DpdMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DpdMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DpdMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DpdMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * dpd mode
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dpdMode")
    DpdMode dpdMode;

    /**
     * Dead peer detection (DPD) timeout in seconds.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dpdTimeoutInSec")
    Integer dpdTimeoutInSec;

    @com.fasterxml.jackson.annotation.JsonProperty("phaseOneDetails")
    TunnelPhaseOneDetails phaseOneDetails;

    @com.fasterxml.jackson.annotation.JsonProperty("phaseTwoDetails")
    TunnelPhaseTwoDetails phaseTwoDetails;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
