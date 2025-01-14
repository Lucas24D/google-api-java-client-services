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
 * This message describes the details of a single language within a locale.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GeostoreLocaleLanguageProto extends com.google.api.client.json.GenericJson {

  /**
   * The language associated with this preference. The external form of a Google International
   * Identifiers Initiative (III) LanguageCode object. See google3/i18n/identifiers/languagecode.h
   * for details. We place extra restrictions on languages in addition to what the III library
   * requires. See http://go/geo-schema-reference/feature-properties/languages.md
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String language;

  /**
   * Flag to indicate if the associated language is "official" within a locale.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean official;

  /**
   * This value represents the preference of the associated language within a locale. It must be
   * between 0.0 and 1.0.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float preference;

  /**
   * Percentage of population that can speak the associated language within a locale. It must be
   * between 0 and 100.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float speakingPercent;

  /**
   * Percentage of population that can write the associated language within a locale. It must be
   * between 0 and 100.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float writingPercent;

  /**
   * The language associated with this preference. The external form of a Google International
   * Identifiers Initiative (III) LanguageCode object. See google3/i18n/identifiers/languagecode.h
   * for details. We place extra restrictions on languages in addition to what the III library
   * requires. See http://go/geo-schema-reference/feature-properties/languages.md
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguage() {
    return language;
  }

  /**
   * The language associated with this preference. The external form of a Google International
   * Identifiers Initiative (III) LanguageCode object. See google3/i18n/identifiers/languagecode.h
   * for details. We place extra restrictions on languages in addition to what the III library
   * requires. See http://go/geo-schema-reference/feature-properties/languages.md
   * @param language language or {@code null} for none
   */
  public GeostoreLocaleLanguageProto setLanguage(java.lang.String language) {
    this.language = language;
    return this;
  }

  /**
   * Flag to indicate if the associated language is "official" within a locale.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getOfficial() {
    return official;
  }

  /**
   * Flag to indicate if the associated language is "official" within a locale.
   * @param official official or {@code null} for none
   */
  public GeostoreLocaleLanguageProto setOfficial(java.lang.Boolean official) {
    this.official = official;
    return this;
  }

  /**
   * This value represents the preference of the associated language within a locale. It must be
   * between 0.0 and 1.0.
   * @return value or {@code null} for none
   */
  public java.lang.Float getPreference() {
    return preference;
  }

  /**
   * This value represents the preference of the associated language within a locale. It must be
   * between 0.0 and 1.0.
   * @param preference preference or {@code null} for none
   */
  public GeostoreLocaleLanguageProto setPreference(java.lang.Float preference) {
    this.preference = preference;
    return this;
  }

  /**
   * Percentage of population that can speak the associated language within a locale. It must be
   * between 0 and 100.
   * @return value or {@code null} for none
   */
  public java.lang.Float getSpeakingPercent() {
    return speakingPercent;
  }

  /**
   * Percentage of population that can speak the associated language within a locale. It must be
   * between 0 and 100.
   * @param speakingPercent speakingPercent or {@code null} for none
   */
  public GeostoreLocaleLanguageProto setSpeakingPercent(java.lang.Float speakingPercent) {
    this.speakingPercent = speakingPercent;
    return this;
  }

  /**
   * Percentage of population that can write the associated language within a locale. It must be
   * between 0 and 100.
   * @return value or {@code null} for none
   */
  public java.lang.Float getWritingPercent() {
    return writingPercent;
  }

  /**
   * Percentage of population that can write the associated language within a locale. It must be
   * between 0 and 100.
   * @param writingPercent writingPercent or {@code null} for none
   */
  public GeostoreLocaleLanguageProto setWritingPercent(java.lang.Float writingPercent) {
    this.writingPercent = writingPercent;
    return this;
  }

  @Override
  public GeostoreLocaleLanguageProto set(String fieldName, Object value) {
    return (GeostoreLocaleLanguageProto) super.set(fieldName, value);
  }

  @Override
  public GeostoreLocaleLanguageProto clone() {
    return (GeostoreLocaleLanguageProto) super.clone();
  }

}
