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
 * Similar to goodoc.BoundingBox, but containing an angle of rotation, thus able to represent non-
 * axis-aligned boxes. RotatedBoundingBox can be used in combination with BoundingBox to better
 * represent non-axis-aligned page structural elements. In such case, two bounding boxes can be used
 * per element. A RotatedBoundingBox that is rotated to tightly encompass the element; embedded (as
 * tightly as possible) inside an axis-aligned BoundingBox. Note that there is some amount of
 * ambiguity regarding what angle and vertex to use. Consider a square with axis-aligned diagonals:
 * B / \ A C \ / D This can either be represented as a -45 degree rotation around A, a 45 degree
 * rotation around B, a 135 degree rotation around C, or a -135 degree rotation around D. Which one
 * you use depends on your use case, but one recommendation is to use the vertex that would be top
 * left if the reader was reading it in the 'natural' orientation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoodocRotatedBoundingBox extends com.google.api.client.json.GenericJson {

  /**
   * Angle of rotation of the original non-rotated box around the top left corner of the original
   * non-rotated box, in clockwise degrees from the horizontal.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("Angle")
  private java.lang.Float angle;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("Height")
  private java.lang.Integer height;

  /**
   * Coordinates and sizes are expressed in pixels, where the top-left pixel is (0, 0). The
   * coordinates refer to the corner of the top-left vertex of the unrotated version of the box.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("Left")
  private java.lang.Integer left;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("Top")
  private java.lang.Integer top;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("Width")
  private java.lang.Integer width;

  /**
   * Angle of rotation of the original non-rotated box around the top left corner of the original
   * non-rotated box, in clockwise degrees from the horizontal.
   * @return value or {@code null} for none
   */
  public java.lang.Float getAngle() {
    return angle;
  }

  /**
   * Angle of rotation of the original non-rotated box around the top left corner of the original
   * non-rotated box, in clockwise degrees from the horizontal.
   * @param angle angle or {@code null} for none
   */
  public GoodocRotatedBoundingBox setAngle(java.lang.Float angle) {
    this.angle = angle;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getHeight() {
    return height;
  }

  /**
   * @param height height or {@code null} for none
   */
  public GoodocRotatedBoundingBox setHeight(java.lang.Integer height) {
    this.height = height;
    return this;
  }

  /**
   * Coordinates and sizes are expressed in pixels, where the top-left pixel is (0, 0). The
   * coordinates refer to the corner of the top-left vertex of the unrotated version of the box.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getLeft() {
    return left;
  }

  /**
   * Coordinates and sizes are expressed in pixels, where the top-left pixel is (0, 0). The
   * coordinates refer to the corner of the top-left vertex of the unrotated version of the box.
   * @param left left or {@code null} for none
   */
  public GoodocRotatedBoundingBox setLeft(java.lang.Integer left) {
    this.left = left;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTop() {
    return top;
  }

  /**
   * @param top top or {@code null} for none
   */
  public GoodocRotatedBoundingBox setTop(java.lang.Integer top) {
    this.top = top;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getWidth() {
    return width;
  }

  /**
   * @param width width or {@code null} for none
   */
  public GoodocRotatedBoundingBox setWidth(java.lang.Integer width) {
    this.width = width;
    return this;
  }

  @Override
  public GoodocRotatedBoundingBox set(String fieldName, Object value) {
    return (GoodocRotatedBoundingBox) super.set(fieldName, value);
  }

  @Override
  public GoodocRotatedBoundingBox clone() {
    return (GoodocRotatedBoundingBox) super.clone();
  }

}
