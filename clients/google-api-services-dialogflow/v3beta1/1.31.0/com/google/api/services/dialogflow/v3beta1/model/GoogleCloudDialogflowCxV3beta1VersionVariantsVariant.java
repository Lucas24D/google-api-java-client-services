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
 * A single flow version with specified traffic allocation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3beta1VersionVariantsVariant extends com.google.api.client.json.GenericJson {

  /**
   * Whether the variant is for the control group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isControlGroup;

  /**
   * Percentage of the traffic which should be routed to this version of flow. Traffic allocation
   * for a single flow must sum up to 1.0.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float trafficAllocation;

  /**
   * The name of the flow version. Format: `projects//locations//agents//flows//versions/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * Whether the variant is for the control group.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsControlGroup() {
    return isControlGroup;
  }

  /**
   * Whether the variant is for the control group.
   * @param isControlGroup isControlGroup or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1VersionVariantsVariant setIsControlGroup(java.lang.Boolean isControlGroup) {
    this.isControlGroup = isControlGroup;
    return this;
  }

  /**
   * Percentage of the traffic which should be routed to this version of flow. Traffic allocation
   * for a single flow must sum up to 1.0.
   * @return value or {@code null} for none
   */
  public java.lang.Float getTrafficAllocation() {
    return trafficAllocation;
  }

  /**
   * Percentage of the traffic which should be routed to this version of flow. Traffic allocation
   * for a single flow must sum up to 1.0.
   * @param trafficAllocation trafficAllocation or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1VersionVariantsVariant setTrafficAllocation(java.lang.Float trafficAllocation) {
    this.trafficAllocation = trafficAllocation;
    return this;
  }

  /**
   * The name of the flow version. Format: `projects//locations//agents//flows//versions/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * The name of the flow version. Format: `projects//locations//agents//flows//versions/`.
   * @param version version or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1VersionVariantsVariant setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1VersionVariantsVariant set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3beta1VersionVariantsVariant) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1VersionVariantsVariant clone() {
    return (GoogleCloudDialogflowCxV3beta1VersionVariantsVariant) super.clone();
  }

}