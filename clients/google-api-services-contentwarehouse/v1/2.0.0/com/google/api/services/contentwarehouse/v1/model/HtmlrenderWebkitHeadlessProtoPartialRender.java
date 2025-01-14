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
 * PartialRenders can be created using the extension API to store the document state and/or create
 * an image at points before the final render.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HtmlrenderWebkitHeadlessProtoPartialRender extends com.google.api.client.json.GenericJson {

  /**
   * Cookies at the time of snapshot creation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<HtmlrenderWebkitHeadlessProtoCookie> cookie;

  static {
    // hack to force ProGuard to consider HtmlrenderWebkitHeadlessProtoCookie used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(HtmlrenderWebkitHeadlessProtoCookie.class);
  }

  /**
   * Current url as would appear in the web browser's address bar at the time of snapshot creation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String currentClientUrl;

  /**
   * Snapshot of the document DOM + Render trees, if requested
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HtmlrenderWebkitHeadlessProtoDocument document;

  /**
   * ID set by the render extension
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Image of the render, if requested
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HtmlrenderWebkitHeadlessProtoImage image;

  /**
   * Cookies at the time of snapshot creation.
   * @return value or {@code null} for none
   */
  public java.util.List<HtmlrenderWebkitHeadlessProtoCookie> getCookie() {
    return cookie;
  }

  /**
   * Cookies at the time of snapshot creation.
   * @param cookie cookie or {@code null} for none
   */
  public HtmlrenderWebkitHeadlessProtoPartialRender setCookie(java.util.List<HtmlrenderWebkitHeadlessProtoCookie> cookie) {
    this.cookie = cookie;
    return this;
  }

  /**
   * Current url as would appear in the web browser's address bar at the time of snapshot creation.
   * @return value or {@code null} for none
   */
  public java.lang.String getCurrentClientUrl() {
    return currentClientUrl;
  }

  /**
   * Current url as would appear in the web browser's address bar at the time of snapshot creation.
   * @param currentClientUrl currentClientUrl or {@code null} for none
   */
  public HtmlrenderWebkitHeadlessProtoPartialRender setCurrentClientUrl(java.lang.String currentClientUrl) {
    this.currentClientUrl = currentClientUrl;
    return this;
  }

  /**
   * Snapshot of the document DOM + Render trees, if requested
   * @return value or {@code null} for none
   */
  public HtmlrenderWebkitHeadlessProtoDocument getDocument() {
    return document;
  }

  /**
   * Snapshot of the document DOM + Render trees, if requested
   * @param document document or {@code null} for none
   */
  public HtmlrenderWebkitHeadlessProtoPartialRender setDocument(HtmlrenderWebkitHeadlessProtoDocument document) {
    this.document = document;
    return this;
  }

  /**
   * ID set by the render extension
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * ID set by the render extension
   * @param id id or {@code null} for none
   */
  public HtmlrenderWebkitHeadlessProtoPartialRender setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Image of the render, if requested
   * @return value or {@code null} for none
   */
  public HtmlrenderWebkitHeadlessProtoImage getImage() {
    return image;
  }

  /**
   * Image of the render, if requested
   * @param image image or {@code null} for none
   */
  public HtmlrenderWebkitHeadlessProtoPartialRender setImage(HtmlrenderWebkitHeadlessProtoImage image) {
    this.image = image;
    return this;
  }

  @Override
  public HtmlrenderWebkitHeadlessProtoPartialRender set(String fieldName, Object value) {
    return (HtmlrenderWebkitHeadlessProtoPartialRender) super.set(fieldName, value);
  }

  @Override
  public HtmlrenderWebkitHeadlessProtoPartialRender clone() {
    return (HtmlrenderWebkitHeadlessProtoPartialRender) super.clone();
  }

}
