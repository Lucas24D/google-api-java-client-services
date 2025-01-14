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
 * Store ProductInformation for a given version of the models used in VSS.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ImageRepositoryShoppingProductInformationVersionedProductInformationSet extends com.google.api.client.json.GenericJson {

  /**
   * The type of the model.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String modelType;

  /**
   * List of ProductInformation for this version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ImageRepositoryShoppingProductInformationProductInformation> products;

  static {
    // hack to force ProGuard to consider ImageRepositoryShoppingProductInformationProductInformation used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ImageRepositoryShoppingProductInformationProductInformation.class);
  }

  /**
   * The version of the models used in VSS. Newer version will have a higher version number.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer version;

  /**
   * The type of the model.
   * @return value or {@code null} for none
   */
  public java.lang.String getModelType() {
    return modelType;
  }

  /**
   * The type of the model.
   * @param modelType modelType or {@code null} for none
   */
  public ImageRepositoryShoppingProductInformationVersionedProductInformationSet setModelType(java.lang.String modelType) {
    this.modelType = modelType;
    return this;
  }

  /**
   * List of ProductInformation for this version.
   * @return value or {@code null} for none
   */
  public java.util.List<ImageRepositoryShoppingProductInformationProductInformation> getProducts() {
    return products;
  }

  /**
   * List of ProductInformation for this version.
   * @param products products or {@code null} for none
   */
  public ImageRepositoryShoppingProductInformationVersionedProductInformationSet setProducts(java.util.List<ImageRepositoryShoppingProductInformationProductInformation> products) {
    this.products = products;
    return this;
  }

  /**
   * The version of the models used in VSS. Newer version will have a higher version number.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getVersion() {
    return version;
  }

  /**
   * The version of the models used in VSS. Newer version will have a higher version number.
   * @param version version or {@code null} for none
   */
  public ImageRepositoryShoppingProductInformationVersionedProductInformationSet setVersion(java.lang.Integer version) {
    this.version = version;
    return this;
  }

  @Override
  public ImageRepositoryShoppingProductInformationVersionedProductInformationSet set(String fieldName, Object value) {
    return (ImageRepositoryShoppingProductInformationVersionedProductInformationSet) super.set(fieldName, value);
  }

  @Override
  public ImageRepositoryShoppingProductInformationVersionedProductInformationSet clone() {
    return (ImageRepositoryShoppingProductInformationVersionedProductInformationSet) super.clone();
  }

}
