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

package com.google.api.services.connectors.v1.model;

/**
 * Provider indicates the owner who provides the connectors.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Connectors API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Provider extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Created time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. Description of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Output only. Display name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Output only. Link to documentation page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String documentationUri;

  /**
   * Output only. Link to external page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String externalUri;

  /**
   * Output only. Resource labels to represent user-provided metadata. Refer to cloud documentation
   * on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Output only. Resource name of the Provider. Format:
   * projects/{project}/locations/{location}/providers/{provider}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Updated time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. Cloud storage location of icons etc consumed by UI.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String webAssetsLocation;

  /**
   * Output only. Created time.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Created time.
   * @param createTime createTime or {@code null} for none
   */
  public Provider setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. Description of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Output only. Description of the resource.
   * @param description description or {@code null} for none
   */
  public Provider setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Output only. Display name.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Output only. Display name.
   * @param displayName displayName or {@code null} for none
   */
  public Provider setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Output only. Link to documentation page.
   * @return value or {@code null} for none
   */
  public java.lang.String getDocumentationUri() {
    return documentationUri;
  }

  /**
   * Output only. Link to documentation page.
   * @param documentationUri documentationUri or {@code null} for none
   */
  public Provider setDocumentationUri(java.lang.String documentationUri) {
    this.documentationUri = documentationUri;
    return this;
  }

  /**
   * Output only. Link to external page.
   * @return value or {@code null} for none
   */
  public java.lang.String getExternalUri() {
    return externalUri;
  }

  /**
   * Output only. Link to external page.
   * @param externalUri externalUri or {@code null} for none
   */
  public Provider setExternalUri(java.lang.String externalUri) {
    this.externalUri = externalUri;
    return this;
  }

  /**
   * Output only. Resource labels to represent user-provided metadata. Refer to cloud documentation
   * on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Output only. Resource labels to represent user-provided metadata. Refer to cloud documentation
   * on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
   * @param labels labels or {@code null} for none
   */
  public Provider setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Output only. Resource name of the Provider. Format:
   * projects/{project}/locations/{location}/providers/{provider}
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Resource name of the Provider. Format:
   * projects/{project}/locations/{location}/providers/{provider}
   * @param name name or {@code null} for none
   */
  public Provider setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Updated time.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Updated time.
   * @param updateTime updateTime or {@code null} for none
   */
  public Provider setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Output only. Cloud storage location of icons etc consumed by UI.
   * @return value or {@code null} for none
   */
  public java.lang.String getWebAssetsLocation() {
    return webAssetsLocation;
  }

  /**
   * Output only. Cloud storage location of icons etc consumed by UI.
   * @param webAssetsLocation webAssetsLocation or {@code null} for none
   */
  public Provider setWebAssetsLocation(java.lang.String webAssetsLocation) {
    this.webAssetsLocation = webAssetsLocation;
    return this;
  }

  @Override
  public Provider set(String fieldName, Object value) {
    return (Provider) super.set(fieldName, value);
  }

  @Override
  public Provider clone() {
    return (Provider) super.clone();
  }

}