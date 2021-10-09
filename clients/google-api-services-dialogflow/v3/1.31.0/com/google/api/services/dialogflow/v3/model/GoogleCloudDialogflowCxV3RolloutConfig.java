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

package com.google.api.services.dialogflow.v3.model;

/**
 * The configuration for auto rollout.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3RolloutConfig extends com.google.api.client.json.GenericJson {

  /**
   * The conditions that are used to evaluate the failure of a rollout step. If not specified, no
   * rollout steps will fail. E.g. "containment_rate < 10% OR average_turn_count < 3". See the
   * [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String failureCondition;

  /**
   * The conditions that are used to evaluate the success of a rollout step. If not specified, all
   * rollout steps will proceed to the next one unless failure conditions are met. E.g.
   * "containment_rate > 60% AND callback_rate < 20%". See the [conditions
   * reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rolloutCondition;

  /**
   * Steps to roll out a flow version. Steps should be sorted by percentage in ascending order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowCxV3RolloutConfigRolloutStep> rolloutSteps;

  /**
   * The conditions that are used to evaluate the failure of a rollout step. If not specified, no
   * rollout steps will fail. E.g. "containment_rate < 10% OR average_turn_count < 3". See the
   * [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
   * @return value or {@code null} for none
   */
  public java.lang.String getFailureCondition() {
    return failureCondition;
  }

  /**
   * The conditions that are used to evaluate the failure of a rollout step. If not specified, no
   * rollout steps will fail. E.g. "containment_rate < 10% OR average_turn_count < 3". See the
   * [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
   * @param failureCondition failureCondition or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3RolloutConfig setFailureCondition(java.lang.String failureCondition) {
    this.failureCondition = failureCondition;
    return this;
  }

  /**
   * The conditions that are used to evaluate the success of a rollout step. If not specified, all
   * rollout steps will proceed to the next one unless failure conditions are met. E.g.
   * "containment_rate > 60% AND callback_rate < 20%". See the [conditions
   * reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
   * @return value or {@code null} for none
   */
  public java.lang.String getRolloutCondition() {
    return rolloutCondition;
  }

  /**
   * The conditions that are used to evaluate the success of a rollout step. If not specified, all
   * rollout steps will proceed to the next one unless failure conditions are met. E.g.
   * "containment_rate > 60% AND callback_rate < 20%". See the [conditions
   * reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
   * @param rolloutCondition rolloutCondition or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3RolloutConfig setRolloutCondition(java.lang.String rolloutCondition) {
    this.rolloutCondition = rolloutCondition;
    return this;
  }

  /**
   * Steps to roll out a flow version. Steps should be sorted by percentage in ascending order.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowCxV3RolloutConfigRolloutStep> getRolloutSteps() {
    return rolloutSteps;
  }

  /**
   * Steps to roll out a flow version. Steps should be sorted by percentage in ascending order.
   * @param rolloutSteps rolloutSteps or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3RolloutConfig setRolloutSteps(java.util.List<GoogleCloudDialogflowCxV3RolloutConfigRolloutStep> rolloutSteps) {
    this.rolloutSteps = rolloutSteps;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3RolloutConfig set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3RolloutConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3RolloutConfig clone() {
    return (GoogleCloudDialogflowCxV3RolloutConfig) super.clone();
  }

}