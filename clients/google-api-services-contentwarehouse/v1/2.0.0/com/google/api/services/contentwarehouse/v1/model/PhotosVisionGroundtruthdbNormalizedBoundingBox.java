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
 * Bounding box coordinates are relative to the width and height of the image. For example, if image
 * is 100x200 and NormalizedBoundingBox is , the bounding box coordinates will be (10, 40) to (50,
 * 180). Note parts of the bounding box may fall outside the image.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PhotosVisionGroundtruthdbNormalizedBoundingBox extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float xmax;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float xmin;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float ymax;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float ymin;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Float getXmax() {
    return xmax;
  }

  /**
   * @param xmax xmax or {@code null} for none
   */
  public PhotosVisionGroundtruthdbNormalizedBoundingBox setXmax(java.lang.Float xmax) {
    this.xmax = xmax;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Float getXmin() {
    return xmin;
  }

  /**
   * @param xmin xmin or {@code null} for none
   */
  public PhotosVisionGroundtruthdbNormalizedBoundingBox setXmin(java.lang.Float xmin) {
    this.xmin = xmin;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Float getYmax() {
    return ymax;
  }

  /**
   * @param ymax ymax or {@code null} for none
   */
  public PhotosVisionGroundtruthdbNormalizedBoundingBox setYmax(java.lang.Float ymax) {
    this.ymax = ymax;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Float getYmin() {
    return ymin;
  }

  /**
   * @param ymin ymin or {@code null} for none
   */
  public PhotosVisionGroundtruthdbNormalizedBoundingBox setYmin(java.lang.Float ymin) {
    this.ymin = ymin;
    return this;
  }

  @Override
  public PhotosVisionGroundtruthdbNormalizedBoundingBox set(String fieldName, Object value) {
    return (PhotosVisionGroundtruthdbNormalizedBoundingBox) super.set(fieldName, value);
  }

  @Override
  public PhotosVisionGroundtruthdbNormalizedBoundingBox clone() {
    return (PhotosVisionGroundtruthdbNormalizedBoundingBox) super.clone();
  }

}
