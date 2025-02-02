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
 * Model definition for LegalDate.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LegalDate extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("Day")
  private java.lang.Integer day;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("Month")
  private java.lang.Integer month;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("Year")
  private java.lang.Integer year;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDay() {
    return day;
  }

  /**
   * @param day day or {@code null} for none
   */
  public LegalDate setDay(java.lang.Integer day) {
    this.day = day;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMonth() {
    return month;
  }

  /**
   * @param month month or {@code null} for none
   */
  public LegalDate setMonth(java.lang.Integer month) {
    this.month = month;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getYear() {
    return year;
  }

  /**
   * @param year year or {@code null} for none
   */
  public LegalDate setYear(java.lang.Integer year) {
    this.year = year;
    return this;
  }

  @Override
  public LegalDate set(String fieldName, Object value) {
    return (LegalDate) super.set(fieldName, value);
  }

  @Override
  public LegalDate clone() {
    return (LegalDate) super.clone();
  }

}
