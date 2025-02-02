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
 * A brand can be any combination of text or mid.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NlpSemanticParsingModelsShoppingAssistantBrandPhrase extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mid;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rawText;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMid() {
    return mid;
  }

  /**
   * @param mid mid or {@code null} for none
   */
  public NlpSemanticParsingModelsShoppingAssistantBrandPhrase setMid(java.lang.String mid) {
    this.mid = mid;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getRawText() {
    return rawText;
  }

  /**
   * @param rawText rawText or {@code null} for none
   */
  public NlpSemanticParsingModelsShoppingAssistantBrandPhrase setRawText(java.lang.String rawText) {
    this.rawText = rawText;
    return this;
  }

  @Override
  public NlpSemanticParsingModelsShoppingAssistantBrandPhrase set(String fieldName, Object value) {
    return (NlpSemanticParsingModelsShoppingAssistantBrandPhrase) super.set(fieldName, value);
  }

  @Override
  public NlpSemanticParsingModelsShoppingAssistantBrandPhrase clone() {
    return (NlpSemanticParsingModelsShoppingAssistantBrandPhrase) super.clone();
  }

}
