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
 * A crossing describes a path from the end point of a segment to the start point of its sibling.
 * Each individual crossing should uniquely represent a physically distinct crossing in the real
 * world. Pedestrian crossings are bidirectional. This proto represents "simple" crossings. More
 * complicated crossings (such as the diagonal crosswalk at Shibuya Station in Tokyo) will be
 * represented using a separate pedestrian network. Example 1: Standard four way crossing. Assume
 * each road (A/B/C) has a crosswalk (denoted by a '-') right before intersection X. Assume crossing
 * at D is prohibited (denoted by a '%'). Assume "prime" roads (A',B',...) are OUT segments relative
 * to X. A\\A' B//B' \\ // \\ // - - X - % // \\ // \\ C'//C D'\\D * A CROSSABLE PedestrianCrossing
 * should be added to A, B and C. * An UNCROSSABLE PedestrianCrossing should be added to D. Example
 * 2: Simple intersection with one crossing. Assume intersection X was added to accommodate the
 * crosswalk (through X, denoted by '-'). Assume "prime" roads (A',B',...) are OUT segments relative
 * to X. A\\A' \\ \\ -X- \\ \\ B'\\B * A CROSSABLE PedestrianCrossing must be added to either A or
 * B, but not both because each real-world crossing should be represented exactly once. Duplicative
 * crossings may be arbitrarily removed.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GeostorePedestrianCrossingProto extends com.google.api.client.json.GenericJson {

  /**
   * This value specifies the angle of the crosswalk. Zero degrees represents a crosswalk
   * perpendicular to the direction of travel, towards the right side of the segment. The crosswalk
   * angle, winds clockwise. Range [-90, 90]. The following crosswalk would have a 15 degree angle:
   * / / <--/-------------------------------- / /
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double angleDegrees;

  /**
   * This value enables crossing anywhere (not just at the segment’s endpoint), typically used on
   * long, low-traffic residential streets. This attribute is only respected for trivial segment ->
   * sibling routes. All other routes can cross at a MapFacts intersection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean crossAnywhere;

  /**
   * Crossing type is used as a restriction and can also be used for rendering.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String crossingType;

  /**
   * The crossing offset defines a fraction between the distance from the segment endpoint to the
   * centerline of the crosswalk and the length of the segment. For example, the segment length is
   * 20 meters and the distance from segment end to center of crosswalk is 2 meters, the value of
   * offset will be 0.1.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float offset;

  /**
   * Restrictions for this crossing (such as constructions on the crosswalk). They must not have
   * subpath or travel_mode.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GeostoreRestrictionProto> restriction;

  /**
   * This value defines the full width of the crossing in the direction perpendicular to the
   * direction which pedestrians walk on the crossing (in meters). The crossing is allowed to
   * "spill" into the next segment (0.5 * width can be greater than the offset). Cannot be a
   * negative value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float width;

  /**
   * This value specifies the angle of the crosswalk. Zero degrees represents a crosswalk
   * perpendicular to the direction of travel, towards the right side of the segment. The crosswalk
   * angle, winds clockwise. Range [-90, 90]. The following crosswalk would have a 15 degree angle:
   * / / <--/-------------------------------- / /
   * @return value or {@code null} for none
   */
  public java.lang.Double getAngleDegrees() {
    return angleDegrees;
  }

  /**
   * This value specifies the angle of the crosswalk. Zero degrees represents a crosswalk
   * perpendicular to the direction of travel, towards the right side of the segment. The crosswalk
   * angle, winds clockwise. Range [-90, 90]. The following crosswalk would have a 15 degree angle:
   * / / <--/-------------------------------- / /
   * @param angleDegrees angleDegrees or {@code null} for none
   */
  public GeostorePedestrianCrossingProto setAngleDegrees(java.lang.Double angleDegrees) {
    this.angleDegrees = angleDegrees;
    return this;
  }

  /**
   * This value enables crossing anywhere (not just at the segment’s endpoint), typically used on
   * long, low-traffic residential streets. This attribute is only respected for trivial segment ->
   * sibling routes. All other routes can cross at a MapFacts intersection.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCrossAnywhere() {
    return crossAnywhere;
  }

  /**
   * This value enables crossing anywhere (not just at the segment’s endpoint), typically used on
   * long, low-traffic residential streets. This attribute is only respected for trivial segment ->
   * sibling routes. All other routes can cross at a MapFacts intersection.
   * @param crossAnywhere crossAnywhere or {@code null} for none
   */
  public GeostorePedestrianCrossingProto setCrossAnywhere(java.lang.Boolean crossAnywhere) {
    this.crossAnywhere = crossAnywhere;
    return this;
  }

  /**
   * Crossing type is used as a restriction and can also be used for rendering.
   * @return value or {@code null} for none
   */
  public java.lang.String getCrossingType() {
    return crossingType;
  }

  /**
   * Crossing type is used as a restriction and can also be used for rendering.
   * @param crossingType crossingType or {@code null} for none
   */
  public GeostorePedestrianCrossingProto setCrossingType(java.lang.String crossingType) {
    this.crossingType = crossingType;
    return this;
  }

  /**
   * The crossing offset defines a fraction between the distance from the segment endpoint to the
   * centerline of the crosswalk and the length of the segment. For example, the segment length is
   * 20 meters and the distance from segment end to center of crosswalk is 2 meters, the value of
   * offset will be 0.1.
   * @return value or {@code null} for none
   */
  public java.lang.Float getOffset() {
    return offset;
  }

  /**
   * The crossing offset defines a fraction between the distance from the segment endpoint to the
   * centerline of the crosswalk and the length of the segment. For example, the segment length is
   * 20 meters and the distance from segment end to center of crosswalk is 2 meters, the value of
   * offset will be 0.1.
   * @param offset offset or {@code null} for none
   */
  public GeostorePedestrianCrossingProto setOffset(java.lang.Float offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Restrictions for this crossing (such as constructions on the crosswalk). They must not have
   * subpath or travel_mode.
   * @return value or {@code null} for none
   */
  public java.util.List<GeostoreRestrictionProto> getRestriction() {
    return restriction;
  }

  /**
   * Restrictions for this crossing (such as constructions on the crosswalk). They must not have
   * subpath or travel_mode.
   * @param restriction restriction or {@code null} for none
   */
  public GeostorePedestrianCrossingProto setRestriction(java.util.List<GeostoreRestrictionProto> restriction) {
    this.restriction = restriction;
    return this;
  }

  /**
   * This value defines the full width of the crossing in the direction perpendicular to the
   * direction which pedestrians walk on the crossing (in meters). The crossing is allowed to
   * "spill" into the next segment (0.5 * width can be greater than the offset). Cannot be a
   * negative value.
   * @return value or {@code null} for none
   */
  public java.lang.Float getWidth() {
    return width;
  }

  /**
   * This value defines the full width of the crossing in the direction perpendicular to the
   * direction which pedestrians walk on the crossing (in meters). The crossing is allowed to
   * "spill" into the next segment (0.5 * width can be greater than the offset). Cannot be a
   * negative value.
   * @param width width or {@code null} for none
   */
  public GeostorePedestrianCrossingProto setWidth(java.lang.Float width) {
    this.width = width;
    return this;
  }

  @Override
  public GeostorePedestrianCrossingProto set(String fieldName, Object value) {
    return (GeostorePedestrianCrossingProto) super.set(fieldName, value);
  }

  @Override
  public GeostorePedestrianCrossingProto clone() {
    return (GeostorePedestrianCrossingProto) super.clone();
  }

}
