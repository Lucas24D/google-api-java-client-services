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
 * Defines a frequency for a terrestrial radio station. For instance, 99.1 FM, 730 AM, etc. Next ID:
 * 4
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NlpSemanticParsingModelsMediaFrequency extends com.google.api.client.json.GenericJson {

  /**
   * The broadcast band used by the radio station.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String band;

  /**
   * Frequency in MHz (for FM) and KHz (for AM).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double value;

  /**
   * The broadcast band used by the radio station.
   * @return value or {@code null} for none
   */
  public java.lang.String getBand() {
    return band;
  }

  /**
   * The broadcast band used by the radio station.
   * @param band band or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaFrequency setBand(java.lang.String band) {
    this.band = band;
    return this;
  }

  /**
   * Frequency in MHz (for FM) and KHz (for AM).
   * @return value or {@code null} for none
   */
  public java.lang.Double getValue() {
    return value;
  }

  /**
   * Frequency in MHz (for FM) and KHz (for AM).
   * @param value value or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaFrequency setValue(java.lang.Double value) {
    this.value = value;
    return this;
  }

  @Override
  public NlpSemanticParsingModelsMediaFrequency set(String fieldName, Object value) {
    return (NlpSemanticParsingModelsMediaFrequency) super.set(fieldName, value);
  }

  @Override
  public NlpSemanticParsingModelsMediaFrequency clone() {
    return (NlpSemanticParsingModelsMediaFrequency) super.clone();
  }

}
