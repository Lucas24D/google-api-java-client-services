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
 * Information specific to rosters like Google Groups and Chatrooms.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppsPeopleOzExternalMergedpeopleapiRosterDetails extends com.google.api.client.json.GenericJson {

  /**
   * Abridged / sample subset of member details of the roster. NOTE: This field is only returned if
   * the request's field mask includes "person.roster_details.abridged_roster_memberships".
   * http://cs/symbol:google.apps.cloudidentity.groups.internal.GroupSummary.abridged_memberships
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AppsPeopleOzExternalMergedpeopleapiRosterMember> abridgedRosterMemberships;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppsPeopleOzExternalMergedpeopleapiPersonFieldMetadata metadata;

  /**
   * Indicates the number of members and sub-rosters of the roster. Corresponds to
   * http://cs/symbol:google.apps.cloudidentity.groups.internal.Group.direct_member_count_per_type
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppsPeopleOzExternalMergedpeopleapiRosterMemberCount rosterMemberCount;

  /**
   * Abridged / sample subset of member details of the roster. NOTE: This field is only returned if
   * the request's field mask includes "person.roster_details.abridged_roster_memberships".
   * http://cs/symbol:google.apps.cloudidentity.groups.internal.GroupSummary.abridged_memberships
   * @return value or {@code null} for none
   */
  public java.util.List<AppsPeopleOzExternalMergedpeopleapiRosterMember> getAbridgedRosterMemberships() {
    return abridgedRosterMemberships;
  }

  /**
   * Abridged / sample subset of member details of the roster. NOTE: This field is only returned if
   * the request's field mask includes "person.roster_details.abridged_roster_memberships".
   * http://cs/symbol:google.apps.cloudidentity.groups.internal.GroupSummary.abridged_memberships
   * @param abridgedRosterMemberships abridgedRosterMemberships or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiRosterDetails setAbridgedRosterMemberships(java.util.List<AppsPeopleOzExternalMergedpeopleapiRosterMember> abridgedRosterMemberships) {
    this.abridgedRosterMemberships = abridgedRosterMemberships;
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
  public AppsPeopleOzExternalMergedpeopleapiRosterDetails setMetadata(AppsPeopleOzExternalMergedpeopleapiPersonFieldMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Indicates the number of members and sub-rosters of the roster. Corresponds to
   * http://cs/symbol:google.apps.cloudidentity.groups.internal.Group.direct_member_count_per_type
   * @return value or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiRosterMemberCount getRosterMemberCount() {
    return rosterMemberCount;
  }

  /**
   * Indicates the number of members and sub-rosters of the roster. Corresponds to
   * http://cs/symbol:google.apps.cloudidentity.groups.internal.Group.direct_member_count_per_type
   * @param rosterMemberCount rosterMemberCount or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiRosterDetails setRosterMemberCount(AppsPeopleOzExternalMergedpeopleapiRosterMemberCount rosterMemberCount) {
    this.rosterMemberCount = rosterMemberCount;
    return this;
  }

  @Override
  public AppsPeopleOzExternalMergedpeopleapiRosterDetails set(String fieldName, Object value) {
    return (AppsPeopleOzExternalMergedpeopleapiRosterDetails) super.set(fieldName, value);
  }

  @Override
  public AppsPeopleOzExternalMergedpeopleapiRosterDetails clone() {
    return (AppsPeopleOzExternalMergedpeopleapiRosterDetails) super.clone();
  }

}
