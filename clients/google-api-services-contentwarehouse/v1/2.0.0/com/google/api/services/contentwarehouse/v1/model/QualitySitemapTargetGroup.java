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
 * Represents a set of targets. The group may have a label field to uniquely identify this target
 * group among others - for instance, if these targets' titles were generated using an alternative
 * title algorithm, the label can be "newtitles". See "Note on adding new fields".
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class QualitySitemapTargetGroup extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("DEPRECATEDCountry")
  private java.lang.Integer dEPRECATEDCountry;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("Target")
  private java.util.List<QualitySitemapTarget> target;

  static {
    // hack to force ProGuard to consider QualitySitemapTarget used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(QualitySitemapTarget.class);
  }

  /**
   * If all the targets in this group are named anchors on the source page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allTargetsNamedAnchors;

  /**
   * If all the targets in this group are named topictags_scrollto on the source page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allTargetsNamedTopictagsScrollto;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private QualitySitemapBreadcrumbTarget breadcrumbTarget;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<QualitySitemapCoClickTarget> coClickTarget;

  static {
    // hack to force ProGuard to consider QualitySitemapCoClickTarget used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(QualitySitemapCoClickTarget.class);
  }

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String countryCode;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String label;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer language;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean modifiedByHostcardHandler;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private QualitySitemapScoringSignals scoringSignals;

  /**
   * A list of top urls with highest two_level_score, i.e., chrome_trans_clicks.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<QualitySitemapTopURL> topUrl;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<QualitySitemapTwoLevelTarget> twoLevelTarget;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDEPRECATEDCountry() {
    return dEPRECATEDCountry;
  }

  /**
   * @param dEPRECATEDCountry dEPRECATEDCountry or {@code null} for none
   */
  public QualitySitemapTargetGroup setDEPRECATEDCountry(java.lang.Integer dEPRECATEDCountry) {
    this.dEPRECATEDCountry = dEPRECATEDCountry;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<QualitySitemapTarget> getTarget() {
    return target;
  }

  /**
   * @param target target or {@code null} for none
   */
  public QualitySitemapTargetGroup setTarget(java.util.List<QualitySitemapTarget> target) {
    this.target = target;
    return this;
  }

  /**
   * If all the targets in this group are named anchors on the source page.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllTargetsNamedAnchors() {
    return allTargetsNamedAnchors;
  }

  /**
   * If all the targets in this group are named anchors on the source page.
   * @param allTargetsNamedAnchors allTargetsNamedAnchors or {@code null} for none
   */
  public QualitySitemapTargetGroup setAllTargetsNamedAnchors(java.lang.Boolean allTargetsNamedAnchors) {
    this.allTargetsNamedAnchors = allTargetsNamedAnchors;
    return this;
  }

  /**
   * If all the targets in this group are named topictags_scrollto on the source page.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllTargetsNamedTopictagsScrollto() {
    return allTargetsNamedTopictagsScrollto;
  }

  /**
   * If all the targets in this group are named topictags_scrollto on the source page.
   * @param allTargetsNamedTopictagsScrollto allTargetsNamedTopictagsScrollto or {@code null} for none
   */
  public QualitySitemapTargetGroup setAllTargetsNamedTopictagsScrollto(java.lang.Boolean allTargetsNamedTopictagsScrollto) {
    this.allTargetsNamedTopictagsScrollto = allTargetsNamedTopictagsScrollto;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public QualitySitemapBreadcrumbTarget getBreadcrumbTarget() {
    return breadcrumbTarget;
  }

  /**
   * @param breadcrumbTarget breadcrumbTarget or {@code null} for none
   */
  public QualitySitemapTargetGroup setBreadcrumbTarget(QualitySitemapBreadcrumbTarget breadcrumbTarget) {
    this.breadcrumbTarget = breadcrumbTarget;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<QualitySitemapCoClickTarget> getCoClickTarget() {
    return coClickTarget;
  }

  /**
   * @param coClickTarget coClickTarget or {@code null} for none
   */
  public QualitySitemapTargetGroup setCoClickTarget(java.util.List<QualitySitemapCoClickTarget> coClickTarget) {
    this.coClickTarget = coClickTarget;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCountryCode() {
    return countryCode;
  }

  /**
   * @param countryCode countryCode or {@code null} for none
   */
  public QualitySitemapTargetGroup setCountryCode(java.lang.String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLabel() {
    return label;
  }

  /**
   * @param label label or {@code null} for none
   */
  public QualitySitemapTargetGroup setLabel(java.lang.String label) {
    this.label = label;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getLanguage() {
    return language;
  }

  /**
   * @param language language or {@code null} for none
   */
  public QualitySitemapTargetGroup setLanguage(java.lang.Integer language) {
    this.language = language;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getModifiedByHostcardHandler() {
    return modifiedByHostcardHandler;
  }

  /**
   * @param modifiedByHostcardHandler modifiedByHostcardHandler or {@code null} for none
   */
  public QualitySitemapTargetGroup setModifiedByHostcardHandler(java.lang.Boolean modifiedByHostcardHandler) {
    this.modifiedByHostcardHandler = modifiedByHostcardHandler;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public QualitySitemapScoringSignals getScoringSignals() {
    return scoringSignals;
  }

  /**
   * @param scoringSignals scoringSignals or {@code null} for none
   */
  public QualitySitemapTargetGroup setScoringSignals(QualitySitemapScoringSignals scoringSignals) {
    this.scoringSignals = scoringSignals;
    return this;
  }

  /**
   * A list of top urls with highest two_level_score, i.e., chrome_trans_clicks.
   * @return value or {@code null} for none
   */
  public java.util.List<QualitySitemapTopURL> getTopUrl() {
    return topUrl;
  }

  /**
   * A list of top urls with highest two_level_score, i.e., chrome_trans_clicks.
   * @param topUrl topUrl or {@code null} for none
   */
  public QualitySitemapTargetGroup setTopUrl(java.util.List<QualitySitemapTopURL> topUrl) {
    this.topUrl = topUrl;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<QualitySitemapTwoLevelTarget> getTwoLevelTarget() {
    return twoLevelTarget;
  }

  /**
   * @param twoLevelTarget twoLevelTarget or {@code null} for none
   */
  public QualitySitemapTargetGroup setTwoLevelTarget(java.util.List<QualitySitemapTwoLevelTarget> twoLevelTarget) {
    this.twoLevelTarget = twoLevelTarget;
    return this;
  }

  @Override
  public QualitySitemapTargetGroup set(String fieldName, Object value) {
    return (QualitySitemapTargetGroup) super.set(fieldName, value);
  }

  @Override
  public QualitySitemapTargetGroup clone() {
    return (QualitySitemapTargetGroup) super.clone();
  }

}
