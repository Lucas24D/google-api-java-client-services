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
 * This protocol buffer represents the association between a segment and a landmark feature. Notes:
 * - References to TYPE_SEGMENT features should always point to the even sibling. - Self-references
 * are allowed but the referencing segment's sibling is required to have a self-reference as well
 * (the above requirement to always reference the even sibling still applies).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GeostoreLandmarkReferenceProto extends com.google.api.client.json.GenericJson {

  /**
   * The type of the landmark feature. Allowed types: - TYPE_CARTOGRAPHIC e.g. a putting green or
   * water hazard - TYPE_COMPOUND e.g. - the Empire state building (TYPE_COMPOUND_BUILDING) - a park
   * (TYPE_COMPOUND_GROUNDS) - a section of a retail store (TYPE_COMPOUND_SECTION) -
   * TYPE_ESTABLISHMENT e.g. - the Eiffel Tower (TYPE_ESTABLISHMENT_BUILDING) - a sports field
   * (TYPE_ESTABLISHMENT_GROUNDS) - Starbucks (TYPE_ESTABLISHMENT_POI) - TYPE_INTERSECTION_GROUP
   * e.g. a major intersection - TYPE_NATURAL_FEATURE e.g. a river - TYPE_SEGMENT e.g. a bike trail
   * or train tracks
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer featureType;

  /**
   * The feature ID of the landmark feature.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GeostoreFeatureIdProto landmark;

  /**
   * The mode(s) of travel for which this landmark is useful.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> travelMode;

  /**
   * The type of the landmark feature. Allowed types: - TYPE_CARTOGRAPHIC e.g. a putting green or
   * water hazard - TYPE_COMPOUND e.g. - the Empire state building (TYPE_COMPOUND_BUILDING) - a park
   * (TYPE_COMPOUND_GROUNDS) - a section of a retail store (TYPE_COMPOUND_SECTION) -
   * TYPE_ESTABLISHMENT e.g. - the Eiffel Tower (TYPE_ESTABLISHMENT_BUILDING) - a sports field
   * (TYPE_ESTABLISHMENT_GROUNDS) - Starbucks (TYPE_ESTABLISHMENT_POI) - TYPE_INTERSECTION_GROUP
   * e.g. a major intersection - TYPE_NATURAL_FEATURE e.g. a river - TYPE_SEGMENT e.g. a bike trail
   * or train tracks
   * @return value or {@code null} for none
   */
  public java.lang.Integer getFeatureType() {
    return featureType;
  }

  /**
   * The type of the landmark feature. Allowed types: - TYPE_CARTOGRAPHIC e.g. a putting green or
   * water hazard - TYPE_COMPOUND e.g. - the Empire state building (TYPE_COMPOUND_BUILDING) - a park
   * (TYPE_COMPOUND_GROUNDS) - a section of a retail store (TYPE_COMPOUND_SECTION) -
   * TYPE_ESTABLISHMENT e.g. - the Eiffel Tower (TYPE_ESTABLISHMENT_BUILDING) - a sports field
   * (TYPE_ESTABLISHMENT_GROUNDS) - Starbucks (TYPE_ESTABLISHMENT_POI) - TYPE_INTERSECTION_GROUP
   * e.g. a major intersection - TYPE_NATURAL_FEATURE e.g. a river - TYPE_SEGMENT e.g. a bike trail
   * or train tracks
   * @param featureType featureType or {@code null} for none
   */
  public GeostoreLandmarkReferenceProto setFeatureType(java.lang.Integer featureType) {
    this.featureType = featureType;
    return this;
  }

  /**
   * The feature ID of the landmark feature.
   * @return value or {@code null} for none
   */
  public GeostoreFeatureIdProto getLandmark() {
    return landmark;
  }

  /**
   * The feature ID of the landmark feature.
   * @param landmark landmark or {@code null} for none
   */
  public GeostoreLandmarkReferenceProto setLandmark(GeostoreFeatureIdProto landmark) {
    this.landmark = landmark;
    return this;
  }

  /**
   * The mode(s) of travel for which this landmark is useful.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTravelMode() {
    return travelMode;
  }

  /**
   * The mode(s) of travel for which this landmark is useful.
   * @param travelMode travelMode or {@code null} for none
   */
  public GeostoreLandmarkReferenceProto setTravelMode(java.util.List<java.lang.String> travelMode) {
    this.travelMode = travelMode;
    return this;
  }

  @Override
  public GeostoreLandmarkReferenceProto set(String fieldName, Object value) {
    return (GeostoreLandmarkReferenceProto) super.set(fieldName, value);
  }

  @Override
  public GeostoreLandmarkReferenceProto clone() {
    return (GeostoreLandmarkReferenceProto) super.clone();
  }

}
