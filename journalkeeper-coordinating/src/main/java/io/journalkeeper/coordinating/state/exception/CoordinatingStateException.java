/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.journalkeeper.coordinating.state.exception;

import io.journalkeeper.coordinating.exception.CoordinatingException;

/**
 * CoordinatingStateException
 * author: gaohaoxiang
 *
 * date: 2019/6/11
 */
public class CoordinatingStateException extends CoordinatingException {

    public CoordinatingStateException() {
    }

    public CoordinatingStateException(String message) {
        super(message);
    }

    public CoordinatingStateException(String message, Throwable cause) {
        super(message, cause);
    }

    public CoordinatingStateException(Throwable cause) {
        super(cause);
    }

    public CoordinatingStateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}