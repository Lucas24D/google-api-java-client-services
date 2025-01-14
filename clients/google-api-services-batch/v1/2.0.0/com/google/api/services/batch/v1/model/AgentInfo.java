/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.batch.v1.model;

/**
 * VM Agent Info.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Batch API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AgentInfo extends com.google.api.client.json.GenericJson {

  /**
   * The assigned Job ID
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String jobId;

  /**
   * When the AgentInfo is generated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String reportTime;

  /**
   * Agent state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The assigned task group ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String taskGroupId;

  /**
   * Task Info.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AgentTaskInfo> tasks;

  /**
   * The assigned Job ID
   * @return value or {@code null} for none
   */
  public java.lang.String getJobId() {
    return jobId;
  }

  /**
   * The assigned Job ID
   * @param jobId jobId or {@code null} for none
   */
  public AgentInfo setJobId(java.lang.String jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * When the AgentInfo is generated.
   * @return value or {@code null} for none
   */
  public String getReportTime() {
    return reportTime;
  }

  /**
   * When the AgentInfo is generated.
   * @param reportTime reportTime or {@code null} for none
   */
  public AgentInfo setReportTime(String reportTime) {
    this.reportTime = reportTime;
    return this;
  }

  /**
   * Agent state.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Agent state.
   * @param state state or {@code null} for none
   */
  public AgentInfo setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * The assigned task group ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getTaskGroupId() {
    return taskGroupId;
  }

  /**
   * The assigned task group ID.
   * @param taskGroupId taskGroupId or {@code null} for none
   */
  public AgentInfo setTaskGroupId(java.lang.String taskGroupId) {
    this.taskGroupId = taskGroupId;
    return this;
  }

  /**
   * Task Info.
   * @return value or {@code null} for none
   */
  public java.util.List<AgentTaskInfo> getTasks() {
    return tasks;
  }

  /**
   * Task Info.
   * @param tasks tasks or {@code null} for none
   */
  public AgentInfo setTasks(java.util.List<AgentTaskInfo> tasks) {
    this.tasks = tasks;
    return this;
  }

  @Override
  public AgentInfo set(String fieldName, Object value) {
    return (AgentInfo) super.set(fieldName, value);
  }

  @Override
  public AgentInfo clone() {
    return (AgentInfo) super.clone();
  }

}
