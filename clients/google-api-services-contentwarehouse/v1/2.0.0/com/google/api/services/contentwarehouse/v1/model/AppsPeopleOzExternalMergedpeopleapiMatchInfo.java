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
 * Represents the matching information for a field when there is a query.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppsPeopleOzExternalMergedpeopleapiMatchInfo extends com.google.api.client.json.GenericJson {

  /**
   * The list of matches ordered by most relevant matching for autocomplete coming first.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AppsPeopleOzExternalMergedpeopleapiMatchInfoLookupTokenMatch> match;

  /**
   * The query token we are matching against.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String query;

  /**
   * The list of matches ordered by most relevant matching for autocomplete coming first.
   * @return value or {@code null} for none
   */
  public java.util.List<AppsPeopleOzExternalMergedpeopleapiMatchInfoLookupTokenMatch> getMatch() {
    return match;
  }

  /**
   * The list of matches ordered by most relevant matching for autocomplete coming first.
   * @param match match or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiMatchInfo setMatch(java.util.List<AppsPeopleOzExternalMergedpeopleapiMatchInfoLookupTokenMatch> match) {
    this.match = match;
    return this;
  }

  /**
   * The query token we are matching against.
   * @return value or {@code null} for none
   */
  public java.lang.String getQuery() {
    return query;
  }

  /**
   * The query token we are matching against.
   * @param query query or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiMatchInfo setQuery(java.lang.String query) {
    this.query = query;
    return this;
  }

  @Override
  public AppsPeopleOzExternalMergedpeopleapiMatchInfo set(String fieldName, Object value) {
    return (AppsPeopleOzExternalMergedpeopleapiMatchInfo) super.set(fieldName, value);
  }

  @Override
  public AppsPeopleOzExternalMergedpeopleapiMatchInfo clone() {
    return (AppsPeopleOzExternalMergedpeopleapiMatchInfo) super.clone();
  }

}
