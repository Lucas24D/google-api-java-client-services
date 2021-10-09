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

package com.google.api.services.dialogflow.v2.model;

/**
 * By default, your agent responds to a matched intent with a static response. As an alternative,
 * you can provide a more dynamic response by using fulfillment. When you enable fulfillment for an
 * intent, Dialogflow responds to that intent by calling a service that you define. For example, if
 * an end-user wants to schedule a haircut on Friday, your service can check your database and
 * respond to the end-user with availability information for Friday. For more information, see the
 * [fulfillment guide](https://cloud.google.com/dialogflow/docs/fulfillment-overview).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2Fulfillment extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The human-readable name of the fulfillment, unique within the agent. This field is
   * not used for Fulfillment in an Environment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Optional. Whether fulfillment is enabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enabled;

  /**
   * Optional. The field defines whether the fulfillment is enabled for certain features.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowV2FulfillmentFeature> features;

  /**
   * Configuration for a generic web service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2FulfillmentGenericWebService genericWebService;

  /**
   * Required. The unique identifier of the fulfillment. Supported formats: -
   * `projects//agent/fulfillment` - `projects//locations//agent/fulfillment` This field is not used
   * for Fulfillment in an Environment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. The human-readable name of the fulfillment, unique within the agent. This field is
   * not used for Fulfillment in an Environment.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Optional. The human-readable name of the fulfillment, unique within the agent. This field is
   * not used for Fulfillment in an Environment.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudDialogflowV2Fulfillment setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Optional. Whether fulfillment is enabled.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnabled() {
    return enabled;
  }

  /**
   * Optional. Whether fulfillment is enabled.
   * @param enabled enabled or {@code null} for none
   */
  public GoogleCloudDialogflowV2Fulfillment setEnabled(java.lang.Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Optional. The field defines whether the fulfillment is enabled for certain features.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowV2FulfillmentFeature> getFeatures() {
    return features;
  }

  /**
   * Optional. The field defines whether the fulfillment is enabled for certain features.
   * @param features features or {@code null} for none
   */
  public GoogleCloudDialogflowV2Fulfillment setFeatures(java.util.List<GoogleCloudDialogflowV2FulfillmentFeature> features) {
    this.features = features;
    return this;
  }

  /**
   * Configuration for a generic web service.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2FulfillmentGenericWebService getGenericWebService() {
    return genericWebService;
  }

  /**
   * Configuration for a generic web service.
   * @param genericWebService genericWebService or {@code null} for none
   */
  public GoogleCloudDialogflowV2Fulfillment setGenericWebService(GoogleCloudDialogflowV2FulfillmentGenericWebService genericWebService) {
    this.genericWebService = genericWebService;
    return this;
  }

  /**
   * Required. The unique identifier of the fulfillment. Supported formats: -
   * `projects//agent/fulfillment` - `projects//locations//agent/fulfillment` This field is not used
   * for Fulfillment in an Environment.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. The unique identifier of the fulfillment. Supported formats: -
   * `projects//agent/fulfillment` - `projects//locations//agent/fulfillment` This field is not used
   * for Fulfillment in an Environment.
   * @param name name or {@code null} for none
   */
  public GoogleCloudDialogflowV2Fulfillment setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2Fulfillment set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2Fulfillment) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2Fulfillment clone() {
    return (GoogleCloudDialogflowV2Fulfillment) super.clone();
  }

}