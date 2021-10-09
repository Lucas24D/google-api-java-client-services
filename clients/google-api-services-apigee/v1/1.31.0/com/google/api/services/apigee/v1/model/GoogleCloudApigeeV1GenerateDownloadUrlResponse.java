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
 * Response for GenerateDownloadUrl method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1GenerateDownloadUrlResponse extends com.google.api.client.json.GenericJson {

  /**
   * The Google Cloud Storage signed URL that can be used to download the Archive zip file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String downloadUri;

  /**
   * The Google Cloud Storage signed URL that can be used to download the Archive zip file.
   * @return value or {@code null} for none
   */
  public java.lang.String getDownloadUri() {
    return downloadUri;
  }

  /**
   * The Google Cloud Storage signed URL that can be used to download the Archive zip file.
   * @param downloadUri downloadUri or {@code null} for none
   */
  public GoogleCloudApigeeV1GenerateDownloadUrlResponse setDownloadUri(java.lang.String downloadUri) {
    this.downloadUri = downloadUri;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1GenerateDownloadUrlResponse set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1GenerateDownloadUrlResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1GenerateDownloadUrlResponse clone() {
    return (GoogleCloudApigeeV1GenerateDownloadUrlResponse) super.clone();
  }

}