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

import com.basistech.rosette.dm.AnnotatedText;

import java.util.List;

/**
 * This is the public interface to the RELAX dependency parser.
 */
public interface DependencyParser {
    /**
     * parses the input by applying a breaker, and tagger then dependency parser.
     * @param input CharSequence
     * @return a list of ParseResult
     */
    List<ParseResult> parse(AnnotatedText input);
}
