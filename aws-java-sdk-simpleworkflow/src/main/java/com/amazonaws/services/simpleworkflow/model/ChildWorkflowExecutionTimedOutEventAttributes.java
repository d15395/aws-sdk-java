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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Provides details of the <code>ChildWorkflowExecutionTimedOut</code> event.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChildWorkflowExecutionTimedOutEventAttributes implements Serializable, Cloneable {

    /**
     * <p>
     * The child workflow execution that timed out.
     * </p>
     */
    private WorkflowExecution workflowExecution;
    /**
     * <p>
     * The type of the child workflow execution.
     * </p>
     */
    private WorkflowType workflowType;
    /**
     * <p>
     * The type of the timeout that caused the child workflow execution to time out.
     * </p>
     */
    private String timeoutType;
    /**
     * <p>
     * The ID of the <code>StartChildWorkflowExecutionInitiated</code> event corresponding to the
     * <code>StartChildWorkflowExecution</code> decision to start this child workflow execution. This information can be
     * useful for diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     */
    private Long initiatedEventId;
    /**
     * <p>
     * The ID of the <code>ChildWorkflowExecutionStarted</code> event recorded when this child workflow execution was
     * started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to
     * this event.
     * </p>
     */
    private Long startedEventId;

    /**
     * <p>
     * The child workflow execution that timed out.
     * </p>
     * 
     * @param workflowExecution
     *        The child workflow execution that timed out.
     */

    public void setWorkflowExecution(WorkflowExecution workflowExecution) {
        this.workflowExecution = workflowExecution;
    }

    /**
     * <p>
     * The child workflow execution that timed out.
     * </p>
     * 
     * @return The child workflow execution that timed out.
     */

    public WorkflowExecution getWorkflowExecution() {
        return this.workflowExecution;
    }

    /**
     * <p>
     * The child workflow execution that timed out.
     * </p>
     * 
     * @param workflowExecution
     *        The child workflow execution that timed out.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChildWorkflowExecutionTimedOutEventAttributes withWorkflowExecution(WorkflowExecution workflowExecution) {
        setWorkflowExecution(workflowExecution);
        return this;
    }

    /**
     * <p>
     * The type of the child workflow execution.
     * </p>
     * 
     * @param workflowType
     *        The type of the child workflow execution.
     */

    public void setWorkflowType(WorkflowType workflowType) {
        this.workflowType = workflowType;
    }

    /**
     * <p>
     * The type of the child workflow execution.
     * </p>
     * 
     * @return The type of the child workflow execution.
     */

    public WorkflowType getWorkflowType() {
        return this.workflowType;
    }

    /**
     * <p>
     * The type of the child workflow execution.
     * </p>
     * 
     * @param workflowType
     *        The type of the child workflow execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChildWorkflowExecutionTimedOutEventAttributes withWorkflowType(WorkflowType workflowType) {
        setWorkflowType(workflowType);
        return this;
    }

    /**
     * <p>
     * The type of the timeout that caused the child workflow execution to time out.
     * </p>
     * 
     * @param timeoutType
     *        The type of the timeout that caused the child workflow execution to time out.
     * @see WorkflowExecutionTimeoutType
     */

    public void setTimeoutType(String timeoutType) {
        this.timeoutType = timeoutType;
    }

    /**
     * <p>
     * The type of the timeout that caused the child workflow execution to time out.
     * </p>
     * 
     * @return The type of the timeout that caused the child workflow execution to time out.
     * @see WorkflowExecutionTimeoutType
     */

    public String getTimeoutType() {
        return this.timeoutType;
    }

    /**
     * <p>
     * The type of the timeout that caused the child workflow execution to time out.
     * </p>
     * 
     * @param timeoutType
     *        The type of the timeout that caused the child workflow execution to time out.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowExecutionTimeoutType
     */

    public ChildWorkflowExecutionTimedOutEventAttributes withTimeoutType(String timeoutType) {
        setTimeoutType(timeoutType);
        return this;
    }

    /**
     * <p>
     * The type of the timeout that caused the child workflow execution to time out.
     * </p>
     * 
     * @param timeoutType
     *        The type of the timeout that caused the child workflow execution to time out.
     * @see WorkflowExecutionTimeoutType
     */

    public void setTimeoutType(WorkflowExecutionTimeoutType timeoutType) {
        this.timeoutType = timeoutType.toString();
    }

    /**
     * <p>
     * The type of the timeout that caused the child workflow execution to time out.
     * </p>
     * 
     * @param timeoutType
     *        The type of the timeout that caused the child workflow execution to time out.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowExecutionTimeoutType
     */

    public ChildWorkflowExecutionTimedOutEventAttributes withTimeoutType(WorkflowExecutionTimeoutType timeoutType) {
        setTimeoutType(timeoutType);
        return this;
    }

    /**
     * <p>
     * The ID of the <code>StartChildWorkflowExecutionInitiated</code> event corresponding to the
     * <code>StartChildWorkflowExecution</code> decision to start this child workflow execution. This information can be
     * useful for diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @param initiatedEventId
     *        The ID of the <code>StartChildWorkflowExecutionInitiated</code> event corresponding to the
     *        <code>StartChildWorkflowExecution</code> decision to start this child workflow execution. This information
     *        can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
     */

    public void setInitiatedEventId(Long initiatedEventId) {
        this.initiatedEventId = initiatedEventId;
    }

    /**
     * <p>
     * The ID of the <code>StartChildWorkflowExecutionInitiated</code> event corresponding to the
     * <code>StartChildWorkflowExecution</code> decision to start this child workflow execution. This information can be
     * useful for diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @return The ID of the <code>StartChildWorkflowExecutionInitiated</code> event corresponding to the
     *         <code>StartChildWorkflowExecution</code> decision to start this child workflow execution. This
     *         information can be useful for diagnosing problems by tracing back the chain of events leading up to this
     *         event.
     */

    public Long getInitiatedEventId() {
        return this.initiatedEventId;
    }

    /**
     * <p>
     * The ID of the <code>StartChildWorkflowExecutionInitiated</code> event corresponding to the
     * <code>StartChildWorkflowExecution</code> decision to start this child workflow execution. This information can be
     * useful for diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @param initiatedEventId
     *        The ID of the <code>StartChildWorkflowExecutionInitiated</code> event corresponding to the
     *        <code>StartChildWorkflowExecution</code> decision to start this child workflow execution. This information
     *        can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChildWorkflowExecutionTimedOutEventAttributes withInitiatedEventId(Long initiatedEventId) {
        setInitiatedEventId(initiatedEventId);
        return this;
    }

    /**
     * <p>
     * The ID of the <code>ChildWorkflowExecutionStarted</code> event recorded when this child workflow execution was
     * started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to
     * this event.
     * </p>
     * 
     * @param startedEventId
     *        The ID of the <code>ChildWorkflowExecutionStarted</code> event recorded when this child workflow execution
     *        was started. This information can be useful for diagnosing problems by tracing back the chain of events
     *        leading up to this event.
     */

    public void setStartedEventId(Long startedEventId) {
        this.startedEventId = startedEventId;
    }

    /**
     * <p>
     * The ID of the <code>ChildWorkflowExecutionStarted</code> event recorded when this child workflow execution was
     * started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to
     * this event.
     * </p>
     * 
     * @return The ID of the <code>ChildWorkflowExecutionStarted</code> event recorded when this child workflow
     *         execution was started. This information can be useful for diagnosing problems by tracing back the chain
     *         of events leading up to this event.
     */

    public Long getStartedEventId() {
        return this.startedEventId;
    }

    /**
     * <p>
     * The ID of the <code>ChildWorkflowExecutionStarted</code> event recorded when this child workflow execution was
     * started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to
     * this event.
     * </p>
     * 
     * @param startedEventId
     *        The ID of the <code>ChildWorkflowExecutionStarted</code> event recorded when this child workflow execution
     *        was started. This information can be useful for diagnosing problems by tracing back the chain of events
     *        leading up to this event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChildWorkflowExecutionTimedOutEventAttributes withStartedEventId(Long startedEventId) {
        setStartedEventId(startedEventId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getWorkflowExecution() != null)
            sb.append("WorkflowExecution: ").append(getWorkflowExecution()).append(",");
        if (getWorkflowType() != null)
            sb.append("WorkflowType: ").append(getWorkflowType()).append(",");
        if (getTimeoutType() != null)
            sb.append("TimeoutType: ").append(getTimeoutType()).append(",");
        if (getInitiatedEventId() != null)
            sb.append("InitiatedEventId: ").append(getInitiatedEventId()).append(",");
        if (getStartedEventId() != null)
            sb.append("StartedEventId: ").append(getStartedEventId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChildWorkflowExecutionTimedOutEventAttributes == false)
            return false;
        ChildWorkflowExecutionTimedOutEventAttributes other = (ChildWorkflowExecutionTimedOutEventAttributes) obj;
        if (other.getWorkflowExecution() == null ^ this.getWorkflowExecution() == null)
            return false;
        if (other.getWorkflowExecution() != null && other.getWorkflowExecution().equals(this.getWorkflowExecution()) == false)
            return false;
        if (other.getWorkflowType() == null ^ this.getWorkflowType() == null)
            return false;
        if (other.getWorkflowType() != null && other.getWorkflowType().equals(this.getWorkflowType()) == false)
            return false;
        if (other.getTimeoutType() == null ^ this.getTimeoutType() == null)
            return false;
        if (other.getTimeoutType() != null && other.getTimeoutType().equals(this.getTimeoutType()) == false)
            return false;
        if (other.getInitiatedEventId() == null ^ this.getInitiatedEventId() == null)
            return false;
        if (other.getInitiatedEventId() != null && other.getInitiatedEventId().equals(this.getInitiatedEventId()) == false)
            return false;
        if (other.getStartedEventId() == null ^ this.getStartedEventId() == null)
            return false;
        if (other.getStartedEventId() != null && other.getStartedEventId().equals(this.getStartedEventId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkflowExecution() == null) ? 0 : getWorkflowExecution().hashCode());
        hashCode = prime * hashCode + ((getWorkflowType() == null) ? 0 : getWorkflowType().hashCode());
        hashCode = prime * hashCode + ((getTimeoutType() == null) ? 0 : getTimeoutType().hashCode());
        hashCode = prime * hashCode + ((getInitiatedEventId() == null) ? 0 : getInitiatedEventId().hashCode());
        hashCode = prime * hashCode + ((getStartedEventId() == null) ? 0 : getStartedEventId().hashCode());
        return hashCode;
    }

    @Override
    public ChildWorkflowExecutionTimedOutEventAttributes clone() {
        try {
            return (ChildWorkflowExecutionTimedOutEventAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
