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
 * If LocationType is CHAIN, this is info about the chain.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class QualityActionsReminderLocationChainInfo extends com.google.api.client.json.GenericJson {

  /**
   * The freebase mid of the chain entity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String chainMid;

  /**
   * The geostore.NameProto.text (corresponding to the user's language) at the time of reminder
   * creation. In most cases, this is the same as name, but there may be corner cases where they
   * differ, e.g. name: "bestbuy", chain_name: "Best Buy".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String chainName;

  /**
   * The (corporate entity) chain's MapFacts feature id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GeostoreFeatureIdProto featureId;

  /**
   * The freebase mid of the chain entity.
   * @return value or {@code null} for none
   */
  public java.lang.String getChainMid() {
    return chainMid;
  }

  /**
   * The freebase mid of the chain entity.
   * @param chainMid chainMid or {@code null} for none
   */
  public QualityActionsReminderLocationChainInfo setChainMid(java.lang.String chainMid) {
    this.chainMid = chainMid;
    return this;
  }

  /**
   * The geostore.NameProto.text (corresponding to the user's language) at the time of reminder
   * creation. In most cases, this is the same as name, but there may be corner cases where they
   * differ, e.g. name: "bestbuy", chain_name: "Best Buy".
   * @return value or {@code null} for none
   */
  public java.lang.String getChainName() {
    return chainName;
  }

  /**
   * The geostore.NameProto.text (corresponding to the user's language) at the time of reminder
   * creation. In most cases, this is the same as name, but there may be corner cases where they
   * differ, e.g. name: "bestbuy", chain_name: "Best Buy".
   * @param chainName chainName or {@code null} for none
   */
  public QualityActionsReminderLocationChainInfo setChainName(java.lang.String chainName) {
    this.chainName = chainName;
    return this;
  }

  /**
   * The (corporate entity) chain's MapFacts feature id.
   * @return value or {@code null} for none
   */
  public GeostoreFeatureIdProto getFeatureId() {
    return featureId;
  }

  /**
   * The (corporate entity) chain's MapFacts feature id.
   * @param featureId featureId or {@code null} for none
   */
  public QualityActionsReminderLocationChainInfo setFeatureId(GeostoreFeatureIdProto featureId) {
    this.featureId = featureId;
    return this;
  }

  @Override
  public QualityActionsReminderLocationChainInfo set(String fieldName, Object value) {
    return (QualityActionsReminderLocationChainInfo) super.set(fieldName, value);
  }

  @Override
  public QualityActionsReminderLocationChainInfo clone() {
    return (QualityActionsReminderLocationChainInfo) super.clone();
  }

}
