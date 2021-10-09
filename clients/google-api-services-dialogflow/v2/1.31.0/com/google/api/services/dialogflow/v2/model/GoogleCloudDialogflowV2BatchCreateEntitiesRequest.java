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

package com.google.api.services.dialogflow.v2.model;

/**
 * The request message for EntityTypes.BatchCreateEntities.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2BatchCreateEntitiesRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The entities to create.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowV2EntityTypeEntity> entities;

  /**
   * Optional. The language used to access language-specific data. If not specified, the agent's
   * default language is used. For more information, see [Multilingual intent and entity
   * data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String languageCode;

  /**
   * Required. The entities to create.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowV2EntityTypeEntity> getEntities() {
    return entities;
  }

  /**
   * Required. The entities to create.
   * @param entities entities or {@code null} for none
   */
  public GoogleCloudDialogflowV2BatchCreateEntitiesRequest setEntities(java.util.List<GoogleCloudDialogflowV2EntityTypeEntity> entities) {
    this.entities = entities;
    return this;
  }

  /**
   * Optional. The language used to access language-specific data. If not specified, the agent's
   * default language is used. For more information, see [Multilingual intent and entity
   * data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguageCode() {
    return languageCode;
  }

  /**
   * Optional. The language used to access language-specific data. If not specified, the agent's
   * default language is used. For more information, see [Multilingual intent and entity
   * data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
   * @param languageCode languageCode or {@code null} for none
   */
  public GoogleCloudDialogflowV2BatchCreateEntitiesRequest setLanguageCode(java.lang.String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2BatchCreateEntitiesRequest set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2BatchCreateEntitiesRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2BatchCreateEntitiesRequest clone() {
    return (GoogleCloudDialogflowV2BatchCreateEntitiesRequest) super.clone();
  }

}