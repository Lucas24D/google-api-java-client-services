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
 * Salient Countries is an estimated probability (salience) of a doc to be relevant to a country. On
 * this message, countries are represented as int32 (the format of this data is defined in
 * i18n/identifiers/stableinternalregionconverter.cc). Salience is a value in range [0.0 - 1.0] in
 * which 1.0 represents a high likelihood to be relevant to the country
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CountrySalientCountry extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long compressedSalience;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer countryCode;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float salience;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getCompressedSalience() {
    return compressedSalience;
  }

  /**
   * @param compressedSalience compressedSalience or {@code null} for none
   */
  public CountrySalientCountry setCompressedSalience(java.lang.Long compressedSalience) {
    this.compressedSalience = compressedSalience;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getCountryCode() {
    return countryCode;
  }

  /**
   * @param countryCode countryCode or {@code null} for none
   */
  public CountrySalientCountry setCountryCode(java.lang.Integer countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Float getSalience() {
    return salience;
  }

  /**
   * @param salience salience or {@code null} for none
   */
  public CountrySalientCountry setSalience(java.lang.Float salience) {
    this.salience = salience;
    return this;
  }

  @Override
  public CountrySalientCountry set(String fieldName, Object value) {
    return (CountrySalientCountry) super.set(fieldName, value);
  }

  @Override
  public CountrySalientCountry clone() {
    return (CountrySalientCountry) super.clone();
  }

}
