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
 * The Freebase type information.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RepositoryWebrefFreebaseType extends com.google.api.client.json.GenericJson {

  /**
   * Optional - for inferred types the principal source of information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> provenance;

  /**
   * Optional score. Not present in KG directly but e.g. in WPCat.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float score;

  /**
   * Mid of this type. Equivalent to type_name, but is more compact. When present, overrides
   * type_name (which can be omitted in this case to save space).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger typeMid;

  /**
   * e.g.: "/business/industry", "/book/book_subject", "/people/person"...
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String typeName;

  /**
   * Optional - for inferred types the principal source of information.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getProvenance() {
    return provenance;
  }

  /**
   * Optional - for inferred types the principal source of information.
   * @param provenance provenance or {@code null} for none
   */
  public RepositoryWebrefFreebaseType setProvenance(java.util.List<java.lang.String> provenance) {
    this.provenance = provenance;
    return this;
  }

  /**
   * Optional score. Not present in KG directly but e.g. in WPCat.
   * @return value or {@code null} for none
   */
  public java.lang.Float getScore() {
    return score;
  }

  /**
   * Optional score. Not present in KG directly but e.g. in WPCat.
   * @param score score or {@code null} for none
   */
  public RepositoryWebrefFreebaseType setScore(java.lang.Float score) {
    this.score = score;
    return this;
  }

  /**
   * Mid of this type. Equivalent to type_name, but is more compact. When present, overrides
   * type_name (which can be omitted in this case to save space).
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getTypeMid() {
    return typeMid;
  }

  /**
   * Mid of this type. Equivalent to type_name, but is more compact. When present, overrides
   * type_name (which can be omitted in this case to save space).
   * @param typeMid typeMid or {@code null} for none
   */
  public RepositoryWebrefFreebaseType setTypeMid(java.math.BigInteger typeMid) {
    this.typeMid = typeMid;
    return this;
  }

  /**
   * e.g.: "/business/industry", "/book/book_subject", "/people/person"...
   * @return value or {@code null} for none
   */
  public java.lang.String getTypeName() {
    return typeName;
  }

  /**
   * e.g.: "/business/industry", "/book/book_subject", "/people/person"...
   * @param typeName typeName or {@code null} for none
   */
  public RepositoryWebrefFreebaseType setTypeName(java.lang.String typeName) {
    this.typeName = typeName;
    return this;
  }

  @Override
  public RepositoryWebrefFreebaseType set(String fieldName, Object value) {
    return (RepositoryWebrefFreebaseType) super.set(fieldName, value);
  }

  @Override
  public RepositoryWebrefFreebaseType clone() {
    return (RepositoryWebrefFreebaseType) super.clone();
  }

}
