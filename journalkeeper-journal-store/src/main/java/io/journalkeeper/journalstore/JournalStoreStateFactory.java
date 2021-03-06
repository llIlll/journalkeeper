/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.journalkeeper.journalstore;

import io.journalkeeper.core.api.JournalEntryParser;
import io.journalkeeper.core.api.State;
import io.journalkeeper.core.api.StateFactory;

/**
 * @author LiYue
 * Date: 2019-05-09
 */
public class JournalStoreStateFactory implements StateFactory {
    private final JournalEntryParser journalEntryParser;

    public JournalStoreStateFactory(JournalEntryParser journalEntryParser) {
        this.journalEntryParser = journalEntryParser;
    }

    @Override
    public State createState() {
        return new JournalStoreState(journalEntryParser);
    }
}
