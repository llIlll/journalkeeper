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
package io.journalkeeper.rpc.server;

import java.net.URI;

/**
 * @author LiYue
 * Date: 2019-03-14
 */
public class RequestVoteRequest implements Termed {
    private final int term;
    private final URI candidate;
    private final long lastLogIndex;
    private final int lastLogTerm;
    private final boolean fromPreferredLeader;
    private final boolean preVote;

    public RequestVoteRequest(int term, URI candidate, long lastLogIndex, int lastLogTerm, boolean fromPreferredLeader, boolean preVote) {
        this.term = term;
        this.candidate = candidate;
        this.lastLogIndex = lastLogIndex;
        this.lastLogTerm = lastLogTerm;
        this.fromPreferredLeader = fromPreferredLeader;
        this.preVote = preVote;
    }

    public int getTerm() {
        return term;
    }

    public URI getCandidate() {
        return candidate;
    }

    public long getLastLogIndex() {
        return lastLogIndex;
    }

    public int getLastLogTerm() {
        return lastLogTerm;
    }

    public boolean isFromPreferredLeader() {
        return fromPreferredLeader;
    }

    public boolean isPreVote() {
        return preVote;
    }
}
