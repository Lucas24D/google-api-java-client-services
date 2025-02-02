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
 * A TypeTrait configures a value that has a property with any of the given trait_id. In practice
 * this means: - any entity that has a metadata ID defined in the KP type_schema, - any intent that
 * has a slot with the given ID. When comparing trait_id to metadata IDs or slot IDs, we lowercase
 * and normalize for comparison.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class KnowledgeAnswersTypeTrait extends com.google.api.client.json.GenericJson {

  /**
   * Contains data about current schema remodelings at this ValueType level. For more information
   * see go/meaning-remodeling-framework.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NlpMeaningMeaningRemodelings remodelings;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> traitId;

  /**
   * Contains data about current schema remodelings at this ValueType level. For more information
   * see go/meaning-remodeling-framework.
   * @return value or {@code null} for none
   */
  public NlpMeaningMeaningRemodelings getRemodelings() {
    return remodelings;
  }

  /**
   * Contains data about current schema remodelings at this ValueType level. For more information
   * see go/meaning-remodeling-framework.
   * @param remodelings remodelings or {@code null} for none
   */
  public KnowledgeAnswersTypeTrait setRemodelings(NlpMeaningMeaningRemodelings remodelings) {
    this.remodelings = remodelings;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTraitId() {
    return traitId;
  }

  /**
   * @param traitId traitId or {@code null} for none
   */
  public KnowledgeAnswersTypeTrait setTraitId(java.util.List<java.lang.String> traitId) {
    this.traitId = traitId;
    return this;
  }

  @Override
  public KnowledgeAnswersTypeTrait set(String fieldName, Object value) {
    return (KnowledgeAnswersTypeTrait) super.set(fieldName, value);
  }

  @Override
  public KnowledgeAnswersTypeTrait clone() {
    return (KnowledgeAnswersTypeTrait) super.clone();
  }

}
