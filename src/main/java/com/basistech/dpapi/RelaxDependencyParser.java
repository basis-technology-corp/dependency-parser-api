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

import org.apache.commons.lang3.tuple.ImmutablePair;

import java.util.List;

/**
 * This is the public interface to the RELAX dependency parser.
 */
public interface RelaxDependencyParser {
    /**
     * parses the input by applying a breaker, and tagger then dependency parser.
     * @param input CharSequence
     * @return a list of ParseResult
     */
    List<DependencyParserResult> parse(CharSequence input);

    /**
     * parses tagger results which should only contain a sentence.
     * @param input a list of TaggedWord from a sentence
     * @return ParseResult for the sentence
     */
    DependencyParserResult parseSentence(List<DepWord> input);
    DocumentParseResult parseDocument(CharSequence input);

    DependencyParserResult tagAndParseSentence(String input);

    List<String> tokenizeSentence(String input);

    /**
     * parses tokens from a sentence; calls a tagger, then the dependency parser.
     * @param input a list of HasWord
     * @return ParseResult for the sentence
     */
    DependencyParserResult tagAndParseSentence(List<String> input);

    /**
     * parses the input by applying a breaker, and tagger then dependency parser. The segmentation is returned along
     * with the parse results.
     *
     * @param input input CharSequence
     * @return a list of Tagged Sentence and ParseResult  pairs.
     */
    List<ImmutablePair<List<DepWord>, DependencyParserResult>>  segmentAndParseSentence(CharSequence input);
}
