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
 * Request for CreditDeveloperBalance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1CreditDeveloperBalanceRequest extends com.google.api.client.json.GenericJson {

  /**
   * The amount of money to be credited. The wallet corresponding to the currency specified within
   * `transaction_amount` will be updated. For example, if you specified `currency_code` within
   * `transaction_amount` as "USD", then the amount would be added to the wallet which has the "USD"
   * currency or if no such wallet exists, a new wallet will be created with the "USD" currency.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleTypeMoney transactionAmount;

  /**
   * Each transaction_id uniquely identifies a credit balance request. If multiple requests are
   * received with the same transaction_id, only one of them will be considered.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String transactionId;

  /**
   * The amount of money to be credited. The wallet corresponding to the currency specified within
   * `transaction_amount` will be updated. For example, if you specified `currency_code` within
   * `transaction_amount` as "USD", then the amount would be added to the wallet which has the "USD"
   * currency or if no such wallet exists, a new wallet will be created with the "USD" currency.
   * @return value or {@code null} for none
   */
  public GoogleTypeMoney getTransactionAmount() {
    return transactionAmount;
  }

  /**
   * The amount of money to be credited. The wallet corresponding to the currency specified within
   * `transaction_amount` will be updated. For example, if you specified `currency_code` within
   * `transaction_amount` as "USD", then the amount would be added to the wallet which has the "USD"
   * currency or if no such wallet exists, a new wallet will be created with the "USD" currency.
   * @param transactionAmount transactionAmount or {@code null} for none
   */
  public GoogleCloudApigeeV1CreditDeveloperBalanceRequest setTransactionAmount(GoogleTypeMoney transactionAmount) {
    this.transactionAmount = transactionAmount;
    return this;
  }

  /**
   * Each transaction_id uniquely identifies a credit balance request. If multiple requests are
   * received with the same transaction_id, only one of them will be considered.
   * @return value or {@code null} for none
   */
  public java.lang.String getTransactionId() {
    return transactionId;
  }

  /**
   * Each transaction_id uniquely identifies a credit balance request. If multiple requests are
   * received with the same transaction_id, only one of them will be considered.
   * @param transactionId transactionId or {@code null} for none
   */
  public GoogleCloudApigeeV1CreditDeveloperBalanceRequest setTransactionId(java.lang.String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1CreditDeveloperBalanceRequest set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1CreditDeveloperBalanceRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1CreditDeveloperBalanceRequest clone() {
    return (GoogleCloudApigeeV1CreditDeveloperBalanceRequest) super.clone();
  }

}