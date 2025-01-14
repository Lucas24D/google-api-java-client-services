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
 * Model definition for AppsPeopleOzExternalMergedpeopleapiOrganization.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppsPeopleOzExternalMergedpeopleapiOrganization extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AppsPeopleOzExternalMergedpeopleapiOrganizationAssignment> assignment;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String certification;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String costCenter;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean current;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String department;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String domain;

  /**
   * Start and End Dates are better represented as calendar entities. The intention is to replace
   * timestamps. Not set if no value exists. Clients can choose whether to use has* semantics or
   * default value semantics. For writes, the default proto and an absent message are equivalent.
   * Legacy callers in the legacy_timestamp_event_write_behavior_enabled capability allowlist should
   * write to PeopleApi via end_ms and migrate to setting both so they can be removed from the
   * whitelist.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleTypeDate endCalendarDay;

  /**
   * Clients are encouraged to read the end_calendar_day instead. PeopleApi writes will still use
   * end_ms for legacy callers that are in the legacy_timestamp_event_write_behavior_enabled
   * capability allowlist. New writers must use the calendar_day fields.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long endMs;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long endMsAsNumber;

  /**
   * The `string_type` translated and formatted in the request locale. See go/people-api-
   * howto/localization for details on how to usage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String formattedStringType;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer fteMilliPercent;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float importance;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppsPeopleOzExternalMergedpeopleapiPersonFieldMetadata metadata;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AppsPeopleOzExternalMergedpeopleapiOrganizationProject> project;

  /**
   * Start and End Dates are better represented as calendar entities. The intention is to replace
   * timestamps. Not set if no value exists. Clients can choose whether to use has* semantics or
   * default value semantics. For writes, the default proto and an absent message are equivalent.
   * Legacy callers in the legacy_timestamp_event_write_behavior_enabled capability allowlist should
   * write to PeopleApi via start_ms and migrate to setting both so they can be removed from the
   * allowlist.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleTypeDate startCalendarDay;

  /**
   * Clients are encouraged to read the start_calendar_day instead. PeopleApi writes will still use
   * start_ms for legacy callers that are in the legacy_timestamp_event_write_behavior_enabled
   * capability allowlist. New writers must use the calendar_day fields.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long startMs;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long startMsAsNumber;

  /**
   * The type of the organization. The type can be free form or one of these predefined values: *
   * `work` * `school`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stringType;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String symbol;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String yomiName;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<AppsPeopleOzExternalMergedpeopleapiOrganizationAssignment> getAssignment() {
    return assignment;
  }

  /**
   * @param assignment assignment or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiOrganization setAssignment(java.util.List<AppsPeopleOzExternalMergedpeopleapiOrganizationAssignment> assignment) {
    this.assignment = assignment;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCertification() {
    return certification;
  }

  /**
   * @param certification certification or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiOrganization setCertification(java.lang.String certification) {
    this.certification = certification;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCostCenter() {
    return costCenter;
  }

  /**
   * @param costCenter costCenter or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiOrganization setCostCenter(java.lang.String costCenter) {
    this.costCenter = costCenter;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCurrent() {
    return current;
  }

  /**
   * @param current current or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiOrganization setCurrent(java.lang.Boolean current) {
    this.current = current;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDepartment() {
    return department;
  }

  /**
   * @param department department or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiOrganization setDepartment(java.lang.String department) {
    this.department = department;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * @param description description or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiOrganization setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDomain() {
    return domain;
  }

  /**
   * @param domain domain or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiOrganization setDomain(java.lang.String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * Start and End Dates are better represented as calendar entities. The intention is to replace
   * timestamps. Not set if no value exists. Clients can choose whether to use has* semantics or
   * default value semantics. For writes, the default proto and an absent message are equivalent.
   * Legacy callers in the legacy_timestamp_event_write_behavior_enabled capability allowlist should
   * write to PeopleApi via end_ms and migrate to setting both so they can be removed from the
   * whitelist.
   * @return value or {@code null} for none
   */
  public GoogleTypeDate getEndCalendarDay() {
    return endCalendarDay;
  }

  /**
   * Start and End Dates are better represented as calendar entities. The intention is to replace
   * timestamps. Not set if no value exists. Clients can choose whether to use has* semantics or
   * default value semantics. For writes, the default proto and an absent message are equivalent.
   * Legacy callers in the legacy_timestamp_event_write_behavior_enabled capability allowlist should
   * write to PeopleApi via end_ms and migrate to setting both so they can be removed from the
   * whitelist.
   * @param endCalendarDay endCalendarDay or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiOrganization setEndCalendarDay(GoogleTypeDate endCalendarDay) {
    this.endCalendarDay = endCalendarDay;
    return this;
  }

  /**
   * Clients are encouraged to read the end_calendar_day instead. PeopleApi writes will still use
   * end_ms for legacy callers that are in the legacy_timestamp_event_write_behavior_enabled
   * capability allowlist. New writers must use the calendar_day fields.
   * @return value or {@code null} for none
   */
  public java.lang.Long getEndMs() {
    return endMs;
  }

  /**
   * Clients are encouraged to read the end_calendar_day instead. PeopleApi writes will still use
   * end_ms for legacy callers that are in the legacy_timestamp_event_write_behavior_enabled
   * capability allowlist. New writers must use the calendar_day fields.
   * @param endMs endMs or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiOrganization setEndMs(java.lang.Long endMs) {
    this.endMs = endMs;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getEndMsAsNumber() {
    return endMsAsNumber;
  }

  /**
   * @param endMsAsNumber endMsAsNumber or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiOrganization setEndMsAsNumber(java.lang.Long endMsAsNumber) {
    this.endMsAsNumber = endMsAsNumber;
    return this;
  }

  /**
   * The `string_type` translated and formatted in the request locale. See go/people-api-
   * howto/localization for details on how to usage.
   * @return value or {@code null} for none
   */
  public java.lang.String getFormattedStringType() {
    return formattedStringType;
  }

  /**
   * The `string_type` translated and formatted in the request locale. See go/people-api-
   * howto/localization for details on how to usage.
   * @param formattedStringType formattedStringType or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiOrganization setFormattedStringType(java.lang.String formattedStringType) {
    this.formattedStringType = formattedStringType;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getFteMilliPercent() {
    return fteMilliPercent;
  }

  /**
   * @param fteMilliPercent fteMilliPercent or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiOrganization setFteMilliPercent(java.lang.Integer fteMilliPercent) {
    this.fteMilliPercent = fteMilliPercent;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Float getImportance() {
    return importance;
  }

  /**
   * @param importance importance or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiOrganization setImportance(java.lang.Float importance) {
    this.importance = importance;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * @param location location or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiOrganization setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiPersonFieldMetadata getMetadata() {
    return metadata;
  }

  /**
   * @param metadata metadata or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiOrganization setMetadata(AppsPeopleOzExternalMergedpeopleapiPersonFieldMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * @param name name or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiOrganization setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<AppsPeopleOzExternalMergedpeopleapiOrganizationProject> getProject() {
    return project;
  }

  /**
   * @param project project or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiOrganization setProject(java.util.List<AppsPeopleOzExternalMergedpeopleapiOrganizationProject> project) {
    this.project = project;
    return this;
  }

  /**
   * Start and End Dates are better represented as calendar entities. The intention is to replace
   * timestamps. Not set if no value exists. Clients can choose whether to use has* semantics or
   * default value semantics. For writes, the default proto and an absent message are equivalent.
   * Legacy callers in the legacy_timestamp_event_write_behavior_enabled capability allowlist should
   * write to PeopleApi via start_ms and migrate to setting both so they can be removed from the
   * allowlist.
   * @return value or {@code null} for none
   */
  public GoogleTypeDate getStartCalendarDay() {
    return startCalendarDay;
  }

  /**
   * Start and End Dates are better represented as calendar entities. The intention is to replace
   * timestamps. Not set if no value exists. Clients can choose whether to use has* semantics or
   * default value semantics. For writes, the default proto and an absent message are equivalent.
   * Legacy callers in the legacy_timestamp_event_write_behavior_enabled capability allowlist should
   * write to PeopleApi via start_ms and migrate to setting both so they can be removed from the
   * allowlist.
   * @param startCalendarDay startCalendarDay or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiOrganization setStartCalendarDay(GoogleTypeDate startCalendarDay) {
    this.startCalendarDay = startCalendarDay;
    return this;
  }

  /**
   * Clients are encouraged to read the start_calendar_day instead. PeopleApi writes will still use
   * start_ms for legacy callers that are in the legacy_timestamp_event_write_behavior_enabled
   * capability allowlist. New writers must use the calendar_day fields.
   * @return value or {@code null} for none
   */
  public java.lang.Long getStartMs() {
    return startMs;
  }

  /**
   * Clients are encouraged to read the start_calendar_day instead. PeopleApi writes will still use
   * start_ms for legacy callers that are in the legacy_timestamp_event_write_behavior_enabled
   * capability allowlist. New writers must use the calendar_day fields.
   * @param startMs startMs or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiOrganization setStartMs(java.lang.Long startMs) {
    this.startMs = startMs;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getStartMsAsNumber() {
    return startMsAsNumber;
  }

  /**
   * @param startMsAsNumber startMsAsNumber or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiOrganization setStartMsAsNumber(java.lang.Long startMsAsNumber) {
    this.startMsAsNumber = startMsAsNumber;
    return this;
  }

  /**
   * The type of the organization. The type can be free form or one of these predefined values: *
   * `work` * `school`
   * @return value or {@code null} for none
   */
  public java.lang.String getStringType() {
    return stringType;
  }

  /**
   * The type of the organization. The type can be free form or one of these predefined values: *
   * `work` * `school`
   * @param stringType stringType or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiOrganization setStringType(java.lang.String stringType) {
    this.stringType = stringType;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSymbol() {
    return symbol;
  }

  /**
   * @param symbol symbol or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiOrganization setSymbol(java.lang.String symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * @param title title or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiOrganization setTitle(java.lang.String title) {
    this.title = title;
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
  public AppsPeopleOzExternalMergedpeopleapiOrganization setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getYomiName() {
    return yomiName;
  }

  /**
   * @param yomiName yomiName or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiOrganization setYomiName(java.lang.String yomiName) {
    this.yomiName = yomiName;
    return this;
  }

  @Override
  public AppsPeopleOzExternalMergedpeopleapiOrganization set(String fieldName, Object value) {
    return (AppsPeopleOzExternalMergedpeopleapiOrganization) super.set(fieldName, value);
  }

  @Override
  public AppsPeopleOzExternalMergedpeopleapiOrganization clone() {
    return (AppsPeopleOzExternalMergedpeopleapiOrganization) super.clone();
  }

}
