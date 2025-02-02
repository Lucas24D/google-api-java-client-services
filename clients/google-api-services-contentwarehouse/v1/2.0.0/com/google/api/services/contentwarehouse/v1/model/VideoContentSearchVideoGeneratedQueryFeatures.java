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
 * Contains video level features for generated queries that are applied at the video level.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VideoContentSearchVideoGeneratedQueryFeatures extends com.google.api.client.json.GenericJson {

  /**
   * A description of why the video was removed. This is intended for debugging generated queries
   * that are filtered at the video level.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> filterReason;

  /**
   * The total number of passages that were input to generating queries for this video. This count
   * might be bigger than the total number of anchors in the video as some of the anchors might have
   * been filtered by the pipeline.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer prefilteredPassageCount;

  /**
   * Entity annotations for one of the mids representing the video title. This entity is either one
   * of the blocklisted entities if at least of the mentioned entities in the title belongs to the
   * blocklisted categories, or is the highest confidence entity for the title.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VideoContentSearchEntityAnnotations titleEntityAnnotations;

  /**
   * The total number of queries that belong to the blocklisted categories for this video.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer totalRestrictedQueries;

  /**
   * A description of why the video was removed. This is intended for debugging generated queries
   * that are filtered at the video level.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getFilterReason() {
    return filterReason;
  }

  /**
   * A description of why the video was removed. This is intended for debugging generated queries
   * that are filtered at the video level.
   * @param filterReason filterReason or {@code null} for none
   */
  public VideoContentSearchVideoGeneratedQueryFeatures setFilterReason(java.util.List<java.lang.String> filterReason) {
    this.filterReason = filterReason;
    return this;
  }

  /**
   * The total number of passages that were input to generating queries for this video. This count
   * might be bigger than the total number of anchors in the video as some of the anchors might have
   * been filtered by the pipeline.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPrefilteredPassageCount() {
    return prefilteredPassageCount;
  }

  /**
   * The total number of passages that were input to generating queries for this video. This count
   * might be bigger than the total number of anchors in the video as some of the anchors might have
   * been filtered by the pipeline.
   * @param prefilteredPassageCount prefilteredPassageCount or {@code null} for none
   */
  public VideoContentSearchVideoGeneratedQueryFeatures setPrefilteredPassageCount(java.lang.Integer prefilteredPassageCount) {
    this.prefilteredPassageCount = prefilteredPassageCount;
    return this;
  }

  /**
   * Entity annotations for one of the mids representing the video title. This entity is either one
   * of the blocklisted entities if at least of the mentioned entities in the title belongs to the
   * blocklisted categories, or is the highest confidence entity for the title.
   * @return value or {@code null} for none
   */
  public VideoContentSearchEntityAnnotations getTitleEntityAnnotations() {
    return titleEntityAnnotations;
  }

  /**
   * Entity annotations for one of the mids representing the video title. This entity is either one
   * of the blocklisted entities if at least of the mentioned entities in the title belongs to the
   * blocklisted categories, or is the highest confidence entity for the title.
   * @param titleEntityAnnotations titleEntityAnnotations or {@code null} for none
   */
  public VideoContentSearchVideoGeneratedQueryFeatures setTitleEntityAnnotations(VideoContentSearchEntityAnnotations titleEntityAnnotations) {
    this.titleEntityAnnotations = titleEntityAnnotations;
    return this;
  }

  /**
   * The total number of queries that belong to the blocklisted categories for this video.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTotalRestrictedQueries() {
    return totalRestrictedQueries;
  }

  /**
   * The total number of queries that belong to the blocklisted categories for this video.
   * @param totalRestrictedQueries totalRestrictedQueries or {@code null} for none
   */
  public VideoContentSearchVideoGeneratedQueryFeatures setTotalRestrictedQueries(java.lang.Integer totalRestrictedQueries) {
    this.totalRestrictedQueries = totalRestrictedQueries;
    return this;
  }

  @Override
  public VideoContentSearchVideoGeneratedQueryFeatures set(String fieldName, Object value) {
    return (VideoContentSearchVideoGeneratedQueryFeatures) super.set(fieldName, value);
  }

  @Override
  public VideoContentSearchVideoGeneratedQueryFeatures clone() {
    return (VideoContentSearchVideoGeneratedQueryFeatures) super.clone();
  }

}
