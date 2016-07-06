/*
* Copyright 2016 Basis Technology Corp.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.basistech.dpapi;

import com.basistech.rosette.dm.BaseAttribute;

import java.util.Map;
import java.util.Objects;

/**
 * A dependency. This is expressed as a relationship type and two token indices. Token index of {@code -1} means 'ROOT'.
 */
public class Dependency extends BaseAttribute {
    private final String relationship;
    private final int governorTokenIndex;
    private final int dependencyTokenIndex;

    protected Dependency(String relationship, int governorTokenIndex, int dependencyTokenIndex, Map<String, Object> extendedProperties) {
        super(extendedProperties);
        this.relationship = relationship;
        this.governorTokenIndex = governorTokenIndex;
        this.dependencyTokenIndex = dependencyTokenIndex;
    }

    public String getRelationship() {
        return relationship;
    }

    public int getGovernorTokenIndex() {
        return governorTokenIndex;
    }

    public int getDependencyTokenIndex() {
        return dependencyTokenIndex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Dependency that = (Dependency) o;
        return governorTokenIndex == that.governorTokenIndex
                && dependencyTokenIndex == that.dependencyTokenIndex
                && Objects.equals(relationship, that.relationship);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), relationship, governorTokenIndex, dependencyTokenIndex);
    }

    // This is not a consistent ADM to-string; that gets into problems with shading.
    @Override
    public String toString() {
        return String.format("%s(%d, %d)",
                relationship, governorTokenIndex, dependencyTokenIndex);
    }

    public static class Builder extends BaseAttribute.Builder<Dependency, Dependency.Builder> {
        protected String relationship;
        protected int governorTokenIndex;
        protected int dependencyTokenIndex;

        public Builder(String relationship, int governorTokenIndex, int dependencyTokenIndex) {
            this.relationship = relationship;
            this.governorTokenIndex = governorTokenIndex;
            this.dependencyTokenIndex = dependencyTokenIndex;
        }

        /**
         * Constructs a builder from the contents of an existing sentence.
         *
         * @param toCopy the object to copy
         * @adm.ignore
         */
        public Builder(Dependency toCopy) {
            super(toCopy);
        }

        /**
         * Creates an immutable Dependency from the current state of the builder.
         *
         * @return the new sentence
         */
        public Dependency build() {
            return new Dependency(relationship, governorTokenIndex, dependencyTokenIndex, buildExtendedProperties());
        }

        @Override
        protected Builder getThis() {
            return null;
        }
    }
}
