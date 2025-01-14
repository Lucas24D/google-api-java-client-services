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
 * Actions supported by Madden for a local entity.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GeoOndemandAssistantSupportedActions extends com.google.api.client.json.GenericJson {

  /**
   * Whether this local entity allows guest checkout for reservations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allowsGuestCheckout;

  /**
   * Whether or not this local entity supports asynchronous restaurant reservations, through the
   * above restaurant_reservation_url.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isAsynchronousRestaurantReservation;

  /**
   * URL for the Madden restaurant reservation flow, e.g. for display in a WebView. Not populated if
   * restaurant reservations are not supported for the local entity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String restaurantReservationUrl;

  /**
   * Whether this local entity allows guest checkout for reservations.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllowsGuestCheckout() {
    return allowsGuestCheckout;
  }

  /**
   * Whether this local entity allows guest checkout for reservations.
   * @param allowsGuestCheckout allowsGuestCheckout or {@code null} for none
   */
  public GeoOndemandAssistantSupportedActions setAllowsGuestCheckout(java.lang.Boolean allowsGuestCheckout) {
    this.allowsGuestCheckout = allowsGuestCheckout;
    return this;
  }

  /**
   * Whether or not this local entity supports asynchronous restaurant reservations, through the
   * above restaurant_reservation_url.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsAsynchronousRestaurantReservation() {
    return isAsynchronousRestaurantReservation;
  }

  /**
   * Whether or not this local entity supports asynchronous restaurant reservations, through the
   * above restaurant_reservation_url.
   * @param isAsynchronousRestaurantReservation isAsynchronousRestaurantReservation or {@code null} for none
   */
  public GeoOndemandAssistantSupportedActions setIsAsynchronousRestaurantReservation(java.lang.Boolean isAsynchronousRestaurantReservation) {
    this.isAsynchronousRestaurantReservation = isAsynchronousRestaurantReservation;
    return this;
  }

  /**
   * URL for the Madden restaurant reservation flow, e.g. for display in a WebView. Not populated if
   * restaurant reservations are not supported for the local entity.
   * @return value or {@code null} for none
   */
  public java.lang.String getRestaurantReservationUrl() {
    return restaurantReservationUrl;
  }

  /**
   * URL for the Madden restaurant reservation flow, e.g. for display in a WebView. Not populated if
   * restaurant reservations are not supported for the local entity.
   * @param restaurantReservationUrl restaurantReservationUrl or {@code null} for none
   */
  public GeoOndemandAssistantSupportedActions setRestaurantReservationUrl(java.lang.String restaurantReservationUrl) {
    this.restaurantReservationUrl = restaurantReservationUrl;
    return this;
  }

  @Override
  public GeoOndemandAssistantSupportedActions set(String fieldName, Object value) {
    return (GeoOndemandAssistantSupportedActions) super.set(fieldName, value);
  }

  @Override
  public GeoOndemandAssistantSupportedActions clone() {
    return (GeoOndemandAssistantSupportedActions) super.clone();
  }

}
