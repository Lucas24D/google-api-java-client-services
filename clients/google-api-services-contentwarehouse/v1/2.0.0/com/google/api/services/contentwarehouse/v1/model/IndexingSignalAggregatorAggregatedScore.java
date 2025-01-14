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
 * Aggregated signal used by NumericSignalAggregator. Next field id: 25
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class IndexingSignalAggregatorAggregatedScore extends com.google.api.client.json.GenericJson {

  /**
   * A number reflecting the deviation of Url scores.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double deviation;

  /**
   * State variables for West & Chan variance algorithm used to be stored here directly. Now they
   * are stored inside RunningMeanAndVarianceInternalState.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double m2;

  /**
   * Input UrlScore with max score.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private IndexingSignalAggregatorUrlScore maxScoreUrl;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double mean;

  /**
   * Overall stats that are only available in final aggregation results. The aggregated score.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double meanScore;

  /**
   * Input UrlScore with min score.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private IndexingSignalAggregatorUrlScore minScoreUrl;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long numImportantUrls;

  /**
   * Final Stats that are also available in intermediate output. Number of Urls matching the class.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long numUrlsMatched;

  /**
   * Not every matching url has a signal.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long numUrlsWithSignal;

  /**
   * Experimental layer of the corresponding pattern.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String patternLayer;

  /**
   * Optionally populated in mediators. A list of patterns that actually contributed to the final
   * mediated signal.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> patternsUsedInMediation;

  /**
   * Score percentile of matching urls. If present, it has N entries for buckets of roughly equal
   * number of urls. N is specified the aggregation. The value is the min score in that bucket.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Double> percentile;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private IndexingSignalAggregatorRunningMeanAndVarianceInternalState runningMeanAndVarianceInternalState;

  /**
   * Random samples.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<IndexingSignalAggregatorUrlScore> samples;

  /**
   * for calculating percentile
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Double> scores;

  /**
   * For debugging purposes, this is an id of the signal associated with this AggregatedScore. For
   * pattern score, this may be the length of the pattern.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer signalId;

  /**
   * If this field presents, it is for a single url. No other field should appear.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private IndexingSignalAggregatorUrlScore singleUrlScore;

  /**
   * summation varaible used to get mean
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double totalScore;

  /**
   * low-order part of total_score
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double totalScoreLow;

  /**
   * summation variable for calculating deviation note, these are now only used for legacy and
   * debugging purposes
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double totalScoreSqr;

  /**
   * low order part of total_score_sq
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double totalScoreSqrLow;

  /**
   * for calculating weighted mean/dev
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double totalWeight;

  /**
   * low order part of total_weight
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double totalWeightLow;

  /**
   * A number reflecting the deviation of Url scores.
   * @return value or {@code null} for none
   */
  public java.lang.Double getDeviation() {
    return deviation;
  }

  /**
   * A number reflecting the deviation of Url scores.
   * @param deviation deviation or {@code null} for none
   */
  public IndexingSignalAggregatorAggregatedScore setDeviation(java.lang.Double deviation) {
    this.deviation = deviation;
    return this;
  }

  /**
   * State variables for West & Chan variance algorithm used to be stored here directly. Now they
   * are stored inside RunningMeanAndVarianceInternalState.
   * @return value or {@code null} for none
   */
  public java.lang.Double getM2() {
    return m2;
  }

  /**
   * State variables for West & Chan variance algorithm used to be stored here directly. Now they
   * are stored inside RunningMeanAndVarianceInternalState.
   * @param m2 m2 or {@code null} for none
   */
  public IndexingSignalAggregatorAggregatedScore setM2(java.lang.Double m2) {
    this.m2 = m2;
    return this;
  }

  /**
   * Input UrlScore with max score.
   * @return value or {@code null} for none
   */
  public IndexingSignalAggregatorUrlScore getMaxScoreUrl() {
    return maxScoreUrl;
  }

  /**
   * Input UrlScore with max score.
   * @param maxScoreUrl maxScoreUrl or {@code null} for none
   */
  public IndexingSignalAggregatorAggregatedScore setMaxScoreUrl(IndexingSignalAggregatorUrlScore maxScoreUrl) {
    this.maxScoreUrl = maxScoreUrl;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getMean() {
    return mean;
  }

  /**
   * @param mean mean or {@code null} for none
   */
  public IndexingSignalAggregatorAggregatedScore setMean(java.lang.Double mean) {
    this.mean = mean;
    return this;
  }

  /**
   * Overall stats that are only available in final aggregation results. The aggregated score.
   * @return value or {@code null} for none
   */
  public java.lang.Double getMeanScore() {
    return meanScore;
  }

  /**
   * Overall stats that are only available in final aggregation results. The aggregated score.
   * @param meanScore meanScore or {@code null} for none
   */
  public IndexingSignalAggregatorAggregatedScore setMeanScore(java.lang.Double meanScore) {
    this.meanScore = meanScore;
    return this;
  }

  /**
   * Input UrlScore with min score.
   * @return value or {@code null} for none
   */
  public IndexingSignalAggregatorUrlScore getMinScoreUrl() {
    return minScoreUrl;
  }

  /**
   * Input UrlScore with min score.
   * @param minScoreUrl minScoreUrl or {@code null} for none
   */
  public IndexingSignalAggregatorAggregatedScore setMinScoreUrl(IndexingSignalAggregatorUrlScore minScoreUrl) {
    this.minScoreUrl = minScoreUrl;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getNumImportantUrls() {
    return numImportantUrls;
  }

  /**
   * @param numImportantUrls numImportantUrls or {@code null} for none
   */
  public IndexingSignalAggregatorAggregatedScore setNumImportantUrls(java.lang.Long numImportantUrls) {
    this.numImportantUrls = numImportantUrls;
    return this;
  }

  /**
   * Final Stats that are also available in intermediate output. Number of Urls matching the class.
   * @return value or {@code null} for none
   */
  public java.lang.Long getNumUrlsMatched() {
    return numUrlsMatched;
  }

  /**
   * Final Stats that are also available in intermediate output. Number of Urls matching the class.
   * @param numUrlsMatched numUrlsMatched or {@code null} for none
   */
  public IndexingSignalAggregatorAggregatedScore setNumUrlsMatched(java.lang.Long numUrlsMatched) {
    this.numUrlsMatched = numUrlsMatched;
    return this;
  }

  /**
   * Not every matching url has a signal.
   * @return value or {@code null} for none
   */
  public java.lang.Long getNumUrlsWithSignal() {
    return numUrlsWithSignal;
  }

  /**
   * Not every matching url has a signal.
   * @param numUrlsWithSignal numUrlsWithSignal or {@code null} for none
   */
  public IndexingSignalAggregatorAggregatedScore setNumUrlsWithSignal(java.lang.Long numUrlsWithSignal) {
    this.numUrlsWithSignal = numUrlsWithSignal;
    return this;
  }

  /**
   * Experimental layer of the corresponding pattern.
   * @return value or {@code null} for none
   */
  public java.lang.String getPatternLayer() {
    return patternLayer;
  }

  /**
   * Experimental layer of the corresponding pattern.
   * @param patternLayer patternLayer or {@code null} for none
   */
  public IndexingSignalAggregatorAggregatedScore setPatternLayer(java.lang.String patternLayer) {
    this.patternLayer = patternLayer;
    return this;
  }

  /**
   * Optionally populated in mediators. A list of patterns that actually contributed to the final
   * mediated signal.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPatternsUsedInMediation() {
    return patternsUsedInMediation;
  }

  /**
   * Optionally populated in mediators. A list of patterns that actually contributed to the final
   * mediated signal.
   * @param patternsUsedInMediation patternsUsedInMediation or {@code null} for none
   */
  public IndexingSignalAggregatorAggregatedScore setPatternsUsedInMediation(java.util.List<java.lang.String> patternsUsedInMediation) {
    this.patternsUsedInMediation = patternsUsedInMediation;
    return this;
  }

  /**
   * Score percentile of matching urls. If present, it has N entries for buckets of roughly equal
   * number of urls. N is specified the aggregation. The value is the min score in that bucket.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Double> getPercentile() {
    return percentile;
  }

  /**
   * Score percentile of matching urls. If present, it has N entries for buckets of roughly equal
   * number of urls. N is specified the aggregation. The value is the min score in that bucket.
   * @param percentile percentile or {@code null} for none
   */
  public IndexingSignalAggregatorAggregatedScore setPercentile(java.util.List<java.lang.Double> percentile) {
    this.percentile = percentile;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public IndexingSignalAggregatorRunningMeanAndVarianceInternalState getRunningMeanAndVarianceInternalState() {
    return runningMeanAndVarianceInternalState;
  }

  /**
   * @param runningMeanAndVarianceInternalState runningMeanAndVarianceInternalState or {@code null} for none
   */
  public IndexingSignalAggregatorAggregatedScore setRunningMeanAndVarianceInternalState(IndexingSignalAggregatorRunningMeanAndVarianceInternalState runningMeanAndVarianceInternalState) {
    this.runningMeanAndVarianceInternalState = runningMeanAndVarianceInternalState;
    return this;
  }

  /**
   * Random samples.
   * @return value or {@code null} for none
   */
  public java.util.List<IndexingSignalAggregatorUrlScore> getSamples() {
    return samples;
  }

  /**
   * Random samples.
   * @param samples samples or {@code null} for none
   */
  public IndexingSignalAggregatorAggregatedScore setSamples(java.util.List<IndexingSignalAggregatorUrlScore> samples) {
    this.samples = samples;
    return this;
  }

  /**
   * for calculating percentile
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Double> getScores() {
    return scores;
  }

  /**
   * for calculating percentile
   * @param scores scores or {@code null} for none
   */
  public IndexingSignalAggregatorAggregatedScore setScores(java.util.List<java.lang.Double> scores) {
    this.scores = scores;
    return this;
  }

  /**
   * For debugging purposes, this is an id of the signal associated with this AggregatedScore. For
   * pattern score, this may be the length of the pattern.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSignalId() {
    return signalId;
  }

  /**
   * For debugging purposes, this is an id of the signal associated with this AggregatedScore. For
   * pattern score, this may be the length of the pattern.
   * @param signalId signalId or {@code null} for none
   */
  public IndexingSignalAggregatorAggregatedScore setSignalId(java.lang.Integer signalId) {
    this.signalId = signalId;
    return this;
  }

  /**
   * If this field presents, it is for a single url. No other field should appear.
   * @return value or {@code null} for none
   */
  public IndexingSignalAggregatorUrlScore getSingleUrlScore() {
    return singleUrlScore;
  }

  /**
   * If this field presents, it is for a single url. No other field should appear.
   * @param singleUrlScore singleUrlScore or {@code null} for none
   */
  public IndexingSignalAggregatorAggregatedScore setSingleUrlScore(IndexingSignalAggregatorUrlScore singleUrlScore) {
    this.singleUrlScore = singleUrlScore;
    return this;
  }

  /**
   * summation varaible used to get mean
   * @return value or {@code null} for none
   */
  public java.lang.Double getTotalScore() {
    return totalScore;
  }

  /**
   * summation varaible used to get mean
   * @param totalScore totalScore or {@code null} for none
   */
  public IndexingSignalAggregatorAggregatedScore setTotalScore(java.lang.Double totalScore) {
    this.totalScore = totalScore;
    return this;
  }

  /**
   * low-order part of total_score
   * @return value or {@code null} for none
   */
  public java.lang.Double getTotalScoreLow() {
    return totalScoreLow;
  }

  /**
   * low-order part of total_score
   * @param totalScoreLow totalScoreLow or {@code null} for none
   */
  public IndexingSignalAggregatorAggregatedScore setTotalScoreLow(java.lang.Double totalScoreLow) {
    this.totalScoreLow = totalScoreLow;
    return this;
  }

  /**
   * summation variable for calculating deviation note, these are now only used for legacy and
   * debugging purposes
   * @return value or {@code null} for none
   */
  public java.lang.Double getTotalScoreSqr() {
    return totalScoreSqr;
  }

  /**
   * summation variable for calculating deviation note, these are now only used for legacy and
   * debugging purposes
   * @param totalScoreSqr totalScoreSqr or {@code null} for none
   */
  public IndexingSignalAggregatorAggregatedScore setTotalScoreSqr(java.lang.Double totalScoreSqr) {
    this.totalScoreSqr = totalScoreSqr;
    return this;
  }

  /**
   * low order part of total_score_sq
   * @return value or {@code null} for none
   */
  public java.lang.Double getTotalScoreSqrLow() {
    return totalScoreSqrLow;
  }

  /**
   * low order part of total_score_sq
   * @param totalScoreSqrLow totalScoreSqrLow or {@code null} for none
   */
  public IndexingSignalAggregatorAggregatedScore setTotalScoreSqrLow(java.lang.Double totalScoreSqrLow) {
    this.totalScoreSqrLow = totalScoreSqrLow;
    return this;
  }

  /**
   * for calculating weighted mean/dev
   * @return value or {@code null} for none
   */
  public java.lang.Double getTotalWeight() {
    return totalWeight;
  }

  /**
   * for calculating weighted mean/dev
   * @param totalWeight totalWeight or {@code null} for none
   */
  public IndexingSignalAggregatorAggregatedScore setTotalWeight(java.lang.Double totalWeight) {
    this.totalWeight = totalWeight;
    return this;
  }

  /**
   * low order part of total_weight
   * @return value or {@code null} for none
   */
  public java.lang.Double getTotalWeightLow() {
    return totalWeightLow;
  }

  /**
   * low order part of total_weight
   * @param totalWeightLow totalWeightLow or {@code null} for none
   */
  public IndexingSignalAggregatorAggregatedScore setTotalWeightLow(java.lang.Double totalWeightLow) {
    this.totalWeightLow = totalWeightLow;
    return this;
  }

  @Override
  public IndexingSignalAggregatorAggregatedScore set(String fieldName, Object value) {
    return (IndexingSignalAggregatorAggregatedScore) super.set(fieldName, value);
  }

  @Override
  public IndexingSignalAggregatorAggregatedScore clone() {
    return (IndexingSignalAggregatorAggregatedScore) super.clone();
  }

}
