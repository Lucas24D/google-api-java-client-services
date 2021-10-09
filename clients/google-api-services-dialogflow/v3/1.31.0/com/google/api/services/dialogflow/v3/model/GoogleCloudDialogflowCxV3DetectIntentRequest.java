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
 * The request to detect user's intent.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3DetectIntentRequest extends com.google.api.client.json.GenericJson {

  /**
   * Instructs the speech synthesizer how to generate the output audio.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3OutputAudioConfig outputAudioConfig;

  /**
   * Required. The input specification.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3QueryInput queryInput;

  /**
   * The parameters of this query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3QueryParameters queryParams;

  /**
   * Instructs the speech synthesizer how to generate the output audio.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3OutputAudioConfig getOutputAudioConfig() {
    return outputAudioConfig;
  }

  /**
   * Instructs the speech synthesizer how to generate the output audio.
   * @param outputAudioConfig outputAudioConfig or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3DetectIntentRequest setOutputAudioConfig(GoogleCloudDialogflowCxV3OutputAudioConfig outputAudioConfig) {
    this.outputAudioConfig = outputAudioConfig;
    return this;
  }

  /**
   * Required. The input specification.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3QueryInput getQueryInput() {
    return queryInput;
  }

  /**
   * Required. The input specification.
   * @param queryInput queryInput or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3DetectIntentRequest setQueryInput(GoogleCloudDialogflowCxV3QueryInput queryInput) {
    this.queryInput = queryInput;
    return this;
  }

  /**
   * The parameters of this query.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3QueryParameters getQueryParams() {
    return queryParams;
  }

  /**
   * The parameters of this query.
   * @param queryParams queryParams or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3DetectIntentRequest setQueryParams(GoogleCloudDialogflowCxV3QueryParameters queryParams) {
    this.queryParams = queryParams;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3DetectIntentRequest set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3DetectIntentRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3DetectIntentRequest clone() {
    return (GoogleCloudDialogflowCxV3DetectIntentRequest) super.clone();
  }

}