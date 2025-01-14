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
 * Represents a domain specific entity data.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RepositoryWebrefDomainSpecificRepresentation extends com.google.api.client.json.GenericJson {

  /**
   * The actual domain specific data. For example it can be freebase.Topic,
   * repository_wikipedia.WikiJoin, ocean.WorkMetadata, geostore.Feature.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Proto2BridgeMessageSet entityData;

  /**
   * The actual domain specific data. For example it can be freebase.Topic,
   * repository_wikipedia.WikiJoin, ocean.WorkMetadata, geostore.Feature.
   * @return value or {@code null} for none
   */
  public Proto2BridgeMessageSet getEntityData() {
    return entityData;
  }

  /**
   * The actual domain specific data. For example it can be freebase.Topic,
   * repository_wikipedia.WikiJoin, ocean.WorkMetadata, geostore.Feature.
   * @param entityData entityData or {@code null} for none
   */
  public RepositoryWebrefDomainSpecificRepresentation setEntityData(Proto2BridgeMessageSet entityData) {
    this.entityData = entityData;
    return this;
  }

  @Override
  public RepositoryWebrefDomainSpecificRepresentation set(String fieldName, Object value) {
    return (RepositoryWebrefDomainSpecificRepresentation) super.set(fieldName, value);
  }

  @Override
  public RepositoryWebrefDomainSpecificRepresentation clone() {
    return (RepositoryWebrefDomainSpecificRepresentation) super.clone();
  }

}
