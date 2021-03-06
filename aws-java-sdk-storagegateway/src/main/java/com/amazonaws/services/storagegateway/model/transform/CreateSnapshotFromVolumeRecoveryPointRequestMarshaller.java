/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.storagegateway.model.transform;

import java.io.ByteArrayInputStream;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * CreateSnapshotFromVolumeRecoveryPointRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSnapshotFromVolumeRecoveryPointRequestMarshaller implements
        Marshaller<Request<CreateSnapshotFromVolumeRecoveryPointRequest>, CreateSnapshotFromVolumeRecoveryPointRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public CreateSnapshotFromVolumeRecoveryPointRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateSnapshotFromVolumeRecoveryPointRequest> marshall(
            CreateSnapshotFromVolumeRecoveryPointRequest createSnapshotFromVolumeRecoveryPointRequest) {

        if (createSnapshotFromVolumeRecoveryPointRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateSnapshotFromVolumeRecoveryPointRequest> request = new DefaultRequest<CreateSnapshotFromVolumeRecoveryPointRequest>(
                createSnapshotFromVolumeRecoveryPointRequest, "AWSStorageGateway");
        request.addHeader("X-Amz-Target", "StorageGateway_20130630.CreateSnapshotFromVolumeRecoveryPoint");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (createSnapshotFromVolumeRecoveryPointRequest.getVolumeARN() != null) {
                jsonGenerator.writeFieldName("VolumeARN").writeValue(createSnapshotFromVolumeRecoveryPointRequest.getVolumeARN());
            }
            if (createSnapshotFromVolumeRecoveryPointRequest.getSnapshotDescription() != null) {
                jsonGenerator.writeFieldName("SnapshotDescription").writeValue(createSnapshotFromVolumeRecoveryPointRequest.getSnapshotDescription());
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.addHeader("Content-Type", protocolFactory.getContentType());
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
