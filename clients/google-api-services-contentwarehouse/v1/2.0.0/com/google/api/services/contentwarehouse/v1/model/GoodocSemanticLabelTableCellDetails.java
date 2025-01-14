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
 * If Appearance is TABLE_CELL:
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoodocSemanticLabelTableCellDetails extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("Column")
  private java.lang.Integer column;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("ColumnSpan")
  private java.lang.Integer columnSpan;

  /**
   * Row and Column are 0-based
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("Row")
  private java.lang.Integer row;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("RowSpan")
  private java.lang.Integer rowSpan;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getColumn() {
    return column;
  }

  /**
   * @param column column or {@code null} for none
   */
  public GoodocSemanticLabelTableCellDetails setColumn(java.lang.Integer column) {
    this.column = column;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getColumnSpan() {
    return columnSpan;
  }

  /**
   * @param columnSpan columnSpan or {@code null} for none
   */
  public GoodocSemanticLabelTableCellDetails setColumnSpan(java.lang.Integer columnSpan) {
    this.columnSpan = columnSpan;
    return this;
  }

  /**
   * Row and Column are 0-based
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRow() {
    return row;
  }

  /**
   * Row and Column are 0-based
   * @param row row or {@code null} for none
   */
  public GoodocSemanticLabelTableCellDetails setRow(java.lang.Integer row) {
    this.row = row;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRowSpan() {
    return rowSpan;
  }

  /**
   * @param rowSpan rowSpan or {@code null} for none
   */
  public GoodocSemanticLabelTableCellDetails setRowSpan(java.lang.Integer rowSpan) {
    this.rowSpan = rowSpan;
    return this;
  }

  @Override
  public GoodocSemanticLabelTableCellDetails set(String fieldName, Object value) {
    return (GoodocSemanticLabelTableCellDetails) super.set(fieldName, value);
  }

  @Override
  public GoodocSemanticLabelTableCellDetails clone() {
    return (GoodocSemanticLabelTableCellDetails) super.clone();
  }

}
