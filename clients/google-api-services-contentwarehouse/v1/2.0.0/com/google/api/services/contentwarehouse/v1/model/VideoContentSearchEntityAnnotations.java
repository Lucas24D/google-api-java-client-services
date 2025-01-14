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
 * Entity annotations for one of the mids representing an anchor label or a query text.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VideoContentSearchEntityAnnotations extends com.google.api.client.json.GenericJson {

  /**
   * The Webref category that this entity belongs to e.g. "/moka/software".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String category;

  /**
   * The overall confidence that this entity is annotated somewhere in the label.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float confidence;

  /**
   * Whether or not this entity belongs to a set of blocklisted categories.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isRestricted;

  /**
   * The Webref entity mid.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mid;

  /**
   * The Webref category that this entity belongs to e.g. "/moka/software".
   * @return value or {@code null} for none
   */
  public java.lang.String getCategory() {
    return category;
  }

  /**
   * The Webref category that this entity belongs to e.g. "/moka/software".
   * @param category category or {@code null} for none
   */
  public VideoContentSearchEntityAnnotations setCategory(java.lang.String category) {
    this.category = category;
    return this;
  }

  /**
   * The overall confidence that this entity is annotated somewhere in the label.
   * @return value or {@code null} for none
   */
  public java.lang.Float getConfidence() {
    return confidence;
  }

  /**
   * The overall confidence that this entity is annotated somewhere in the label.
   * @param confidence confidence or {@code null} for none
   */
  public VideoContentSearchEntityAnnotations setConfidence(java.lang.Float confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * Whether or not this entity belongs to a set of blocklisted categories.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsRestricted() {
    return isRestricted;
  }

  /**
   * Whether or not this entity belongs to a set of blocklisted categories.
   * @param isRestricted isRestricted or {@code null} for none
   */
  public VideoContentSearchEntityAnnotations setIsRestricted(java.lang.Boolean isRestricted) {
    this.isRestricted = isRestricted;
    return this;
  }

  /**
   * The Webref entity mid.
   * @return value or {@code null} for none
   */
  public java.lang.String getMid() {
    return mid;
  }

  /**
   * The Webref entity mid.
   * @param mid mid or {@code null} for none
   */
  public VideoContentSearchEntityAnnotations setMid(java.lang.String mid) {
    this.mid = mid;
    return this;
  }

  @Override
  public VideoContentSearchEntityAnnotations set(String fieldName, Object value) {
    return (VideoContentSearchEntityAnnotations) super.set(fieldName, value);
  }

  @Override
  public VideoContentSearchEntityAnnotations clone() {
    return (VideoContentSearchEntityAnnotations) super.clone();
  }

}
