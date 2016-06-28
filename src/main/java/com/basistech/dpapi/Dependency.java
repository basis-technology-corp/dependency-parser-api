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

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Objects;

/**
 * A dependency.
 */
public class Dependency {
    private final String relationship;
    private final int governor;
    private final int dependency;

    public Dependency(String relationship, int governor, int dependency) {
        this.relationship = relationship;
        this.governor = governor;
        this.dependency = dependency;
    }

    public String getRelationship() {
        return relationship;
    }

    public int getGovernor() {
        return governor;
    }

    public int getDependency() {
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
        return new ToStringBuilder(this)
                .append("relationship", relationship)
                .append("governor", governor)
                .append("dependency", dependency)
                .toString();
    }
}
