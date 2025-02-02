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

package com.google.api.services.contentwarehouse.v1.model;

/**
 * A summary of the reasons that we chose a certain target device.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AssistantLogsMediaDeviceSelectionDecisionSummary extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deviceSelectionPreferenceUsed;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deviceSelectionReason;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> miscSelectionSignal;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDeviceSelectionPreferenceUsed() {
    return deviceSelectionPreferenceUsed;
  }

  /**
   * @param deviceSelectionPreferenceUsed deviceSelectionPreferenceUsed or {@code null} for none
   */
  public AssistantLogsMediaDeviceSelectionDecisionSummary setDeviceSelectionPreferenceUsed(java.lang.String deviceSelectionPreferenceUsed) {
    this.deviceSelectionPreferenceUsed = deviceSelectionPreferenceUsed;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDeviceSelectionReason() {
    return deviceSelectionReason;
  }

  /**
   * @param deviceSelectionReason deviceSelectionReason or {@code null} for none
   */
  public AssistantLogsMediaDeviceSelectionDecisionSummary setDeviceSelectionReason(java.lang.String deviceSelectionReason) {
    this.deviceSelectionReason = deviceSelectionReason;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getMiscSelectionSignal() {
    return miscSelectionSignal;
  }

  /**
   * @param miscSelectionSignal miscSelectionSignal or {@code null} for none
   */
  public AssistantLogsMediaDeviceSelectionDecisionSummary setMiscSelectionSignal(java.util.List<java.lang.String> miscSelectionSignal) {
    this.miscSelectionSignal = miscSelectionSignal;
    return this;
  }

  @Override
  public AssistantLogsMediaDeviceSelectionDecisionSummary set(String fieldName, Object value) {
    return (AssistantLogsMediaDeviceSelectionDecisionSummary) super.set(fieldName, value);
  }

  @Override
  public AssistantLogsMediaDeviceSelectionDecisionSummary clone() {
    return (AssistantLogsMediaDeviceSelectionDecisionSummary) super.clone();
  }

}
