/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.dataflow.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.dataflow.model.*;
import com.oracle.bmc.dataflow.requests.*;
import com.oracle.bmc.dataflow.responses.*;
import org.apache.commons.lang3.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
@lombok.extern.slf4j.Slf4j
public class CreateRunConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static CreateRunRequest interceptRequest(CreateRunRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client, CreateRunRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notNull(request.getCreateRunDetails(), "createRunDetails is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget().path("/20200129").path("runs");

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcRetryToken() != null) {
            ib.header("opc-retry-token", request.getOpcRetryToken());
        }

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        return ib;
    }

    public static com.google.common.base.Function<javax.ws.rs.core.Response, CreateRunResponse>
            fromResponse() {
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateRunResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response, CreateRunResponse>() {
                            @Override
                            public CreateRunResponse apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace("Transform function invoked for CreateRunResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<Run>>
                                        responseFn = RESPONSE_CONVERSION_FACTORY.create(Run.class);

                                com.oracle.bmc.http.internal.WithHeaders<Run> response =
                                        responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                CreateRunResponse.Builder builder = CreateRunResponse.builder();

                                builder.run(response.getItem());

                                com.google.common.base.Optional<java.util.List<String>> etagHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.get(
                                                headers, "etag");
                                if (etagHeader.isPresent()) {
                                    builder.etag(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "etag", etagHeader.get().get(0), String.class));
                                }

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

                                CreateRunResponse responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
