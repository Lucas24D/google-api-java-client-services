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

package com.google.api.services.apigee.v1.model;

/**
 * API call volume range and the fees charged when the total number of API calls is within the
 * range.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1RateRange extends com.google.api.client.json.GenericJson {

  /**
   * Ending value of the range. Set to 0 or `null` for the last range of values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long end;

  /**
   * Fee to charge when total number of API calls falls within this range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleTypeMoney fee;

  /**
   * Starting value of the range. Set to 0 or `null` for the initial range of values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long start;

  /**
   * Ending value of the range. Set to 0 or `null` for the last range of values.
   * @return value or {@code null} for none
   */
  public java.lang.Long getEnd() {
    return end;
  }

  /**
   * Ending value of the range. Set to 0 or `null` for the last range of values.
   * @param end end or {@code null} for none
   */
  public GoogleCloudApigeeV1RateRange setEnd(java.lang.Long end) {
    this.end = end;
    return this;
  }

  /**
   * Fee to charge when total number of API calls falls within this range.
   * @return value or {@code null} for none
   */
  public GoogleTypeMoney getFee() {
    return fee;
  }

  /**
   * Fee to charge when total number of API calls falls within this range.
   * @param fee fee or {@code null} for none
   */
  public GoogleCloudApigeeV1RateRange setFee(GoogleTypeMoney fee) {
    this.fee = fee;
    return this;
  }

  /**
   * Starting value of the range. Set to 0 or `null` for the initial range of values.
   * @return value or {@code null} for none
   */
  public java.lang.Long getStart() {
    return start;
  }

  /**
   * Starting value of the range. Set to 0 or `null` for the initial range of values.
   * @param start start or {@code null} for none
   */
  public GoogleCloudApigeeV1RateRange setStart(java.lang.Long start) {
    this.start = start;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1RateRange set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1RateRange) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1RateRange clone() {
    return (GoogleCloudApigeeV1RateRange) super.clone();
  }

}