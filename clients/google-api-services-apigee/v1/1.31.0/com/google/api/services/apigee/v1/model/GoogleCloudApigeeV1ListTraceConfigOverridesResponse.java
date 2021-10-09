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

package com.google.api.services.apigee.v1.model;

/**
 * Response for ListTraceConfigOverrides.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1ListTraceConfigOverridesResponse extends com.google.api.client.json.GenericJson {

  /**
   * Token value that can be passed as `page_token` to retrieve the next page of content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * List all trace configuration overrides in an environment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudApigeeV1TraceConfigOverride> traceConfigOverrides;

  /**
   * Token value that can be passed as `page_token` to retrieve the next page of content.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Token value that can be passed as `page_token` to retrieve the next page of content.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleCloudApigeeV1ListTraceConfigOverridesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * List all trace configuration overrides in an environment.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudApigeeV1TraceConfigOverride> getTraceConfigOverrides() {
    return traceConfigOverrides;
  }

  /**
   * List all trace configuration overrides in an environment.
   * @param traceConfigOverrides traceConfigOverrides or {@code null} for none
   */
  public GoogleCloudApigeeV1ListTraceConfigOverridesResponse setTraceConfigOverrides(java.util.List<GoogleCloudApigeeV1TraceConfigOverride> traceConfigOverrides) {
    this.traceConfigOverrides = traceConfigOverrides;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1ListTraceConfigOverridesResponse set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1ListTraceConfigOverridesResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1ListTraceConfigOverridesResponse clone() {
    return (GoogleCloudApigeeV1ListTraceConfigOverridesResponse) super.clone();
  }

}