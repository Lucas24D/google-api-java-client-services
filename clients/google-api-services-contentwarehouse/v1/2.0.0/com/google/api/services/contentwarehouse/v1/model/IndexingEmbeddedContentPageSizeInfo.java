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
 * Page download size information.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class IndexingEmbeddedContentPageSizeInfo extends com.google.api.client.json.GenericJson {

  /**
   * Images are also resources. num_images <= num_resources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numImages;

  /**
   * Number of images whose crawl status is CONTENT.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numImagesWithContent;

  /**
   * Numbers below don't include embedder.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numResources;

  /**
   * Number of resources whose crawl status is CONTENT.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numResourcesWithContent;

  /**
   * Sum of embedder and all referenced resources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer sumHttpResponseLength;

  /**
   * Images are also resources. num_images <= num_resources.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumImages() {
    return numImages;
  }

  /**
   * Images are also resources. num_images <= num_resources.
   * @param numImages numImages or {@code null} for none
   */
  public IndexingEmbeddedContentPageSizeInfo setNumImages(java.lang.Integer numImages) {
    this.numImages = numImages;
    return this;
  }

  /**
   * Number of images whose crawl status is CONTENT.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumImagesWithContent() {
    return numImagesWithContent;
  }

  /**
   * Number of images whose crawl status is CONTENT.
   * @param numImagesWithContent numImagesWithContent or {@code null} for none
   */
  public IndexingEmbeddedContentPageSizeInfo setNumImagesWithContent(java.lang.Integer numImagesWithContent) {
    this.numImagesWithContent = numImagesWithContent;
    return this;
  }

  /**
   * Numbers below don't include embedder.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumResources() {
    return numResources;
  }

  /**
   * Numbers below don't include embedder.
   * @param numResources numResources or {@code null} for none
   */
  public IndexingEmbeddedContentPageSizeInfo setNumResources(java.lang.Integer numResources) {
    this.numResources = numResources;
    return this;
  }

  /**
   * Number of resources whose crawl status is CONTENT.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumResourcesWithContent() {
    return numResourcesWithContent;
  }

  /**
   * Number of resources whose crawl status is CONTENT.
   * @param numResourcesWithContent numResourcesWithContent or {@code null} for none
   */
  public IndexingEmbeddedContentPageSizeInfo setNumResourcesWithContent(java.lang.Integer numResourcesWithContent) {
    this.numResourcesWithContent = numResourcesWithContent;
    return this;
  }

  /**
   * Sum of embedder and all referenced resources.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSumHttpResponseLength() {
    return sumHttpResponseLength;
  }

  /**
   * Sum of embedder and all referenced resources.
   * @param sumHttpResponseLength sumHttpResponseLength or {@code null} for none
   */
  public IndexingEmbeddedContentPageSizeInfo setSumHttpResponseLength(java.lang.Integer sumHttpResponseLength) {
    this.sumHttpResponseLength = sumHttpResponseLength;
    return this;
  }

  @Override
  public IndexingEmbeddedContentPageSizeInfo set(String fieldName, Object value) {
    return (IndexingEmbeddedContentPageSizeInfo) super.set(fieldName, value);
  }

  @Override
  public IndexingEmbeddedContentPageSizeInfo clone() {
    return (IndexingEmbeddedContentPageSizeInfo) super.clone();
  }

}
