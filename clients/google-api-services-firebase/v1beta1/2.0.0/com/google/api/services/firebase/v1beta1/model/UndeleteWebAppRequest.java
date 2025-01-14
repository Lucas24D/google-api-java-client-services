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

package com.google.api.services.firebase.v1beta1.model;

/**
 * Model definition for UndeleteWebAppRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UndeleteWebAppRequest extends com.google.api.client.json.GenericJson {

  /**
   * Checksum provided in the WebApp entity, which if provided ensures the client has an up-to-date
   * value before proceeding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * If set to true, the request is only validated. The App will _not_ be undeleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean validateOnly;

  /**
   * Checksum provided in the WebApp entity, which if provided ensures the client has an up-to-date
   * value before proceeding.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Checksum provided in the WebApp entity, which if provided ensures the client has an up-to-date
   * value before proceeding.
   * @param etag etag or {@code null} for none
   */
  public UndeleteWebAppRequest setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * If set to true, the request is only validated. The App will _not_ be undeleted.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getValidateOnly() {
    return validateOnly;
  }

  /**
   * If set to true, the request is only validated. The App will _not_ be undeleted.
   * @param validateOnly validateOnly or {@code null} for none
   */
  public UndeleteWebAppRequest setValidateOnly(java.lang.Boolean validateOnly) {
    this.validateOnly = validateOnly;
    return this;
  }

  @Override
  public UndeleteWebAppRequest set(String fieldName, Object value) {
    return (UndeleteWebAppRequest) super.set(fieldName, value);
  }

  @Override
  public UndeleteWebAppRequest clone() {
    return (UndeleteWebAppRequest) super.clone();
  }

}
