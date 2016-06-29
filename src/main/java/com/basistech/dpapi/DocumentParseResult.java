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


import java.util.List;

public class DocumentParseResult {

    private final List<ParseResult> getSentencesParseResults;
    private final List<String> tokens;

    public DocumentParseResult(List<ParseResult> getSentencesParseResults,
                               List<String> tokens) {
        this.getSentencesParseResults = getSentencesParseResults;
        this.tokens = tokens;
    }

    public List<ParseResult> getGetSentencesParseResults() {
        return getSentencesParseResults;
    }

    public List<String> getTokens() {
        return tokens;
    }
}
