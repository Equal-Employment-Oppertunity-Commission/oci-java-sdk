/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.healthchecks.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.healthchecks.model.*;
import com.oracle.bmc.healthchecks.requests.*;
import com.oracle.bmc.healthchecks.responses.*;
import org.apache.commons.lang3.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180501")
@lombok.extern.slf4j.Slf4j
public class CreateOnDemandPingProbeConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static com.oracle.bmc.healthchecks.requests.CreateOnDemandPingProbeRequest
            interceptRequest(
                    com.oracle.bmc.healthchecks.requests.CreateOnDemandPingProbeRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.healthchecks.requests.CreateOnDemandPingProbeRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notNull(
                request.getCreateOnDemandPingProbeDetails(),
                "createOnDemandPingProbeDetails is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget().path("/20180501").path("pingProbeResults");

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        if (client.getClientConfigurator() != null) {
            client.getClientConfigurator().customizeRequest(request, ib);
        }
        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.healthchecks.responses.CreateOnDemandPingProbeResponse>
            fromResponse() {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.healthchecks.responses.CreateOnDemandPingProbeResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.healthchecks.responses
                                        .CreateOnDemandPingProbeResponse>() {
                            @Override
                            public com.oracle.bmc.healthchecks.responses
                                            .CreateOnDemandPingProbeResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.healthchecks.responses.CreateOnDemandPingProbeResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        com.oracle.bmc.healthchecks.model
                                                                .PingProbe>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(
                                                        com.oracle.bmc.healthchecks.model.PingProbe
                                                                .class);

                                com.oracle.bmc.http.internal.WithHeaders<
                                                com.oracle.bmc.healthchecks.model.PingProbe>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.healthchecks.responses
                                                .CreateOnDemandPingProbeResponse.Builder
                                        builder =
                                                com.oracle.bmc.healthchecks.responses
                                                        .CreateOnDemandPingProbeResponse.builder()
                                                        .__httpStatusCode__(
                                                                rawResponse.getStatus());

                                builder.pingProbe(response.getItem());

                                com.google.common.base.Optional<java.util.List<String>>
                                        opcRequestIdHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "opc-request-id");
                                if (opcRequestIdHeader.isPresent()) {
                                    builder.opcRequestId(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-request-id",
                                                    opcRequestIdHeader.get().get(0),
                                                    String.class));
                                }

                                com.google.common.base.Optional<java.util.List<String>>
                                        locationHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "location");
                                if (locationHeader.isPresent()) {
                                    builder.location(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "location",
                                                    locationHeader.get().get(0),
                                                    String.class));
                                }

                                com.oracle.bmc.healthchecks.responses
                                                .CreateOnDemandPingProbeResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
