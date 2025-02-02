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
 * The end of the recurrence can be represented in one of three ways. 1. An abstract DateTime.
 * (inclusive) 2. An absolute timestamp, in milliseconds from UTC epoch. 3. A number of occurrences.
 * Exactly one of the fields [end_date_time, end_millis, num_occurrences] in this message must be
 * set. Repeating tasks for which the user did not specify an end date are automatically given a
 * reasonable end conditions by the system and auto_renew will be set to true. Similarly, if the
 * user- provided end date is too far in the future to reasonably create all instances, the server
 * will set an auto_renew_until end condition.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NlpSemanticParsingModelsRecurrenceRecurrenceEnd extends com.google.api.client.json.GenericJson {

  /**
   * Should be used in cases where the size of the recurrence is infinite (no end date specified),
   * in which case we rely on an offline process to extend. Set by server only, setting it on a new
   * recurrence will throw an exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean autoRenew;

  /**
   * Used in cases where the recurrence is too large to create in a single transaction. In this case
   * we create a manageable number of instances initially and rely on an offline process to
   * continually extend the recurrence until this date. Set by server only, setting it on a new
   * recurrence will throw an exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NlpSemanticParsingDateTimeAnnotation autoRenewUntil;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NlpSemanticParsingDateTimeAnnotation endDateTime;

  /**
   * Deprecated - prefer end_date_time.absolute_time_ms.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long endMillis;

  /**
   * Note that auto-renewing is not supported in conjunction with num_occurrences. Therefore we
   * impose a hard limit of 1000 when using this field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numOccurrences;

  /**
   * Should be used in cases where the size of the recurrence is infinite (no end date specified),
   * in which case we rely on an offline process to extend. Set by server only, setting it on a new
   * recurrence will throw an exception.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAutoRenew() {
    return autoRenew;
  }

  /**
   * Should be used in cases where the size of the recurrence is infinite (no end date specified),
   * in which case we rely on an offline process to extend. Set by server only, setting it on a new
   * recurrence will throw an exception.
   * @param autoRenew autoRenew or {@code null} for none
   */
  public NlpSemanticParsingModelsRecurrenceRecurrenceEnd setAutoRenew(java.lang.Boolean autoRenew) {
    this.autoRenew = autoRenew;
    return this;
  }

  /**
   * Used in cases where the recurrence is too large to create in a single transaction. In this case
   * we create a manageable number of instances initially and rely on an offline process to
   * continually extend the recurrence until this date. Set by server only, setting it on a new
   * recurrence will throw an exception.
   * @return value or {@code null} for none
   */
  public NlpSemanticParsingDateTimeAnnotation getAutoRenewUntil() {
    return autoRenewUntil;
  }

  /**
   * Used in cases where the recurrence is too large to create in a single transaction. In this case
   * we create a manageable number of instances initially and rely on an offline process to
   * continually extend the recurrence until this date. Set by server only, setting it on a new
   * recurrence will throw an exception.
   * @param autoRenewUntil autoRenewUntil or {@code null} for none
   */
  public NlpSemanticParsingModelsRecurrenceRecurrenceEnd setAutoRenewUntil(NlpSemanticParsingDateTimeAnnotation autoRenewUntil) {
    this.autoRenewUntil = autoRenewUntil;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public NlpSemanticParsingDateTimeAnnotation getEndDateTime() {
    return endDateTime;
  }

  /**
   * @param endDateTime endDateTime or {@code null} for none
   */
  public NlpSemanticParsingModelsRecurrenceRecurrenceEnd setEndDateTime(NlpSemanticParsingDateTimeAnnotation endDateTime) {
    this.endDateTime = endDateTime;
    return this;
  }

  /**
   * Deprecated - prefer end_date_time.absolute_time_ms.
   * @return value or {@code null} for none
   */
  public java.lang.Long getEndMillis() {
    return endMillis;
  }

  /**
   * Deprecated - prefer end_date_time.absolute_time_ms.
   * @param endMillis endMillis or {@code null} for none
   */
  public NlpSemanticParsingModelsRecurrenceRecurrenceEnd setEndMillis(java.lang.Long endMillis) {
    this.endMillis = endMillis;
    return this;
  }

  /**
   * Note that auto-renewing is not supported in conjunction with num_occurrences. Therefore we
   * impose a hard limit of 1000 when using this field.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumOccurrences() {
    return numOccurrences;
  }

  /**
   * Note that auto-renewing is not supported in conjunction with num_occurrences. Therefore we
   * impose a hard limit of 1000 when using this field.
   * @param numOccurrences numOccurrences or {@code null} for none
   */
  public NlpSemanticParsingModelsRecurrenceRecurrenceEnd setNumOccurrences(java.lang.Integer numOccurrences) {
    this.numOccurrences = numOccurrences;
    return this;
  }

  @Override
  public NlpSemanticParsingModelsRecurrenceRecurrenceEnd set(String fieldName, Object value) {
    return (NlpSemanticParsingModelsRecurrenceRecurrenceEnd) super.set(fieldName, value);
  }

  @Override
  public NlpSemanticParsingModelsRecurrenceRecurrenceEnd clone() {
    return (NlpSemanticParsingModelsRecurrenceRecurrenceEnd) super.clone();
  }

}
