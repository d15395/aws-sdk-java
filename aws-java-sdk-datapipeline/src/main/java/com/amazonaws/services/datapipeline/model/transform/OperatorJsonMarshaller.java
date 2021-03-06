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
package com.amazonaws.services.datapipeline.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.datapipeline.model.*;

import com.amazonaws.protocol.json.*;

/**
 * OperatorMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OperatorJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Operator operator, StructuredJsonGenerator jsonGenerator) {

        if (operator == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (operator.getType() != null) {
                jsonGenerator.writeFieldName("type").writeValue(operator.getType());
            }

            com.amazonaws.internal.SdkInternalList<String> valuesList = (com.amazonaws.internal.SdkInternalList<String>) operator.getValues();
            if (!valuesList.isEmpty() || !valuesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("values");
                jsonGenerator.writeStartArray();
                for (String valuesListValue : valuesList) {
                    if (valuesListValue != null) {
                        jsonGenerator.writeValue(valuesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static OperatorJsonMarshaller instance;

    public static OperatorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OperatorJsonMarshaller();
        return instance;
    }

}
