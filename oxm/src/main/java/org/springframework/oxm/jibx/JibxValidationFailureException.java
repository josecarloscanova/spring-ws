/*
 * Copyright 2006 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.oxm.jibx;

import org.jibx.runtime.ValidationException;
import org.springframework.oxm.ValidationFailureException;

/**
 * JAXB-specific subclass of <code>ValidationFailureException</code>.
 *
 * @author Arjen Poutsma
 * @see JibxUtils#convertJibxException(org.jibx.runtime.JiBXException,boolean)
 * @since 1.0
 */
public class JibxValidationFailureException extends ValidationFailureException {

    public JibxValidationFailureException(ValidationException ex) {
        super("JiBX validation exception: " + ex.getMessage(), ex);
    }

}
