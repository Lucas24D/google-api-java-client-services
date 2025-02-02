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
 * Per-vertical part. Next available tag: 19
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RepositoryWebrefMdvcMetadataPerVertical extends com.google.api.client.json.GenericJson {

  /**
   * Concept ids compatible with this topic: specializations and/or ones having this concept as a
   * dimension. Always includes the topic itself.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.List<java.math.BigInteger> compatibleIds;

  /**
   * Concept ids of the dimension values of this topic.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.List<java.math.BigInteger> dimensionIds;

  /**
   * Concept ids to annotate whenever this entity is annotated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.List<java.math.BigInteger> expandedOutputIds;

  /**
   * Concept ids of the generalizations of this topic.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.List<java.math.BigInteger> generalizationIds;

  /**
   * True if the topic is considered a "core topic" for the vertical.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isCore;

  /**
   * If true, the entity is a dimension for some entities in the vertical.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isDimension;

  /**
   * If true, the entity is a generalization for some entities in the vertical.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isGeneralization;

  /**
   * Resolution priority for this entity. If there are many possible resolutions to a MDVC
   * understanding, only the ones with the highest priority are annotated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer resolutionPriority;

  /**
   * Fingerprints that identify the topic's sub-verticals, if any.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.List<java.math.BigInteger> subVerticalFp;

  /**
   * Name of the vertical this message is about.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String verticalName;

  /**
   * Concept ids compatible with this topic: specializations and/or ones having this concept as a
   * dimension. Always includes the topic itself.
   * @return value or {@code null} for none
   */
  public java.util.List<java.math.BigInteger> getCompatibleIds() {
    return compatibleIds;
  }

  /**
   * Concept ids compatible with this topic: specializations and/or ones having this concept as a
   * dimension. Always includes the topic itself.
   * @param compatibleIds compatibleIds or {@code null} for none
   */
  public RepositoryWebrefMdvcMetadataPerVertical setCompatibleIds(java.util.List<java.math.BigInteger> compatibleIds) {
    this.compatibleIds = compatibleIds;
    return this;
  }

  /**
   * Concept ids of the dimension values of this topic.
   * @return value or {@code null} for none
   */
  public java.util.List<java.math.BigInteger> getDimensionIds() {
    return dimensionIds;
  }

  /**
   * Concept ids of the dimension values of this topic.
   * @param dimensionIds dimensionIds or {@code null} for none
   */
  public RepositoryWebrefMdvcMetadataPerVertical setDimensionIds(java.util.List<java.math.BigInteger> dimensionIds) {
    this.dimensionIds = dimensionIds;
    return this;
  }

  /**
   * Concept ids to annotate whenever this entity is annotated.
   * @return value or {@code null} for none
   */
  public java.util.List<java.math.BigInteger> getExpandedOutputIds() {
    return expandedOutputIds;
  }

  /**
   * Concept ids to annotate whenever this entity is annotated.
   * @param expandedOutputIds expandedOutputIds or {@code null} for none
   */
  public RepositoryWebrefMdvcMetadataPerVertical setExpandedOutputIds(java.util.List<java.math.BigInteger> expandedOutputIds) {
    this.expandedOutputIds = expandedOutputIds;
    return this;
  }

  /**
   * Concept ids of the generalizations of this topic.
   * @return value or {@code null} for none
   */
  public java.util.List<java.math.BigInteger> getGeneralizationIds() {
    return generalizationIds;
  }

  /**
   * Concept ids of the generalizations of this topic.
   * @param generalizationIds generalizationIds or {@code null} for none
   */
  public RepositoryWebrefMdvcMetadataPerVertical setGeneralizationIds(java.util.List<java.math.BigInteger> generalizationIds) {
    this.generalizationIds = generalizationIds;
    return this;
  }

  /**
   * True if the topic is considered a "core topic" for the vertical.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsCore() {
    return isCore;
  }

  /**
   * True if the topic is considered a "core topic" for the vertical.
   * @param isCore isCore or {@code null} for none
   */
  public RepositoryWebrefMdvcMetadataPerVertical setIsCore(java.lang.Boolean isCore) {
    this.isCore = isCore;
    return this;
  }

  /**
   * If true, the entity is a dimension for some entities in the vertical.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsDimension() {
    return isDimension;
  }

  /**
   * If true, the entity is a dimension for some entities in the vertical.
   * @param isDimension isDimension or {@code null} for none
   */
  public RepositoryWebrefMdvcMetadataPerVertical setIsDimension(java.lang.Boolean isDimension) {
    this.isDimension = isDimension;
    return this;
  }

  /**
   * If true, the entity is a generalization for some entities in the vertical.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsGeneralization() {
    return isGeneralization;
  }

  /**
   * If true, the entity is a generalization for some entities in the vertical.
   * @param isGeneralization isGeneralization or {@code null} for none
   */
  public RepositoryWebrefMdvcMetadataPerVertical setIsGeneralization(java.lang.Boolean isGeneralization) {
    this.isGeneralization = isGeneralization;
    return this;
  }

  /**
   * Resolution priority for this entity. If there are many possible resolutions to a MDVC
   * understanding, only the ones with the highest priority are annotated.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getResolutionPriority() {
    return resolutionPriority;
  }

  /**
   * Resolution priority for this entity. If there are many possible resolutions to a MDVC
   * understanding, only the ones with the highest priority are annotated.
   * @param resolutionPriority resolutionPriority or {@code null} for none
   */
  public RepositoryWebrefMdvcMetadataPerVertical setResolutionPriority(java.lang.Integer resolutionPriority) {
    this.resolutionPriority = resolutionPriority;
    return this;
  }

  /**
   * Fingerprints that identify the topic's sub-verticals, if any.
   * @return value or {@code null} for none
   */
  public java.util.List<java.math.BigInteger> getSubVerticalFp() {
    return subVerticalFp;
  }

  /**
   * Fingerprints that identify the topic's sub-verticals, if any.
   * @param subVerticalFp subVerticalFp or {@code null} for none
   */
  public RepositoryWebrefMdvcMetadataPerVertical setSubVerticalFp(java.util.List<java.math.BigInteger> subVerticalFp) {
    this.subVerticalFp = subVerticalFp;
    return this;
  }

  /**
   * Name of the vertical this message is about.
   * @return value or {@code null} for none
   */
  public java.lang.String getVerticalName() {
    return verticalName;
  }

  /**
   * Name of the vertical this message is about.
   * @param verticalName verticalName or {@code null} for none
   */
  public RepositoryWebrefMdvcMetadataPerVertical setVerticalName(java.lang.String verticalName) {
    this.verticalName = verticalName;
    return this;
  }

  @Override
  public RepositoryWebrefMdvcMetadataPerVertical set(String fieldName, Object value) {
    return (RepositoryWebrefMdvcMetadataPerVertical) super.set(fieldName, value);
  }

  @Override
  public RepositoryWebrefMdvcMetadataPerVertical clone() {
    return (RepositoryWebrefMdvcMetadataPerVertical) super.clone();
  }

}
