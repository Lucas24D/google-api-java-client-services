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

package com.google.api.services.dialogflow.v3beta1.model;

/**
 * Represents a part of a message possibly annotated with an entity. The part can be an entity or
 * purely a part of the message between two entities or message start/end.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1AnnotatedMessagePart extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The [Dialogflow system entity
   * type](https://cloud.google.com/dialogflow/docs/reference/system-entities) of this message part.
   * If this is empty, Dialogflow could not annotate the phrase part with a system entity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String entityType;

  /**
   * Optional. The [Dialogflow system entity formatted value
   * ](https://cloud.google.com/dialogflow/docs/reference/system-entities) of this message part. For
   * example for a system entity of type `@sys.unit-currency`, this may contain: { "amount": 5,
   * "currency": "USD" }
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Object formattedValue;

  /**
   * Required. A part of a message possibly annotated with an entity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String text;

  /**
   * Optional. The [Dialogflow system entity
   * type](https://cloud.google.com/dialogflow/docs/reference/system-entities) of this message part.
   * If this is empty, Dialogflow could not annotate the phrase part with a system entity.
   * @return value or {@code null} for none
   */
  public java.lang.String getEntityType() {
    return entityType;
  }

  /**
   * Optional. The [Dialogflow system entity
   * type](https://cloud.google.com/dialogflow/docs/reference/system-entities) of this message part.
   * If this is empty, Dialogflow could not annotate the phrase part with a system entity.
   * @param entityType entityType or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1AnnotatedMessagePart setEntityType(java.lang.String entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * Optional. The [Dialogflow system entity formatted value
   * ](https://cloud.google.com/dialogflow/docs/reference/system-entities) of this message part. For
   * example for a system entity of type `@sys.unit-currency`, this may contain: { "amount": 5,
   * "currency": "USD" }
   * @return value or {@code null} for none
   */
  public java.lang.Object getFormattedValue() {
    return formattedValue;
  }

  /**
   * Optional. The [Dialogflow system entity formatted value
   * ](https://cloud.google.com/dialogflow/docs/reference/system-entities) of this message part. For
   * example for a system entity of type `@sys.unit-currency`, this may contain: { "amount": 5,
   * "currency": "USD" }
   * @param formattedValue formattedValue or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1AnnotatedMessagePart setFormattedValue(java.lang.Object formattedValue) {
    this.formattedValue = formattedValue;
    return this;
  }

  /**
   * Required. A part of a message possibly annotated with an entity.
   * @return value or {@code null} for none
   */
  public java.lang.String getText() {
    return text;
  }

  /**
   * Required. A part of a message possibly annotated with an entity.
   * @param text text or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1AnnotatedMessagePart setText(java.lang.String text) {
    this.text = text;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1AnnotatedMessagePart set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1AnnotatedMessagePart) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1AnnotatedMessagePart clone() {
    return (GoogleCloudDialogflowV2beta1AnnotatedMessagePart) super.clone();
  }

}