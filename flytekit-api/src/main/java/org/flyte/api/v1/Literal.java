/*
 * Copyright 2020 Spotify AB.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.flyte.api.v1;

import com.google.auto.value.AutoOneOf;

/**
 * A simple value. This supports any level of nesting (e.g. array of array of array of Blobs) as
 * well as simple primitives.
 */
@AutoOneOf(Literal.Kind.class)
public abstract class Literal {

  public enum Kind {
    SCALAR
  }

  public abstract Kind kind();

  public abstract Scalar scalar();

  public static Literal of(Scalar scalar) {
    return AutoOneOf_Literal.scalar(scalar);
  }
}