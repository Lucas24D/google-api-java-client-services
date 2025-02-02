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
 * This is the log version of fuzzy ngram match results that's used for generating the best fuzzy
 * match. Next ID: 3
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AssistantLogsCommunicationFuzzyNgramMatchLog extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float relativeCost;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Float getRelativeCost() {
    return relativeCost;
  }

  /**
   * @param relativeCost relativeCost or {@code null} for none
   */
  public AssistantLogsCommunicationFuzzyNgramMatchLog setRelativeCost(java.lang.Float relativeCost) {
    this.relativeCost = relativeCost;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * @param type type or {@code null} for none
   */
  public AssistantLogsCommunicationFuzzyNgramMatchLog setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public AssistantLogsCommunicationFuzzyNgramMatchLog set(String fieldName, Object value) {
    return (AssistantLogsCommunicationFuzzyNgramMatchLog) super.set(fieldName, value);
  }

  @Override
  public AssistantLogsCommunicationFuzzyNgramMatchLog clone() {
    return (AssistantLogsCommunicationFuzzyNgramMatchLog) super.clone();
  }

}
