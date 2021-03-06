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
package com.amazonaws.services.directory.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.directory.model.*;

import com.amazonaws.protocol.json.*;

/**
 * DirectoryVpcSettingsDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DirectoryVpcSettingsDescriptionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(DirectoryVpcSettingsDescription directoryVpcSettingsDescription, StructuredJsonGenerator jsonGenerator) {

        if (directoryVpcSettingsDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (directoryVpcSettingsDescription.getVpcId() != null) {
                jsonGenerator.writeFieldName("VpcId").writeValue(directoryVpcSettingsDescription.getVpcId());
            }

            com.amazonaws.internal.SdkInternalList<String> subnetIdsList = (com.amazonaws.internal.SdkInternalList<String>) directoryVpcSettingsDescription
                    .getSubnetIds();
            if (!subnetIdsList.isEmpty() || !subnetIdsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("SubnetIds");
                jsonGenerator.writeStartArray();
                for (String subnetIdsListValue : subnetIdsList) {
                    if (subnetIdsListValue != null) {
                        jsonGenerator.writeValue(subnetIdsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (directoryVpcSettingsDescription.getSecurityGroupId() != null) {
                jsonGenerator.writeFieldName("SecurityGroupId").writeValue(directoryVpcSettingsDescription.getSecurityGroupId());
            }

            com.amazonaws.internal.SdkInternalList<String> availabilityZonesList = (com.amazonaws.internal.SdkInternalList<String>) directoryVpcSettingsDescription
                    .getAvailabilityZones();
            if (!availabilityZonesList.isEmpty() || !availabilityZonesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("AvailabilityZones");
                jsonGenerator.writeStartArray();
                for (String availabilityZonesListValue : availabilityZonesList) {
                    if (availabilityZonesListValue != null) {
                        jsonGenerator.writeValue(availabilityZonesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DirectoryVpcSettingsDescriptionJsonMarshaller instance;

    public static DirectoryVpcSettingsDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DirectoryVpcSettingsDescriptionJsonMarshaller();
        return instance;
    }

}
