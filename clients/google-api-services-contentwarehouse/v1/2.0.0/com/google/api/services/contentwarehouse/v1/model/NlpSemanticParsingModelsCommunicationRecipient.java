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
 * It can be a contact (person name), a business name, an email address or a phone number. NOTE:
 * Unfortunately the name of this message is not generic enough. Contact would be a better name.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NlpSemanticParsingModelsCommunicationRecipient extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AssistantApiCoreTypesCalendarEvent calendarEvent;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AssistantApiCoreTypesCalendarEventWrapper calendarEventWrapper;

  /**
   * Contact details (e.g. gaia_id, phone, etc). Replaces 'focus_name' above.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NlpSemanticParsingModelsPersonPerson contact;

  /**
   * Required, but should only be used inside Aqua and must not be used by outside clients!!
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NlpSemanticParsingAnnotationEvalData evalData;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isAnnotatedFromText;

  /**
   * Deprecated in favor of recipient.contact.name_annotation_source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nameAnnotationSource;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String numberAnnotationSource;

  /**
   * NOTE: for CONTACT recipient, this is *NOT* the real raw text of the recipient span of
   * historical reasons. Major differences includes: - stripping possessive suffix, e.g. "John's" ->
   * "John" - stripping prefix/suffix/title, e.g. "Mr. John" -> "John" - uninflect name for
   * languages like Russian, e.g. "Андрею" -> "Андрей" Currently this is the same as .contact.name,
   * and is used as the string shown to the user on clientside UI. If you're looking for real raw
   * text, use .contact.raw_text
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rawText;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String recipientType;

  /**
   * A reference to a person by relationship name. eg. my father.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NlpSemanticParsingModelsCommunicationRelationshipArgument relationship;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer sensitiveNumBytes;

  /**
   * The beginning and end of the recipient name that should be removed before logging.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer sensitiveStartByte;

  /**
   * @return value or {@code null} for none
   */
  public AssistantApiCoreTypesCalendarEvent getCalendarEvent() {
    return calendarEvent;
  }

  /**
   * @param calendarEvent calendarEvent or {@code null} for none
   */
  public NlpSemanticParsingModelsCommunicationRecipient setCalendarEvent(AssistantApiCoreTypesCalendarEvent calendarEvent) {
    this.calendarEvent = calendarEvent;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public AssistantApiCoreTypesCalendarEventWrapper getCalendarEventWrapper() {
    return calendarEventWrapper;
  }

  /**
   * @param calendarEventWrapper calendarEventWrapper or {@code null} for none
   */
  public NlpSemanticParsingModelsCommunicationRecipient setCalendarEventWrapper(AssistantApiCoreTypesCalendarEventWrapper calendarEventWrapper) {
    this.calendarEventWrapper = calendarEventWrapper;
    return this;
  }

  /**
   * Contact details (e.g. gaia_id, phone, etc). Replaces 'focus_name' above.
   * @return value or {@code null} for none
   */
  public NlpSemanticParsingModelsPersonPerson getContact() {
    return contact;
  }

  /**
   * Contact details (e.g. gaia_id, phone, etc). Replaces 'focus_name' above.
   * @param contact contact or {@code null} for none
   */
  public NlpSemanticParsingModelsCommunicationRecipient setContact(NlpSemanticParsingModelsPersonPerson contact) {
    this.contact = contact;
    return this;
  }

  /**
   * Required, but should only be used inside Aqua and must not be used by outside clients!!
   * @return value or {@code null} for none
   */
  public NlpSemanticParsingAnnotationEvalData getEvalData() {
    return evalData;
  }

  /**
   * Required, but should only be used inside Aqua and must not be used by outside clients!!
   * @param evalData evalData or {@code null} for none
   */
  public NlpSemanticParsingModelsCommunicationRecipient setEvalData(NlpSemanticParsingAnnotationEvalData evalData) {
    this.evalData = evalData;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsAnnotatedFromText() {
    return isAnnotatedFromText;
  }

  /**
   * @param isAnnotatedFromText isAnnotatedFromText or {@code null} for none
   */
  public NlpSemanticParsingModelsCommunicationRecipient setIsAnnotatedFromText(java.lang.Boolean isAnnotatedFromText) {
    this.isAnnotatedFromText = isAnnotatedFromText;
    return this;
  }

  /**
   * Deprecated in favor of recipient.contact.name_annotation_source.
   * @return value or {@code null} for none
   */
  public java.lang.String getNameAnnotationSource() {
    return nameAnnotationSource;
  }

  /**
   * Deprecated in favor of recipient.contact.name_annotation_source.
   * @param nameAnnotationSource nameAnnotationSource or {@code null} for none
   */
  public NlpSemanticParsingModelsCommunicationRecipient setNameAnnotationSource(java.lang.String nameAnnotationSource) {
    this.nameAnnotationSource = nameAnnotationSource;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getNumberAnnotationSource() {
    return numberAnnotationSource;
  }

  /**
   * @param numberAnnotationSource numberAnnotationSource or {@code null} for none
   */
  public NlpSemanticParsingModelsCommunicationRecipient setNumberAnnotationSource(java.lang.String numberAnnotationSource) {
    this.numberAnnotationSource = numberAnnotationSource;
    return this;
  }

  /**
   * NOTE: for CONTACT recipient, this is *NOT* the real raw text of the recipient span of
   * historical reasons. Major differences includes: - stripping possessive suffix, e.g. "John's" ->
   * "John" - stripping prefix/suffix/title, e.g. "Mr. John" -> "John" - uninflect name for
   * languages like Russian, e.g. "Андрею" -> "Андрей" Currently this is the same as .contact.name,
   * and is used as the string shown to the user on clientside UI. If you're looking for real raw
   * text, use .contact.raw_text
   * @return value or {@code null} for none
   */
  public java.lang.String getRawText() {
    return rawText;
  }

  /**
   * NOTE: for CONTACT recipient, this is *NOT* the real raw text of the recipient span of
   * historical reasons. Major differences includes: - stripping possessive suffix, e.g. "John's" ->
   * "John" - stripping prefix/suffix/title, e.g. "Mr. John" -> "John" - uninflect name for
   * languages like Russian, e.g. "Андрею" -> "Андрей" Currently this is the same as .contact.name,
   * and is used as the string shown to the user on clientside UI. If you're looking for real raw
   * text, use .contact.raw_text
   * @param rawText rawText or {@code null} for none
   */
  public NlpSemanticParsingModelsCommunicationRecipient setRawText(java.lang.String rawText) {
    this.rawText = rawText;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getRecipientType() {
    return recipientType;
  }

  /**
   * @param recipientType recipientType or {@code null} for none
   */
  public NlpSemanticParsingModelsCommunicationRecipient setRecipientType(java.lang.String recipientType) {
    this.recipientType = recipientType;
    return this;
  }

  /**
   * A reference to a person by relationship name. eg. my father.
   * @return value or {@code null} for none
   */
  public NlpSemanticParsingModelsCommunicationRelationshipArgument getRelationship() {
    return relationship;
  }

  /**
   * A reference to a person by relationship name. eg. my father.
   * @param relationship relationship or {@code null} for none
   */
  public NlpSemanticParsingModelsCommunicationRecipient setRelationship(NlpSemanticParsingModelsCommunicationRelationshipArgument relationship) {
    this.relationship = relationship;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSensitiveNumBytes() {
    return sensitiveNumBytes;
  }

  /**
   * @param sensitiveNumBytes sensitiveNumBytes or {@code null} for none
   */
  public NlpSemanticParsingModelsCommunicationRecipient setSensitiveNumBytes(java.lang.Integer sensitiveNumBytes) {
    this.sensitiveNumBytes = sensitiveNumBytes;
    return this;
  }

  /**
   * The beginning and end of the recipient name that should be removed before logging.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSensitiveStartByte() {
    return sensitiveStartByte;
  }

  /**
   * The beginning and end of the recipient name that should be removed before logging.
   * @param sensitiveStartByte sensitiveStartByte or {@code null} for none
   */
  public NlpSemanticParsingModelsCommunicationRecipient setSensitiveStartByte(java.lang.Integer sensitiveStartByte) {
    this.sensitiveStartByte = sensitiveStartByte;
    return this;
  }

  @Override
  public NlpSemanticParsingModelsCommunicationRecipient set(String fieldName, Object value) {
    return (NlpSemanticParsingModelsCommunicationRecipient) super.set(fieldName, value);
  }

  @Override
  public NlpSemanticParsingModelsCommunicationRecipient clone() {
    return (NlpSemanticParsingModelsCommunicationRecipient) super.clone();
  }

}
