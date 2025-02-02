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
 * A container proto to store prices for GE
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OceanGEMoney extends com.google.api.client.json.GenericJson {

  /**
   * amount in micros. 1 is represented 1000000
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long amountInMicros;

  /**
   * The currency codes come from google3/i18n/identifiers/currencycode.h.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String currencyCode;

  /**
   * amount in micros. 1 is represented 1000000
   * @return value or {@code null} for none
   */
  public java.lang.Long getAmountInMicros() {
    return amountInMicros;
  }

  /**
   * amount in micros. 1 is represented 1000000
   * @param amountInMicros amountInMicros or {@code null} for none
   */
  public OceanGEMoney setAmountInMicros(java.lang.Long amountInMicros) {
    this.amountInMicros = amountInMicros;
    return this;
  }

  /**
   * The currency codes come from google3/i18n/identifiers/currencycode.h.
   * @return value or {@code null} for none
   */
  public java.lang.String getCurrencyCode() {
    return currencyCode;
  }

  /**
   * The currency codes come from google3/i18n/identifiers/currencycode.h.
   * @param currencyCode currencyCode or {@code null} for none
   */
  public OceanGEMoney setCurrencyCode(java.lang.String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  @Override
  public OceanGEMoney set(String fieldName, Object value) {
    return (OceanGEMoney) super.set(fieldName, value);
  }

  @Override
  public OceanGEMoney clone() {
    return (OceanGEMoney) super.clone();
  }

}
