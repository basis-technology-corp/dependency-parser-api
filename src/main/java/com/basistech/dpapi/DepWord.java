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
 * A word with a tag.
 */
public class DepWord {
    private final String word;
    private final String tag;
    private final int startIndex;
    private final int endIndex;

    public DepWord(String word, String tag, int startIndex, int endIndex) {
        this.word = word;
        this.tag = tag;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public String getWord() {
        return word;
    }

    public String getTag() {
        return tag;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DepWord depWord = (DepWord) o;
        // start index and end index?
        return Objects.equals(word, depWord.word)
               && Objects.equals(tag, depWord.tag);
    }
    @Override
    public int hashCode() {
        return Objects.hash(word, tag);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("word", word)
                .append("tag", tag)
                .append("startIndex", startIndex)
                .append("endIndex", endIndex)
                .toString();
    }
}
