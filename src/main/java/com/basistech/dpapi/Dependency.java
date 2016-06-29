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

import java.util.Objects;

/**
 * A dependency.
 */
public class Dependency {
    private final String relationship;
    private final IndexedToken governor;
    private final IndexedToken dependency;

    public Dependency(String relationship, IndexedToken governor, IndexedToken dependency) {
        this.relationship = relationship;
        this.governor = governor;
        this.dependency = dependency;
    }

    public String getRelationship() {
        return relationship;
    }

    public IndexedToken getGovernor() {
        return governor;
    }

    public IndexedToken getDependency() {
        return dependency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Dependency that = (Dependency) o;
        return governor == that.governor
                && dependency == that.dependency
                && Objects.equals(relationship, that.relationship);
    }

    @Override
    public int hashCode() {
        return Objects.hash(relationship, governor, dependency);
    }

    @Override
    public String toString() {
        return String.format("%s(%s, %s)",
                relationship, governor, dependency);
    }
}
