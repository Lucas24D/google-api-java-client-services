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
 * Options for Update operations.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudContentwarehouseV1UpdateOptions extends com.google.api.client.json.GenericJson {

  /**
   * Options for merging.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudContentwarehouseV1MergeFieldsOptions mergeFieldsOptions;

  /**
   * Field mask for merging Document fields. For the `FieldMask` definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateMask;

  /**
   * Type for update.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String updateType;

  /**
   * Options for merging.
   * @return value or {@code null} for none
   */
  public GoogleCloudContentwarehouseV1MergeFieldsOptions getMergeFieldsOptions() {
    return mergeFieldsOptions;
  }

  /**
   * Options for merging.
   * @param mergeFieldsOptions mergeFieldsOptions or {@code null} for none
   */
  public GoogleCloudContentwarehouseV1UpdateOptions setMergeFieldsOptions(GoogleCloudContentwarehouseV1MergeFieldsOptions mergeFieldsOptions) {
    this.mergeFieldsOptions = mergeFieldsOptions;
    return this;
  }

  /**
   * Field mask for merging Document fields. For the `FieldMask` definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * @return value or {@code null} for none
   */
  public String getUpdateMask() {
    return updateMask;
  }

  /**
   * Field mask for merging Document fields. For the `FieldMask` definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * @param updateMask updateMask or {@code null} for none
   */
  public GoogleCloudContentwarehouseV1UpdateOptions setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  /**
   * Type for update.
   * @return value or {@code null} for none
   */
  public java.lang.String getUpdateType() {
    return updateType;
  }

  /**
   * Type for update.
   * @param updateType updateType or {@code null} for none
   */
  public GoogleCloudContentwarehouseV1UpdateOptions setUpdateType(java.lang.String updateType) {
    this.updateType = updateType;
    return this;
  }

  @Override
  public GoogleCloudContentwarehouseV1UpdateOptions set(String fieldName, Object value) {
    return (GoogleCloudContentwarehouseV1UpdateOptions) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudContentwarehouseV1UpdateOptions clone() {
    return (GoogleCloudContentwarehouseV1UpdateOptions) super.clone();
  }

}
