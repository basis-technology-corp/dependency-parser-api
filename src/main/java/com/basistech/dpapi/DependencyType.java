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

public enum DependencyType {

    /**
     * Returns all the typed dependencies of this grammatical structure.
     * These are like the basic (uncollapsed) dependencies, but may include
     * extra arcs for control relationships, etc. This corresponds to the
     * "nonCollapsed" option.
     */
    Basic,

    /**
     * Get the typed dependencies after collapsing them and processing eventual
     * CC complements.  The effect of this part is to distributed conjoined
     * arguments across relations or conjoined predicates across their arguments.
     * This is generally useful, and we generally recommend using the output of
     * this method with the second argument being {@code true}.
     * The "CCPropagated" option corresponds to calling this method with an
     * argument of {@code true}.
     */
    CCprocessed,

    /**
     * Get the typed dependencies after mostly collapsing them, but keep a tree
     * structure.  In order to do this, the code does:
     * <ol>
     * <li> no relative clause processing
     * <li> no xsubj relations
     * <li> no propagation of conjuncts
     * </ol>
     * This corresponds to the "tree" option.
     */
    Collapsed;


}
