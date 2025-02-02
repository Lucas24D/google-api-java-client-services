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
 * Model definition for VideoContentSearchDolphinFeatures.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VideoContentSearchDolphinFeatures extends com.google.api.client.json.GenericJson {

  /**
   * The alt query used for building the Dolphin example.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String altQuery;

  /**
   * The answer used for building the Dolphin example.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String answer;

  /**
   * The query used for building the Dolphin example.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String query;

  /**
   * The time stamp of the video anchor in milliseconds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long timeMs;

  /**
   * The title used for building the Dolphin example.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The url of the video.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * The alt query used for building the Dolphin example.
   * @return value or {@code null} for none
   */
  public java.lang.String getAltQuery() {
    return altQuery;
  }

  /**
   * The alt query used for building the Dolphin example.
   * @param altQuery altQuery or {@code null} for none
   */
  public VideoContentSearchDolphinFeatures setAltQuery(java.lang.String altQuery) {
    this.altQuery = altQuery;
    return this;
  }

  /**
   * The answer used for building the Dolphin example.
   * @return value or {@code null} for none
   */
  public java.lang.String getAnswer() {
    return answer;
  }

  /**
   * The answer used for building the Dolphin example.
   * @param answer answer or {@code null} for none
   */
  public VideoContentSearchDolphinFeatures setAnswer(java.lang.String answer) {
    this.answer = answer;
    return this;
  }

  /**
   * The query used for building the Dolphin example.
   * @return value or {@code null} for none
   */
  public java.lang.String getQuery() {
    return query;
  }

  /**
   * The query used for building the Dolphin example.
   * @param query query or {@code null} for none
   */
  public VideoContentSearchDolphinFeatures setQuery(java.lang.String query) {
    this.query = query;
    return this;
  }

  /**
   * The time stamp of the video anchor in milliseconds.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTimeMs() {
    return timeMs;
  }

  /**
   * The time stamp of the video anchor in milliseconds.
   * @param timeMs timeMs or {@code null} for none
   */
  public VideoContentSearchDolphinFeatures setTimeMs(java.lang.Long timeMs) {
    this.timeMs = timeMs;
    return this;
  }

  /**
   * The title used for building the Dolphin example.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The title used for building the Dolphin example.
   * @param title title or {@code null} for none
   */
  public VideoContentSearchDolphinFeatures setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * The url of the video.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * The url of the video.
   * @param url url or {@code null} for none
   */
  public VideoContentSearchDolphinFeatures setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  @Override
  public VideoContentSearchDolphinFeatures set(String fieldName, Object value) {
    return (VideoContentSearchDolphinFeatures) super.set(fieldName, value);
  }

  @Override
  public VideoContentSearchDolphinFeatures clone() {
    return (VideoContentSearchDolphinFeatures) super.clone();
  }

}
