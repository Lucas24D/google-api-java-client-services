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
 * GeoTopicality of a document is a set of GeoTopics ordered by their normalized scores.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RepositoryAnnotationsGeoTopic extends com.google.api.client.json.GenericJson {

  /**
   * Stores parent/container information containing city, province & country.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GeostoreAddressProto address;

  /**
   * The raw scores used to calculate the normalized_score. Note that not all these scores may be
   * exposed to the users.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<RepositoryAnnotationsGeoTopicalityScore> componentScores;

  /**
   * A score [0, 1] indicating the confidence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float confidence;

  /**
   * Is this a dense city (e.g., population > 100k)?
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean denseCity;

  /**
   * Sub type for POI types like ESTABLISHMENT_POI, ESTABLISHMENT_GROUNDS & ESTABLISHMENT_BUILDING
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer establishmentType;

  /**
   * Latitude and Longitude of the location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long latE7;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long lngE7;

  /**
   * Name of the Geographic location. This is the normalized name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String locationName;

  /**
   * A score [0, 1] indicating the likelihood of the location being the GeoTopicality.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float normalizedScore;

  /**
   * Oyster Feature ID of the location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GeostoreFeatureIdProto oysterId;

  /**
   * Oyster Feature Type
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer oysterType;

  /**
   * The sum of the normalized scores of POIs contained within a particular locality.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float sumContainedPoiNormalizedScores;

  /**
   * Stores parent/container information containing city, province & country.
   * @return value or {@code null} for none
   */
  public GeostoreAddressProto getAddress() {
    return address;
  }

  /**
   * Stores parent/container information containing city, province & country.
   * @param address address or {@code null} for none
   */
  public RepositoryAnnotationsGeoTopic setAddress(GeostoreAddressProto address) {
    this.address = address;
    return this;
  }

  /**
   * The raw scores used to calculate the normalized_score. Note that not all these scores may be
   * exposed to the users.
   * @return value or {@code null} for none
   */
  public java.util.List<RepositoryAnnotationsGeoTopicalityScore> getComponentScores() {
    return componentScores;
  }

  /**
   * The raw scores used to calculate the normalized_score. Note that not all these scores may be
   * exposed to the users.
   * @param componentScores componentScores or {@code null} for none
   */
  public RepositoryAnnotationsGeoTopic setComponentScores(java.util.List<RepositoryAnnotationsGeoTopicalityScore> componentScores) {
    this.componentScores = componentScores;
    return this;
  }

  /**
   * A score [0, 1] indicating the confidence.
   * @return value or {@code null} for none
   */
  public java.lang.Float getConfidence() {
    return confidence;
  }

  /**
   * A score [0, 1] indicating the confidence.
   * @param confidence confidence or {@code null} for none
   */
  public RepositoryAnnotationsGeoTopic setConfidence(java.lang.Float confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * Is this a dense city (e.g., population > 100k)?
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDenseCity() {
    return denseCity;
  }

  /**
   * Is this a dense city (e.g., population > 100k)?
   * @param denseCity denseCity or {@code null} for none
   */
  public RepositoryAnnotationsGeoTopic setDenseCity(java.lang.Boolean denseCity) {
    this.denseCity = denseCity;
    return this;
  }

  /**
   * Sub type for POI types like ESTABLISHMENT_POI, ESTABLISHMENT_GROUNDS & ESTABLISHMENT_BUILDING
   * @return value or {@code null} for none
   */
  public java.lang.Integer getEstablishmentType() {
    return establishmentType;
  }

  /**
   * Sub type for POI types like ESTABLISHMENT_POI, ESTABLISHMENT_GROUNDS & ESTABLISHMENT_BUILDING
   * @param establishmentType establishmentType or {@code null} for none
   */
  public RepositoryAnnotationsGeoTopic setEstablishmentType(java.lang.Integer establishmentType) {
    this.establishmentType = establishmentType;
    return this;
  }

  /**
   * Latitude and Longitude of the location.
   * @return value or {@code null} for none
   */
  public java.lang.Long getLatE7() {
    return latE7;
  }

  /**
   * Latitude and Longitude of the location.
   * @param latE7 latE7 or {@code null} for none
   */
  public RepositoryAnnotationsGeoTopic setLatE7(java.lang.Long latE7) {
    this.latE7 = latE7;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getLngE7() {
    return lngE7;
  }

  /**
   * @param lngE7 lngE7 or {@code null} for none
   */
  public RepositoryAnnotationsGeoTopic setLngE7(java.lang.Long lngE7) {
    this.lngE7 = lngE7;
    return this;
  }

  /**
   * Name of the Geographic location. This is the normalized name.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocationName() {
    return locationName;
  }

  /**
   * Name of the Geographic location. This is the normalized name.
   * @param locationName locationName or {@code null} for none
   */
  public RepositoryAnnotationsGeoTopic setLocationName(java.lang.String locationName) {
    this.locationName = locationName;
    return this;
  }

  /**
   * A score [0, 1] indicating the likelihood of the location being the GeoTopicality.
   * @return value or {@code null} for none
   */
  public java.lang.Float getNormalizedScore() {
    return normalizedScore;
  }

  /**
   * A score [0, 1] indicating the likelihood of the location being the GeoTopicality.
   * @param normalizedScore normalizedScore or {@code null} for none
   */
  public RepositoryAnnotationsGeoTopic setNormalizedScore(java.lang.Float normalizedScore) {
    this.normalizedScore = normalizedScore;
    return this;
  }

  /**
   * Oyster Feature ID of the location.
   * @return value or {@code null} for none
   */
  public GeostoreFeatureIdProto getOysterId() {
    return oysterId;
  }

  /**
   * Oyster Feature ID of the location.
   * @param oysterId oysterId or {@code null} for none
   */
  public RepositoryAnnotationsGeoTopic setOysterId(GeostoreFeatureIdProto oysterId) {
    this.oysterId = oysterId;
    return this;
  }

  /**
   * Oyster Feature Type
   * @return value or {@code null} for none
   */
  public java.lang.Integer getOysterType() {
    return oysterType;
  }

  /**
   * Oyster Feature Type
   * @param oysterType oysterType or {@code null} for none
   */
  public RepositoryAnnotationsGeoTopic setOysterType(java.lang.Integer oysterType) {
    this.oysterType = oysterType;
    return this;
  }

  /**
   * The sum of the normalized scores of POIs contained within a particular locality.
   * @return value or {@code null} for none
   */
  public java.lang.Float getSumContainedPoiNormalizedScores() {
    return sumContainedPoiNormalizedScores;
  }

  /**
   * The sum of the normalized scores of POIs contained within a particular locality.
   * @param sumContainedPoiNormalizedScores sumContainedPoiNormalizedScores or {@code null} for none
   */
  public RepositoryAnnotationsGeoTopic setSumContainedPoiNormalizedScores(java.lang.Float sumContainedPoiNormalizedScores) {
    this.sumContainedPoiNormalizedScores = sumContainedPoiNormalizedScores;
    return this;
  }

  @Override
  public RepositoryAnnotationsGeoTopic set(String fieldName, Object value) {
    return (RepositoryAnnotationsGeoTopic) super.set(fieldName, value);
  }

  @Override
  public RepositoryAnnotationsGeoTopic clone() {
    return (RepositoryAnnotationsGeoTopic) super.clone();
  }

}
