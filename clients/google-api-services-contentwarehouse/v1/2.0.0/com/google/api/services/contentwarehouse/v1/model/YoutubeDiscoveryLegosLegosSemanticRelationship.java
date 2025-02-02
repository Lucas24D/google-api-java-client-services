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
 * Description of a semantic Legos annotation. http://go/legos/project.md#semantic-intent-
 * annotations
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class YoutubeDiscoveryLegosLegosSemanticRelationship extends com.google.api.client.json.GenericJson {

  /**
   * Confidence score. Thresholding at the confidence score at 0.XX yields annotations of precision
   * of at least XX%. Only filled in the intent definition Legos. Please use
   * IsSemanticAnnotationAtConfidenceThreshold() from
   * video/youtube/discovery/legos/annotations/public/legos_annotations_util.h to obtain only intent
   * definition Legos. For more information on the migration please look at go/legos-intent-
   * migration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float confidence;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<YoutubeDiscoveryLegosLegosSemanticRelationshipContext> contexts;

  /**
   * DEPRECATED. Please use confidence instead. Will be set to the same value as confidence in early
   * January 2019. See go/legos-intent-migration for more information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double topicalityScore;

  /**
   * Confidence score. Thresholding at the confidence score at 0.XX yields annotations of precision
   * of at least XX%. Only filled in the intent definition Legos. Please use
   * IsSemanticAnnotationAtConfidenceThreshold() from
   * video/youtube/discovery/legos/annotations/public/legos_annotations_util.h to obtain only intent
   * definition Legos. For more information on the migration please look at go/legos-intent-
   * migration.
   * @return value or {@code null} for none
   */
  public java.lang.Float getConfidence() {
    return confidence;
  }

  /**
   * Confidence score. Thresholding at the confidence score at 0.XX yields annotations of precision
   * of at least XX%. Only filled in the intent definition Legos. Please use
   * IsSemanticAnnotationAtConfidenceThreshold() from
   * video/youtube/discovery/legos/annotations/public/legos_annotations_util.h to obtain only intent
   * definition Legos. For more information on the migration please look at go/legos-intent-
   * migration.
   * @param confidence confidence or {@code null} for none
   */
  public YoutubeDiscoveryLegosLegosSemanticRelationship setConfidence(java.lang.Float confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<YoutubeDiscoveryLegosLegosSemanticRelationshipContext> getContexts() {
    return contexts;
  }

  /**
   * @param contexts contexts or {@code null} for none
   */
  public YoutubeDiscoveryLegosLegosSemanticRelationship setContexts(java.util.List<YoutubeDiscoveryLegosLegosSemanticRelationshipContext> contexts) {
    this.contexts = contexts;
    return this;
  }

  /**
   * DEPRECATED. Please use confidence instead. Will be set to the same value as confidence in early
   * January 2019. See go/legos-intent-migration for more information.
   * @return value or {@code null} for none
   */
  public java.lang.Double getTopicalityScore() {
    return topicalityScore;
  }

  /**
   * DEPRECATED. Please use confidence instead. Will be set to the same value as confidence in early
   * January 2019. See go/legos-intent-migration for more information.
   * @param topicalityScore topicalityScore or {@code null} for none
   */
  public YoutubeDiscoveryLegosLegosSemanticRelationship setTopicalityScore(java.lang.Double topicalityScore) {
    this.topicalityScore = topicalityScore;
    return this;
  }

  @Override
  public YoutubeDiscoveryLegosLegosSemanticRelationship set(String fieldName, Object value) {
    return (YoutubeDiscoveryLegosLegosSemanticRelationship) super.set(fieldName, value);
  }

  @Override
  public YoutubeDiscoveryLegosLegosSemanticRelationship clone() {
    return (YoutubeDiscoveryLegosLegosSemanticRelationship) super.clone();
  }

}
