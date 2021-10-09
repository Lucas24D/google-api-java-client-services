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

package com.google.api.services.dialogflow.v3beta1.model;

/**
 * Transition coverage represents the percentage of all possible page transitions (page-level
 * transition routes and event handlers, excluding transition route groups) present within any of a
 * parent's test cases.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3beta1TransitionCoverage extends com.google.api.client.json.GenericJson {

  /**
   * The percent of transitions in the agent that are covered.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float coverageScore;

  /**
   * The list of Transitions present in the agent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowCxV3beta1TransitionCoverageTransition> transitions;

  /**
   * The percent of transitions in the agent that are covered.
   * @return value or {@code null} for none
   */
  public java.lang.Float getCoverageScore() {
    return coverageScore;
  }

  /**
   * The percent of transitions in the agent that are covered.
   * @param coverageScore coverageScore or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1TransitionCoverage setCoverageScore(java.lang.Float coverageScore) {
    this.coverageScore = coverageScore;
    return this;
  }

  /**
   * The list of Transitions present in the agent.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowCxV3beta1TransitionCoverageTransition> getTransitions() {
    return transitions;
  }

  /**
   * The list of Transitions present in the agent.
   * @param transitions transitions or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1TransitionCoverage setTransitions(java.util.List<GoogleCloudDialogflowCxV3beta1TransitionCoverageTransition> transitions) {
    this.transitions = transitions;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1TransitionCoverage set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3beta1TransitionCoverage) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1TransitionCoverage clone() {
    return (GoogleCloudDialogflowCxV3beta1TransitionCoverage) super.clone();
  }

}