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
 * Device model capabilities override from client.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAssistantEmbeddedV1DeviceModelCapabilitiesOverride extends com.google.api.client.json.GenericJson {

  /**
   * Device model capabilities from client.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deviceModelCapabilities;

  /**
   * If present, overrides only fields specified in the mask. When doing so, selected message and
   * repeated fields will be replaced rather than merged. Performs a regular proto MergeFrom if no
   * mask is specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateMask;

  /**
   * Device model capabilities from client.
   * @see #decodeDeviceModelCapabilities()
   * @return value or {@code null} for none
   */
  public java.lang.String getDeviceModelCapabilities() {
    return deviceModelCapabilities;
  }

  /**
   * Device model capabilities from client.
   * @see #getDeviceModelCapabilities()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeDeviceModelCapabilities() {
    return com.google.api.client.util.Base64.decodeBase64(deviceModelCapabilities);
  }

  /**
   * Device model capabilities from client.
   * @see #encodeDeviceModelCapabilities()
   * @param deviceModelCapabilities deviceModelCapabilities or {@code null} for none
   */
  public GoogleAssistantEmbeddedV1DeviceModelCapabilitiesOverride setDeviceModelCapabilities(java.lang.String deviceModelCapabilities) {
    this.deviceModelCapabilities = deviceModelCapabilities;
    return this;
  }

  /**
   * Device model capabilities from client.
   * @see #setDeviceModelCapabilities()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GoogleAssistantEmbeddedV1DeviceModelCapabilitiesOverride encodeDeviceModelCapabilities(byte[] deviceModelCapabilities) {
    this.deviceModelCapabilities = com.google.api.client.util.Base64.encodeBase64URLSafeString(deviceModelCapabilities);
    return this;
  }

  /**
   * If present, overrides only fields specified in the mask. When doing so, selected message and
   * repeated fields will be replaced rather than merged. Performs a regular proto MergeFrom if no
   * mask is specified.
   * @return value or {@code null} for none
   */
  public String getUpdateMask() {
    return updateMask;
  }

  /**
   * If present, overrides only fields specified in the mask. When doing so, selected message and
   * repeated fields will be replaced rather than merged. Performs a regular proto MergeFrom if no
   * mask is specified.
   * @param updateMask updateMask or {@code null} for none
   */
  public GoogleAssistantEmbeddedV1DeviceModelCapabilitiesOverride setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  @Override
  public GoogleAssistantEmbeddedV1DeviceModelCapabilitiesOverride set(String fieldName, Object value) {
    return (GoogleAssistantEmbeddedV1DeviceModelCapabilitiesOverride) super.set(fieldName, value);
  }

  @Override
  public GoogleAssistantEmbeddedV1DeviceModelCapabilitiesOverride clone() {
    return (GoogleAssistantEmbeddedV1DeviceModelCapabilitiesOverride) super.clone();
  }

}
