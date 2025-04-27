package com.ListCompare;

/**
 * Immutable container class for storing a pair of values.
 *
 * @param <A> type of first value
 * @param <B> type of second value
 * @param firstValue first value
 * @param secondValue second value
 */
public record Pair<A, B>(A firstValue, B secondValue) { }
