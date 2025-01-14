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
 * Media device. Like, Chromecast, TV or Chirp. When emitted from the cast_device domain, you should
 * expect it to be one of 3 different forms: 1) Personal Device: The annotation comes from a device
 * we found in the user's home. device_id and name should be set, cast_device_type is set if device
 * type is mentioned in query. e.g. "Dima's Pineapple Chirp" device_id: FOOBAR name: "Dima's
 * Pineapple" cast_device_type: CHIRP 2) Common Device Name: The annotation comes from a model of
 * the common names of user's device. name and cast_device_type should be set but device_id will not
 * be. cast_device_type can be UNKNOWN. e.g. "John's Living Room" name: "John's Living Room"
 * cast_device_type: UNKNOWN 3) Device Type: The annotation comes from a model of common cast device
 * types. Only cast_device_type will be set. e.g. "TV" or "chromecast" cast_device_type: CHROMECAST
 * Next ID: 9
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NlpSemanticParsingModelsMediaCastDeviceAnnotation extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String castDeviceSource;

  /**
   * This field is populated when the user says [play X on $cast_device] and we know the type of
   * $cast_device but cannot identify the exact device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String castDeviceType;

  /**
   * The timestamp that the device is linked with the user in milliseconds. This is inherited from
   * the corresponding assistant DeviceSettings as is.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long creationTimestampMs;

  /**
   * DEPRECATED: Please use device_identifier instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deviceId;

  /**
   * The identification of the device. This field is populated when the user says [play X on
   * $device_name] and $device_name matches one of the devices linked to user's account. } oneof
   * Media Device
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AssistantApiCoreTypesDeviceId deviceIdentifier;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * This field is populated when the user metioned quantification in the query. E.g., "2" or "all".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NlpSemanticParsingModelsMediaQuantification quantification;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCastDeviceSource() {
    return castDeviceSource;
  }

  /**
   * @param castDeviceSource castDeviceSource or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaCastDeviceAnnotation setCastDeviceSource(java.lang.String castDeviceSource) {
    this.castDeviceSource = castDeviceSource;
    return this;
  }

  /**
   * This field is populated when the user says [play X on $cast_device] and we know the type of
   * $cast_device but cannot identify the exact device.
   * @return value or {@code null} for none
   */
  public java.lang.String getCastDeviceType() {
    return castDeviceType;
  }

  /**
   * This field is populated when the user says [play X on $cast_device] and we know the type of
   * $cast_device but cannot identify the exact device.
   * @param castDeviceType castDeviceType or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaCastDeviceAnnotation setCastDeviceType(java.lang.String castDeviceType) {
    this.castDeviceType = castDeviceType;
    return this;
  }

  /**
   * The timestamp that the device is linked with the user in milliseconds. This is inherited from
   * the corresponding assistant DeviceSettings as is.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCreationTimestampMs() {
    return creationTimestampMs;
  }

  /**
   * The timestamp that the device is linked with the user in milliseconds. This is inherited from
   * the corresponding assistant DeviceSettings as is.
   * @param creationTimestampMs creationTimestampMs or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaCastDeviceAnnotation setCreationTimestampMs(java.lang.Long creationTimestampMs) {
    this.creationTimestampMs = creationTimestampMs;
    return this;
  }

  /**
   * DEPRECATED: Please use device_identifier instead.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeviceId() {
    return deviceId;
  }

  /**
   * DEPRECATED: Please use device_identifier instead.
   * @param deviceId deviceId or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaCastDeviceAnnotation setDeviceId(java.lang.String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

  /**
   * The identification of the device. This field is populated when the user says [play X on
   * $device_name] and $device_name matches one of the devices linked to user's account. } oneof
   * Media Device
   * @return value or {@code null} for none
   */
  public AssistantApiCoreTypesDeviceId getDeviceIdentifier() {
    return deviceIdentifier;
  }

  /**
   * The identification of the device. This field is populated when the user says [play X on
   * $device_name] and $device_name matches one of the devices linked to user's account. } oneof
   * Media Device
   * @param deviceIdentifier deviceIdentifier or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaCastDeviceAnnotation setDeviceIdentifier(AssistantApiCoreTypesDeviceId deviceIdentifier) {
    this.deviceIdentifier = deviceIdentifier;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * @param name name or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaCastDeviceAnnotation setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * This field is populated when the user metioned quantification in the query. E.g., "2" or "all".
   * @return value or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaQuantification getQuantification() {
    return quantification;
  }

  /**
   * This field is populated when the user metioned quantification in the query. E.g., "2" or "all".
   * @param quantification quantification or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaCastDeviceAnnotation setQuantification(NlpSemanticParsingModelsMediaQuantification quantification) {
    this.quantification = quantification;
    return this;
  }

  @Override
  public NlpSemanticParsingModelsMediaCastDeviceAnnotation set(String fieldName, Object value) {
    return (NlpSemanticParsingModelsMediaCastDeviceAnnotation) super.set(fieldName, value);
  }

  @Override
  public NlpSemanticParsingModelsMediaCastDeviceAnnotation clone() {
    return (NlpSemanticParsingModelsMediaCastDeviceAnnotation) super.clone();
  }

}
