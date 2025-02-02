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
 * Model definition for IndexingSignalAggregatorSccSignal.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class IndexingSignalAggregatorSccSignal extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double clicksBad;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double clicksImage;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double clicksTotal;

  /**
   * For debugging purpose only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> debugInfo;

  /**
   * This represents the number of urls with image clicks. A url can have both image and non-image
   * clicks, in which case we set num_image_urls to be the ratio of image_clicks vs total clicks.
   * For example, if a url has 10 total clicks and 7 image clicks, num_image_urls will be set to
   * 0.7.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double numImageUrls;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long numUrls;

  /**
   * For debugging purpose only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pattern;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getClicksBad() {
    return clicksBad;
  }

  /**
   * @param clicksBad clicksBad or {@code null} for none
   */
  public IndexingSignalAggregatorSccSignal setClicksBad(java.lang.Double clicksBad) {
    this.clicksBad = clicksBad;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getClicksImage() {
    return clicksImage;
  }

  /**
   * @param clicksImage clicksImage or {@code null} for none
   */
  public IndexingSignalAggregatorSccSignal setClicksImage(java.lang.Double clicksImage) {
    this.clicksImage = clicksImage;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getClicksTotal() {
    return clicksTotal;
  }

  /**
   * @param clicksTotal clicksTotal or {@code null} for none
   */
  public IndexingSignalAggregatorSccSignal setClicksTotal(java.lang.Double clicksTotal) {
    this.clicksTotal = clicksTotal;
    return this;
  }

  /**
   * For debugging purpose only.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDebugInfo() {
    return debugInfo;
  }

  /**
   * For debugging purpose only.
   * @param debugInfo debugInfo or {@code null} for none
   */
  public IndexingSignalAggregatorSccSignal setDebugInfo(java.util.List<java.lang.String> debugInfo) {
    this.debugInfo = debugInfo;
    return this;
  }

  /**
   * This represents the number of urls with image clicks. A url can have both image and non-image
   * clicks, in which case we set num_image_urls to be the ratio of image_clicks vs total clicks.
   * For example, if a url has 10 total clicks and 7 image clicks, num_image_urls will be set to
   * 0.7.
   * @return value or {@code null} for none
   */
  public java.lang.Double getNumImageUrls() {
    return numImageUrls;
  }

  /**
   * This represents the number of urls with image clicks. A url can have both image and non-image
   * clicks, in which case we set num_image_urls to be the ratio of image_clicks vs total clicks.
   * For example, if a url has 10 total clicks and 7 image clicks, num_image_urls will be set to
   * 0.7.
   * @param numImageUrls numImageUrls or {@code null} for none
   */
  public IndexingSignalAggregatorSccSignal setNumImageUrls(java.lang.Double numImageUrls) {
    this.numImageUrls = numImageUrls;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getNumUrls() {
    return numUrls;
  }

  /**
   * @param numUrls numUrls or {@code null} for none
   */
  public IndexingSignalAggregatorSccSignal setNumUrls(java.lang.Long numUrls) {
    this.numUrls = numUrls;
    return this;
  }

  /**
   * For debugging purpose only.
   * @return value or {@code null} for none
   */
  public java.lang.String getPattern() {
    return pattern;
  }

  /**
   * For debugging purpose only.
   * @param pattern pattern or {@code null} for none
   */
  public IndexingSignalAggregatorSccSignal setPattern(java.lang.String pattern) {
    this.pattern = pattern;
    return this;
  }

  @Override
  public IndexingSignalAggregatorSccSignal set(String fieldName, Object value) {
    return (IndexingSignalAggregatorSccSignal) super.set(fieldName, value);
  }

  @Override
  public IndexingSignalAggregatorSccSignal clone() {
    return (IndexingSignalAggregatorSccSignal) super.clone();
  }

}
